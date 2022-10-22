package typingsJapgolly.orbitUiReactComponents.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.orbitUiReactComponents.distTabsSrcTabPanelMod.InnerTabPanelProps
import typingsJapgolly.orbitUiReactComponents.distTabsSrcUseTabsItemsMod.PanelType
import typingsJapgolly.react.mod.ForwardedRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InnerTabPanel {
  
  inline def apply(panel: PanelType): Builder = {
    val __props = js.Dynamic.literal(panel = panel.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[InnerTabPanelProps]))
  }
  
  @JSImport("@orbit-ui/react-components", "InnerTabPanel")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def as(value: ElementType): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def forwardedRef(value: ForwardedRef[Any]): this.type = set("forwardedRef", value.asInstanceOf[js.Any])
    
    inline def forwardedRefFunction1(value: /* instance */ Any | Null => Callback): this.type = set("forwardedRef", js.Any.fromFunction1((t0: /* instance */ Any | Null) => value(t0).runNow()))
    
    inline def forwardedRefNull: this.type = set("forwardedRef", null)
  }
  
  def withProps(p: InnerTabPanelProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
