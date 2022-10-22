package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.libComponentsButtonButtonDottypesMod.IButtonProps
import typingsJapgolly.officeUiFabricReact.libComponentsDialogDialogContentDottypesMod.DialogType
import typingsJapgolly.officeUiFabricReact.libComponentsDialogDialogContentDottypesMod.IDialogContentProps
import typingsJapgolly.officeUiFabricReact.libComponentsDialogDialogDottypesMod.IDialog
import typingsJapgolly.officeUiFabricReact.libComponentsDialogDialogDottypesMod.IDialogProps
import typingsJapgolly.officeUiFabricReact.libComponentsDialogDialogDottypesMod.IDialogStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsDialogDialogDottypesMod.IDialogStyles
import typingsJapgolly.officeUiFabricReact.libComponentsModalModalDottypesMod.IModalProps
import typingsJapgolly.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIrawstylebaseMod.ICSSPixelUnitRule
import typingsJapgolly.uifabricMergeStyles.libIrawstylebaseMod.ICSSRule
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Dialog {
  
  @JSImport("office-ui-fabric-react", "Dialog")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[
          typingsJapgolly.officeUiFabricReact.libComponentsDialogDialogDotbaseMod.DialogBase
        ] {
    
    inline def ariaDescribedById(value: String): this.type = set("ariaDescribedById", value.asInstanceOf[js.Any])
    
    inline def ariaLabelledById(value: String): this.type = set("ariaLabelledById", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def closeButtonAriaLabel(value: String): this.type = set("closeButtonAriaLabel", value.asInstanceOf[js.Any])
    
    inline def componentRef(value: IRefObject[IDialog]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    inline def componentRefFunction1(value: /* ref */ IDialog | Null => Callback): this.type = set("componentRef", js.Any.fromFunction1((t0: /* ref */ IDialog | Null) => value(t0).runNow()))
    
    inline def containerClassName(value: String): this.type = set("containerClassName", value.asInstanceOf[js.Any])
    
    inline def contentClassName(value: String): this.type = set("contentClassName", value.asInstanceOf[js.Any])
    
    inline def dialogContentProps(value: IDialogContentProps): this.type = set("dialogContentProps", value.asInstanceOf[js.Any])
    
    inline def elementToFocusOnDismiss(value: HTMLElement): this.type = set("elementToFocusOnDismiss", value.asInstanceOf[js.Any])
    
    inline def firstFocusableSelector(value: String | js.Function0[String]): this.type = set("firstFocusableSelector", value.asInstanceOf[js.Any])
    
    inline def firstFocusableSelectorCallbackTo(value: CallbackTo[String]): this.type = set("firstFocusableSelector", value.toJsFn)
    
    inline def forceFocusInsideTrap(value: Boolean): this.type = set("forceFocusInsideTrap", value.asInstanceOf[js.Any])
    
    inline def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    inline def ignoreExternalFocusing(value: Boolean): this.type = set("ignoreExternalFocusing", value.asInstanceOf[js.Any])
    
    inline def isBlocking(value: Boolean): this.type = set("isBlocking", value.asInstanceOf[js.Any])
    
    inline def isClickableOutsideFocusTrap(value: Boolean): this.type = set("isClickableOutsideFocusTrap", value.asInstanceOf[js.Any])
    
    inline def isDarkOverlay(value: Boolean): this.type = set("isDarkOverlay", value.asInstanceOf[js.Any])
    
    inline def isOpen(value: Boolean): this.type = set("isOpen", value.asInstanceOf[js.Any])
    
    inline def maxWidth(value: ICSSRule | ICSSPixelUnitRule): this.type = set("maxWidth", value.asInstanceOf[js.Any])
    
    inline def minWidth(value: ICSSRule | ICSSPixelUnitRule): this.type = set("minWidth", value.asInstanceOf[js.Any])
    
    inline def modalProps(value: IModalProps): this.type = set("modalProps", value.asInstanceOf[js.Any])
    
    inline def onDismiss(value: /* ev */ js.UndefOr[ReactMouseEventFrom[HTMLButtonElement]] => Any): this.type = set("onDismiss", js.Any.fromFunction1(value))
    
    inline def onDismissed(value: CallbackTo[Any]): this.type = set("onDismissed", value.toJsFn)
    
    inline def onLayerDidMount(value: Callback): this.type = set("onLayerDidMount", value.toJsFn)
    
    inline def onLayerMounted(value: Callback): this.type = set("onLayerMounted", value.toJsFn)
    
    inline def responsiveMode(value: ResponsiveMode): this.type = set("responsiveMode", value.asInstanceOf[js.Any])
    
    inline def styles(value: IStyleFunctionOrObject[IDialogStyleProps, IDialogStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def stylesFunction1(value: IDialogStyleProps => DeepPartial[IDialogStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    
    inline def subText(value: String): this.type = set("subText", value.asInstanceOf[js.Any])
    
    inline def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def title(value: String | Element): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
    
    inline def topButtonsProps(value: js.Array[IButtonProps]): this.type = set("topButtonsProps", value.asInstanceOf[js.Any])
    
    inline def topButtonsPropsVarargs(value: IButtonProps*): this.type = set("topButtonsProps", js.Array(value*))
    
    inline def `type`(value: DialogType): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Dialog.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IDialogProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
