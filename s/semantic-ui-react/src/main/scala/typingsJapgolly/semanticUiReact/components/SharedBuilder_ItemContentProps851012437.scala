package typingsJapgolly.semanticUiReact.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ReactNodeArray
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS
import typingsJapgolly.semanticUiReact.distCommonjsViewsItemItemDescriptionMod.ItemDescriptionProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsItemItemExtraMod.ItemExtraProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsItemItemHeaderMod.ItemHeaderProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsItemItemMetaMod.ItemMetaProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_ItemContentProps851012437[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
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
  
  inline def meta(value: SemanticShorthandItem[ItemMetaProps]): this.type = set("meta", value.asInstanceOf[js.Any])
  
  inline def metaFunction3(
    value: (/* component */ ElementType, ItemMetaProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
  ): this.type = set("meta", js.Any.fromFunction3(value))
  
  inline def metaNull: this.type = set("meta", null)
  
  inline def metaVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("meta", js.Array(value*))
  
  inline def metaVdomElement(value: VdomElement): this.type = set("meta", value.rawElement.asInstanceOf[js.Any])
  
  inline def verticalAlign(value: SemanticVERTICALALIGNMENTS): this.type = set("verticalAlign", value.asInstanceOf[js.Any])
}
