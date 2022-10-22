package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsCore.libEsmComponentsPanelStack2PanelTypesMod.Panel
import typingsJapgolly.blueprintjsCore.libEsmComponentsPanelStack2PanelView2Mod.PanelView2Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PanelView2 {
  
  inline def apply[T /* <: Panel[js.Object] */](onClose: T => Callback, onOpen: T => Callback, panel: T, showHeader: Boolean): Builder[T] = {
    val __props = js.Dynamic.literal(onClose = js.Any.fromFunction1((t0: T) => onClose(t0).runNow()), onOpen = js.Any.fromFunction1((t0: T) => onOpen(t0).runNow()), panel = panel.asInstanceOf[js.Any], showHeader = showHeader.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[PanelView2Props[T]]))
  }
  
  @JSImport("@blueprintjs/core/lib/esm/components/panel-stack2/panelView2", "PanelView2")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T /* <: Panel[js.Object] */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def previousPanel(value: T): this.type = set("previousPanel", value.asInstanceOf[js.Any])
  }
  
  def withProps[T /* <: Panel[js.Object] */](p: PanelView2Props[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
