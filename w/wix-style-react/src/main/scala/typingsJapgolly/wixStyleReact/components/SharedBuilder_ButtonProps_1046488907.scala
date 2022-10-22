package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesButtonButtonDottypesMod.ButtonPriority
import typingsJapgolly.wixStyleReact.distTypesButtonButtonDottypesMod.ButtonSize
import typingsJapgolly.wixStyleReact.distTypesButtonButtonDottypesMod.ButtonSkin
import typingsJapgolly.wixStyleReact.distTypesCommonMod.TooltipCommonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_ButtonProps_1046488907[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
  
  inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  inline def ellipsis(value: Boolean): this.type = set("ellipsis", value.asInstanceOf[js.Any])
  
  inline def fullWidth(value: Boolean): this.type = set("fullWidth", value.asInstanceOf[js.Any])
  
  inline def onClick(value: ReactMouseEventFrom[HTMLElement & Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & Element]) => value(t0).runNow()))
  
  inline def prefixIcon(value: VdomElement): this.type = set("prefixIcon", value.rawElement.asInstanceOf[js.Any])
  
  inline def priority(value: ButtonPriority): this.type = set("priority", value.asInstanceOf[js.Any])
  
  inline def showTooltip(value: Boolean): this.type = set("showTooltip", value.asInstanceOf[js.Any])
  
  inline def size(value: ButtonSize): this.type = set("size", value.asInstanceOf[js.Any])
  
  inline def skin(value: ButtonSkin): this.type = set("skin", value.asInstanceOf[js.Any])
  
  inline def suffixIcon(value: VdomElement): this.type = set("suffixIcon", value.rawElement.asInstanceOf[js.Any])
  
  inline def tooltipProps(value: TooltipCommonProps): this.type = set("tooltipProps", value.asInstanceOf[js.Any])
}
