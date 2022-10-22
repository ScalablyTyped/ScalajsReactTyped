package typingsJapgolly.reactBurgerMenu.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactBurgerMenu.anon.PartialStyles
import typingsJapgolly.reactBurgerMenu.mod.HoverState
import typingsJapgolly.reactBurgerMenu.mod.State
import typingsJapgolly.reactBurgerMenu.reactBurgerMenuBooleans.`false`
import typingsJapgolly.reactBurgerMenu.reactBurgerMenuStrings.div
import typingsJapgolly.reactBurgerMenu.reactBurgerMenuStrings.nav
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_Props_1809302565[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def bodyClassName(value: String): this.type = set("bodyClassName", value.asInstanceOf[js.Any])
  
  inline def burgerBarClassName(value: String): this.type = set("burgerBarClassName", value.asInstanceOf[js.Any])
  
  inline def burgerButtonClassName(value: String): this.type = set("burgerButtonClassName", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def crossButtonClassName(value: String): this.type = set("crossButtonClassName", value.asInstanceOf[js.Any])
  
  inline def crossClassName(value: String): this.type = set("crossClassName", value.asInstanceOf[js.Any])
  
  inline def customBurgerIcon(value: Element | `false`): this.type = set("customBurgerIcon", value.asInstanceOf[js.Any])
  
  inline def customBurgerIconVdomElement(value: VdomElement): this.type = set("customBurgerIcon", value.rawElement.asInstanceOf[js.Any])
  
  inline def customCrossIcon(value: Element | `false`): this.type = set("customCrossIcon", value.asInstanceOf[js.Any])
  
  inline def customCrossIconVdomElement(value: VdomElement): this.type = set("customCrossIcon", value.rawElement.asInstanceOf[js.Any])
  
  inline def customOnKeyDown(value: /* event */ ReactKeyboardEventFrom[org.scalajs.dom.Element] => Callback): this.type = set("customOnKeyDown", js.Any.fromFunction1((t0: /* event */ ReactKeyboardEventFrom[org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def disableAutoFocus(value: Boolean): this.type = set("disableAutoFocus", value.asInstanceOf[js.Any])
  
  inline def disableCloseOnEsc(value: Boolean): this.type = set("disableCloseOnEsc", value.asInstanceOf[js.Any])
  
  inline def disableOverlayClick(value: Boolean | js.Function0[Boolean]): this.type = set("disableOverlayClick", value.asInstanceOf[js.Any])
  
  inline def disableOverlayClickCallbackTo(value: CallbackTo[Boolean]): this.type = set("disableOverlayClick", value.toJsFn)
  
  inline def htmlClassName(value: String): this.type = set("htmlClassName", value.asInstanceOf[js.Any])
  
  inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
  
  inline def isOpen(value: Boolean): this.type = set("isOpen", value.asInstanceOf[js.Any])
  
  inline def itemClassName(value: String): this.type = set("itemClassName", value.asInstanceOf[js.Any])
  
  inline def itemListClassName(value: String): this.type = set("itemListClassName", value.asInstanceOf[js.Any])
  
  inline def itemListElement(value: div | nav): this.type = set("itemListElement", value.asInstanceOf[js.Any])
  
  inline def menuClassName(value: String): this.type = set("menuClassName", value.asInstanceOf[js.Any])
  
  inline def morphShapeClassName(value: String): this.type = set("morphShapeClassName", value.asInstanceOf[js.Any])
  
  inline def noOverlay(value: Boolean): this.type = set("noOverlay", value.asInstanceOf[js.Any])
  
  inline def noTransition(value: Boolean): this.type = set("noTransition", value.asInstanceOf[js.Any])
  
  inline def onClose(value: Callback): this.type = set("onClose", value.toJsFn)
  
  inline def onIconHoverChange(value: /* state */ HoverState => Callback): this.type = set("onIconHoverChange", js.Any.fromFunction1((t0: /* state */ HoverState) => value(t0).runNow()))
  
  inline def onOpen(value: Callback): this.type = set("onOpen", value.toJsFn)
  
  inline def onStateChange(value: /* state */ State => Callback): this.type = set("onStateChange", js.Any.fromFunction1((t0: /* state */ State) => value(t0).runNow()))
  
  inline def outerContainerId(value: String): this.type = set("outerContainerId", value.asInstanceOf[js.Any])
  
  inline def overlayClassName(value: String): this.type = set("overlayClassName", value.asInstanceOf[js.Any])
  
  inline def pageWrapId(value: String): this.type = set("pageWrapId", value.asInstanceOf[js.Any])
  
  inline def right(value: Boolean): this.type = set("right", value.asInstanceOf[js.Any])
  
  inline def styles(value: PartialStyles): this.type = set("styles", value.asInstanceOf[js.Any])
  
  inline def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
}
