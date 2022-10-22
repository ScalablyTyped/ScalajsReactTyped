package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUi.MaterialUI.Card.CardHeaderProps
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CardHeader {
  
  @JSImport("material-ui", "CardHeader")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.materialUi.mod.CardHeader] {
    
    inline def actAsExpander(value: Boolean): this.type = set("actAsExpander", value.asInstanceOf[js.Any])
    
    inline def avatar(value: VdomNode): this.type = set("avatar", value.rawNode.asInstanceOf[js.Any])
    
    inline def avatarNull: this.type = set("avatar", null)
    
    inline def avatarVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("avatar", js.Array(value*))
    
    inline def avatarVdomElement(value: VdomElement): this.type = set("avatar", value.rawElement.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def closeIcon(value: VdomNode): this.type = set("closeIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def closeIconNull: this.type = set("closeIcon", null)
    
    inline def closeIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("closeIcon", js.Array(value*))
    
    inline def closeIconVdomElement(value: VdomElement): this.type = set("closeIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def expandable(value: Boolean): this.type = set("expandable", value.asInstanceOf[js.Any])
    
    inline def iconStyle(value: CSSProperties): this.type = set("iconStyle", value.asInstanceOf[js.Any])
    
    inline def openIcon(value: VdomNode): this.type = set("openIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def openIconNull: this.type = set("openIcon", null)
    
    inline def openIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("openIcon", js.Array(value*))
    
    inline def openIconVdomElement(value: VdomElement): this.type = set("openIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def showExpandableButton(value: Boolean): this.type = set("showExpandableButton", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def subtitle(value: VdomNode): this.type = set("subtitle", value.rawNode.asInstanceOf[js.Any])
    
    inline def subtitleColor(value: String): this.type = set("subtitleColor", value.asInstanceOf[js.Any])
    
    inline def subtitleNull: this.type = set("subtitle", null)
    
    inline def subtitleStyle(value: CSSProperties): this.type = set("subtitleStyle", value.asInstanceOf[js.Any])
    
    inline def subtitleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("subtitle", js.Array(value*))
    
    inline def subtitleVdomElement(value: VdomElement): this.type = set("subtitle", value.rawElement.asInstanceOf[js.Any])
    
    inline def textStyle(value: CSSProperties): this.type = set("textStyle", value.asInstanceOf[js.Any])
    
    inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
    
    inline def titleColor(value: String): this.type = set("titleColor", value.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleStyle(value: CSSProperties): this.type = set("titleStyle", value.asInstanceOf[js.Any])
    
    inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: CardHeader.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CardHeaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
