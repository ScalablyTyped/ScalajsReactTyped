package typingsJapgolly.ionicCore

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.ionicCore.actionSheetInterfaceMod.ActionSheetOptions
import typingsJapgolly.ionicCore.alertInterfaceMod.AlertOptions
import typingsJapgolly.ionicCore.animationInterfaceMod.Animation
import typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonActionSheetElement
import typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonAlertElement
import typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonLoadingElement
import typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonModalElement
import typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonPickerElement
import typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonPopoverElement
import typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonToastElement
import typingsJapgolly.ionicCore.ionicCoreStrings._forceStatusbarPadding
import typingsJapgolly.ionicCore.ionicCoreStrings._testing
import typingsJapgolly.ionicCore.ionicCoreStrings._zoneGate
import typingsJapgolly.ionicCore.ionicCoreStrings.actionSheetEnter
import typingsJapgolly.ionicCore.ionicCoreStrings.actionSheetLeave
import typingsJapgolly.ionicCore.ionicCoreStrings.alertEnter
import typingsJapgolly.ionicCore.ionicCoreStrings.alertLeave
import typingsJapgolly.ionicCore.ionicCoreStrings.animated
import typingsJapgolly.ionicCore.ionicCoreStrings.backButtonIcon
import typingsJapgolly.ionicCore.ionicCoreStrings.backButtonText
import typingsJapgolly.ionicCore.ionicCoreStrings.backdrop
import typingsJapgolly.ionicCore.ionicCoreStrings.experimentalTransitionShadow
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
import typingsJapgolly.ionicCore.ionicCoreStrings.popoverEnter
import typingsJapgolly.ionicCore.ionicCoreStrings.popoverLeave
import typingsJapgolly.ionicCore.ionicCoreStrings.refreshingIcon
import typingsJapgolly.ionicCore.ionicCoreStrings.refreshingSpinner
import typingsJapgolly.ionicCore.ionicCoreStrings.rippleEffect
import typingsJapgolly.ionicCore.ionicCoreStrings.scrollAssist
import typingsJapgolly.ionicCore.ionicCoreStrings.scrollPadding
import typingsJapgolly.ionicCore.ionicCoreStrings.spinner
import typingsJapgolly.ionicCore.ionicCoreStrings.statusTap
import typingsJapgolly.ionicCore.ionicCoreStrings.swipeBackEnabled
import typingsJapgolly.ionicCore.ionicCoreStrings.tabButtonLayout
import typingsJapgolly.ionicCore.ionicCoreStrings.toastEnter
import typingsJapgolly.ionicCore.ionicCoreStrings.toastLeave
import typingsJapgolly.ionicCore.loadingInterfaceMod.LoadingOptions
import typingsJapgolly.ionicCore.mod.ComponentRef
import typingsJapgolly.ionicCore.modalInterfaceMod.ModalOptions
import typingsJapgolly.ionicCore.oldAnimationAnimationInterfaceMod.AnimationBuilder
import typingsJapgolly.ionicCore.overlaysInterfaceMod.HTMLIonOverlayElement
import typingsJapgolly.ionicCore.overlaysInterfaceMod.OverlayInterface
import typingsJapgolly.ionicCore.pickerInterfaceMod.PickerOptions
import typingsJapgolly.ionicCore.popoverInterfaceMod.PopoverOptions
import typingsJapgolly.ionicCore.toastInterfaceMod.ToastOptions
import typingsJapgolly.std.Document_
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/utils/overlays", JSImport.Namespace)
@js.native
object overlaysMod extends js.Object {
  val BACKDROP: backdrop = js.native
  def connectListeners(doc: Document_): Unit = js.native
  def createOverlay[T /* <: HTMLIonOverlayElement */](tagName: String): js.Promise[T] = js.native
  def createOverlay[T /* <: HTMLIonOverlayElement */](tagName: String, opts: js.Object): js.Promise[T] = js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: js.UndefOr[scala.Nothing],
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: AnimationBuilder,
    mdLeaveAnimation: AnimationBuilder
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: js.UndefOr[scala.Nothing],
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: AnimationBuilder,
    mdLeaveAnimation: AnimationBuilder,
    opts: js.Any
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: js.UndefOr[scala.Nothing],
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: AnimationBuilder,
    mdLeaveAnimation: IonicAnimationInterface
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: js.UndefOr[scala.Nothing],
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: AnimationBuilder,
    mdLeaveAnimation: IonicAnimationInterface,
    opts: js.Any
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: js.UndefOr[scala.Nothing],
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: IonicAnimationInterface,
    mdLeaveAnimation: AnimationBuilder
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: js.UndefOr[scala.Nothing],
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: IonicAnimationInterface,
    mdLeaveAnimation: AnimationBuilder,
    opts: js.Any
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: js.UndefOr[scala.Nothing],
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: IonicAnimationInterface,
    mdLeaveAnimation: IonicAnimationInterface
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: js.UndefOr[scala.Nothing],
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: IonicAnimationInterface,
    mdLeaveAnimation: IonicAnimationInterface,
    opts: js.Any
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: String,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: AnimationBuilder,
    mdLeaveAnimation: AnimationBuilder
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: String,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: AnimationBuilder,
    mdLeaveAnimation: AnimationBuilder,
    opts: js.Any
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: String,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: AnimationBuilder,
    mdLeaveAnimation: IonicAnimationInterface
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: String,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: AnimationBuilder,
    mdLeaveAnimation: IonicAnimationInterface,
    opts: js.Any
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: String,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: IonicAnimationInterface,
    mdLeaveAnimation: AnimationBuilder
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: String,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: IonicAnimationInterface,
    mdLeaveAnimation: AnimationBuilder,
    opts: js.Any
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: String,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: IonicAnimationInterface,
    mdLeaveAnimation: IonicAnimationInterface
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: String,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: IonicAnimationInterface,
    mdLeaveAnimation: IonicAnimationInterface,
    opts: js.Any
  ): js.Promise[Boolean] = js.native
  def dismissOverlay(doc: Document_, data: js.Any, role: js.UndefOr[scala.Nothing], overlayTag: String): js.Promise[Boolean] = js.native
  def dismissOverlay(doc: Document_, data: js.Any, role: js.UndefOr[scala.Nothing], overlayTag: String, id: String): js.Promise[Boolean] = js.native
  def dismissOverlay(doc: Document_, data: js.Any, role: String, overlayTag: String): js.Promise[Boolean] = js.native
  def dismissOverlay(doc: Document_, data: js.Any, role: String, overlayTag: String, id: String): js.Promise[Boolean] = js.native
  def eventMethod[T](element: HTMLElement, eventName: String): js.Promise[T] = js.native
  def getOverlay(doc: Document_): js.UndefOr[HTMLIonOverlayElement] = js.native
  def getOverlay(doc: Document_, overlayTag: js.UndefOr[scala.Nothing], id: String): js.UndefOr[HTMLIonOverlayElement] = js.native
  def getOverlay(doc: Document_, overlayTag: String): js.UndefOr[HTMLIonOverlayElement] = js.native
  def getOverlay(doc: Document_, overlayTag: String, id: String): js.UndefOr[HTMLIonOverlayElement] = js.native
  def getOverlays(doc: Document_): js.Array[HTMLIonOverlayElement] = js.native
  def getOverlays(doc: Document_, selector: String): js.Array[HTMLIonOverlayElement] = js.native
  def isCancel(): Boolean = js.native
  def isCancel(role: String): Boolean = js.native
  def onceEvent(element: HTMLElement, eventName: String, callback: js.Function1[/* ev */ Event_, Unit]): Unit = js.native
  def prepareOverlay[T /* <: HTMLIonOverlayElement */](el: T): Unit = js.native
  def present(
    overlay: OverlayInterface,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosEnterAnimation: AnimationBuilder,
    mdEnterAnimation: AnimationBuilder
  ): js.Promise[Unit] = js.native
  def present(
    overlay: OverlayInterface,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosEnterAnimation: AnimationBuilder,
    mdEnterAnimation: AnimationBuilder,
    opts: js.Any
  ): js.Promise[Unit] = js.native
  def present(
    overlay: OverlayInterface,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosEnterAnimation: AnimationBuilder,
    mdEnterAnimation: IonicAnimationInterface
  ): js.Promise[Unit] = js.native
  def present(
    overlay: OverlayInterface,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosEnterAnimation: AnimationBuilder,
    mdEnterAnimation: IonicAnimationInterface,
    opts: js.Any
  ): js.Promise[Unit] = js.native
  def present(
    overlay: OverlayInterface,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosEnterAnimation: IonicAnimationInterface,
    mdEnterAnimation: AnimationBuilder
  ): js.Promise[Unit] = js.native
  def present(
    overlay: OverlayInterface,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosEnterAnimation: IonicAnimationInterface,
    mdEnterAnimation: AnimationBuilder,
    opts: js.Any
  ): js.Promise[Unit] = js.native
  def present(
    overlay: OverlayInterface,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosEnterAnimation: IonicAnimationInterface,
    mdEnterAnimation: IonicAnimationInterface
  ): js.Promise[Unit] = js.native
  def present(
    overlay: OverlayInterface,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosEnterAnimation: IonicAnimationInterface,
    mdEnterAnimation: IonicAnimationInterface,
    opts: js.Any
  ): js.Promise[Unit] = js.native
  def safeCall(handler: js.Any): js.Any = js.native
  def safeCall(handler: js.Any, arg: js.Any): js.Any = js.native
  @js.native
  object actionSheetController extends js.Object {
    def create(options: ActionSheetOptions): js.Promise[HTMLIonActionSheetElement] = js.native
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonActionSheetElement]] = js.native
  }
  
  @js.native
  object alertController extends js.Object {
    def create(options: AlertOptions): js.Promise[HTMLIonAlertElement] = js.native
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonAlertElement]] = js.native
  }
  
  @js.native
  object loadingController extends js.Object {
    def create(options: LoadingOptions): js.Promise[HTMLIonLoadingElement] = js.native
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonLoadingElement]] = js.native
  }
  
  @js.native
  object modalController extends js.Object {
    def create(options: ModalOptions[ComponentRef]): js.Promise[HTMLIonModalElement] = js.native
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonModalElement]] = js.native
  }
  
  @js.native
  object pickerController extends js.Object {
    def create(options: PickerOptions): js.Promise[HTMLIonPickerElement] = js.native
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonPickerElement]] = js.native
  }
  
  @js.native
  object popoverController extends js.Object {
    def create(options: PopoverOptions[ComponentRef]): js.Promise[HTMLIonPopoverElement] = js.native
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonPopoverElement]] = js.native
  }
  
  @js.native
  object toastController extends js.Object {
    def create(options: ToastOptions): js.Promise[HTMLIonToastElement] = js.native
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonToastElement]] = js.native
  }
  
  type IonicAnimationInterface = js.Function2[/* baseEl */ js.Any, /* opts */ js.Any, Animation]
}

