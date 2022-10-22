package typingsJapgolly.blueprintjsTable.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsTable.libEsmInteractionsResizableMod.IResizableProps
import typingsJapgolly.blueprintjsTable.libEsmInteractionsResizeHandleMod.Orientation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Resizable {
  
  inline def apply(onLayoutLock: js.UndefOr[Boolean] => Callback, orientation: Orientation, size: Double): Builder = {
    val __props = js.Dynamic.literal(onLayoutLock = js.Any.fromFunction1((t0: js.UndefOr[Boolean]) => onLayoutLock(t0).runNow()), orientation = orientation.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IResizableProps]))
  }
  
  @JSImport("@blueprintjs/table/lib/esm/interactions/resizable", "Resizable")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsTable.libEsmInteractionsResizableMod.Resizable] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def isResizable(value: Boolean): this.type = set("isResizable", value.asInstanceOf[js.Any])
    
    inline def maxSize(value: Double): this.type = set("maxSize", value.asInstanceOf[js.Any])
    
    inline def minSize(value: Double): this.type = set("minSize", value.asInstanceOf[js.Any])
    
    inline def onDoubleClick(value: Callback): this.type = set("onDoubleClick", value.toJsFn)
    
    inline def onResizeEnd(value: /* size */ Double => Callback): this.type = set("onResizeEnd", js.Any.fromFunction1((t0: /* size */ Double) => value(t0).runNow()))
    
    inline def onSizeChanged(value: /* size */ Double => Callback): this.type = set("onSizeChanged", js.Any.fromFunction1((t0: /* size */ Double) => value(t0).runNow()))
  }
  
  def withProps(p: IResizableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
