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
import typingsJapgolly.semanticUiReact.distCommonjsElementsListListContentMod.ListContentProps
import typingsJapgolly.semanticUiReact.distCommonjsElementsListListDescriptionMod.ListDescriptionProps
import typingsJapgolly.semanticUiReact.distCommonjsElementsListListHeaderMod.ListHeaderProps
import typingsJapgolly.semanticUiReact.distCommonjsElementsListListIconMod.ListIconProps
import typingsJapgolly.semanticUiReact.distCommonjsElementsListListItemMod.ListItemProps
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_ListItemProps_1291039995 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
  
  inline def as(value: Any): this.type = set("as", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def content(value: SemanticShorthandItem[ListContentProps]): this.type = set("content", value.asInstanceOf[js.Any])
  
  inline def contentFunction3(
    value: (/* component */ ElementType, ListContentProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
  ): this.type = set("content", js.Any.fromFunction3(value))
  
  inline def contentNull: this.type = set("content", null)
  
  inline def contentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("content", js.Array(value*))
  
  inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
  
  inline def description(value: SemanticShorthandItem[ListDescriptionProps]): this.type = set("description", value.asInstanceOf[js.Any])
  
  inline def descriptionFunction3(
    value: (/* component */ ElementType, ListDescriptionProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
  ): this.type = set("description", js.Any.fromFunction3(value))
  
  inline def descriptionNull: this.type = set("description", null)
  
  inline def descriptionVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("description", js.Array(value*))
  
  inline def descriptionVdomElement(value: VdomElement): this.type = set("description", value.rawElement.asInstanceOf[js.Any])
  
  inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  inline def header(value: SemanticShorthandItem[ListHeaderProps]): this.type = set("header", value.asInstanceOf[js.Any])
  
  inline def headerFunction3(
    value: (/* component */ ElementType, ListHeaderProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
  ): this.type = set("header", js.Any.fromFunction3(value))
  
  inline def headerNull: this.type = set("header", null)
  
  inline def headerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("header", js.Array(value*))
  
  inline def headerVdomElement(value: VdomElement): this.type = set("header", value.rawElement.asInstanceOf[js.Any])
  
  inline def icon(value: SemanticShorthandItem[ListIconProps]): this.type = set("icon", value.asInstanceOf[js.Any])
  
  inline def iconFunction3(
    value: (/* component */ ElementType, ListIconProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
  ): this.type = set("icon", js.Any.fromFunction3(value))
  
  inline def iconNull: this.type = set("icon", null)
  
  inline def iconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("icon", js.Array(value*))
  
  inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
  
  inline def image(value: SemanticShorthandItem[ImageProps]): this.type = set("image", value.asInstanceOf[js.Any])
  
  inline def imageFunction3(
    value: (/* component */ ElementType, ImageProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
  ): this.type = set("image", js.Any.fromFunction3(value))
  
  inline def imageNull: this.type = set("image", null)
  
  inline def imageVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("image", js.Array(value*))
  
  inline def imageVdomElement(value: VdomElement): this.type = set("image", value.rawElement.asInstanceOf[js.Any])
  
  inline def onClick(value: (/* event */ ReactMouseEventFrom[HTMLAnchorElement], /* data */ ListItemProps) => Callback): this.type = set("onClick", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLAnchorElement], t1: /* data */ ListItemProps) => (value(t0, t1)).runNow()))
  
  inline def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
}
