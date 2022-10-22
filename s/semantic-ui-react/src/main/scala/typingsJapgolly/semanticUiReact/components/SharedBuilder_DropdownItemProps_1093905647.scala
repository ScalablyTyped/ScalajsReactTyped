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
import typingsJapgolly.semanticUiReact.distCommonjsElementsFlagFlagMod.FlagProps
import typingsJapgolly.semanticUiReact.distCommonjsElementsIconIconMod.IconProps
import typingsJapgolly.semanticUiReact.distCommonjsElementsImageImageMod.ImageProps
import typingsJapgolly.semanticUiReact.distCommonjsElementsLabelLabelMod.LabelProps
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.HtmlSpanProps
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsJapgolly.semanticUiReact.distCommonjsModulesDropdownDropdownItemMod.DropdownItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_DropdownItemProps_1093905647[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
  
  inline def as(value: Any): this.type = set("as", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
  
  inline def contentNull: this.type = set("content", null)
  
  inline def contentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("content", js.Array(value*))
  
  inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
  
  inline def description(value: SemanticShorthandItem[HtmlSpanProps]): this.type = set("description", value.asInstanceOf[js.Any])
  
  inline def descriptionFunction3(
    value: (/* component */ ElementType, HtmlSpanProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
  ): this.type = set("description", js.Any.fromFunction3(value))
  
  inline def descriptionNull: this.type = set("description", null)
  
  inline def descriptionVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("description", js.Array(value*))
  
  inline def descriptionVdomElement(value: VdomElement): this.type = set("description", value.rawElement.asInstanceOf[js.Any])
  
  inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  inline def flag(value: SemanticShorthandItem[FlagProps]): this.type = set("flag", value.asInstanceOf[js.Any])
  
  inline def flagFunction3(
    value: (/* component */ ElementType, FlagProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
  ): this.type = set("flag", js.Any.fromFunction3(value))
  
  inline def flagNull: this.type = set("flag", null)
  
  inline def flagVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("flag", js.Array(value*))
  
  inline def flagVdomElement(value: VdomElement): this.type = set("flag", value.rawElement.asInstanceOf[js.Any])
  
  inline def icon(value: SemanticShorthandItem[IconProps]): this.type = set("icon", value.asInstanceOf[js.Any])
  
  inline def iconFunction3(
    value: (/* component */ ElementType, IconProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
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
  
  inline def label(value: SemanticShorthandItem[LabelProps]): this.type = set("label", value.asInstanceOf[js.Any])
  
  inline def labelFunction3(
    value: (/* component */ ElementType, LabelProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
  ): this.type = set("label", js.Any.fromFunction3(value))
  
  inline def labelNull: this.type = set("label", null)
  
  inline def labelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("label", js.Array(value*))
  
  inline def labelVdomElement(value: VdomElement): this.type = set("label", value.rawElement.asInstanceOf[js.Any])
  
  inline def onClick(value: (/* event */ ReactMouseEventFrom[HTMLDivElement], /* data */ DropdownItemProps) => Callback): this.type = set("onClick", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLDivElement], t1: /* data */ DropdownItemProps) => (value(t0, t1)).runNow()))
  
  inline def selected(value: Boolean): this.type = set("selected", value.asInstanceOf[js.Any])
  
  inline def text(value: SemanticShorthandContent): this.type = set("text", value.asInstanceOf[js.Any])
  
  inline def textNull: this.type = set("text", null)
  
  inline def textVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("text", js.Array(value*))
  
  inline def textVdomElement(value: VdomElement): this.type = set("text", value.rawElement.asInstanceOf[js.Any])
  
  inline def value(value: Boolean | Double | String): this.type = set("value", value.asInstanceOf[js.Any])
}
