package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait hasGetFinalUrl extends StObject {
  
  def getFinalUrl(): String
  
  def getMobileFinalUrl(): String
}
object hasGetFinalUrl {
  
  inline def apply(getFinalUrl: CallbackTo[String], getMobileFinalUrl: CallbackTo[String]): hasGetFinalUrl = {
    val __obj = js.Dynamic.literal(getFinalUrl = getFinalUrl.toJsFn, getMobileFinalUrl = getMobileFinalUrl.toJsFn)
    __obj.asInstanceOf[hasGetFinalUrl]
  }
  
  extension [Self <: hasGetFinalUrl](x: Self) {
    
    inline def setGetFinalUrl(value: CallbackTo[String]): Self = StObject.set(x, "getFinalUrl", value.toJsFn)
    
    inline def setGetMobileFinalUrl(value: CallbackTo[String]): Self = StObject.set(x, "getMobileFinalUrl", value.toJsFn)
  }
}
