package com.gookkis.jetpacknavigationcomponent

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.math.BigDecimal

/**
 *Created by herikiswanto on 2019-10-16.
 **/

@Parcelize
data class Money(val amount: BigDecimal) : Parcelable {

}