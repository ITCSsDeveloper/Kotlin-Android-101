package com.example.win8.myapplication

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by win8 on 7/22/2017.
 */
data class LoginKotlin constructor(var username: String, var password : String): Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(username)
        parcel.writeString(password)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<LoginKotlin> {
        override fun createFromParcel(parcel: Parcel): LoginKotlin {
            return LoginKotlin(parcel)
        }

        override fun newArray(size: Int): Array<LoginKotlin?> {
            return arrayOfNulls(size)
        }
    }
}