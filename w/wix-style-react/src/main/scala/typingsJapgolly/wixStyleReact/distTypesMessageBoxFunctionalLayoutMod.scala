package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.wixStyleReact.distTypesButtonButtonDottypesMod.ButtonSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMessageBoxFunctionalLayoutMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/types/MessageBoxFunctionalLayout", JSImport.Default)
  @js.native
  val default: FC[MessageBoxFunctionalLayoutProps] = js.native
  
  trait MessageBoxFunctionalLayoutProps extends StObject {
    
    var buttonsHeight: js.UndefOr[ButtonSize] = js.undefined
    
    var cancelPrefixIcon: js.UndefOr[Element] = js.undefined
    
    var cancelSuffixIcon: js.UndefOr[Element] = js.undefined
    
    var cancelText: js.UndefOr[Node] = js.undefined
    
    var closeButton: js.UndefOr[Boolean] = js.undefined
    
    var confirmPrefixIcon: js.UndefOr[Element] = js.undefined
    
    var confirmSuffixIcon: js.UndefOr[Element] = js.undefined
    
    var confirmText: js.UndefOr[Node] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var disableCancel: js.UndefOr[Boolean] = js.undefined
    
    var disableConfirmation: js.UndefOr[Boolean] = js.undefined
    
    var footerBottomChildren: js.UndefOr[Node] = js.undefined
    
    var fullscreen: js.UndefOr[Boolean] = js.undefined
    
    var hideFooter: js.UndefOr[Boolean] = js.undefined
    
    var image: js.UndefOr[Node] = js.undefined
    
    var margin: js.UndefOr[String] = js.undefined
    
    var maxHeight: js.UndefOr[String | Double] = js.undefined
    
    var noBodyPadding: js.UndefOr[Boolean] = js.undefined
    
    var onCancel: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var onClose: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var onOk: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var sideActions: js.UndefOr[Node] = js.undefined
    
    var theme: js.UndefOr[MessageBoxFunctionalLayoutTheme] = js.undefined
    
    var title: js.UndefOr[Node] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
    
    var withEmptyState: js.UndefOr[Boolean] = js.undefined
  }
  object MessageBoxFunctionalLayoutProps {
    
    inline def apply(): MessageBoxFunctionalLayoutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageBoxFunctionalLayoutProps]
    }
    
    extension [Self <: MessageBoxFunctionalLayoutProps](x: Self) {
      
      inline def setButtonsHeight(value: ButtonSize): Self = StObject.set(x, "buttonsHeight", value.asInstanceOf[js.Any])
      
      inline def setButtonsHeightUndefined: Self = StObject.set(x, "buttonsHeight", js.undefined)
      
      inline def setCancelPrefixIcon(value: VdomElement): Self = StObject.set(x, "cancelPrefixIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCancelPrefixIconUndefined: Self = StObject.set(x, "cancelPrefixIcon", js.undefined)
      
      inline def setCancelSuffixIcon(value: VdomElement): Self = StObject.set(x, "cancelSuffixIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCancelSuffixIconUndefined: Self = StObject.set(x, "cancelSuffixIcon", js.undefined)
      
      inline def setCancelText(value: VdomNode): Self = StObject.set(x, "cancelText", value.rawNode.asInstanceOf[js.Any])
      
      inline def setCancelTextNull: Self = StObject.set(x, "cancelText", null)
      
      inline def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
      
      inline def setCancelTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "cancelText", js.Array(value*))
      
      inline def setCancelTextVdomElement(value: VdomElement): Self = StObject.set(x, "cancelText", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCloseButton(value: Boolean): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
      
      inline def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
      
      inline def setConfirmPrefixIcon(value: VdomElement): Self = StObject.set(x, "confirmPrefixIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setConfirmPrefixIconUndefined: Self = StObject.set(x, "confirmPrefixIcon", js.undefined)
      
      inline def setConfirmSuffixIcon(value: VdomElement): Self = StObject.set(x, "confirmSuffixIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setConfirmSuffixIconUndefined: Self = StObject.set(x, "confirmSuffixIcon", js.undefined)
      
      inline def setConfirmText(value: VdomNode): Self = StObject.set(x, "confirmText", value.rawNode.asInstanceOf[js.Any])
      
      inline def setConfirmTextNull: Self = StObject.set(x, "confirmText", null)
      
      inline def setConfirmTextUndefined: Self = StObject.set(x, "confirmText", js.undefined)
      
      inline def setConfirmTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "confirmText", js.Array(value*))
      
      inline def setConfirmTextVdomElement(value: VdomElement): Self = StObject.set(x, "confirmText", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDisableCancel(value: Boolean): Self = StObject.set(x, "disableCancel", value.asInstanceOf[js.Any])
      
      inline def setDisableCancelUndefined: Self = StObject.set(x, "disableCancel", js.undefined)
      
      inline def setDisableConfirmation(value: Boolean): Self = StObject.set(x, "disableConfirmation", value.asInstanceOf[js.Any])
      
      inline def setDisableConfirmationUndefined: Self = StObject.set(x, "disableConfirmation", js.undefined)
      
      inline def setFooterBottomChildren(value: VdomNode): Self = StObject.set(x, "footerBottomChildren", value.rawNode.asInstanceOf[js.Any])
      
      inline def setFooterBottomChildrenNull: Self = StObject.set(x, "footerBottomChildren", null)
      
      inline def setFooterBottomChildrenUndefined: Self = StObject.set(x, "footerBottomChildren", js.undefined)
      
      inline def setFooterBottomChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "footerBottomChildren", js.Array(value*))
      
      inline def setFooterBottomChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "footerBottomChildren", value.rawElement.asInstanceOf[js.Any])
      
      inline def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
      
      inline def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
      
      inline def setHideFooter(value: Boolean): Self = StObject.set(x, "hideFooter", value.asInstanceOf[js.Any])
      
      inline def setHideFooterUndefined: Self = StObject.set(x, "hideFooter", js.undefined)
      
      inline def setImage(value: VdomNode): Self = StObject.set(x, "image", value.rawNode.asInstanceOf[js.Any])
      
      inline def setImageNull: Self = StObject.set(x, "image", null)
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setImageVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "image", js.Array(value*))
      
      inline def setImageVdomElement(value: VdomElement): Self = StObject.set(x, "image", value.rawElement.asInstanceOf[js.Any])
      
      inline def setMargin(value: String): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMaxHeight(value: String | Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setNoBodyPadding(value: Boolean): Self = StObject.set(x, "noBodyPadding", value.asInstanceOf[js.Any])
      
      inline def setNoBodyPaddingUndefined: Self = StObject.set(x, "noBodyPadding", js.undefined)
      
      inline def setOnCancel(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCancel", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      inline def setOnClose(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onClose", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnOk(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onOk", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
      
      inline def setSideActions(value: VdomNode): Self = StObject.set(x, "sideActions", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSideActionsNull: Self = StObject.set(x, "sideActions", null)
      
      inline def setSideActionsUndefined: Self = StObject.set(x, "sideActions", js.undefined)
      
      inline def setSideActionsVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "sideActions", js.Array(value*))
      
      inline def setSideActionsVdomElement(value: VdomElement): Self = StObject.set(x, "sideActions", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTheme(value: MessageBoxFunctionalLayoutTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWithEmptyState(value: Boolean): Self = StObject.set(x, "withEmptyState", value.asInstanceOf[js.Any])
      
      inline def setWithEmptyStateUndefined: Self = StObject.set(x, "withEmptyState", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.red
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.blue
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.purple
  */
  trait MessageBoxFunctionalLayoutTheme extends StObject
  object MessageBoxFunctionalLayoutTheme {
    
    inline def blue: typingsJapgolly.wixStyleReact.wixStyleReactStrings.blue = "blue".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.blue]
    
    inline def purple: typingsJapgolly.wixStyleReact.wixStyleReactStrings.purple = "purple".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.purple]
    
    inline def red: typingsJapgolly.wixStyleReact.wixStyleReactStrings.red = "red".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.red]
  }
  
  type _To = FC[MessageBoxFunctionalLayoutProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesMessageBoxFunctionalLayoutMod.foo` */
  override def _to: FC[MessageBoxFunctionalLayoutProps] = default
}
