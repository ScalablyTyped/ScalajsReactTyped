package typingsJapgolly.semanticUiReact.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ReactNodeArray
import typingsJapgolly.semanticUiReact.distCommonjsElementsImageImageMod.ImageProps
import typingsJapgolly.semanticUiReact.distCommonjsElementsLabelLabelMod.LabelProps
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticFLOATS
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticSIZES
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS
import typingsJapgolly.semanticUiReact.distCommonjsModulesDimmerDimmerMod.DimmerProps
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.left
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ItemImage {
  
  @JSImport("semantic-ui-react", "ItemImage")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def as(value: Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def avatar(value: Boolean): this.type = set("avatar", value.asInstanceOf[js.Any])
    
    inline def bordered(value: Boolean): this.type = set("bordered", value.asInstanceOf[js.Any])
    
    inline def centered(value: Boolean): this.type = set("centered", value.asInstanceOf[js.Any])
    
    inline def circular(value: Boolean): this.type = set("circular", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
    
    inline def contentNull: this.type = set("content", null)
    
    inline def contentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("content", js.Array(value*))
    
    inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
    
    inline def dimmer(value: SemanticShorthandItem[DimmerProps]): this.type = set("dimmer", value.asInstanceOf[js.Any])
    
    inline def dimmerFunction3(
      value: (/* component */ ElementType, DimmerProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
    ): this.type = set("dimmer", js.Any.fromFunction3(value))
    
    inline def dimmerNull: this.type = set("dimmer", null)
    
    inline def dimmerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("dimmer", js.Array(value*))
    
    inline def dimmerVdomElement(value: VdomElement): this.type = set("dimmer", value.rawElement.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def floated(value: SemanticFLOATS): this.type = set("floated", value.asInstanceOf[js.Any])
    
    inline def fluid(value: Boolean): this.type = set("fluid", value.asInstanceOf[js.Any])
    
    inline def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    inline def href(value: String): this.type = set("href", value.asInstanceOf[js.Any])
    
    inline def `inline`(value: Boolean): this.type = set("inline", value.asInstanceOf[js.Any])
    
    inline def label(value: SemanticShorthandItem[LabelProps]): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def labelFunction3(
      value: (/* component */ ElementType, LabelProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
    ): this.type = set("label", js.Any.fromFunction3(value))
    
    inline def labelNull: this.type = set("label", null)
    
    inline def labelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("label", js.Array(value*))
    
    inline def labelVdomElement(value: VdomElement): this.type = set("label", value.rawElement.asInstanceOf[js.Any])
    
    inline def rounded(value: Boolean): this.type = set("rounded", value.asInstanceOf[js.Any])
    
    inline def size(value: SemanticSIZES): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def spaced(value: Boolean | left | right): this.type = set("spaced", value.asInstanceOf[js.Any])
    
    inline def ui(value: Boolean): this.type = set("ui", value.asInstanceOf[js.Any])
    
    inline def verticalAlign(value: SemanticVERTICALALIGNMENTS): this.type = set("verticalAlign", value.asInstanceOf[js.Any])
    
    inline def wrapped(value: Boolean): this.type = set("wrapped", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ItemImage.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ImageProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
