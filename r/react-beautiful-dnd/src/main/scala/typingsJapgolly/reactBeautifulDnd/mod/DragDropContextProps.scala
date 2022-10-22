package typingsJapgolly.reactBeautifulDnd.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragDropContextProps extends StObject {
  
  var children: Node | Null
  
  var dragHandleUsageInstructions: js.UndefOr[String] = js.undefined
  
  var enableDefaultSensors: js.UndefOr[Boolean] = js.undefined
  
  var nonce: js.UndefOr[String] = js.undefined
  
  var onBeforeCapture: js.UndefOr[js.Function1[/* before */ BeforeCapture, Unit]] = js.undefined
  
  var onBeforeDragStart: js.UndefOr[js.Function1[/* initial */ DragStart, Unit]] = js.undefined
  
  def onDragEnd(result: DropResult, provided: ResponderProvided): Unit
  
  var onDragStart: js.UndefOr[js.Function2[/* initial */ DragStart, /* provided */ ResponderProvided, Unit]] = js.undefined
  
  var onDragUpdate: js.UndefOr[js.Function2[/* initial */ DragUpdate, /* provided */ ResponderProvided, Unit]] = js.undefined
  
  var sensors: js.UndefOr[js.Array[Sensor]] = js.undefined
}
object DragDropContextProps {
  
  inline def apply(onDragEnd: (DropResult, ResponderProvided) => Callback): DragDropContextProps = {
    val __obj = js.Dynamic.literal(onDragEnd = js.Any.fromFunction2((t0: DropResult, t1: ResponderProvided) => (onDragEnd(t0, t1)).runNow()), children = null)
    __obj.asInstanceOf[DragDropContextProps]
  }
  
  extension [Self <: DragDropContextProps](x: Self) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setDragHandleUsageInstructions(value: String): Self = StObject.set(x, "dragHandleUsageInstructions", value.asInstanceOf[js.Any])
    
    inline def setDragHandleUsageInstructionsUndefined: Self = StObject.set(x, "dragHandleUsageInstructions", js.undefined)
    
    inline def setEnableDefaultSensors(value: Boolean): Self = StObject.set(x, "enableDefaultSensors", value.asInstanceOf[js.Any])
    
    inline def setEnableDefaultSensorsUndefined: Self = StObject.set(x, "enableDefaultSensors", js.undefined)
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setOnBeforeCapture(value: /* before */ BeforeCapture => Callback): Self = StObject.set(x, "onBeforeCapture", js.Any.fromFunction1((t0: /* before */ BeforeCapture) => value(t0).runNow()))
    
    inline def setOnBeforeCaptureUndefined: Self = StObject.set(x, "onBeforeCapture", js.undefined)
    
    inline def setOnBeforeDragStart(value: /* initial */ DragStart => Callback): Self = StObject.set(x, "onBeforeDragStart", js.Any.fromFunction1((t0: /* initial */ DragStart) => value(t0).runNow()))
    
    inline def setOnBeforeDragStartUndefined: Self = StObject.set(x, "onBeforeDragStart", js.undefined)
    
    inline def setOnDragEnd(value: (DropResult, ResponderProvided) => Callback): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction2((t0: DropResult, t1: ResponderProvided) => (value(t0, t1)).runNow()))
    
    inline def setOnDragStart(value: (/* initial */ DragStart, /* provided */ ResponderProvided) => Callback): Self = StObject.set(x, "onDragStart", js.Any.fromFunction2((t0: /* initial */ DragStart, t1: /* provided */ ResponderProvided) => (value(t0, t1)).runNow()))
    
    inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    inline def setOnDragUpdate(value: (/* initial */ DragUpdate, /* provided */ ResponderProvided) => Callback): Self = StObject.set(x, "onDragUpdate", js.Any.fromFunction2((t0: /* initial */ DragUpdate, t1: /* provided */ ResponderProvided) => (value(t0, t1)).runNow()))
    
    inline def setOnDragUpdateUndefined: Self = StObject.set(x, "onDragUpdate", js.undefined)
    
    inline def setSensors(value: js.Array[Sensor]): Self = StObject.set(x, "sensors", value.asInstanceOf[js.Any])
    
    inline def setSensorsUndefined: Self = StObject.set(x, "sensors", js.undefined)
    
    inline def setSensorsVarargs(value: Sensor*): Self = StObject.set(x, "sensors", js.Array(value*))
  }
}
