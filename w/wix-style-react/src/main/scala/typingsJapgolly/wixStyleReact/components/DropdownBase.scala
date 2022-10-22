package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.csstype.mod.Property.MaxWidth
import typingsJapgolly.csstype.mod.Property.MinWidth
import typingsJapgolly.wixStyleReact.anon.Close
import typingsJapgolly.wixStyleReact.distTypesCommonMod.MoveByOffset
import typingsJapgolly.wixStyleReact.distTypesDropdownBaseMod.DropdownBaseChildrenFn
import typingsJapgolly.wixStyleReact.distTypesDropdownBaseMod.DropdownBaseProps
import typingsJapgolly.wixStyleReact.distTypesDropdownLayoutMod.DropdownLayoutOption
import typingsJapgolly.wixStyleReact.distTypesDropdownLayoutMod.DropdownLayoutValueOption
import typingsJapgolly.wixStyleReact.distTypesDropdownLayoutMod.ListType
import typingsJapgolly.wixStyleReact.distTypesPopoverPopoverDottypesMod.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DropdownBase {
  
  @JSImport("wix-style-react", "DropdownBase")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.DropdownBase] {
    
    inline def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    inline def appendTo(value: String | Node): this.type = set("appendTo", value.asInstanceOf[js.Any])
    
    inline def appendToNull: this.type = set("appendTo", null)
    
    inline def appendToVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("appendTo", js.Array(value*))
    
    inline def appendToVdomElement(value: VdomElement): this.type = set("appendTo", value.rawElement.asInstanceOf[js.Any])
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def children(value: DropdownBaseChildrenFn): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenFunction1(value: /* data */ Close => Node): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def dynamicWidth(value: Boolean): this.type = set("dynamicWidth", value.asInstanceOf[js.Any])
    
    inline def fixed(value: Boolean): this.type = set("fixed", value.asInstanceOf[js.Any])
    
    inline def fixedFooter(value: VdomNode): this.type = set("fixedFooter", value.rawNode.asInstanceOf[js.Any])
    
    inline def fixedFooterNull: this.type = set("fixedFooter", null)
    
    inline def fixedFooterVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("fixedFooter", js.Array(value*))
    
    inline def fixedFooterVdomElement(value: VdomElement): this.type = set("fixedFooter", value.rawElement.asInstanceOf[js.Any])
    
    inline def fixedHeader(value: VdomNode): this.type = set("fixedHeader", value.rawNode.asInstanceOf[js.Any])
    
    inline def fixedHeaderNull: this.type = set("fixedHeader", null)
    
    inline def fixedHeaderVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("fixedHeader", js.Array(value*))
    
    inline def fixedHeaderVdomElement(value: VdomElement): this.type = set("fixedHeader", value.rawElement.asInstanceOf[js.Any])
    
    inline def flip(value: Boolean): this.type = set("flip", value.asInstanceOf[js.Any])
    
    inline def fluid(value: Boolean): this.type = set("fluid", value.asInstanceOf[js.Any])
    
    inline def focusOnOption(value: String | Double): this.type = set("focusOnOption", value.asInstanceOf[js.Any])
    
    inline def focusOnSelectedOption(value: Boolean): this.type = set("focusOnSelectedOption", value.asInstanceOf[js.Any])
    
    inline def hasMore(value: Boolean): this.type = set("hasMore", value.asInstanceOf[js.Any])
    
    inline def infiniteScroll(value: Boolean): this.type = set("infiniteScroll", value.asInstanceOf[js.Any])
    
    inline def initialSelectedId(value: String | Double): this.type = set("initialSelectedId", value.asInstanceOf[js.Any])
    
    inline def listType(value: ListType): this.type = set("listType", value.asInstanceOf[js.Any])
    
    inline def loadMore(value: /* page */ Double => Callback): this.type = set("loadMore", js.Any.fromFunction1((t0: /* page */ Double) => value(t0).runNow()))
    
    inline def maxHeight(value: Double | String): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    
    inline def maxWidth(value: MaxWidth[String | Double]): this.type = set("maxWidth", value.asInstanceOf[js.Any])
    
    inline def minWidth(value: MinWidth[String | Double]): this.type = set("minWidth", value.asInstanceOf[js.Any])
    
    inline def moveBy(value: MoveByOffset): this.type = set("moveBy", value.asInstanceOf[js.Any])
    
    inline def onClickOutside(value: Callback): this.type = set("onClickOutside", value.toJsFn)
    
    inline def onHide(value: Callback): this.type = set("onHide", value.toJsFn)
    
    inline def onMouseEnter(value: Callback): this.type = set("onMouseEnter", value.toJsFn)
    
    inline def onMouseLeave(value: Callback): this.type = set("onMouseLeave", value.toJsFn)
    
    inline def onSelect(value: /* option */ DropdownLayoutValueOption => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: /* option */ DropdownLayoutValueOption) => value(t0).runNow()))
    
    inline def onShow(value: Callback): this.type = set("onShow", value.toJsFn)
    
    inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    inline def options(value: js.Array[DropdownLayoutOption]): this.type = set("options", value.asInstanceOf[js.Any])
    
    inline def optionsVarargs(value: DropdownLayoutOption*): this.type = set("options", js.Array(value*))
    
    inline def overflow(value: String): this.type = set("overflow", value.asInstanceOf[js.Any])
    
    inline def placement(value: Placement): this.type = set("placement", value.asInstanceOf[js.Any])
    
    inline def scrollToOption(value: String | Double): this.type = set("scrollToOption", value.asInstanceOf[js.Any])
    
    inline def selectedId(value: String | Double): this.type = set("selectedId", value.asInstanceOf[js.Any])
    
    inline def showArrow(value: Boolean): this.type = set("showArrow", value.asInstanceOf[js.Any])
    
    inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: DropdownBase.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DropdownBaseProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
