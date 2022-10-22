package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.libComponentsFocusTrapZoneFocusTrapZoneDottypesMod.IFocusTrapZoneProps
import typingsJapgolly.officeUiFabricReact.libComponentsLayerLayerDottypesMod.ILayerProps
import typingsJapgolly.officeUiFabricReact.libComponentsModalModalDottypesMod.IDragOptions
import typingsJapgolly.officeUiFabricReact.libComponentsModalModalDottypesMod.IModal
import typingsJapgolly.officeUiFabricReact.libComponentsModalModalDottypesMod.IModalProps
import typingsJapgolly.officeUiFabricReact.libComponentsModalModalDottypesMod.IModalStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsModalModalDottypesMod.IModalStyles
import typingsJapgolly.officeUiFabricReact.libComponentsOverlayOverlayDottypesMod.IOverlayProps
import typingsJapgolly.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Modal {
  
  @JSImport("office-ui-fabric-react", "Modal")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.officeUiFabricReact.libComponentsModalModalDotbaseMod.ModalBase] {
    
    inline def allowTouchBodyScroll(value: Boolean): this.type = set("allowTouchBodyScroll", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def closeButtonAriaLabel(value: String): this.type = set("closeButtonAriaLabel", value.asInstanceOf[js.Any])
    
    inline def componentRef(value: IRefObject[IModal]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    inline def componentRefFunction1(value: /* ref */ IModal | Null => Callback): this.type = set("componentRef", js.Any.fromFunction1((t0: /* ref */ IModal | Null) => value(t0).runNow()))
    
    inline def containerClassName(value: String): this.type = set("containerClassName", value.asInstanceOf[js.Any])
    
    inline def dragOptions(value: IDragOptions): this.type = set("dragOptions", value.asInstanceOf[js.Any])
    
    inline def elementToFocusOnDismiss(value: HTMLElement): this.type = set("elementToFocusOnDismiss", value.asInstanceOf[js.Any])
    
    inline def enableAriaHiddenSiblings(value: Boolean): this.type = set("enableAriaHiddenSiblings", value.asInstanceOf[js.Any])
    
    inline def firstFocusableSelector(value: String | js.Function0[String]): this.type = set("firstFocusableSelector", value.asInstanceOf[js.Any])
    
    inline def firstFocusableSelectorCallbackTo(value: CallbackTo[String]): this.type = set("firstFocusableSelector", value.toJsFn)
    
    inline def focusTrapZoneProps(value: IFocusTrapZoneProps): this.type = set("focusTrapZoneProps", value.asInstanceOf[js.Any])
    
    inline def forceFocusInsideTrap(value: Boolean): this.type = set("forceFocusInsideTrap", value.asInstanceOf[js.Any])
    
    inline def ignoreExternalFocusing(value: Boolean): this.type = set("ignoreExternalFocusing", value.asInstanceOf[js.Any])
    
    inline def isAlert(value: Boolean): this.type = set("isAlert", value.asInstanceOf[js.Any])
    
    inline def isBlocking(value: Boolean): this.type = set("isBlocking", value.asInstanceOf[js.Any])
    
    inline def isClickableOutsideFocusTrap(value: Boolean): this.type = set("isClickableOutsideFocusTrap", value.asInstanceOf[js.Any])
    
    inline def isDarkOverlay(value: Boolean): this.type = set("isDarkOverlay", value.asInstanceOf[js.Any])
    
    inline def isModeless(value: Boolean): this.type = set("isModeless", value.asInstanceOf[js.Any])
    
    inline def isOpen(value: Boolean): this.type = set("isOpen", value.asInstanceOf[js.Any])
    
    inline def layerProps(value: ILayerProps): this.type = set("layerProps", value.asInstanceOf[js.Any])
    
    inline def onDismiss(value: /* ev */ js.UndefOr[ReactMouseEventFrom[HTMLButtonElement]] => Any): this.type = set("onDismiss", js.Any.fromFunction1(value))
    
    inline def onDismissed(value: CallbackTo[Any]): this.type = set("onDismissed", value.toJsFn)
    
    inline def onLayerDidMount(value: Callback): this.type = set("onLayerDidMount", value.toJsFn)
    
    inline def overlay(value: IOverlayProps): this.type = set("overlay", value.asInstanceOf[js.Any])
    
    inline def responsiveMode(value: ResponsiveMode): this.type = set("responsiveMode", value.asInstanceOf[js.Any])
    
    inline def scrollableContentClassName(value: String): this.type = set("scrollableContentClassName", value.asInstanceOf[js.Any])
    
    inline def styles(value: IStyleFunctionOrObject[IModalStyleProps, IModalStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def stylesFunction1(value: IModalStyleProps => DeepPartial[IModalStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    
    inline def subtitleAriaId(value: String): this.type = set("subtitleAriaId", value.asInstanceOf[js.Any])
    
    inline def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def titleAriaId(value: String): this.type = set("titleAriaId", value.asInstanceOf[js.Any])
    
    inline def topOffsetFixed(value: Boolean): this.type = set("topOffsetFixed", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Modal.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IModalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
