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
import typingsJapgolly.semanticUiReact.distCommonjsAddonsPaginationPaginationItemMod.PaginationItemProps
import typingsJapgolly.semanticUiReact.distCommonjsAddonsPaginationPaginationMod.PaginationProps
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Pagination {
  
  inline def apply(totalPages: Double | String): Builder = {
    val __props = js.Dynamic.literal(totalPages = totalPages.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PaginationProps]))
  }
  
  object Item {
    
    @JSImport("semantic-ui-react", "Pagination.Item")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Item.type): SharedBuilder_PaginationItemProps756477565[typingsJapgolly.semanticUiReact.mod.Pagination.Item] = new SharedBuilder_PaginationItemProps756477565[typingsJapgolly.semanticUiReact.mod.Pagination.Item](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: PaginationItemProps): SharedBuilder_PaginationItemProps756477565[typingsJapgolly.semanticUiReact.mod.Pagination.Item] = new SharedBuilder_PaginationItemProps756477565[typingsJapgolly.semanticUiReact.mod.Pagination.Item](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("semantic-ui-react", "Pagination")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.semanticUiReact.mod.Pagination] {
    
    inline def activePage(value: Double | String): this.type = set("activePage", value.asInstanceOf[js.Any])
    
    inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    inline def boundaryRange(value: Double | String): this.type = set("boundaryRange", value.asInstanceOf[js.Any])
    
    inline def defaultActivePage(value: Double | String): this.type = set("defaultActivePage", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def ellipsisItem(value: SemanticShorthandItem[PaginationItemProps]): this.type = set("ellipsisItem", value.asInstanceOf[js.Any])
    
    inline def ellipsisItemFunction3(
      value: (/* component */ ElementType, PaginationItemProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
    ): this.type = set("ellipsisItem", js.Any.fromFunction3(value))
    
    inline def ellipsisItemNull: this.type = set("ellipsisItem", null)
    
    inline def ellipsisItemVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("ellipsisItem", js.Array(value*))
    
    inline def ellipsisItemVdomElement(value: VdomElement): this.type = set("ellipsisItem", value.rawElement.asInstanceOf[js.Any])
    
    inline def firstItem(value: SemanticShorthandItem[PaginationItemProps]): this.type = set("firstItem", value.asInstanceOf[js.Any])
    
    inline def firstItemFunction3(
      value: (/* component */ ElementType, PaginationItemProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
    ): this.type = set("firstItem", js.Any.fromFunction3(value))
    
    inline def firstItemNull: this.type = set("firstItem", null)
    
    inline def firstItemVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("firstItem", js.Array(value*))
    
    inline def firstItemVdomElement(value: VdomElement): this.type = set("firstItem", value.rawElement.asInstanceOf[js.Any])
    
    inline def lastItem(value: SemanticShorthandItem[PaginationItemProps]): this.type = set("lastItem", value.asInstanceOf[js.Any])
    
    inline def lastItemFunction3(
      value: (/* component */ ElementType, PaginationItemProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
    ): this.type = set("lastItem", js.Any.fromFunction3(value))
    
    inline def lastItemNull: this.type = set("lastItem", null)
    
    inline def lastItemVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("lastItem", js.Array(value*))
    
    inline def lastItemVdomElement(value: VdomElement): this.type = set("lastItem", value.rawElement.asInstanceOf[js.Any])
    
    inline def nextItem(value: SemanticShorthandItem[PaginationItemProps]): this.type = set("nextItem", value.asInstanceOf[js.Any])
    
    inline def nextItemFunction3(
      value: (/* component */ ElementType, PaginationItemProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
    ): this.type = set("nextItem", js.Any.fromFunction3(value))
    
    inline def nextItemNull: this.type = set("nextItem", null)
    
    inline def nextItemVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("nextItem", js.Array(value*))
    
    inline def nextItemVdomElement(value: VdomElement): this.type = set("nextItem", value.rawElement.asInstanceOf[js.Any])
    
    inline def onPageChange(
      value: (/* event */ ReactMouseEventFrom[HTMLAnchorElement], /* data */ PaginationProps) => Callback
    ): this.type = set("onPageChange", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLAnchorElement], t1: /* data */ PaginationProps) => (value(t0, t1)).runNow()))
    
    inline def pageItem(value: SemanticShorthandItem[PaginationItemProps]): this.type = set("pageItem", value.asInstanceOf[js.Any])
    
    inline def pageItemFunction3(
      value: (/* component */ ElementType, PaginationItemProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
    ): this.type = set("pageItem", js.Any.fromFunction3(value))
    
    inline def pageItemNull: this.type = set("pageItem", null)
    
    inline def pageItemVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("pageItem", js.Array(value*))
    
    inline def pageItemVdomElement(value: VdomElement): this.type = set("pageItem", value.rawElement.asInstanceOf[js.Any])
    
    inline def prevItem(value: SemanticShorthandItem[PaginationItemProps]): this.type = set("prevItem", value.asInstanceOf[js.Any])
    
    inline def prevItemFunction3(
      value: (/* component */ ElementType, PaginationItemProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
    ): this.type = set("prevItem", js.Any.fromFunction3(value))
    
    inline def prevItemNull: this.type = set("prevItem", null)
    
    inline def prevItemVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("prevItem", js.Array(value*))
    
    inline def prevItemVdomElement(value: VdomElement): this.type = set("prevItem", value.rawElement.asInstanceOf[js.Any])
    
    inline def siblingRange(value: Double | String): this.type = set("siblingRange", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PaginationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
