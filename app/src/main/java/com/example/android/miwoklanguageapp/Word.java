package com.example.android.miwoklanguageapp;

public class Word {

    // Default translation of the word
    private String mDefaultTranslation;

    // Miwok translation of the word
    private String mMiwokTranslation;

    // Resource id of the image
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    //Resource id of audio file
    private int mAudioResourceId;

    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * create a new word
     *
     * @param defaultTranslation is the word in Default language with which user is familiar with
     * @param miwokTranslation   is the word in miwok language
     * @param audioResourceId    is the raw resource id of the audio file
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     * create a new word
     *
     * @param defaultTranslation is the word in Default language with which user is familiar with
     * @param miwokTranslation   is the word in miwok language
     * @param imageResourceId    is the drawable resource id of the image
     * @param audioResourceId    is the raw resource id of the audio file
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    /**
     * method to get the default translation of the word
     *
     * @return default translation of the word
     */

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }


    /**
     * method to get the miwok translation of the word
     *
     * @return miwok translation of the word
     */

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * method to get the resource id of the image
     *
     * @return resource id of the image
     */

    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * method to check whether the image is provided or not
     *
     * @return
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * method to get the resource id of the audio
     *
     * @return resource id of the audio file
     */

    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
