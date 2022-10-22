package typingsJapgolly.semanticUiReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ReactNodeArray
import typingsJapgolly.semanticUiReact.distCommonjsElementsIconIconMod.IconProps
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.HtmlIframeProps
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsJapgolly.semanticUiReact.distCommonjsModulesEmbedEmbedMod.EmbedProps
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`16Colon9`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`21Colon9`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`4Colon3`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.vimeo
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.youtube
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Embed {
  
  @JSImport("semantic-ui-react", "Embed")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.semanticUiReact.mod.Embed] {
    
    inline def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    inline def as(value: Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def aspectRatio(value: `4Colon3` | `16Colon9` | `21Colon9`): this.type = set("aspectRatio", value.asInstanceOf[js.Any])
    
    inline def autoplay(value: Boolean): this.type = set("autoplay", value.asInstanceOf[js.Any])
    
    inline def brandedUI(value: Boolean): this.type = set("brandedUI", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
    
    inline def contentNull: this.type = set("content", null)
    
    inline def contentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("content", js.Array(value*))
    
    inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
    
    inline def defaultActive(value: Boolean): this.type = set("defaultActive", value.asInstanceOf[js.Any])
    
    inline def hd(value: Boolean): this.type = set("hd", value.asInstanceOf[js.Any])
    
    inline def icon(value: SemanticShorthandItem[IconProps]): this.type = set("icon", value.asInstanceOf[js.Any])
    
    inline def iconFunction3(
      value: (/* component */ ElementType, IconProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
    ): this.type = set("icon", js.Any.fromFunction3(value))
    
    inline def iconNull: this.type = set("icon", null)
    
    inline def iconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("icon", js.Array(value*))
    
    inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def iframe(value: SemanticShorthandItem[HtmlIframeProps]): this.type = set("iframe", value.asInstanceOf[js.Any])
    
    inline def iframeFunction3(
      value: (/* component */ ElementType, HtmlIframeProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
    ): this.type = set("iframe", js.Any.fromFunction3(value))
    
    inline def iframeNull: this.type = set("iframe", null)
    
    inline def iframeVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("iframe", js.Array(value*))
    
    inline def iframeVdomElement(value: VdomElement): this.type = set("iframe", value.rawElement.asInstanceOf[js.Any])
    
    inline def onClick(value: (/* event */ ReactMouseEventFrom[HTMLDivElement], /* data */ EmbedProps) => Callback): this.type = set("onClick", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLDivElement], t1: /* data */ EmbedProps) => (value(t0, t1)).runNow()))
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def source(value: youtube | vimeo): this.type = set("source", value.asInstanceOf[js.Any])
    
    inline def url(value: String): this.type = set("url", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Embed.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: EmbedProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
