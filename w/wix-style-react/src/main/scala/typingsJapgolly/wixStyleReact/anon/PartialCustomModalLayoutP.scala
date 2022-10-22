package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.wixStyleReact.distTypesBaseModalLayoutMod.ModalTheme
import typingsJapgolly.wixStyleReact.distTypesButtonButtonDottypesMod.ButtonProps
import typingsJapgolly.wixStyleReact.distTypesButtonButtonDottypesMod.ButtonSize
import typingsJapgolly.wixStyleReact.distTypesCommonMod.OmitPolyfill
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.auto
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.dataHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<wix-style-react.wix-style-react/dist/types/CustomModalLayout.CustomModalLayoutProps> */
trait PartialCustomModalLayoutP extends StObject {
  
  var actionsSize: js.UndefOr[ButtonSize] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var content: js.UndefOr[Node] = js.undefined
  
  var dataHook: js.UndefOr[String] = js.undefined
  
  var footnote: js.UndefOr[Node] = js.undefined
  
  var height: js.UndefOr[typingsJapgolly.csstype.mod.Property.Height[String | Double]] = js.undefined
  
  var maxHeight: js.UndefOr[typingsJapgolly.csstype.mod.Property.MaxHeight[String | Double]] = js.undefined
  
  var onCloseButtonClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
  
  var onHelpButtonClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
  
  var overflowY: js.UndefOr[String] = js.undefined
  
  var primaryButtonOnClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var primaryButtonProps: js.UndefOr[OmitPolyfill[ButtonProps, dataHook]] = js.undefined
  
  var primaryButtonText: js.UndefOr[Node] = js.undefined
  
  var primaryButtonTooltipProps: js.UndefOr[TooltipCommonPropscontent] = js.undefined
  
  var removeContentPadding: js.UndefOr[Boolean] = js.undefined
  
  var secondaryButtonOnClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var secondaryButtonProps: js.UndefOr[OmitPolyfill[ButtonProps, dataHook]] = js.undefined
  
  var secondaryButtonText: js.UndefOr[String] = js.undefined
  
  var showFooterDivider: js.UndefOr[auto | Boolean] = js.undefined
  
  var showHeaderDivider: js.UndefOr[auto | Boolean] = js.undefined
  
  var sideActions: js.UndefOr[Node] = js.undefined
  
  var subtitle: js.UndefOr[Node] = js.undefined
  
  var theme: js.UndefOr[ModalTheme] = js.undefined
  
  var title: js.UndefOr[Node] = js.undefined
  
  var width: js.UndefOr[typingsJapgolly.csstype.mod.Property.Width[String | Double]] = js.undefined
}
object PartialCustomModalLayoutP {
  
  inline def apply(): PartialCustomModalLayoutP = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCustomModalLayoutP]
  }
  
  extension [Self <: PartialCustomModalLayoutP](x: Self) {
    
    inline def setActionsSize(value: ButtonSize): Self = StObject.set(x, "actionsSize", value.asInstanceOf[js.Any])
    
    inline def setActionsSizeUndefined: Self = StObject.set(x, "actionsSize", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setContent(value: VdomNode): Self = StObject.set(x, "content", value.rawNode.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setContentVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "content", js.Array(value*))
    
    inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
    
    inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
    
    inline def setFootnote(value: VdomNode): Self = StObject.set(x, "footnote", value.rawNode.asInstanceOf[js.Any])
    
    inline def setFootnoteNull: Self = StObject.set(x, "footnote", null)
    
    inline def setFootnoteUndefined: Self = StObject.set(x, "footnote", js.undefined)
    
    inline def setFootnoteVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "footnote", js.Array(value*))
    
    inline def setFootnoteVdomElement(value: VdomElement): Self = StObject.set(x, "footnote", value.rawElement.asInstanceOf[js.Any])
    
    inline def setHeight(value: typingsJapgolly.csstype.mod.Property.Height[String | Double]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setMaxHeight(value: typingsJapgolly.csstype.mod.Property.MaxHeight[String | Double]): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setOnCloseButtonClick(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCloseButtonClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnCloseButtonClickUndefined: Self = StObject.set(x, "onCloseButtonClick", js.undefined)
    
    inline def setOnHelpButtonClick(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onHelpButtonClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnHelpButtonClickUndefined: Self = StObject.set(x, "onHelpButtonClick", js.undefined)
    
    inline def setOverflowY(value: String): Self = StObject.set(x, "overflowY", value.asInstanceOf[js.Any])
    
    inline def setOverflowYUndefined: Self = StObject.set(x, "overflowY", js.undefined)
    
    inline def setPrimaryButtonOnClick(value: Callback): Self = StObject.set(x, "primaryButtonOnClick", value.toJsFn)
    
    inline def setPrimaryButtonOnClickUndefined: Self = StObject.set(x, "primaryButtonOnClick", js.undefined)
    
    inline def setPrimaryButtonProps(value: OmitPolyfill[ButtonProps, dataHook]): Self = StObject.set(x, "primaryButtonProps", value.asInstanceOf[js.Any])
    
    inline def setPrimaryButtonPropsUndefined: Self = StObject.set(x, "primaryButtonProps", js.undefined)
    
    inline def setPrimaryButtonText(value: VdomNode): Self = StObject.set(x, "primaryButtonText", value.rawNode.asInstanceOf[js.Any])
    
    inline def setPrimaryButtonTextNull: Self = StObject.set(x, "primaryButtonText", null)
    
    inline def setPrimaryButtonTextUndefined: Self = StObject.set(x, "primaryButtonText", js.undefined)
    
    inline def setPrimaryButtonTextVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "primaryButtonText", js.Array(value*))
    
    inline def setPrimaryButtonTextVdomElement(value: VdomElement): Self = StObject.set(x, "primaryButtonText", value.rawElement.asInstanceOf[js.Any])
    
    inline def setPrimaryButtonTooltipProps(value: TooltipCommonPropscontent): Self = StObject.set(x, "primaryButtonTooltipProps", value.asInstanceOf[js.Any])
    
    inline def setPrimaryButtonTooltipPropsUndefined: Self = StObject.set(x, "primaryButtonTooltipProps", js.undefined)
    
    inline def setRemoveContentPadding(value: Boolean): Self = StObject.set(x, "removeContentPadding", value.asInstanceOf[js.Any])
    
    inline def setRemoveContentPaddingUndefined: Self = StObject.set(x, "removeContentPadding", js.undefined)
    
    inline def setSecondaryButtonOnClick(value: Callback): Self = StObject.set(x, "secondaryButtonOnClick", value.toJsFn)
    
    inline def setSecondaryButtonOnClickUndefined: Self = StObject.set(x, "secondaryButtonOnClick", js.undefined)
    
    inline def setSecondaryButtonProps(value: OmitPolyfill[ButtonProps, dataHook]): Self = StObject.set(x, "secondaryButtonProps", value.asInstanceOf[js.Any])
    
    inline def setSecondaryButtonPropsUndefined: Self = StObject.set(x, "secondaryButtonProps", js.undefined)
    
    inline def setSecondaryButtonText(value: String): Self = StObject.set(x, "secondaryButtonText", value.asInstanceOf[js.Any])
    
    inline def setSecondaryButtonTextUndefined: Self = StObject.set(x, "secondaryButtonText", js.undefined)
    
    inline def setShowFooterDivider(value: auto | Boolean): Self = StObject.set(x, "showFooterDivider", value.asInstanceOf[js.Any])
    
    inline def setShowFooterDividerUndefined: Self = StObject.set(x, "showFooterDivider", js.undefined)
    
    inline def setShowHeaderDivider(value: auto | Boolean): Self = StObject.set(x, "showHeaderDivider", value.asInstanceOf[js.Any])
    
    inline def setShowHeaderDividerUndefined: Self = StObject.set(x, "showHeaderDivider", js.undefined)
    
    inline def setSideActions(value: VdomNode): Self = StObject.set(x, "sideActions", value.rawNode.asInstanceOf[js.Any])
    
    inline def setSideActionsNull: Self = StObject.set(x, "sideActions", null)
    
    inline def setSideActionsUndefined: Self = StObject.set(x, "sideActions", js.undefined)
    
    inline def setSideActionsVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "sideActions", js.Array(value*))
    
    inline def setSideActionsVdomElement(value: VdomElement): Self = StObject.set(x, "sideActions", value.rawElement.asInstanceOf[js.Any])
    
    inline def setSubtitle(value: VdomNode): Self = StObject.set(x, "subtitle", value.rawNode.asInstanceOf[js.Any])
    
    inline def setSubtitleNull: Self = StObject.set(x, "subtitle", null)
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setSubtitleVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "subtitle", js.Array(value*))
    
    inline def setSubtitleVdomElement(value: VdomElement): Self = StObject.set(x, "subtitle", value.rawElement.asInstanceOf[js.Any])
    
    inline def setTheme(value: ModalTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTitleVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "title", js.Array(value*))
    
    inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    
    inline def setWidth(value: typingsJapgolly.csstype.mod.Property.Width[String | Double]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
