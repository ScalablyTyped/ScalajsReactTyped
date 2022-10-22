package typingsJapgolly.ionicCore

import org.scalajs.dom.Document
import org.scalajs.dom.Element
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.distTypesComponentsActionSheetActionSheetInterfaceMod.ActionSheetOptions
import typingsJapgolly.ionicCore.distTypesComponentsAlertAlertInterfaceMod.AlertOptions
import typingsJapgolly.ionicCore.distTypesComponentsLoadingLoadingInterfaceMod.LoadingOptions
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonActionSheetElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonAlertElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonLoadingElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonModalElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonPickerElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonPopoverElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonToastElement
import typingsJapgolly.ionicCore.distTypesComponentsModalModalInterfaceMod.ModalOptions
import typingsJapgolly.ionicCore.distTypesComponentsPickerPickerInterfaceMod.PickerOptions
import typingsJapgolly.ionicCore.distTypesComponentsPopoverPopoverInterfaceMod.PopoverOptions
import typingsJapgolly.ionicCore.distTypesComponentsToastToastInterfaceMod.ToastOptions
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.Animation
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.AnimationBuilder
import typingsJapgolly.ionicCore.distTypesUtilsOverlaysInterfaceMod.HTMLIonOverlayElement
import typingsJapgolly.ionicCore.distTypesUtilsOverlaysInterfaceMod.OverlayInterface
import typingsJapgolly.ionicCore.ionicCoreStrings._ael
import typingsJapgolly.ionicCore.ionicCoreStrings._ce
import typingsJapgolly.ionicCore.ionicCoreStrings._forceStatusbarPadding
import typingsJapgolly.ionicCore.ionicCoreStrings._rel
import typingsJapgolly.ionicCore.ionicCoreStrings._testing
import typingsJapgolly.ionicCore.ionicCoreStrings._zoneGate
import typingsJapgolly.ionicCore.ionicCoreStrings.actionSheetEnter
import typingsJapgolly.ionicCore.ionicCoreStrings.actionSheetLeave
import typingsJapgolly.ionicCore.ionicCoreStrings.alertEnter
import typingsJapgolly.ionicCore.ionicCoreStrings.alertLeave
import typingsJapgolly.ionicCore.ionicCoreStrings.animated
import typingsJapgolly.ionicCore.ionicCoreStrings.backButtonDefaultHref
import typingsJapgolly.ionicCore.ionicCoreStrings.backButtonIcon
import typingsJapgolly.ionicCore.ionicCoreStrings.backButtonText
import typingsJapgolly.ionicCore.ionicCoreStrings.hardwareBackButton
import typingsJapgolly.ionicCore.ionicCoreStrings.hideCaretOnScroll
import typingsJapgolly.ionicCore.ionicCoreStrings.infiniteLoadingSpinner
import typingsJapgolly.ionicCore.ionicCoreStrings.inputBlurring
import typingsJapgolly.ionicCore.ionicCoreStrings.inputShims
import typingsJapgolly.ionicCore.ionicCoreStrings.keyboardHeight
import typingsJapgolly.ionicCore.ionicCoreStrings.loadingEnter
import typingsJapgolly.ionicCore.ionicCoreStrings.loadingLeave
import typingsJapgolly.ionicCore.ionicCoreStrings.loadingSpinner
import typingsJapgolly.ionicCore.ionicCoreStrings.menuIcon
import typingsJapgolly.ionicCore.ionicCoreStrings.menuType
import typingsJapgolly.ionicCore.ionicCoreStrings.modalEnter
import typingsJapgolly.ionicCore.ionicCoreStrings.modalLeave
import typingsJapgolly.ionicCore.ionicCoreStrings.mode
import typingsJapgolly.ionicCore.ionicCoreStrings.navAnimation
import typingsJapgolly.ionicCore.ionicCoreStrings.persistConfig
import typingsJapgolly.ionicCore.ionicCoreStrings.pickerEnter
import typingsJapgolly.ionicCore.ionicCoreStrings.pickerLeave
import typingsJapgolly.ionicCore.ionicCoreStrings.platform
import typingsJapgolly.ionicCore.ionicCoreStrings.popoverEnter
import typingsJapgolly.ionicCore.ionicCoreStrings.popoverLeave
import typingsJapgolly.ionicCore.ionicCoreStrings.refreshingIcon
import typingsJapgolly.ionicCore.ionicCoreStrings.refreshingSpinner
import typingsJapgolly.ionicCore.ionicCoreStrings.rippleEffect
import typingsJapgolly.ionicCore.ionicCoreStrings.sanitizerEnabled
import typingsJapgolly.ionicCore.ionicCoreStrings.scrollAssist
import typingsJapgolly.ionicCore.ionicCoreStrings.scrollPadding
import typingsJapgolly.ionicCore.ionicCoreStrings.spinner
import typingsJapgolly.ionicCore.ionicCoreStrings.statusTap
import typingsJapgolly.ionicCore.ionicCoreStrings.swipeBackEnabled
import typingsJapgolly.ionicCore.ionicCoreStrings.tabButtonLayout
import typingsJapgolly.ionicCore.ionicCoreStrings.toastEnter
import typingsJapgolly.ionicCore.ionicCoreStrings.toastLeave
import typingsJapgolly.ionicCore.mod.ComponentRef
import typingsJapgolly.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsOverlaysMod {
  
  @JSImport("@ionic/core/dist/types/utils/overlays", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/core/dist/types/utils/overlays", "BACKDROP")
  @js.native
  val BACKDROP: /* "backdrop" */ String = js.native
  
  object actionSheetController {
    
    @JSImport("@ionic/core/dist/types/utils/overlays", "actionSheetController")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(options: ActionSheetOptions): js.Promise[HTMLIonActionSheetElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HTMLIonActionSheetElement]]
    
    inline def dismiss(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")().asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Any): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Any, role: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Any, role: String, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Any, role: Unit, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Unit, role: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Unit, role: String, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Unit, role: Unit, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
    inline def getTop(): js.Promise[js.UndefOr[HTMLIonActionSheetElement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTop")().asInstanceOf[js.Promise[js.UndefOr[HTMLIonActionSheetElement]]]
  }
  
  @JSImport("@ionic/core/dist/types/utils/overlays", "activeAnimations")
  @js.native
  val activeAnimations: WeakMap[OverlayInterface, js.Array[Animation]] = js.native
  
  object alertController {
    
    @JSImport("@ionic/core/dist/types/utils/overlays", "alertController")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(options: AlertOptions): js.Promise[HTMLIonAlertElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HTMLIonAlertElement]]
    
    inline def dismiss(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")().asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Any): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Any, role: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Any, role: String, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Any, role: Unit, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Unit, role: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Unit, role: String, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Unit, role: Unit, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
    inline def getTop(): js.Promise[js.UndefOr[HTMLIonAlertElement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTop")().asInstanceOf[js.Promise[js.UndefOr[HTMLIonAlertElement]]]
  }
  
  inline def createOverlay[T /* <: HTMLIonOverlayElement */](tagName: String): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createOverlay")(tagName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def createOverlay[T /* <: HTMLIonOverlayElement */](tagName: String, opts: js.Object): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createOverlay")(tagName.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def dismiss(
    overlay: OverlayInterface,
    data: Any,
    role: String,
    name: /* keyof @ionic/core.@ionic/core/dist/types/utils/config.IonicConfig */ animated | rippleEffect | mode | hardwareBackButton | statusTap | backButtonIcon | backButtonText | backButtonDefaultHref | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | sanitizerEnabled | platform | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate | _ael | _rel | _ce,
    iosLeaveAnimation: AnimationBuilder,
    mdLeaveAnimation: AnimationBuilder
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(overlay.asInstanceOf[js.Any], data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], name.asInstanceOf[js.Any], iosLeaveAnimation.asInstanceOf[js.Any], mdLeaveAnimation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def dismiss(
    overlay: OverlayInterface,
    data: Any,
    role: String,
    name: /* keyof @ionic/core.@ionic/core/dist/types/utils/config.IonicConfig */ animated | rippleEffect | mode | hardwareBackButton | statusTap | backButtonIcon | backButtonText | backButtonDefaultHref | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | sanitizerEnabled | platform | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate | _ael | _rel | _ce,
    iosLeaveAnimation: AnimationBuilder,
    mdLeaveAnimation: AnimationBuilder,
    opts: Any
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(overlay.asInstanceOf[js.Any], data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], name.asInstanceOf[js.Any], iosLeaveAnimation.asInstanceOf[js.Any], mdLeaveAnimation.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def dismiss(
    overlay: OverlayInterface,
    data: Any,
    role: Unit,
    name: /* keyof @ionic/core.@ionic/core/dist/types/utils/config.IonicConfig */ animated | rippleEffect | mode | hardwareBackButton | statusTap | backButtonIcon | backButtonText | backButtonDefaultHref | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | sanitizerEnabled | platform | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate | _ael | _rel | _ce,
    iosLeaveAnimation: AnimationBuilder,
    mdLeaveAnimation: AnimationBuilder
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(overlay.asInstanceOf[js.Any], data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], name.asInstanceOf[js.Any], iosLeaveAnimation.asInstanceOf[js.Any], mdLeaveAnimation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def dismiss(
    overlay: OverlayInterface,
    data: Any,
    role: Unit,
    name: /* keyof @ionic/core.@ionic/core/dist/types/utils/config.IonicConfig */ animated | rippleEffect | mode | hardwareBackButton | statusTap | backButtonIcon | backButtonText | backButtonDefaultHref | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | sanitizerEnabled | platform | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate | _ael | _rel | _ce,
    iosLeaveAnimation: AnimationBuilder,
    mdLeaveAnimation: AnimationBuilder,
    opts: Any
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(overlay.asInstanceOf[js.Any], data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], name.asInstanceOf[js.Any], iosLeaveAnimation.asInstanceOf[js.Any], mdLeaveAnimation.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def dismiss(
    overlay: OverlayInterface,
    data: Unit,
    role: String,
    name: /* keyof @ionic/core.@ionic/core/dist/types/utils/config.IonicConfig */ animated | rippleEffect | mode | hardwareBackButton | statusTap | backButtonIcon | backButtonText | backButtonDefaultHref | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | sanitizerEnabled | platform | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate | _ael | _rel | _ce,
    iosLeaveAnimation: AnimationBuilder,
    mdLeaveAnimation: AnimationBuilder
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(overlay.asInstanceOf[js.Any], data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], name.asInstanceOf[js.Any], iosLeaveAnimation.asInstanceOf[js.Any], mdLeaveAnimation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def dismiss(
    overlay: OverlayInterface,
    data: Unit,
    role: String,
    name: /* keyof @ionic/core.@ionic/core/dist/types/utils/config.IonicConfig */ animated | rippleEffect | mode | hardwareBackButton | statusTap | backButtonIcon | backButtonText | backButtonDefaultHref | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | sanitizerEnabled | platform | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate | _ael | _rel | _ce,
    iosLeaveAnimation: AnimationBuilder,
    mdLeaveAnimation: AnimationBuilder,
    opts: Any
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(overlay.asInstanceOf[js.Any], data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], name.asInstanceOf[js.Any], iosLeaveAnimation.asInstanceOf[js.Any], mdLeaveAnimation.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def dismiss(
    overlay: OverlayInterface,
    data: Unit,
    role: Unit,
    name: /* keyof @ionic/core.@ionic/core/dist/types/utils/config.IonicConfig */ animated | rippleEffect | mode | hardwareBackButton | statusTap | backButtonIcon | backButtonText | backButtonDefaultHref | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | sanitizerEnabled | platform | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate | _ael | _rel | _ce,
    iosLeaveAnimation: AnimationBuilder,
    mdLeaveAnimation: AnimationBuilder
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(overlay.asInstanceOf[js.Any], data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], name.asInstanceOf[js.Any], iosLeaveAnimation.asInstanceOf[js.Any], mdLeaveAnimation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def dismiss(
    overlay: OverlayInterface,
    data: Unit,
    role: Unit,
    name: /* keyof @ionic/core.@ionic/core/dist/types/utils/config.IonicConfig */ animated | rippleEffect | mode | hardwareBackButton | statusTap | backButtonIcon | backButtonText | backButtonDefaultHref | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | sanitizerEnabled | platform | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate | _ael | _rel | _ce,
    iosLeaveAnimation: AnimationBuilder,
    mdLeaveAnimation: AnimationBuilder,
    opts: Any
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(overlay.asInstanceOf[js.Any], data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], name.asInstanceOf[js.Any], iosLeaveAnimation.asInstanceOf[js.Any], mdLeaveAnimation.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def dismissOverlay(doc: Document, data: Any, role: String, overlayTag: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismissOverlay")(doc.asInstanceOf[js.Any], data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], overlayTag.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def dismissOverlay(doc: Document, data: Any, role: String, overlayTag: String, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismissOverlay")(doc.asInstanceOf[js.Any], data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], overlayTag.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def dismissOverlay(doc: Document, data: Any, role: Unit, overlayTag: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismissOverlay")(doc.asInstanceOf[js.Any], data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], overlayTag.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def dismissOverlay(doc: Document, data: Any, role: Unit, overlayTag: String, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismissOverlay")(doc.asInstanceOf[js.Any], data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], overlayTag.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def eventMethod[T](element: HTMLElement, eventName: String): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventMethod")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def focusFirstDescendant(ref: Element, overlay: HTMLIonOverlayElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusFirstDescendant")(ref.asInstanceOf[js.Any], overlay.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getOverlay(doc: Document): js.UndefOr[HTMLIonOverlayElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOverlay")(doc.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[HTMLIonOverlayElement]]
  inline def getOverlay(doc: Document, overlayTag: String): js.UndefOr[HTMLIonOverlayElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOverlay")(doc.asInstanceOf[js.Any], overlayTag.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[HTMLIonOverlayElement]]
  inline def getOverlay(doc: Document, overlayTag: String, id: String): js.UndefOr[HTMLIonOverlayElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOverlay")(doc.asInstanceOf[js.Any], overlayTag.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[HTMLIonOverlayElement]]
  inline def getOverlay(doc: Document, overlayTag: Unit, id: String): js.UndefOr[HTMLIonOverlayElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOverlay")(doc.asInstanceOf[js.Any], overlayTag.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[HTMLIonOverlayElement]]
  
  inline def getOverlays(doc: Document): js.Array[HTMLIonOverlayElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOverlays")(doc.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLIonOverlayElement]]
  inline def getOverlays(doc: Document, selector: String): js.Array[HTMLIonOverlayElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOverlays")(doc.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLIonOverlayElement]]
  
  inline def isCancel(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCancel")().asInstanceOf[Boolean]
  inline def isCancel(role: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCancel")(role.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  object loadingController {
    
    @JSImport("@ionic/core/dist/types/utils/overlays", "loadingController")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(options: LoadingOptions): js.Promise[HTMLIonLoadingElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HTMLIonLoadingElement]]
    
    inline def dismiss(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")().asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Any): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Any, role: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Any, role: String, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Any, role: Unit, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Unit, role: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Unit, role: String, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Unit, role: Unit, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
    inline def getTop(): js.Promise[js.UndefOr[HTMLIonLoadingElement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTop")().asInstanceOf[js.Promise[js.UndefOr[HTMLIonLoadingElement]]]
  }
  
  object modalController {
    
    @JSImport("@ionic/core/dist/types/utils/overlays", "modalController")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(options: ModalOptions[ComponentRef]): js.Promise[HTMLIonModalElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HTMLIonModalElement]]
    
    inline def dismiss(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")().asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Any): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Any, role: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Any, role: String, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Any, role: Unit, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Unit, role: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Unit, role: String, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Unit, role: Unit, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
    inline def getTop(): js.Promise[js.UndefOr[HTMLIonModalElement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTop")().asInstanceOf[js.Promise[js.UndefOr[HTMLIonModalElement]]]
  }
  
  inline def onceEvent(element: HTMLElement, eventName: String, callback: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onceEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object pickerController {
    
    @JSImport("@ionic/core/dist/types/utils/overlays", "pickerController")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(options: PickerOptions): js.Promise[HTMLIonPickerElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HTMLIonPickerElement]]
    
    inline def dismiss(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")().asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Any): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Any, role: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Any, role: String, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Any, role: Unit, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Unit, role: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Unit, role: String, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Unit, role: Unit, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
    inline def getTop(): js.Promise[js.UndefOr[HTMLIonPickerElement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTop")().asInstanceOf[js.Promise[js.UndefOr[HTMLIonPickerElement]]]
  }
  
  object popoverController {
    
    @JSImport("@ionic/core/dist/types/utils/overlays", "popoverController")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(options: PopoverOptions[ComponentRef]): js.Promise[HTMLIonPopoverElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HTMLIonPopoverElement]]
    
    inline def dismiss(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")().asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Any): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Any, role: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Any, role: String, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Any, role: Unit, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Unit, role: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Unit, role: String, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Unit, role: Unit, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
    inline def getTop(): js.Promise[js.UndefOr[HTMLIonPopoverElement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTop")().asInstanceOf[js.Promise[js.UndefOr[HTMLIonPopoverElement]]]
  }
  
  inline def prepareOverlay[T /* <: HTMLIonOverlayElement */](el: T): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareOverlay")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def present(
    overlay: OverlayInterface,
    name: /* keyof @ionic/core.@ionic/core/dist/types/utils/config.IonicConfig */ animated | rippleEffect | mode | hardwareBackButton | statusTap | backButtonIcon | backButtonText | backButtonDefaultHref | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | sanitizerEnabled | platform | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate | _ael | _rel | _ce,
    iosEnterAnimation: AnimationBuilder,
    mdEnterAnimation: AnimationBuilder
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("present")(overlay.asInstanceOf[js.Any], name.asInstanceOf[js.Any], iosEnterAnimation.asInstanceOf[js.Any], mdEnterAnimation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def present(
    overlay: OverlayInterface,
    name: /* keyof @ionic/core.@ionic/core/dist/types/utils/config.IonicConfig */ animated | rippleEffect | mode | hardwareBackButton | statusTap | backButtonIcon | backButtonText | backButtonDefaultHref | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | sanitizerEnabled | platform | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate | _ael | _rel | _ce,
    iosEnterAnimation: AnimationBuilder,
    mdEnterAnimation: AnimationBuilder,
    opts: Any
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("present")(overlay.asInstanceOf[js.Any], name.asInstanceOf[js.Any], iosEnterAnimation.asInstanceOf[js.Any], mdEnterAnimation.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def safeCall(handler: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("safeCall")(handler.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def safeCall(handler: Any, arg: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("safeCall")(handler.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def setRootAriaHidden(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRootAriaHidden")().asInstanceOf[Unit]
  inline def setRootAriaHidden(hidden: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRootAriaHidden")(hidden.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  object toastController {
    
    @JSImport("@ionic/core/dist/types/utils/overlays", "toastController")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(options: ToastOptions): js.Promise[HTMLIonToastElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HTMLIonToastElement]]
    
    inline def dismiss(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")().asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Any): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Any, role: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Any, role: String, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Any, role: Unit, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Unit, role: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Unit, role: String, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def dismiss(data: Unit, role: Unit, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
    inline def getTop(): js.Promise[js.UndefOr[HTMLIonToastElement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTop")().asInstanceOf[js.Promise[js.UndefOr[HTMLIonToastElement]]]
  }
}
