package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.wixStyleReact.anon.TooltipCommonPropscontent
import typingsJapgolly.wixStyleReact.distTypesBaseModalLayoutMod.ModalTheme
import typingsJapgolly.wixStyleReact.distTypesButtonButtonDottypesMod.ButtonProps
import typingsJapgolly.wixStyleReact.distTypesButtonButtonDottypesMod.ButtonSize
import typingsJapgolly.wixStyleReact.distTypesCommonMod.OmitPolyfill
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.dataHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBaseModalLayoutLayoutBlocksFooterMod {
  
  @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Footer", "Footer")
  @js.native
  val Footer: FunctionComponent[FooterProps] = js.native
  
  trait FooterProps extends StObject {
    
    var actionsSize: js.UndefOr[ButtonSize] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var primaryButtonOnClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var primaryButtonProps: js.UndefOr[OmitPolyfill[ButtonProps, dataHook]] = js.undefined
    
    var primaryButtonText: js.UndefOr[Node] = js.undefined
    
    var primaryButtonTooltipProps: js.UndefOr[TooltipCommonPropscontent] = js.undefined
    
    var secondaryButtonOnClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var secondaryButtonProps: js.UndefOr[OmitPolyfill[ButtonProps, dataHook]] = js.undefined
    
    var secondaryButtonText: js.UndefOr[Node] = js.undefined
    
    var showFooterDivider: js.UndefOr[Boolean] = js.undefined
    
    var sideActions: js.UndefOr[Node] = js.undefined
    
    var theme: js.UndefOr[ModalTheme] = js.undefined
  }
  object FooterProps {
    
    inline def apply(): FooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FooterProps]
    }
    
    extension [Self <: FooterProps](x: Self) {
      
      inline def setActionsSize(value: ButtonSize): Self = StObject.set(x, "actionsSize", value.asInstanceOf[js.Any])
      
      inline def setActionsSizeUndefined: Self = StObject.set(x, "actionsSize", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setPrimaryButtonOnClick(value: Callback): Self = StObject.set(x, "primaryButtonOnClick", value.toJsFn)
      
      inline def setPrimaryButtonOnClickUndefined: Self = StObject.set(x, "primaryButtonOnClick", js.undefined)
      
      inline def setPrimaryButtonProps(value: OmitPolyfill[ButtonProps, dataHook]): Self = StObject.set(x, "primaryButtonProps", value.asInstanceOf[js.Any])
      
      inline def setPrimaryButtonPropsUndefined: Self = StObject.set(x, "primaryButtonProps", js.undefined)
      
      inline def setPrimaryButtonText(value: VdomNode): Self = StObject.set(x, "primaryButtonText", value.rawNode.asInstanceOf[js.Any])
      
      inline def setPrimaryButtonTextNull: Self = StObject.set(x, "primaryButtonText", null)
      
      inline def setPrimaryButtonTextUndefined: Self = StObject.set(x, "primaryButtonText", js.undefined)
      
      inline def setPrimaryButtonTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "primaryButtonText", js.Array(value*))
      
      inline def setPrimaryButtonTextVdomElement(value: VdomElement): Self = StObject.set(x, "primaryButtonText", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPrimaryButtonTooltipProps(value: TooltipCommonPropscontent): Self = StObject.set(x, "primaryButtonTooltipProps", value.asInstanceOf[js.Any])
      
      inline def setPrimaryButtonTooltipPropsUndefined: Self = StObject.set(x, "primaryButtonTooltipProps", js.undefined)
      
      inline def setSecondaryButtonOnClick(value: Callback): Self = StObject.set(x, "secondaryButtonOnClick", value.toJsFn)
      
      inline def setSecondaryButtonOnClickUndefined: Self = StObject.set(x, "secondaryButtonOnClick", js.undefined)
      
      inline def setSecondaryButtonProps(value: OmitPolyfill[ButtonProps, dataHook]): Self = StObject.set(x, "secondaryButtonProps", value.asInstanceOf[js.Any])
      
      inline def setSecondaryButtonPropsUndefined: Self = StObject.set(x, "secondaryButtonProps", js.undefined)
      
      inline def setSecondaryButtonText(value: VdomNode): Self = StObject.set(x, "secondaryButtonText", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSecondaryButtonTextNull: Self = StObject.set(x, "secondaryButtonText", null)
      
      inline def setSecondaryButtonTextUndefined: Self = StObject.set(x, "secondaryButtonText", js.undefined)
      
      inline def setSecondaryButtonTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "secondaryButtonText", js.Array(value*))
      
      inline def setSecondaryButtonTextVdomElement(value: VdomElement): Self = StObject.set(x, "secondaryButtonText", value.rawElement.asInstanceOf[js.Any])
      
      inline def setShowFooterDivider(value: Boolean): Self = StObject.set(x, "showFooterDivider", value.asInstanceOf[js.Any])
      
      inline def setShowFooterDividerUndefined: Self = StObject.set(x, "showFooterDivider", js.undefined)
      
      inline def setSideActions(value: VdomNode): Self = StObject.set(x, "sideActions", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSideActionsNull: Self = StObject.set(x, "sideActions", null)
      
      inline def setSideActionsUndefined: Self = StObject.set(x, "sideActions", js.undefined)
      
      inline def setSideActionsVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "sideActions", js.Array(value*))
      
      inline def setSideActionsVdomElement(value: VdomElement): Self = StObject.set(x, "sideActions", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTheme(value: ModalTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
