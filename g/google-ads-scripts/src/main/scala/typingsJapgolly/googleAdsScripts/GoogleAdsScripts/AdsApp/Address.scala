package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the address of a geographical point. Contains information about the street address, country, province / state, and postal code.
  *
  * For instance, the address "1600 Amphitheatre Parkway, Mountain View, CA 94043" will have the following values:
  *
  * * `getStreetAddress()`: "1600 Amphitheatre Parkway"
  * * `getStreetAddress2()`: `null`
  * * `getCityName()`: "Mountain View"
  * * `getProvinceCode()`: "CA"
  * * `getProvinceName()`: "California"
  * * `getPostalCode()`: "94043"
  * * `getCountryCode()`: "US"
  */
trait Address extends StObject {
  
  /** Returns the city name, or `null` if not known. */
  def getCityName(): String | Null
  
  /** Returns the country code, or `null` if not known. */
  def getCountryCode(): String | Null
  
  /** Returns the postal code, or `null` if not known. */
  def getPostalCode(): String | Null
  
  /** Returns the province / state code, or `null` if not known. */
  def getProvinceCode(): String | Null
  
  /** Returns the province / state name, or `null` if not known. */
  def getProvinceName(): String | Null
  
  /** Returns the street address, or `null` if not known. */
  def getStreetAddress(): String | Null
  
  /** Returns the second line of the street address, or `null` if not known. */
  def getStreetAddress2(): String | Null
}
object Address {
  
  inline def apply(
    getCityName: CallbackTo[String | Null],
    getCountryCode: CallbackTo[String | Null],
    getPostalCode: CallbackTo[String | Null],
    getProvinceCode: CallbackTo[String | Null],
    getProvinceName: CallbackTo[String | Null],
    getStreetAddress: CallbackTo[String | Null],
    getStreetAddress2: CallbackTo[String | Null]
  ): Address = {
    val __obj = js.Dynamic.literal(getCityName = getCityName.toJsFn, getCountryCode = getCountryCode.toJsFn, getPostalCode = getPostalCode.toJsFn, getProvinceCode = getProvinceCode.toJsFn, getProvinceName = getProvinceName.toJsFn, getStreetAddress = getStreetAddress.toJsFn, getStreetAddress2 = getStreetAddress2.toJsFn)
    __obj.asInstanceOf[Address]
  }
  
  extension [Self <: Address](x: Self) {
    
    inline def setGetCityName(value: CallbackTo[String | Null]): Self = StObject.set(x, "getCityName", value.toJsFn)
    
    inline def setGetCountryCode(value: CallbackTo[String | Null]): Self = StObject.set(x, "getCountryCode", value.toJsFn)
    
    inline def setGetPostalCode(value: CallbackTo[String | Null]): Self = StObject.set(x, "getPostalCode", value.toJsFn)
    
    inline def setGetProvinceCode(value: CallbackTo[String | Null]): Self = StObject.set(x, "getProvinceCode", value.toJsFn)
    
    inline def setGetProvinceName(value: CallbackTo[String | Null]): Self = StObject.set(x, "getProvinceName", value.toJsFn)
    
    inline def setGetStreetAddress(value: CallbackTo[String | Null]): Self = StObject.set(x, "getStreetAddress", value.toJsFn)
    
    inline def setGetStreetAddress2(value: CallbackTo[String | Null]): Self = StObject.set(x, "getStreetAddress2", value.toJsFn)
  }
}
