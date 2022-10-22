package typingsJapgolly.wixUiCore.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnBlur extends StObject {
  
  def onBlur(): Any
  
  def onChange(): Any
  
  def onHover(): Any
  
  def onKeyDown(): Any
}
object OnBlur {
  
  inline def apply(
    onBlur: CallbackTo[Any],
    onChange: CallbackTo[Any],
    onHover: CallbackTo[Any],
    onKeyDown: CallbackTo[Any]
  ): OnBlur = {
    val __obj = js.Dynamic.literal(onBlur = onBlur.toJsFn, onChange = onChange.toJsFn, onHover = onHover.toJsFn, onKeyDown = onKeyDown.toJsFn)
    __obj.asInstanceOf[OnBlur]
  }
  
  extension [Self <: OnBlur](x: Self) {
    
    inline def setOnBlur(value: CallbackTo[Any]): Self = StObject.set(x, "onBlur", value.toJsFn)
    
    inline def setOnChange(value: CallbackTo[Any]): Self = StObject.set(x, "onChange", value.toJsFn)
    
    inline def setOnHover(value: CallbackTo[Any]): Self = StObject.set(x, "onHover", value.toJsFn)
    
    inline def setOnKeyDown(value: CallbackTo[Any]): Self = StObject.set(x, "onKeyDown", value.toJsFn)
  }
}
