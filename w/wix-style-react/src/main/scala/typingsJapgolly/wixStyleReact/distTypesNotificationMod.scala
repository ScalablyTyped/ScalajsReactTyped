package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.wixStyleReact.distTypesPopoverPopoverDottypesMod.AppendTo
import typingsJapgolly.wixStyleReact.distTypesPopoverPopoverDottypesMod.Placement
import typingsJapgolly.wixStyleReact.distTypesTooltipTooltipDottypesMod.TooltipSize
import typingsJapgolly.wixStyleReact.distTypesTooltipTooltipDottypesMod.TooltipTextAlign
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.button
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.textLink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesNotificationMod {
  
  @JSImport("wix-style-react/dist/types/Notification", JSImport.Default)
  @js.native
  open class default ()
    extends Component[NotificationProps, js.Object, Any]
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/types/Notification", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/Notification", "default.ActionButton")
    @js.native
    def ActionButton: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<ActionButtonProps> */ Any = js.native
    inline def ActionButton_=(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<ActionButtonProps> */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ActionButton")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Notification", "default.CloseButton")
    @js.native
    def CloseButton: Instantiable0[typingsJapgolly.wixStyleReact.distTypesCloseButtonMod.default] = js.native
    inline def CloseButton_=(x: Instantiable0[typingsJapgolly.wixStyleReact.distTypesCloseButtonMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CloseButton")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Notification", "default.TextLabel")
    @js.native
    def TextLabel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<TextLabelProps> */ Any = js.native
    inline def TextLabel_=(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<TextLabelProps> */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TextLabel")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.distTypesNotificationMod.ButtonActionButtonProps
    - typingsJapgolly.wixStyleReact.distTypesNotificationMod.TextLinkActionButton
  */
  trait ActionButtonProps extends StObject
  object ActionButtonProps {
    
    inline def ButtonActionButtonProps(): typingsJapgolly.wixStyleReact.distTypesNotificationMod.ButtonActionButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.wixStyleReact.distTypesNotificationMod.ButtonActionButtonProps]
    }
    
    inline def TextLinkActionButton(): typingsJapgolly.wixStyleReact.distTypesNotificationMod.TextLinkActionButton = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("textLink")
      __obj.asInstanceOf[typingsJapgolly.wixStyleReact.distTypesNotificationMod.TextLinkActionButton]
    }
  }
  
  trait ButtonActionButtonProps
    extends StObject
       with ActionButtonProps {
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var `type`: js.UndefOr[button] = js.undefined
  }
  object ButtonActionButtonProps {
    
    inline def apply(): ButtonActionButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonActionButtonProps]
    }
    
    extension [Self <: ButtonActionButtonProps](x: Self) {
      
      inline def setOnClick(value: ReactMouseEventFrom[HTMLButtonElement & Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & Element]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setType(value: button): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type Notification = japgolly.scalajs.react.facade.React.Component[NotificationProps & js.Object, js.Object]
  
  trait NotificationProps extends StObject {
    
    var autoHideTimeout: js.UndefOr[Double] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var onClose: js.UndefOr[js.Function1[/* source */ String, Unit]] = js.undefined
    
    var show: js.UndefOr[Boolean] = js.undefined
    
    var theme: js.UndefOr[NotificationTheme] = js.undefined
    
    var `type`: js.UndefOr[NotificationType] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object NotificationProps {
    
    inline def apply(): NotificationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationProps]
    }
    
    extension [Self <: NotificationProps](x: Self) {
      
      inline def setAutoHideTimeout(value: Double): Self = StObject.set(x, "autoHideTimeout", value.asInstanceOf[js.Any])
      
      inline def setAutoHideTimeoutUndefined: Self = StObject.set(x, "autoHideTimeout", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setOnClose(value: /* source */ String => Callback): Self = StObject.set(x, "onClose", js.Any.fromFunction1((t0: /* source */ String) => value(t0).runNow()))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setTheme(value: NotificationTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setType(value: NotificationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.error
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.success
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.warning
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.premium
  */
  trait NotificationTheme extends StObject
  object NotificationTheme {
    
    inline def error: typingsJapgolly.wixStyleReact.wixStyleReactStrings.error = "error".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.error]
    
    inline def premium: typingsJapgolly.wixStyleReact.wixStyleReactStrings.premium = "premium".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.premium]
    
    inline def standard: typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard = "standard".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard]
    
    inline def success: typingsJapgolly.wixStyleReact.wixStyleReactStrings.success = "success".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.success]
    
    inline def warning: typingsJapgolly.wixStyleReact.wixStyleReactStrings.warning = "warning".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.warning]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.local
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.global
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.sticky
  */
  trait NotificationType extends StObject
  object NotificationType {
    
    inline def global: typingsJapgolly.wixStyleReact.wixStyleReactStrings.global = "global".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.global]
    
    inline def local: typingsJapgolly.wixStyleReact.wixStyleReactStrings.local = "local".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.local]
    
    inline def sticky: typingsJapgolly.wixStyleReact.wixStyleReactStrings.sticky = "sticky".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.sticky]
  }
  
  /* Inlined wix-style-react.wix-style-react/dist/types/common/Ellipsis.EllipsisCommonProps & {  children :react.react.ReactNode} */
  trait TextLabelProps extends StObject {
    
    var appendTo: js.UndefOr[AppendTo] = js.undefined
    
    var children: Node
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var ellipsis: js.UndefOr[Boolean] = js.undefined
    
    var enterDelay: js.UndefOr[Double] = js.undefined
    
    var exitDelay: js.UndefOr[Double] = js.undefined
    
    var fixed: js.UndefOr[Boolean] = js.undefined
    
    var flip: js.UndefOr[Boolean] = js.undefined
    
    var maxLines: js.UndefOr[Double] = js.undefined
    
    var maxWidth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['maxWidth'] */ js.Any
      ] = js.undefined
    
    var moveArrowTo: js.UndefOr[Double] = js.undefined
    
    var moveBy: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: wix-style-react.wix-style-react/dist/types/Popover/Popover.types.PopoverProps['moveBy'] */ js.Any
      ] = js.undefined
    
    var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var placement: js.UndefOr[Placement] = js.undefined
    
    var showTooltip: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[TooltipSize] = js.undefined
    
    var textAlign: js.UndefOr[TooltipTextAlign] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object TextLabelProps {
    
    inline def apply(): TextLabelProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[TextLabelProps]
    }
    
    extension [Self <: TextLabelProps](x: Self) {
      
      inline def setAppendTo(value: AppendTo): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToFunction1(value: /* s */ Element => Boolean): Self = StObject.set(x, "appendTo", js.Any.fromFunction1(value))
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEllipsis(value: Boolean): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      inline def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      inline def setEnterDelay(value: Double): Self = StObject.set(x, "enterDelay", value.asInstanceOf[js.Any])
      
      inline def setEnterDelayUndefined: Self = StObject.set(x, "enterDelay", js.undefined)
      
      inline def setExitDelay(value: Double): Self = StObject.set(x, "exitDelay", value.asInstanceOf[js.Any])
      
      inline def setExitDelayUndefined: Self = StObject.set(x, "exitDelay", js.undefined)
      
      inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      inline def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      inline def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      inline def setMaxLines(value: Double): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
      
      inline def setMaxLinesUndefined: Self = StObject.set(x, "maxLines", js.undefined)
      
      inline def setMaxWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['maxWidth'] */ js.Any
      ): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMoveArrowTo(value: Double): Self = StObject.set(x, "moveArrowTo", value.asInstanceOf[js.Any])
      
      inline def setMoveArrowToUndefined: Self = StObject.set(x, "moveArrowTo", js.undefined)
      
      inline def setMoveBy(
        value: /* import warning: importer.ImportType#apply Failed type conversion: wix-style-react.wix-style-react/dist/types/Popover/Popover.types.PopoverProps['moveBy'] */ js.Any
      ): Self = StObject.set(x, "moveBy", value.asInstanceOf[js.Any])
      
      inline def setMoveByUndefined: Self = StObject.set(x, "moveBy", js.undefined)
      
      inline def setOnHide(value: Callback): Self = StObject.set(x, "onHide", value.toJsFn)
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnShow(value: Callback): Self = StObject.set(x, "onShow", value.toJsFn)
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setShowTooltip(value: Boolean): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
      
      inline def setShowTooltipUndefined: Self = StObject.set(x, "showTooltip", js.undefined)
      
      inline def setSize(value: TooltipSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTextAlign(value: TooltipTextAlign): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  trait TextLinkActionButton
    extends StObject
       with ActionButtonProps {
    
    var link: js.UndefOr[String] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
    
    var `type`: textLink
  }
  object TextLinkActionButton {
    
    inline def apply(): TextLinkActionButton = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("textLink")
      __obj.asInstanceOf[TextLinkActionButton]
    }
    
    extension [Self <: TextLinkActionButton](x: Self) {
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setOnClick(value: ReactMouseEventFrom[HTMLAnchorElement & Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & Element]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: textLink): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
