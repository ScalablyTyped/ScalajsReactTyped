package typingsJapgolly.reactBeautifulDnd.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactBeautifulDnd.mod.BeforeCapture
import typingsJapgolly.reactBeautifulDnd.mod.DragDropContextProps
import typingsJapgolly.reactBeautifulDnd.mod.DragStart
import typingsJapgolly.reactBeautifulDnd.mod.DragUpdate
import typingsJapgolly.reactBeautifulDnd.mod.DropResult
import typingsJapgolly.reactBeautifulDnd.mod.ResponderProvided
import typingsJapgolly.reactBeautifulDnd.mod.Sensor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DragDropContext {
  
  inline def apply(onDragEnd: (DropResult, ResponderProvided) => Callback): Builder = {
    val __props = js.Dynamic.literal(onDragEnd = js.Any.fromFunction2((t0: DropResult, t1: ResponderProvided) => (onDragEnd(t0, t1)).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[DragDropContextProps]))
  }
  
  @JSImport("react-beautiful-dnd", "DragDropContext")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactBeautifulDnd.mod.DragDropContext] {
    
    inline def dragHandleUsageInstructions(value: String): this.type = set("dragHandleUsageInstructions", value.asInstanceOf[js.Any])
    
    inline def enableDefaultSensors(value: Boolean): this.type = set("enableDefaultSensors", value.asInstanceOf[js.Any])
    
    inline def nonce(value: String): this.type = set("nonce", value.asInstanceOf[js.Any])
    
    inline def onBeforeCapture(value: /* before */ BeforeCapture => Callback): this.type = set("onBeforeCapture", js.Any.fromFunction1((t0: /* before */ BeforeCapture) => value(t0).runNow()))
    
    inline def onBeforeDragStart(value: /* initial */ DragStart => Callback): this.type = set("onBeforeDragStart", js.Any.fromFunction1((t0: /* initial */ DragStart) => value(t0).runNow()))
    
    inline def onDragStart(value: (/* initial */ DragStart, /* provided */ ResponderProvided) => Callback): this.type = set("onDragStart", js.Any.fromFunction2((t0: /* initial */ DragStart, t1: /* provided */ ResponderProvided) => (value(t0, t1)).runNow()))
    
    inline def onDragUpdate(value: (/* initial */ DragUpdate, /* provided */ ResponderProvided) => Callback): this.type = set("onDragUpdate", js.Any.fromFunction2((t0: /* initial */ DragUpdate, t1: /* provided */ ResponderProvided) => (value(t0, t1)).runNow()))
    
    inline def sensors(value: js.Array[Sensor]): this.type = set("sensors", value.asInstanceOf[js.Any])
    
    inline def sensorsVarargs(value: Sensor*): this.type = set("sensors", js.Array(value*))
  }
  
  def withProps(p: DragDropContextProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
