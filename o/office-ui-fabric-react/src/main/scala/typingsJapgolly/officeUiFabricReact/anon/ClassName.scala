package typingsJapgolly.officeUiFabricReact.anon

import org.scalajs.dom.HTMLElement
import typingsJapgolly.officeUiFabricReact.libUtilitiesDraggableZoneDraggableZoneMod.MouseTouchEvent
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassName extends StObject {
  
  var className: String
  
  def onMouseDown(event: MouseTouchEvent[HTMLElement]): js.UndefOr[`false`]
  
  def onMouseUp(event: MouseTouchEvent[HTMLElement]): scala.Unit
  
  def onTouchEnd(event: MouseTouchEvent[HTMLElement]): scala.Unit
  
  def onTouchStart(event: MouseTouchEvent[HTMLElement]): js.UndefOr[`false`]
  
  var style: Any
}
object ClassName {
  
  inline def apply(
    className: String,
    onMouseDown: MouseTouchEvent[HTMLElement] => js.UndefOr[`false`],
    onMouseUp: MouseTouchEvent[HTMLElement] => japgolly.scalajs.react.Callback,
    onTouchEnd: MouseTouchEvent[HTMLElement] => japgolly.scalajs.react.Callback,
    onTouchStart: MouseTouchEvent[HTMLElement] => js.UndefOr[`false`],
    style: Any
  ): ClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], onMouseDown = js.Any.fromFunction1(onMouseDown), onMouseUp = js.Any.fromFunction1((t0: MouseTouchEvent[HTMLElement]) => onMouseUp(t0).runNow()), onTouchEnd = js.Any.fromFunction1((t0: MouseTouchEvent[HTMLElement]) => onTouchEnd(t0).runNow()), onTouchStart = js.Any.fromFunction1(onTouchStart), style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassName]
  }
  
  extension [Self <: ClassName](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setOnMouseDown(value: MouseTouchEvent[HTMLElement] => js.UndefOr[`false`]): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
    
    inline def setOnMouseUp(value: MouseTouchEvent[HTMLElement] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1((t0: MouseTouchEvent[HTMLElement]) => value(t0).runNow()))
    
    inline def setOnTouchEnd(value: MouseTouchEvent[HTMLElement] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1((t0: MouseTouchEvent[HTMLElement]) => value(t0).runNow()))
    
    inline def setOnTouchStart(value: MouseTouchEvent[HTMLElement] => js.UndefOr[`false`]): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
    
    inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
