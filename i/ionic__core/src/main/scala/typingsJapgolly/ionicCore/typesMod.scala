package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.actionSheetInterfaceMod.ActionSheetOptions
import typingsJapgolly.ionicCore.alertInterfaceMod.AlertOptions
import typingsJapgolly.ionicCore.animationInterfaceMod.Animation
import typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonActionSheetElement
import typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonAlertElement
import typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonLoadingElement
import typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonMenuElement
import typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonModalElement
import typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonPickerElement
import typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonPopoverElement
import typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonToastElement
import typingsJapgolly.ionicCore.gestureMod.Gesture
import typingsJapgolly.ionicCore.gestureMod.GestureConfig
import typingsJapgolly.ionicCore.ionicCoreStrings.android
import typingsJapgolly.ionicCore.ionicCoreStrings.capacitor
import typingsJapgolly.ionicCore.ionicCoreStrings.cordova
import typingsJapgolly.ionicCore.ionicCoreStrings.desktop
import typingsJapgolly.ionicCore.ionicCoreStrings.electron
import typingsJapgolly.ionicCore.ionicCoreStrings.hybrid
import typingsJapgolly.ionicCore.ionicCoreStrings.ionViewDidEnter
import typingsJapgolly.ionicCore.ionicCoreStrings.ionViewDidLeave
import typingsJapgolly.ionicCore.ionicCoreStrings.ionViewWillEnter
import typingsJapgolly.ionicCore.ionicCoreStrings.ionViewWillLeave
import typingsJapgolly.ionicCore.ionicCoreStrings.ionViewWillUnload
import typingsJapgolly.ionicCore.ionicCoreStrings.ios
import typingsJapgolly.ionicCore.ionicCoreStrings.ipad
import typingsJapgolly.ionicCore.ionicCoreStrings.iphone
import typingsJapgolly.ionicCore.ionicCoreStrings.md
import typingsJapgolly.ionicCore.ionicCoreStrings.mobile
import typingsJapgolly.ionicCore.ionicCoreStrings.mobileweb
import typingsJapgolly.ionicCore.ionicCoreStrings.phablet
import typingsJapgolly.ionicCore.ionicCoreStrings.pwa
import typingsJapgolly.ionicCore.ionicCoreStrings.tablet
import typingsJapgolly.ionicCore.loadingInterfaceMod.LoadingOptions
import typingsJapgolly.ionicCore.menuInterfaceMod.MenuI
import typingsJapgolly.ionicCore.mod.ComponentRef
import typingsJapgolly.ionicCore.modalInterfaceMod.ModalOptions
import typingsJapgolly.ionicCore.oldAnimationAnimationInterfaceMod.AnimationBuilder
import typingsJapgolly.ionicCore.pickerInterfaceMod.PickerOptions
import typingsJapgolly.ionicCore.platformMod.IsPlatformSignature
import typingsJapgolly.ionicCore.popoverInterfaceMod.PopoverOptions
import typingsJapgolly.ionicCore.toastInterfaceMod.ToastOptions
import typingsJapgolly.ionicCore.utilsConfigMod.IonicConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types", JSImport.Namespace)
@js.native
object typesMod extends js.Object {
  val LIFECYCLE_DID_ENTER: ionViewDidEnter = js.native
  val LIFECYCLE_DID_LEAVE: ionViewDidLeave = js.native
  val LIFECYCLE_WILL_ENTER: ionViewWillEnter = js.native
  val LIFECYCLE_WILL_LEAVE: ionViewWillLeave = js.native
  val LIFECYCLE_WILL_UNLOAD: ionViewWillUnload = js.native
  val isPlatform: IsPlatformSignature = js.native
  def createAnimation(): Animation = js.native
  def createGesture(config: GestureConfig): Gesture = js.native
  def getMode(): ios | md = js.native
  def getPlatforms(win: js.Any): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = js.native
  def setupConfig(config: IonicConfig): js.Any = js.native
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
  object menuController extends js.Object {
    def _createAnimation(`type`: String, menuCmp: MenuI): js.Any = js.native
    def _getOpenSync(): js.UndefOr[HTMLIonMenuElement] = js.native
    def _register(menu: MenuI): Unit = js.native
    def _setActiveMenu(menu: MenuI): Unit = js.native
    def _setOpen(menu: MenuI, shouldOpen: Boolean, animated: Boolean): js.Promise[Boolean] = js.native
    def _unregister(menu: MenuI): Unit = js.native
    def close(): js.Promise[Boolean] = js.native
    def close(menu: String): js.Promise[Boolean] = js.native
    def enable(shouldEnable: Boolean): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    def enable(shouldEnable: Boolean, menu: String): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    def get(): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    def get(menu: String): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    def getMenus(): js.Promise[js.Array[HTMLIonMenuElement]] = js.native
    def getOpen(): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    def isAnimating(): js.Promise[Boolean] = js.native
    def isEnabled(): js.Promise[Boolean] = js.native
    def isEnabled(menu: String): js.Promise[Boolean] = js.native
    def isOpen(): js.Promise[Boolean] = js.native
    def isOpen(menu: String): js.Promise[Boolean] = js.native
    def open(): js.Promise[Boolean] = js.native
    def open(menu: String): js.Promise[Boolean] = js.native
    def registerAnimation(name: String, animation: js.Function1[/* menu */ MenuI, Animation]): Unit = js.native
    def registerAnimation(name: String, animation: AnimationBuilder): Unit = js.native
    def swipeGesture(shouldEnable: Boolean): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    def swipeGesture(shouldEnable: Boolean, menu: String): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    def toggle(): js.Promise[Boolean] = js.native
    def toggle(menu: String): js.Promise[Boolean] = js.native
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
  
}

