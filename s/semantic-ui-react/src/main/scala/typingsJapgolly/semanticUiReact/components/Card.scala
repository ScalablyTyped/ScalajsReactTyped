package typingsJapgolly.semanticUiReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLAnchorElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ReactNodeArray
import typingsJapgolly.semanticUiReact.distCommonjsElementsImageImageMod.ImageProps
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticCOLORS
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsJapgolly.semanticUiReact.distCommonjsViewsCardCardContentMod.CardContentProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsCardCardDescriptionMod.CardDescriptionProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsCardCardGroupMod.CardGroupProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsCardCardHeaderMod.CardHeaderProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsCardCardMetaMod.CardMetaProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsCardCardMod.CardProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Card {
  
  object Content {
    
    @JSImport("semantic-ui-react", "Card.Content")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Content.type): SharedBuilder_CardContentProps_1425910179 = new SharedBuilder_CardContentProps_1425910179(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: CardContentProps): SharedBuilder_CardContentProps_1425910179 = new SharedBuilder_CardContentProps_1425910179(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Description {
    
    @JSImport("semantic-ui-react", "Card.Description")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Description.type): SharedBuilder_CardDescriptionProps733411506 = new SharedBuilder_CardDescriptionProps733411506(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: CardDescriptionProps): SharedBuilder_CardDescriptionProps733411506 = new SharedBuilder_CardDescriptionProps733411506(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Group {
    
    @JSImport("semantic-ui-react", "Card.Group")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Group.type): SharedBuilder_CardGroupProps368716750 = new SharedBuilder_CardGroupProps368716750(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: CardGroupProps): SharedBuilder_CardGroupProps368716750 = new SharedBuilder_CardGroupProps368716750(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Header {
    
    @JSImport("semantic-ui-react", "Card.Header")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Header.type): SharedBuilder_CardHeaderProps586099955 = new SharedBuilder_CardHeaderProps586099955(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: CardHeaderProps): SharedBuilder_CardHeaderProps586099955 = new SharedBuilder_CardHeaderProps586099955(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Meta {
    
    @JSImport("semantic-ui-react", "Card.Meta")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Meta.type): SharedBuilder_CardMetaProps_2106210004 = new SharedBuilder_CardMetaProps_2106210004(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: CardMetaProps): SharedBuilder_CardMetaProps_2106210004 = new SharedBuilder_CardMetaProps_2106210004(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("semantic-ui-react", "Card")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def as(value: Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def centered(value: Boolean): this.type = set("centered", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def color(value: SemanticCOLORS): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
    
    inline def contentNull: this.type = set("content", null)
    
    inline def contentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("content", js.Array(value*))
    
    inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
    
    inline def description(value: SemanticShorthandItem[CardDescriptionProps]): this.type = set("description", value.asInstanceOf[js.Any])
    
    inline def descriptionFunction3(
      value: (/* component */ ElementType, CardDescriptionProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
    ): this.type = set("description", js.Any.fromFunction3(value))
    
    inline def descriptionNull: this.type = set("description", null)
    
    inline def descriptionVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("description", js.Array(value*))
    
    inline def descriptionVdomElement(value: VdomElement): this.type = set("description", value.rawElement.asInstanceOf[js.Any])
    
    inline def extra(value: SemanticShorthandContent): this.type = set("extra", value.asInstanceOf[js.Any])
    
    inline def extraNull: this.type = set("extra", null)
    
    inline def extraVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("extra", js.Array(value*))
    
    inline def extraVdomElement(value: VdomElement): this.type = set("extra", value.rawElement.asInstanceOf[js.Any])
    
    inline def fluid(value: Boolean): this.type = set("fluid", value.asInstanceOf[js.Any])
    
    inline def header(value: SemanticShorthandItem[CardHeaderProps]): this.type = set("header", value.asInstanceOf[js.Any])
    
    inline def headerFunction3(
      value: (/* component */ ElementType, CardHeaderProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
    ): this.type = set("header", js.Any.fromFunction3(value))
    
    inline def headerNull: this.type = set("header", null)
    
    inline def headerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("header", js.Array(value*))
    
    inline def headerVdomElement(value: VdomElement): this.type = set("header", value.rawElement.asInstanceOf[js.Any])
    
    inline def href(value: String): this.type = set("href", value.asInstanceOf[js.Any])
    
    inline def image(value: SemanticShorthandItem[ImageProps]): this.type = set("image", value.asInstanceOf[js.Any])
    
    inline def imageFunction3(
      value: (/* component */ ElementType, ImageProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
    ): this.type = set("image", js.Any.fromFunction3(value))
    
    inline def imageNull: this.type = set("image", null)
    
    inline def imageVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("image", js.Array(value*))
    
    inline def imageVdomElement(value: VdomElement): this.type = set("image", value.rawElement.asInstanceOf[js.Any])
    
    inline def link(value: Boolean): this.type = set("link", value.asInstanceOf[js.Any])
    
    inline def meta(value: SemanticShorthandItem[CardMetaProps]): this.type = set("meta", value.asInstanceOf[js.Any])
    
    inline def metaFunction3(
      value: (/* component */ ElementType, CardMetaProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
    ): this.type = set("meta", js.Any.fromFunction3(value))
    
    inline def metaNull: this.type = set("meta", null)
    
    inline def metaVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("meta", js.Array(value*))
    
    inline def metaVdomElement(value: VdomElement): this.type = set("meta", value.rawElement.asInstanceOf[js.Any])
    
    inline def onClick(value: (/* event */ ReactMouseEventFrom[HTMLAnchorElement], /* data */ CardProps) => Callback): this.type = set("onClick", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLAnchorElement], t1: /* data */ CardProps) => (value(t0, t1)).runNow()))
    
    inline def raised(value: Boolean): this.type = set("raised", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Card.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CardProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
