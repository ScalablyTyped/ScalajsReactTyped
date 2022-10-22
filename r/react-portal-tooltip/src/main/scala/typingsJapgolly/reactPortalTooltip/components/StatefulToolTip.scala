package typingsJapgolly.reactPortalTooltip.components

import japgolly.scalajs.react.facade.React.RefHandle
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactPortalTooltip.anon.ArrowStyle
import typingsJapgolly.reactPortalTooltip.libCardMod.Card.Align
import typingsJapgolly.reactPortalTooltip.libCardMod.Card.Arrow
import typingsJapgolly.reactPortalTooltip.libCardMod.Card.Position
import typingsJapgolly.reactPortalTooltip.libStatefulToolTipMod.StatefulToolTipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StatefulToolTip {
  
  inline def apply(parent: String | Element | RefHandle[Any]): Builder = {
    val __props = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[StatefulToolTipProps]))
  }
  
  @JSImport("react-portal-tooltip", "StatefulToolTip")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactPortalTooltip.mod.StatefulToolTip] {
    
    inline def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    inline def align(value: Align): this.type = set("align", value.asInstanceOf[js.Any])
    
    inline def alignNull: this.type = set("align", null)
    
    inline def arrow(value: Arrow): this.type = set("arrow", value.asInstanceOf[js.Any])
    
    inline def arrowNull: this.type = set("arrow", null)
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def group(value: String): this.type = set("group", value.asInstanceOf[js.Any])
    
    inline def position(value: Position): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def style(value: ArrowStyle): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tooltipTimeout(value: Double): this.type = set("tooltipTimeout", value.asInstanceOf[js.Any])
    
    inline def useHover(value: Boolean): this.type = set("useHover", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StatefulToolTipProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
