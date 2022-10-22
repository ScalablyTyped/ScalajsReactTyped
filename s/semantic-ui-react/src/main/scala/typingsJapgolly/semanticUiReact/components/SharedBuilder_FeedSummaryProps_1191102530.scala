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
import typingsJapgolly.semanticUiReact.distCommonjsViewsFeedFeedDateMod.FeedDateProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsFeedFeedUserMod.FeedUserProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_FeedSummaryProps_1191102530 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def as(value: Any): this.type = set("as", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
  
  inline def contentNull: this.type = set("content", null)
  
  inline def contentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("content", js.Array(value*))
  
  inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
  
  inline def date(value: SemanticShorthandItem[FeedDateProps]): this.type = set("date", value.asInstanceOf[js.Any])
  
  inline def dateFunction3(
    value: (/* component */ ElementType, FeedDateProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
  ): this.type = set("date", js.Any.fromFunction3(value))
  
  inline def dateNull: this.type = set("date", null)
  
  inline def dateVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("date", js.Array(value*))
  
  inline def dateVdomElement(value: VdomElement): this.type = set("date", value.rawElement.asInstanceOf[js.Any])
  
  inline def user(value: SemanticShorthandItem[FeedUserProps]): this.type = set("user", value.asInstanceOf[js.Any])
  
  inline def userFunction3(
    value: (/* component */ ElementType, FeedUserProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
  ): this.type = set("user", js.Any.fromFunction3(value))
  
  inline def userNull: this.type = set("user", null)
  
  inline def userVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("user", js.Array(value*))
  
  inline def userVdomElement(value: VdomElement): this.type = set("user", value.rawElement.asInstanceOf[js.Any])
}
