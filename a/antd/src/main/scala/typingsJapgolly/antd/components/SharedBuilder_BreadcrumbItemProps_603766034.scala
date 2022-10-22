package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.libDropdownDropdownMod.DropdownProps
import typingsJapgolly.antd.libDropdownDropdownMod.OverlayFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_BreadcrumbItemProps_603766034 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def dropdownProps(value: DropdownProps): this.type = set("dropdownProps", value.asInstanceOf[js.Any])
  
  inline def href(value: String): this.type = set("href", value.asInstanceOf[js.Any])
  
  inline def onClick(
    value: ReactMouseEventFrom[(HTMLAnchorElement | HTMLSpanElement) & org.scalajs.dom.Element] => Callback
  ): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[(HTMLAnchorElement | HTMLSpanElement) & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def overlay(value: japgolly.scalajs.react.facade.React.Element | OverlayFunc): this.type = set("overlay", value.asInstanceOf[js.Any])
  
  inline def overlayCallbackTo(value: CallbackTo[japgolly.scalajs.react.facade.React.Element]): this.type = set("overlay", value.toJsFn)
  
  inline def overlayVdomElement(value: VdomElement): this.type = set("overlay", value.rawElement.asInstanceOf[js.Any])
  
  inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  inline def separator(value: VdomNode): this.type = set("separator", value.rawNode.asInstanceOf[js.Any])
  
  inline def separatorNull: this.type = set("separator", null)
  
  inline def separatorVarargs(
    value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
  ): this.type = set("separator", js.Array(value*))
  
  inline def separatorVdomElement(value: VdomElement): this.type = set("separator", value.rawElement.asInstanceOf[js.Any])
}
