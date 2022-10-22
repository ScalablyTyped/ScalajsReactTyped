package typingsJapgolly.reactCalendarTimeline.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.ReactEventHandler
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.react.mod.TouchEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemRendererGetItemPropsReturnType extends StObject {
  
  var className: String
  
  var key: Id
  
  var onContextMenu: ReactEventHandler[Element]
  
  var onDoubleClick: MouseEventHandler[Element]
  
  var onMouseDown: MouseEventHandler[Element]
  
  var onMouseUp: MouseEventHandler[Element]
  
  var onTouchEnd: TouchEventHandler[Element]
  
  var onTouchStart: TouchEventHandler[Element]
  
  var ref: Ref[Any]
  
  var style: CSSProperties
}
object ItemRendererGetItemPropsReturnType {
  
  inline def apply(
    className: String,
    key: Id,
    onContextMenu: ReactEventFrom[Element & Element] => Callback,
    onDoubleClick: ReactMouseEventFrom[Element & Element] => Callback,
    onMouseDown: ReactMouseEventFrom[Element & Element] => Callback,
    onMouseUp: ReactMouseEventFrom[Element & Element] => Callback,
    onTouchEnd: ReactTouchEventFrom[Element & Element] => Callback,
    onTouchStart: ReactTouchEventFrom[Element & Element] => Callback,
    style: CSSProperties
  ): ItemRendererGetItemPropsReturnType = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], onContextMenu = js.Any.fromFunction1((t0: ReactEventFrom[Element & Element]) => onContextMenu(t0).runNow()), onDoubleClick = js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => onDoubleClick(t0).runNow()), onMouseDown = js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => onMouseDown(t0).runNow()), onMouseUp = js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => onMouseUp(t0).runNow()), onTouchEnd = js.Any.fromFunction1((t0: ReactTouchEventFrom[Element & Element]) => onTouchEnd(t0).runNow()), onTouchStart = js.Any.fromFunction1((t0: ReactTouchEventFrom[Element & Element]) => onTouchStart(t0).runNow()), style = style.asInstanceOf[js.Any], ref = null)
    __obj.asInstanceOf[ItemRendererGetItemPropsReturnType]
  }
  
  extension [Self <: ItemRendererGetItemPropsReturnType](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Id): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setOnContextMenu(value: ReactEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1((t0: ReactEventFrom[Element & Element]) => value(t0).runNow()))
    
    inline def setOnDoubleClick(value: ReactMouseEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => value(t0).runNow()))
    
    inline def setOnMouseDown(value: ReactMouseEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => value(t0).runNow()))
    
    inline def setOnMouseUp(value: ReactMouseEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => value(t0).runNow()))
    
    inline def setOnTouchEnd(value: ReactTouchEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[Element & Element]) => value(t0).runNow()))
    
    inline def setOnTouchStart(value: ReactTouchEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[Element & Element]) => value(t0).runNow()))
    
    inline def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: Any | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
