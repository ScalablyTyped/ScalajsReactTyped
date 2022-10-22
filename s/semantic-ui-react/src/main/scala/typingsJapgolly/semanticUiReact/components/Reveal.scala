package typingsJapgolly.semanticUiReact.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.semanticUiReact.distCommonjsElementsRevealRevealContentMod.RevealContentProps
import typingsJapgolly.semanticUiReact.distCommonjsElementsRevealRevealMod.RevealProps
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`move down`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`move right`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`move up`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`rotate left`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`small fade`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.fade
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.move
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.rotate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Reveal {
  
  object Content {
    
    @JSImport("semantic-ui-react", "Reveal.Content")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Content.type): SharedBuilder_RevealContentProps272703396 = new SharedBuilder_RevealContentProps272703396(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: RevealContentProps): SharedBuilder_RevealContentProps272703396 = new SharedBuilder_RevealContentProps272703396(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("semantic-ui-react", "Reveal")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    inline def animated(
      value: fade | (`small fade`) | move | (`move right`) | (`move up`) | (`move down`) | rotate | (`rotate left`)
    ): this.type = set("animated", value.asInstanceOf[js.Any])
    
    inline def as(value: Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
    
    inline def contentNull: this.type = set("content", null)
    
    inline def contentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("content", js.Array(value*))
    
    inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def instant(value: Boolean): this.type = set("instant", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Reveal.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RevealProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
