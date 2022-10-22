package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdCustomizerSource
  extends StObject
     with AdWordsEntity {
  
  def adCustomizerItemBuilder(): AdCustomizerItemBuilder[AdCustomizerItem]
  
  def getAttributes(): js.Object
  
  def getName(): String
  
  def items(): AdWordsSelector[AdCustomizerItem]
}
object AdCustomizerSource {
  
  inline def apply(
    adCustomizerItemBuilder: CallbackTo[AdCustomizerItemBuilder[AdCustomizerItem]],
    getAttributes: CallbackTo[js.Object],
    getName: CallbackTo[String],
    items: CallbackTo[AdWordsSelector[AdCustomizerItem]]
  ): AdCustomizerSource = {
    val __obj = js.Dynamic.literal(adCustomizerItemBuilder = adCustomizerItemBuilder.toJsFn, getAttributes = getAttributes.toJsFn, getName = getName.toJsFn, items = items.toJsFn)
    __obj.asInstanceOf[AdCustomizerSource]
  }
  
  extension [Self <: AdCustomizerSource](x: Self) {
    
    inline def setAdCustomizerItemBuilder(value: CallbackTo[AdCustomizerItemBuilder[AdCustomizerItem]]): Self = StObject.set(x, "adCustomizerItemBuilder", value.toJsFn)
    
    inline def setGetAttributes(value: CallbackTo[js.Object]): Self = StObject.set(x, "getAttributes", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setItems(value: CallbackTo[AdWordsSelector[AdCustomizerItem]]): Self = StObject.set(x, "items", value.toJsFn)
  }
}
