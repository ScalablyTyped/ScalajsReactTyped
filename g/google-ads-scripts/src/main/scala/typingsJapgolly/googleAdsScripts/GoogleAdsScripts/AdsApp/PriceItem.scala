package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PriceItem extends StObject {
  
  def getAmount(): Double
  
  def getCurrencyCode(): String
  
  def getDescription(): String
  
  def getFinalUrl(): String
  
  def getHeader(): String
  
  def getMobileFinalUrl(): String
  
  def getUnitType(): String
  
  def remove(): Unit
}
object PriceItem {
  
  inline def apply(
    getAmount: CallbackTo[Double],
    getCurrencyCode: CallbackTo[String],
    getDescription: CallbackTo[String],
    getFinalUrl: CallbackTo[String],
    getHeader: CallbackTo[String],
    getMobileFinalUrl: CallbackTo[String],
    getUnitType: CallbackTo[String],
    remove: Callback
  ): PriceItem = {
    val __obj = js.Dynamic.literal(getAmount = getAmount.toJsFn, getCurrencyCode = getCurrencyCode.toJsFn, getDescription = getDescription.toJsFn, getFinalUrl = getFinalUrl.toJsFn, getHeader = getHeader.toJsFn, getMobileFinalUrl = getMobileFinalUrl.toJsFn, getUnitType = getUnitType.toJsFn, remove = remove.toJsFn)
    __obj.asInstanceOf[PriceItem]
  }
  
  extension [Self <: PriceItem](x: Self) {
    
    inline def setGetAmount(value: CallbackTo[Double]): Self = StObject.set(x, "getAmount", value.toJsFn)
    
    inline def setGetCurrencyCode(value: CallbackTo[String]): Self = StObject.set(x, "getCurrencyCode", value.toJsFn)
    
    inline def setGetDescription(value: CallbackTo[String]): Self = StObject.set(x, "getDescription", value.toJsFn)
    
    inline def setGetFinalUrl(value: CallbackTo[String]): Self = StObject.set(x, "getFinalUrl", value.toJsFn)
    
    inline def setGetHeader(value: CallbackTo[String]): Self = StObject.set(x, "getHeader", value.toJsFn)
    
    inline def setGetMobileFinalUrl(value: CallbackTo[String]): Self = StObject.set(x, "getMobileFinalUrl", value.toJsFn)
    
    inline def setGetUnitType(value: CallbackTo[String]): Self = StObject.set(x, "getUnitType", value.toJsFn)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
  }
}
