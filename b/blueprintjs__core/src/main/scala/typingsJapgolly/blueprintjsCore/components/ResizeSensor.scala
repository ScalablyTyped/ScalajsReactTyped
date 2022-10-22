package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsCore.libEsmComponentsResizeSensorResizeSensorMod.IResizeSensorProps
import typingsJapgolly.std.ResizeObserverEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ResizeSensor {
  
  inline def apply(onResize: js.Array[ResizeObserverEntry] => Callback): Builder = {
    val __props = js.Dynamic.literal(onResize = js.Any.fromFunction1((t0: js.Array[ResizeObserverEntry]) => onResize(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[IResizeSensorProps]))
  }
  
  @JSImport("@blueprintjs/core", "ResizeSensor")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsCore.mod.ResizeSensor] {
    
    inline def observeParents(value: Boolean): this.type = set("observeParents", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IResizeSensorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
