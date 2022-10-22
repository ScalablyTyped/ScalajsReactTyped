package typingsJapgolly.blueprintjsTable.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsTable.libEsmInteractionsResizeHandleMod.IResizeHandleProps
import typingsJapgolly.blueprintjsTable.libEsmInteractionsResizeHandleMod.Orientation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ResizeHandle {
  
  inline def apply(onLayoutLock: js.UndefOr[Boolean] => Callback, orientation: Orientation): Builder = {
    val __props = js.Dynamic.literal(onLayoutLock = js.Any.fromFunction1((t0: js.UndefOr[Boolean]) => onLayoutLock(t0).runNow()), orientation = orientation.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IResizeHandleProps]))
  }
  
  @JSImport("@blueprintjs/table", "ResizeHandle")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsTable.mod.ResizeHandle] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def onDoubleClick(value: Callback): this.type = set("onDoubleClick", value.toJsFn)
    
    inline def onResizeEnd(value: /* offset */ Double => Callback): this.type = set("onResizeEnd", js.Any.fromFunction1((t0: /* offset */ Double) => value(t0).runNow()))
    
    inline def onResizeMove(value: (/* offset */ Double, /* delta */ Double) => Callback): this.type = set("onResizeMove", js.Any.fromFunction2((t0: /* offset */ Double, t1: /* delta */ Double) => (value(t0, t1)).runNow()))
  }
  
  def withProps(p: IResizeHandleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
