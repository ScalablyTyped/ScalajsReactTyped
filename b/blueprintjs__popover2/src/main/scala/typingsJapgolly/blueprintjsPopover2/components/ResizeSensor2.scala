package typingsJapgolly.blueprintjsPopover2.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsPopover2.libEsmResizeSensor2Mod.ResizeSensor2Props
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.std.ResizeObserverEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ResizeSensor2 {
  
  inline def apply(onResize: js.Array[ResizeObserverEntry] => Callback): Builder = {
    val __props = js.Dynamic.literal(onResize = js.Any.fromFunction1((t0: js.Array[ResizeObserverEntry]) => onResize(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[ResizeSensor2Props]))
  }
  
  @JSImport("@blueprintjs/popover2", "ResizeSensor2")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsPopover2.mod.ResizeSensor2] {
    
    inline def observeParents(value: Boolean): this.type = set("observeParents", value.asInstanceOf[js.Any])
    
    inline def targetRef(value: Ref[Any]): this.type = set("targetRef", value.asInstanceOf[js.Any])
    
    inline def targetRefFunction1(value: Any | Null => Callback): this.type = set("targetRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def targetRefNull: this.type = set("targetRef", null)
  }
  
  def withProps(p: ResizeSensor2Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
