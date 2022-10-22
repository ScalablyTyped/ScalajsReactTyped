package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.TouchEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesDropdownLayoutMod.DropdownLayoutItemHeight
import typingsJapgolly.wixStyleReact.distTypesDropdownLayoutMod.DropdownLayoutOption
import typingsJapgolly.wixStyleReact.distTypesDropdownLayoutMod.DropdownLayoutProps
import typingsJapgolly.wixStyleReact.distTypesDropdownLayoutMod.DropdownLayoutValueOption
import typingsJapgolly.wixStyleReact.distTypesDropdownLayoutMod.ListType
import typingsJapgolly.wixStyleReact.distTypesDropdownLayoutMod.Overflow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DropdownLayout {
  
  @JSImport("wix-style-react", "DropdownLayout")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.DropdownLayout] {
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def closeOnSelect(value: Boolean): this.type = set("closeOnSelect", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def dropDirectionUp(value: Boolean): this.type = set("dropDirectionUp", value.asInstanceOf[js.Any])
    
    inline def fixedFooter(value: VdomNode): this.type = set("fixedFooter", value.rawNode.asInstanceOf[js.Any])
    
    inline def fixedFooterNull: this.type = set("fixedFooter", null)
    
    inline def fixedFooterVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("fixedFooter", js.Array(value*))
    
    inline def fixedFooterVdomElement(value: VdomElement): this.type = set("fixedFooter", value.rawElement.asInstanceOf[js.Any])
    
    inline def fixedHeader(value: VdomNode): this.type = set("fixedHeader", value.rawNode.asInstanceOf[js.Any])
    
    inline def fixedHeaderNull: this.type = set("fixedHeader", null)
    
    inline def fixedHeaderVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("fixedHeader", js.Array(value*))
    
    inline def fixedHeaderVdomElement(value: VdomElement): this.type = set("fixedHeader", value.rawElement.asInstanceOf[js.Any])
    
    inline def focusOnOption(value: String | Double): this.type = set("focusOnOption", value.asInstanceOf[js.Any])
    
    inline def focusOnSelectedOption(value: Boolean): this.type = set("focusOnSelectedOption", value.asInstanceOf[js.Any])
    
    inline def hasMore(value: Boolean): this.type = set("hasMore", value.asInstanceOf[js.Any])
    
    inline def inContainer(value: Boolean): this.type = set("inContainer", value.asInstanceOf[js.Any])
    
    inline def infiniteScroll(value: Boolean): this.type = set("infiniteScroll", value.asInstanceOf[js.Any])
    
    inline def itemHeight(value: DropdownLayoutItemHeight): this.type = set("itemHeight", value.asInstanceOf[js.Any])
    
    inline def listType(value: ListType): this.type = set("listType", value.asInstanceOf[js.Any])
    
    inline def loadMore(value: /* page */ Double => Callback): this.type = set("loadMore", js.Any.fromFunction1((t0: /* page */ Double) => value(t0).runNow()))
    
    inline def markedOption(value: Boolean | String | Double): this.type = set("markedOption", value.asInstanceOf[js.Any])
    
    inline def maxHeightPixels(value: String | Double): this.type = set("maxHeightPixels", value.asInstanceOf[js.Any])
    
    inline def minWidthPixels(value: String | Double): this.type = set("minWidthPixels", value.asInstanceOf[js.Any])
    
    inline def onClickOutside(value: /* e */ TouchEvent | MouseEvent => Callback): this.type = set("onClickOutside", js.Any.fromFunction1((t0: /* e */ TouchEvent | MouseEvent) => value(t0).runNow()))
    
    inline def onClose(value: Callback): this.type = set("onClose", value.toJsFn)
    
    inline def onMouseEnter(value: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onMouseLeave(value: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onOptionMarked(value: /* option */ DropdownLayoutValueOption | Null => Callback): this.type = set("onOptionMarked", js.Any.fromFunction1((t0: /* option */ DropdownLayoutValueOption | Null) => value(t0).runNow()))
    
    inline def onSelect(value: (/* option */ DropdownLayoutValueOption, /* sameOptionWasPicked */ Boolean) => Callback): this.type = set("onSelect", js.Any.fromFunction2((t0: /* option */ DropdownLayoutValueOption, t1: /* sameOptionWasPicked */ Boolean) => (value(t0, t1)).runNow()))
    
    inline def options(value: js.Array[DropdownLayoutOption]): this.type = set("options", value.asInstanceOf[js.Any])
    
    inline def optionsVarargs(value: DropdownLayoutOption*): this.type = set("options", js.Array(value*))
    
    inline def overflow(value: Overflow): this.type = set("overflow", value.asInstanceOf[js.Any])
    
    inline def scrollToOption(value: String | Double): this.type = set("scrollToOption", value.asInstanceOf[js.Any])
    
    inline def selectedHighlight(value: Boolean): this.type = set("selectedHighlight", value.asInstanceOf[js.Any])
    
    inline def selectedId(value: String | Double): this.type = set("selectedId", value.asInstanceOf[js.Any])
    
    inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
    
    inline def withArrow(value: Boolean): this.type = set("withArrow", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: DropdownLayout.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DropdownLayoutProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
