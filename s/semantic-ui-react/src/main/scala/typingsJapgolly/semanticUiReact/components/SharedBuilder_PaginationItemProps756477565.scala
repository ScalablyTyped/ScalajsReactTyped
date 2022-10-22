package typingsJapgolly.semanticUiReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLAnchorElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.semanticUiReact.distCommonjsAddonsPaginationPaginationItemMod.PaginationItemProps
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.ellipsisItem
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.firstItem
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.lastItem
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.nextItem
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.pageItem
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.prevItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_PaginationItemProps756477565[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
  
  inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  inline def onClick(
    value: (/* event */ ReactMouseEventFrom[HTMLAnchorElement], /* data */ PaginationItemProps) => Callback
  ): this.type = set("onClick", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLAnchorElement], t1: /* data */ PaginationItemProps) => (value(t0, t1)).runNow()))
  
  inline def onKeyDown(
    value: (/* event */ ReactMouseEventFrom[HTMLAnchorElement], /* data */ PaginationItemProps) => Callback
  ): this.type = set("onKeyDown", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLAnchorElement], t1: /* data */ PaginationItemProps) => (value(t0, t1)).runNow()))
  
  inline def `type`(value: ellipsisItem | firstItem | prevItem | pageItem | nextItem | lastItem): this.type = set("type", value.asInstanceOf[js.Any])
}
