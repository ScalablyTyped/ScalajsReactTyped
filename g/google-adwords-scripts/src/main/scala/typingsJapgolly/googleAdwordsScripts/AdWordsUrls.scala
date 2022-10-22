package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdWordsUrls extends StObject {
  
  def getCustomParameters(): js.Object
  
  def getTrackingTemplate(): String
}
object AdWordsUrls {
  
  inline def apply(getCustomParameters: CallbackTo[js.Object], getTrackingTemplate: CallbackTo[String]): AdWordsUrls = {
    val __obj = js.Dynamic.literal(getCustomParameters = getCustomParameters.toJsFn, getTrackingTemplate = getTrackingTemplate.toJsFn)
    __obj.asInstanceOf[AdWordsUrls]
  }
  
  extension [Self <: AdWordsUrls](x: Self) {
    
    inline def setGetCustomParameters(value: CallbackTo[js.Object]): Self = StObject.set(x, "getCustomParameters", value.toJsFn)
    
    inline def setGetTrackingTemplate(value: CallbackTo[String]): Self = StObject.set(x, "getTrackingTemplate", value.toJsFn)
  }
}
