package com.example.jsonapp

import com.google.gson.annotations.SerializedName

class Datum(var date: String?,var eur: Cur?) {

    class Cur {

        @SerializedName("inr")
        var inr: String? = null

        @SerializedName("usd")
        var usd: String? = null

        @SerializedName("aud")
        var aud: String? = null

        @SerializedName("sar")
        var sar: String? = null

        @SerializedName("cny")
        var cny: String? = null

        @SerializedName("jpy")
        var jpy: String? = null

    }
}