package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.anon.TooltipCommonPropscontent
import typingsJapgolly.wixStyleReact.distTypesBaseModalLayoutMod.ModalTheme
import typingsJapgolly.wixStyleReact.distTypesButtonButtonDottypesMod.ButtonProps
import typingsJapgolly.wixStyleReact.distTypesButtonButtonDottypesMod.ButtonSize
import typingsJapgolly.wixStyleReact.distTypesCommonMod.OmitPolyfill
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.dataHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_FooterProps220805238 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def actionsSize(value: ButtonSize): this.type = set("actionsSize", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
  
  inline def primaryButtonOnClick(value: Callback): this.type = set("primaryButtonOnClick", value.toJsFn)
  
  inline def primaryButtonProps(value: OmitPolyfill[ButtonProps, dataHook]): this.type = set("primaryButtonProps", value.asInstanceOf[js.Any])
  
  inline def primaryButtonText(value: VdomNode): this.type = set("primaryButtonText", value.rawNode.asInstanceOf[js.Any])
  
  inline def primaryButtonTextNull: this.type = set("primaryButtonText", null)
  
  inline def primaryButtonTextVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("primaryButtonText", js.Array(value*))
  
  inline def primaryButtonTextVdomElement(value: VdomElement): this.type = set("primaryButtonText", value.rawElement.asInstanceOf[js.Any])
  
  inline def primaryButtonTooltipProps(value: TooltipCommonPropscontent): this.type = set("primaryButtonTooltipProps", value.asInstanceOf[js.Any])
  
  inline def secondaryButtonOnClick(value: Callback): this.type = set("secondaryButtonOnClick", value.toJsFn)
  
  inline def secondaryButtonProps(value: OmitPolyfill[ButtonProps, dataHook]): this.type = set("secondaryButtonProps", value.asInstanceOf[js.Any])
  
  inline def secondaryButtonText(value: VdomNode): this.type = set("secondaryButtonText", value.rawNode.asInstanceOf[js.Any])
  
  inline def secondaryButtonTextNull: this.type = set("secondaryButtonText", null)
  
  inline def secondaryButtonTextVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("secondaryButtonText", js.Array(value*))
  
  inline def secondaryButtonTextVdomElement(value: VdomElement): this.type = set("secondaryButtonText", value.rawElement.asInstanceOf[js.Any])
  
  inline def showFooterDivider(value: Boolean): this.type = set("showFooterDivider", value.asInstanceOf[js.Any])
  
  inline def sideActions(value: VdomNode): this.type = set("sideActions", value.rawNode.asInstanceOf[js.Any])
  
  inline def sideActionsNull: this.type = set("sideActions", null)
  
  inline def sideActionsVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("sideActions", js.Array(value*))
  
  inline def sideActionsVdomElement(value: VdomElement): this.type = set("sideActions", value.rawElement.asInstanceOf[js.Any])
  
  inline def theme(value: ModalTheme): this.type = set("theme", value.asInstanceOf[js.Any])
}
