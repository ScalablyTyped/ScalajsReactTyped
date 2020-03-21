package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  def getCityName(): String
  def getCountryCode(): String
  def getPostalCode(): String
  def getProvinceCode(): String
  def getProvinceName(): String
  def getStreetAddress(): String
  def getStreetAddress2(): String
}

object Address {
  @scala.inline
  def apply(
    getCityName: CallbackTo[String],
    getCountryCode: CallbackTo[String],
    getPostalCode: CallbackTo[String],
    getProvinceCode: CallbackTo[String],
    getProvinceName: CallbackTo[String],
    getStreetAddress: CallbackTo[String],
    getStreetAddress2: CallbackTo[String]
  ): Address = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCityName")(getCityName.toJsFn)
    __obj.updateDynamic("getCountryCode")(getCountryCode.toJsFn)
    __obj.updateDynamic("getPostalCode")(getPostalCode.toJsFn)
    __obj.updateDynamic("getProvinceCode")(getProvinceCode.toJsFn)
    __obj.updateDynamic("getProvinceName")(getProvinceName.toJsFn)
    __obj.updateDynamic("getStreetAddress")(getStreetAddress.toJsFn)
    __obj.updateDynamic("getStreetAddress2")(getStreetAddress2.toJsFn)
    __obj.asInstanceOf[Address]
  }
}

