package com.himanshu.miwokupdate;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResorceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }
    public Word(int imageResorceId, String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResorceId = imageResorceId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    public int getImageView() { return mImageResorceId; }
    public boolean hasImage() { return mImageResorceId != NO_IMAGE_PROVIDED; }
}
