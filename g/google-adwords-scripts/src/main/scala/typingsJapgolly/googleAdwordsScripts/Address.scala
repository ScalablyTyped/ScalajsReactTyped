package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Address extends StObject {
  
  def getCityName(): String
  
  def getCountryCode(): String
  
  def getPostalCode(): String
  
  def getProvinceCode(): String
  
  def getProvinceName(): String
  
  def getStreetAddress(): String
  
  def getStreetAddress2(): String
}
object Address {
  
  inline def apply(
    getCityName: CallbackTo[String],
    getCountryCode: CallbackTo[String],
    getPostalCode: CallbackTo[String],
    getProvinceCode: CallbackTo[String],
    getProvinceName: CallbackTo[String],
    getStreetAddress: CallbackTo[String],
    getStreetAddress2: CallbackTo[String]
  ): Address = {
    val __obj = js.Dynamic.literal(getCityName = getCityName.toJsFn, getCountryCode = getCountryCode.toJsFn, getPostalCode = getPostalCode.toJsFn, getProvinceCode = getProvinceCode.toJsFn, getProvinceName = getProvinceName.toJsFn, getStreetAddress = getStreetAddress.toJsFn, getStreetAddress2 = getStreetAddress2.toJsFn)
    __obj.asInstanceOf[Address]
  }
  
  extension [Self <: Address](x: Self) {
    
    inline def setGetCityName(value: CallbackTo[String]): Self = StObject.set(x, "getCityName", value.toJsFn)
    
    inline def setGetCountryCode(value: CallbackTo[String]): Self = StObject.set(x, "getCountryCode", value.toJsFn)
    
    inline def setGetPostalCode(value: CallbackTo[String]): Self = StObject.set(x, "getPostalCode", value.toJsFn)
    
    inline def setGetProvinceCode(value: CallbackTo[String]): Self = StObject.set(x, "getProvinceCode", value.toJsFn)
    
    inline def setGetProvinceName(value: CallbackTo[String]): Self = StObject.set(x, "getProvinceName", value.toJsFn)
    
    inline def setGetStreetAddress(value: CallbackTo[String]): Self = StObject.set(x, "getStreetAddress", value.toJsFn)
    
    inline def setGetStreetAddress2(value: CallbackTo[String]): Self = StObject.set(x, "getStreetAddress2", value.toJsFn)
  }
}
