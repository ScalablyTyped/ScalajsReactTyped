package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.cardTypesMod.CardOverrides
import typingsJapgolly.baseui.cardTypesMod.CardProps
import typingsJapgolly.baseui.cardTypesMod.ImageProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Card {
  
  inline def apply(overrides: CardOverrides): Builder = {
    val __props = js.Dynamic.literal(overrides = overrides.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CardProps]))
  }
  
  @JSImport("baseui/card", "Card")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def action(value: VdomNode): this.type = set("action", value.rawNode.asInstanceOf[js.Any])
    
    inline def actionNull: this.type = set("action", null)
    
    inline def actionVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("action", js.Array(value*))
    
    inline def actionVdomElement(value: VdomElement): this.type = set("action", value.rawElement.asInstanceOf[js.Any])
    
    inline def hasThumbnail(value: /* a */ typingsJapgolly.baseui.anon.Thumbnail => Boolean): this.type = set("hasThumbnail", js.Any.fromFunction1(value))
    
    inline def headerImage(value: String | ImageProps): this.type = set("headerImage", value.asInstanceOf[js.Any])
    
    inline def thumbnail(value: String): this.type = set("thumbnail", value.asInstanceOf[js.Any])
    
    inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
  }
  
  def withProps(p: CardProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
