package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsCore.libEsmComponentsPanelStackPanelPropsMod.IPanel
import typingsJapgolly.blueprintjsCore.libEsmComponentsPanelStackPanelViewMod.IPanelViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PanelView {
  
  inline def apply(
    onClose: IPanel[Any] => Callback,
    onOpen: IPanel[Any] => Callback,
    panel: IPanel[js.Object],
    showHeader: Boolean
  ): Builder = {
    val __props = js.Dynamic.literal(onClose = js.Any.fromFunction1((t0: IPanel[Any]) => onClose(t0).runNow()), onOpen = js.Any.fromFunction1((t0: IPanel[Any]) => onOpen(t0).runNow()), panel = panel.asInstanceOf[js.Any], showHeader = showHeader.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IPanelViewProps]))
  }
  
  @JSImport("@blueprintjs/core/lib/esm/components/panel-stack/panelView", "PanelView")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsCore.libEsmComponentsPanelStackPanelViewMod.PanelView] {
    
    inline def previousPanel(value: IPanel[js.Object]): this.type = set("previousPanel", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IPanelViewProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
