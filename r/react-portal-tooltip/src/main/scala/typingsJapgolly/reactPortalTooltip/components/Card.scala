package typingsJapgolly.reactPortalTooltip.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactPortalTooltip.anon.ArrowStyle
import typingsJapgolly.reactPortalTooltip.libCardMod.Card.Align
import typingsJapgolly.reactPortalTooltip.libCardMod.Card.Arrow
import typingsJapgolly.reactPortalTooltip.libCardMod.Card.CardProps
import typingsJapgolly.reactPortalTooltip.libCardMod.Card.Position
import typingsJapgolly.reactPortalTooltip.libCardMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Card {
  
  @JSImport("react-portal-tooltip/lib/Card", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def align(value: Align): this.type = set("align", value.asInstanceOf[js.Any])
    
    inline def alignNull: this.type = set("align", null)
    
    inline def arrow(value: Arrow): this.type = set("arrow", value.asInstanceOf[js.Any])
    
    inline def arrowNull: this.type = set("arrow", null)
    
    inline def position(value: Position): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def style(value: ArrowStyle): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def useHover(value: Boolean): this.type = set("useHover", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Card.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CardProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
