package typingsJapgolly.blueprintjsTable.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.MouseEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsTable.libEsmInteractionsDragTypesMod.ICoordinateData
import typingsJapgolly.blueprintjsTable.libEsmInteractionsDraggableMod.IDraggableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Draggable {
  
  @JSImport("@blueprintjs/table", "Draggable")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsTable.mod.Draggable] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def onActivate(value: /* event */ MouseEvent => Boolean): this.type = set("onActivate", js.Any.fromFunction1(value))
    
    inline def onClick(value: /* event */ MouseEvent => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: /* event */ MouseEvent) => value(t0).runNow()))
    
    inline def onDoubleClick(value: /* event */ MouseEvent => Callback): this.type = set("onDoubleClick", js.Any.fromFunction1((t0: /* event */ MouseEvent) => value(t0).runNow()))
    
    inline def onDragEnd(value: (/* event */ MouseEvent, /* coords */ ICoordinateData) => Callback): this.type = set("onDragEnd", js.Any.fromFunction2((t0: /* event */ MouseEvent, t1: /* coords */ ICoordinateData) => (value(t0, t1)).runNow()))
    
    inline def onDragMove(value: (/* event */ MouseEvent, /* coords */ ICoordinateData) => Callback): this.type = set("onDragMove", js.Any.fromFunction2((t0: /* event */ MouseEvent, t1: /* coords */ ICoordinateData) => (value(t0, t1)).runNow()))
    
    inline def preventDefault(value: Boolean): this.type = set("preventDefault", value.asInstanceOf[js.Any])
    
    inline def stopPropagation(value: Boolean): this.type = set("stopPropagation", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Draggable.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IDraggableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
