package com.nullexception0.stayathomedeobfuscator;

public final class a {

    private int[] f233a;

    private int f234b = 0;
    private int c = 0;

    public a(byte[] bArr) {
        this.f233a = c(bArr);
    }

    public final byte[] a(byte[] bArr) {
        return b(bArr);
    }

    public final byte[] b(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            this.f234b = (this.f234b + 1) % 256;
            int i2 = this.c;
            int[] iArr = this.f233a;
            int i3 = this.f234b;
            this.c = (i2 + iArr[i3]) % 256;
            a(i3, this.c, iArr);
            int[] iArr2 = this.f233a;
            bArr2[i] = (byte) (iArr2[(iArr2[this.f234b] + iArr2[this.c]) % 256] ^ bArr[i]);
        }
        return bArr2;
    }

    private static int[] c(byte[] bArr) {
        int[] iArr = new int[256];
        for (int i = 0; i < 256; i++) {
            iArr[i] = i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            i2 = (((i2 + iArr[i3]) + bArr[i3 % bArr.length]) + 256) % 256;
            a(i3, i2, iArr);
        }
        return iArr;
    }

    private static void a(int i, int i2, int[] iArr) {
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
    }
}