package typingsJapgolly.jsfl

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Context extends StObject {
  
  var elements: js.Array[FlashElement]
  
  var frame: FlashFrame
  
  def goto(): Any
  
  var keyframes: js.Array[FlashFrame]
  
  var layer: FlashLayer
  
  def setLayer(index: Double): Any
  
  def update(): Any
}
object Context {
  
  inline def apply(
    elements: js.Array[FlashElement],
    frame: FlashFrame,
    goto: CallbackTo[Any],
    keyframes: js.Array[FlashFrame],
    layer: FlashLayer,
    setLayer: Double => Any,
    update: CallbackTo[Any]
  ): Context = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], goto = goto.toJsFn, keyframes = keyframes.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], setLayer = js.Any.fromFunction1(setLayer), update = update.toJsFn)
    __obj.asInstanceOf[Context]
  }
  
  extension [Self <: Context](x: Self) {
    
    inline def setElements(value: js.Array[FlashElement]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsVarargs(value: FlashElement*): Self = StObject.set(x, "elements", js.Array(value*))
    
    inline def setFrame(value: FlashFrame): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setGoto(value: CallbackTo[Any]): Self = StObject.set(x, "goto", value.toJsFn)
    
    inline def setKeyframes(value: js.Array[FlashFrame]): Self = StObject.set(x, "keyframes", value.asInstanceOf[js.Any])
    
    inline def setKeyframesVarargs(value: FlashFrame*): Self = StObject.set(x, "keyframes", js.Array(value*))
    
    inline def setLayer(value: FlashLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setSetLayer(value: Double => Any): Self = StObject.set(x, "setLayer", js.Any.fromFunction1(value))
    
    inline def setUpdate(value: CallbackTo[Any]): Self = StObject.set(x, "update", value.toJsFn)
  }
}
