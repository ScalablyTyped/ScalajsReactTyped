package typingsJapgolly.wixUiCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixUiCore.distEsSrcComponentsDropdownContentDropdownContentMod.IDOMid
import typingsJapgolly.wixUiCore.distEsSrcComponentsDropdownOptionOptionFactoryMod.Option
import typingsJapgolly.wixUiCore.distEsSrcComponentsPopoverPopoverMod.AppendTo
import typingsJapgolly.wixUiCore.distEsSrcComponentsPopoverUtilsGetModifiersMod.MoveBy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_DropdownProps_577454351[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def allowReselect(value: Boolean): this.type = set("allowReselect", value.asInstanceOf[js.Any])
  
  inline def appendTo(value: AppendTo): this.type = set("appendTo", value.asInstanceOf[js.Any])
  
  inline def appendToFunction1(value: /* s */ Element => Boolean): this.type = set("appendTo", js.Any.fromFunction1(value))
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def contentClassName(value: String): this.type = set("contentClassName", value.asInstanceOf[js.Any])
  
  inline def contentId(value: String): this.type = set("contentId", value.asInstanceOf[js.Any])
  
  inline def `data-hook`(value: String): this.type = set("data-hook", value.asInstanceOf[js.Any])
  
  inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  inline def dropdownA11yFixes(value: Boolean): this.type = set("dropdownA11yFixes", value.asInstanceOf[js.Any])
  
  inline def dynamicWidth(value: Boolean): this.type = set("dynamicWidth", value.asInstanceOf[js.Any])
  
  inline def fixed(value: Boolean): this.type = set("fixed", value.asInstanceOf[js.Any])
  
  inline def fixedFooter(value: VdomNode): this.type = set("fixedFooter", value.rawNode.asInstanceOf[js.Any])
  
  inline def fixedFooterNull: this.type = set("fixedFooter", null)
  
  inline def fixedFooterVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("fixedFooter", js.Array(value*))
  
  inline def fixedFooterVdomElement(value: VdomElement): this.type = set("fixedFooter", value.rawElement.asInstanceOf[js.Any])
  
  inline def fixedHeader(value: VdomNode): this.type = set("fixedHeader", value.rawNode.asInstanceOf[js.Any])
  
  inline def fixedHeaderNull: this.type = set("fixedHeader", null)
  
  inline def fixedHeaderVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("fixedHeader", js.Array(value*))
  
  inline def fixedHeaderVdomElement(value: VdomElement): this.type = set("fixedHeader", value.rawElement.asInstanceOf[js.Any])
  
  inline def flip(value: Boolean): this.type = set("flip", value.asInstanceOf[js.Any])
  
  inline def forceContentElementVisibility(value: Boolean): this.type = set("forceContentElementVisibility", value.asInstanceOf[js.Any])
  
  inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
  
  inline def moveBy(value: MoveBy): this.type = set("moveBy", value.asInstanceOf[js.Any])
  
  inline def multi(value: Boolean): this.type = set("multi", value.asInstanceOf[js.Any])
  
  inline def onContentMouseDown(value: /* e */ ReactMouseEventFrom[Element] => Callback): this.type = set("onContentMouseDown", js.Any.fromFunction1((t0: /* e */ ReactMouseEventFrom[Element]) => value(t0).runNow()))
  
  inline def onDeselect(value: /* option */ Option | Null => Callback): this.type = set("onDeselect", js.Any.fromFunction1((t0: /* option */ Option | Null) => value(t0).runNow()))
  
  inline def onExpandedChange(value: /* isExpanded */ Boolean => Callback): this.type = set("onExpandedChange", js.Any.fromFunction1((t0: /* isExpanded */ Boolean) => value(t0).runNow()))
  
  inline def onInitialSelectedOptionsSet(value: /* options */ js.Array[Option] => Callback): this.type = set("onInitialSelectedOptionsSet", js.Any.fromFunction1((t0: /* options */ js.Array[Option]) => value(t0).runNow()))
  
  inline def onOptionHover(value: /* option */ (Option & IDOMid) | Null => Callback): this.type = set("onOptionHover", js.Any.fromFunction1((t0: /* option */ (Option & IDOMid) | Null) => value(t0).runNow()))
  
  inline def optionsContainerZIndex(value: Double): this.type = set("optionsContainerZIndex", value.asInstanceOf[js.Any])
  
  inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
  
  inline def showArrow(value: Boolean): this.type = set("showArrow", value.asInstanceOf[js.Any])
  
  inline def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def timeout(value: Double): this.type = set("timeout", value.asInstanceOf[js.Any])
}
