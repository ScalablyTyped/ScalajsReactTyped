package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUi.MaterialUI.Card.CardMediaProps
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CardMedia {
  
  @JSImport("material-ui", "CardMedia")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.materialUi.mod.CardMedia] {
    
    inline def actAsExpander(value: Boolean): this.type = set("actAsExpander", value.asInstanceOf[js.Any])
    
    inline def expandable(value: Boolean): this.type = set("expandable", value.asInstanceOf[js.Any])
    
    inline def mediaStyle(value: CSSProperties): this.type = set("mediaStyle", value.asInstanceOf[js.Any])
    
    inline def overlay(value: VdomNode): this.type = set("overlay", value.rawNode.asInstanceOf[js.Any])
    
    inline def overlayContainerStyle(value: CSSProperties): this.type = set("overlayContainerStyle", value.asInstanceOf[js.Any])
    
    inline def overlayContentStyle(value: CSSProperties): this.type = set("overlayContentStyle", value.asInstanceOf[js.Any])
    
    inline def overlayNull: this.type = set("overlay", null)
    
    inline def overlayStyle(value: CSSProperties): this.type = set("overlayStyle", value.asInstanceOf[js.Any])
    
    inline def overlayVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("overlay", js.Array(value*))
    
    inline def overlayVdomElement(value: VdomElement): this.type = set("overlay", value.rawElement.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: CardMedia.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CardMediaProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
