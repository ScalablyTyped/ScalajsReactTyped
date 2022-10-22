package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.anon.Exit
import typingsJapgolly.wixStyleReact.distTypesPopoverPopoverCoreUtilsGetModifiersMod.MoveBy
import typingsJapgolly.wixStyleReact.distTypesPopoverPopoverDottypesMod.AppendTo
import typingsJapgolly.wixStyleReact.distTypesPopoverPopoverDottypesMod.Placement
import typingsJapgolly.wixStyleReact.distTypesPopoverPopoverDottypesMod.PopoverTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_PopoverProps_839399539[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
  
  inline def appendTo(value: AppendTo): this.type = set("appendTo", value.asInstanceOf[js.Any])
  
  inline def appendToFunction1(value: /* s */ Element => Boolean): this.type = set("appendTo", js.Any.fromFunction1(value))
  
  inline def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
  
  inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
  
  inline def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def customArrow(value: (/* placement */ Placement, /* arrowProps */ js.Object) => Node): this.type = set("customArrow", js.Any.fromFunction2(value))
  
  inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
  
  inline def disableClickOutsideWhenClosed(value: Boolean): this.type = set("disableClickOutsideWhenClosed", value.asInstanceOf[js.Any])
  
  inline def dynamicWidth(value: Boolean): this.type = set("dynamicWidth", value.asInstanceOf[js.Any])
  
  inline def excludeClass(value: String): this.type = set("excludeClass", value.asInstanceOf[js.Any])
  
  inline def fixed(value: Boolean): this.type = set("fixed", value.asInstanceOf[js.Any])
  
  inline def flip(value: Boolean): this.type = set("flip", value.asInstanceOf[js.Any])
  
  inline def fluid(value: Boolean): this.type = set("fluid", value.asInstanceOf[js.Any])
  
  inline def hideDelay(value: Double): this.type = set("hideDelay", value.asInstanceOf[js.Any])
  
  inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
  
  inline def maxWidth(value: Double | String): this.type = set("maxWidth", value.asInstanceOf[js.Any])
  
  inline def minWidth(value: Double | String): this.type = set("minWidth", value.asInstanceOf[js.Any])
  
  inline def moveArrowTo(value: Double): this.type = set("moveArrowTo", value.asInstanceOf[js.Any])
  
  inline def moveBy(value: MoveBy): this.type = set("moveBy", value.asInstanceOf[js.Any])
  
  inline def onClick(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onClickOutside(value: js.Function): this.type = set("onClickOutside", value.asInstanceOf[js.Any])
  
  inline def onEscPress(value: js.Function): this.type = set("onEscPress", value.asInstanceOf[js.Any])
  
  inline def onKeyDown(value: ReactKeyboardEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onMouseEnter(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onMouseLeave(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onTabOut(value: js.Function): this.type = set("onTabOut", value.asInstanceOf[js.Any])
  
  inline def placement(value: Placement): this.type = set("placement", value.asInstanceOf[js.Any])
  
  inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
  
  inline def showArrow(value: Boolean): this.type = set("showArrow", value.asInstanceOf[js.Any])
  
  inline def showDelay(value: Double): this.type = set("showDelay", value.asInstanceOf[js.Any])
  
  inline def shown(value: Boolean): this.type = set("shown", value.asInstanceOf[js.Any])
  
  inline def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
  
  inline def theme(value: PopoverTheme): this.type = set("theme", value.asInstanceOf[js.Any])
  
  inline def timeout(value: Double | Exit): this.type = set("timeout", value.asInstanceOf[js.Any])
  
  inline def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
  
  inline def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
}
