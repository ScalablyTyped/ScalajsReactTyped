package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsCore.libEsmComponentsPanelStackPanelPropsMod.IPanel
import typingsJapgolly.blueprintjsCore.libEsmComponentsPanelStackPanelStackMod.IPanelStackProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PanelStack {
  
  @JSImport("@blueprintjs/core", "PanelStack")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsCore.mod.PanelStack] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def initialPanel(value: IPanel[Any]): this.type = set("initialPanel", value.asInstanceOf[js.Any])
    
    inline def onClose(value: /* removedPanel */ IPanel[js.Object] => Callback): this.type = set("onClose", js.Any.fromFunction1((t0: /* removedPanel */ IPanel[js.Object]) => value(t0).runNow()))
    
    inline def onOpen(value: /* addedPanel */ IPanel[js.Object] => Callback): this.type = set("onOpen", js.Any.fromFunction1((t0: /* addedPanel */ IPanel[js.Object]) => value(t0).runNow()))
    
    inline def renderActivePanelOnly(value: Boolean): this.type = set("renderActivePanelOnly", value.asInstanceOf[js.Any])
    
    inline def showPanelHeader(value: Boolean): this.type = set("showPanelHeader", value.asInstanceOf[js.Any])
    
    inline def stack(value: js.Array[IPanel[Any]]): this.type = set("stack", value.asInstanceOf[js.Any])
    
    inline def stackVarargs(value: IPanel[Any]*): this.type = set("stack", js.Array(value*))
  }
  
  implicit def make(companion: PanelStack.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IPanelStackProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
