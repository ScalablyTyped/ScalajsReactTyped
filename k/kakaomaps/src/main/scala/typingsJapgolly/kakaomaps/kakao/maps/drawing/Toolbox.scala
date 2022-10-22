package typingsJapgolly.kakaomaps.kakao.maps.drawing

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Toolbox extends StObject {
  
  def getElement(): Any
}
object Toolbox {
  
  inline def apply(getElement: CallbackTo[Any]): Toolbox = {
    val __obj = js.Dynamic.literal(getElement = getElement.toJsFn)
    __obj.asInstanceOf[Toolbox]
  }
  
  extension [Self <: Toolbox](x: Self) {
    
    inline def setGetElement(value: CallbackTo[Any]): Self = StObject.set(x, "getElement", value.toJsFn)
  }
}
