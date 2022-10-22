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
import typingsJapgolly.semanticUiReact.distCommonjsViewsItemItemContentMod.ItemContentProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsItemItemDescriptionMod.ItemDescriptionProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsItemItemExtraMod.ItemExtraProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsItemItemGroupMod.ItemGroupProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsItemItemHeaderMod.ItemHeaderProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsItemItemImageMod.ItemImageProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsItemItemMetaMod.ItemMetaProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsItemItemMod.ItemProps
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.left
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Item {
  
  object Content {
    
    @JSImport("semantic-ui-react", "Item.Content")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Content.type): SharedBuilder_ItemContentProps851012437[typingsJapgolly.semanticUiReact.mod.Item.Content] = new SharedBuilder_ItemContentProps851012437[typingsJapgolly.semanticUiReact.mod.Item.Content](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ItemContentProps): SharedBuilder_ItemContentProps851012437[typingsJapgolly.semanticUiReact.mod.Item.Content] = new SharedBuilder_ItemContentProps851012437[typingsJapgolly.semanticUiReact.mod.Item.Content](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Description {
    
    @JSImport("semantic-ui-react", "Item.Description")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Description.type): SharedBuilder_ItemDescriptionProps1575465241 = new SharedBuilder_ItemDescriptionProps1575465241(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ItemDescriptionProps): SharedBuilder_ItemDescriptionProps1575465241 = new SharedBuilder_ItemDescriptionProps1575465241(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Extra {
    
    @JSImport("semantic-ui-react", "Item.Extra")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Extra.type): SharedBuilder_ItemExtraProps_1373826181 = new SharedBuilder_ItemExtraProps_1373826181(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ItemExtraProps): SharedBuilder_ItemExtraProps_1373826181 = new SharedBuilder_ItemExtraProps_1373826181(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Group {
    
    @JSImport("semantic-ui-react", "Item.Group")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Group.type): SharedBuilder_ItemGroupProps238763249 = new SharedBuilder_ItemGroupProps238763249(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ItemGroupProps): SharedBuilder_ItemGroupProps238763249 = new SharedBuilder_ItemGroupProps238763249(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Header {
    
    @JSImport("semantic-ui-react", "Item.Header")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Header.type): SharedBuilder_ItemHeaderProps1790006180 = new SharedBuilder_ItemHeaderProps1790006180(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ItemHeaderProps): SharedBuilder_ItemHeaderProps1790006180 = new SharedBuilder_ItemHeaderProps1790006180(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Image {
    
    @JSImport("semantic-ui-react", "Item.Image")
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
    
    implicit def make(companion: Image.type): typingsJapgolly.semanticUiReact.components.Item.Image.Builder = new typingsJapgolly.semanticUiReact.components.Item.Image.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ImageProps): typingsJapgolly.semanticUiReact.components.Item.Image.Builder = new typingsJapgolly.semanticUiReact.components.Item.Image.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Meta {
    
    @JSImport("semantic-ui-react", "Item.Meta")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Meta.type): SharedBuilder_ItemMetaProps174320053 = new SharedBuilder_ItemMetaProps174320053(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ItemMetaProps): SharedBuilder_ItemMetaProps174320053 = new SharedBuilder_ItemMetaProps174320053(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("semantic-ui-react", "Item")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def as(value: Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
    
    inline def contentNull: this.type = set("content", null)
    
    inline def contentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("content", js.Array(value*))
    
    inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
    
    inline def description(value: SemanticShorthandItem[ItemDescriptionProps]): this.type = set("description", value.asInstanceOf[js.Any])
    
    inline def descriptionFunction3(
      value: (/* component */ ElementType, ItemDescriptionProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
    ): this.type = set("description", js.Any.fromFunction3(value))
    
    inline def descriptionNull: this.type = set("description", null)
    
    inline def descriptionVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("description", js.Array(value*))
    
    inline def descriptionVdomElement(value: VdomElement): this.type = set("description", value.rawElement.asInstanceOf[js.Any])
    
    inline def extra(value: SemanticShorthandItem[ItemExtraProps]): this.type = set("extra", value.asInstanceOf[js.Any])
    
    inline def extraFunction3(
      value: (/* component */ ElementType, ItemExtraProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
    ): this.type = set("extra", js.Any.fromFunction3(value))
    
    inline def extraNull: this.type = set("extra", null)
    
    inline def extraVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("extra", js.Array(value*))
    
    inline def extraVdomElement(value: VdomElement): this.type = set("extra", value.rawElement.asInstanceOf[js.Any])
    
    inline def header(value: SemanticShorthandItem[ItemHeaderProps]): this.type = set("header", value.asInstanceOf[js.Any])
    
    inline def headerFunction3(
      value: (/* component */ ElementType, ItemHeaderProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
    ): this.type = set("header", js.Any.fromFunction3(value))
    
    inline def headerNull: this.type = set("header", null)
    
    inline def headerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("header", js.Array(value*))
    
    inline def headerVdomElement(value: VdomElement): this.type = set("header", value.rawElement.asInstanceOf[js.Any])
    
    inline def image(value: SemanticShorthandItem[ItemImageProps]): this.type = set("image", value.asInstanceOf[js.Any])
    
    inline def imageFunction3(
      value: (/* component */ ElementType, ItemImageProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
    ): this.type = set("image", js.Any.fromFunction3(value))
    
    inline def imageNull: this.type = set("image", null)
    
    inline def imageVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("image", js.Array(value*))
    
    inline def imageVdomElement(value: VdomElement): this.type = set("image", value.rawElement.asInstanceOf[js.Any])
    
    inline def meta(value: SemanticShorthandItem[ItemMetaProps]): this.type = set("meta", value.asInstanceOf[js.Any])
    
    inline def metaFunction3(
      value: (/* component */ ElementType, ItemMetaProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
    ): this.type = set("meta", js.Any.fromFunction3(value))
    
    inline def metaNull: this.type = set("meta", null)
    
    inline def metaVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("meta", js.Array(value*))
    
    inline def metaVdomElement(value: VdomElement): this.type = set("meta", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Item.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
