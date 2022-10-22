package typingsJapgolly.ionicCore

import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.anon.AfterInit
import typingsJapgolly.ionicCore.distTypesComponentsActionSheetActionSheetInterfaceMod.ActionSheetOptions
import typingsJapgolly.ionicCore.distTypesComponentsAlertAlertInterfaceMod.AlertOptions
import typingsJapgolly.ionicCore.distTypesComponentsLoadingLoadingInterfaceMod.LoadingOptions
import typingsJapgolly.ionicCore.distTypesComponentsMenuMenuInterfaceMod.MenuI
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonActionSheetElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonAlertElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonLoadingElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonMenuElement
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
import typingsJapgolly.ionicCore.distTypesUtilsConfigMod.IonicConfig
import typingsJapgolly.ionicCore.distTypesUtilsGestureMod.Gesture
import typingsJapgolly.ionicCore.distTypesUtilsGestureMod.GestureConfig
import typingsJapgolly.ionicCore.distTypesUtilsPlatformMod.IsPlatformSignature
import typingsJapgolly.ionicCore.distTypesUtilsTransitionMod.TransitionOptions
import typingsJapgolly.ionicCore.ionicCoreStrings.android
import typingsJapgolly.ionicCore.ionicCoreStrings.capacitor
import typingsJapgolly.ionicCore.ionicCoreStrings.cordova
import typingsJapgolly.ionicCore.ionicCoreStrings.desktop
import typingsJapgolly.ionicCore.ionicCoreStrings.electron
import typingsJapgolly.ionicCore.ionicCoreStrings.hybrid
import typingsJapgolly.ionicCore.ionicCoreStrings.ios
import typingsJapgolly.ionicCore.ionicCoreStrings.ipad
import typingsJapgolly.ionicCore.ionicCoreStrings.iphone
import typingsJapgolly.ionicCore.ionicCoreStrings.mobile
import typingsJapgolly.ionicCore.ionicCoreStrings.mobileweb
import typingsJapgolly.ionicCore.ionicCoreStrings.phablet
import typingsJapgolly.ionicCore.ionicCoreStrings.pwa
import typingsJapgolly.ionicCore.ionicCoreStrings.tablet
import typingsJapgolly.ionicCore.mod.ComponentRef
import typingsJapgolly.ionicCore.mod.Mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  @JSImport("@ionic/core/dist/types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/core/dist/types", "IonicSafeString")
  @js.native
  open class IonicSafeString protected ()
    extends typingsJapgolly.ionicCore.distTypesUtilsSanitizationMod.IonicSafeString {
    def this(value: String) = this()
  }
  
  inline def IonicSlides(opts: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("IonicSlides")(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  object IonicSwiper {
    
    @JSImport("@ionic/core/dist/types", "IonicSwiper")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ionic/core/dist/types", "IonicSwiper.name")
    @js.native
    def name: String = js.native
    inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    @JSImport("@ionic/core/dist/types", "IonicSwiper.on")
    @js.native
    def on: AfterInit = js.native
    inline def on_=(x: AfterInit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("on")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@ionic/core/dist/types", "LIFECYCLE_DID_ENTER")
  @js.native
  val LIFECYCLE_DID_ENTER: /* "ionViewDidEnter" */ String = js.native
  
  @JSImport("@ionic/core/dist/types", "LIFECYCLE_DID_LEAVE")
  @js.native
  val LIFECYCLE_DID_LEAVE: /* "ionViewDidLeave" */ String = js.native
  
  @JSImport("@ionic/core/dist/types", "LIFECYCLE_WILL_ENTER")
  @js.native
  val LIFECYCLE_WILL_ENTER: /* "ionViewWillEnter" */ String = js.native
  
  @JSImport("@ionic/core/dist/types", "LIFECYCLE_WILL_LEAVE")
  @js.native
  val LIFECYCLE_WILL_LEAVE: /* "ionViewWillLeave" */ String = js.native
  
  @JSImport("@ionic/core/dist/types", "LIFECYCLE_WILL_UNLOAD")
  @js.native
  val LIFECYCLE_WILL_UNLOAD: /* "ionViewWillUnload" */ String = js.native
  
  object actionSheetController {
    
    @JSImport("@ionic/core/dist/types", "actionSheetController")
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
  
  object alertController {
    
    @JSImport("@ionic/core/dist/types", "alertController")
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
  
  inline def componentOnReady(el: Any, callback: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("componentOnReady")(el.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createAnimation(): Animation = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnimation")().asInstanceOf[Animation]
  inline def createAnimation(animationId: String): Animation = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnimation")(animationId.asInstanceOf[js.Any]).asInstanceOf[Animation]
  
  inline def createGesture(config: GestureConfig): Gesture = ^.asInstanceOf[js.Dynamic].applyDynamic("createGesture")(config.asInstanceOf[js.Any]).asInstanceOf[Gesture]
  
  inline def getMode(): Mode = ^.asInstanceOf[js.Dynamic].applyDynamic("getMode")().asInstanceOf[Mode]
  
  inline def getPlatforms(): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlatforms")().asInstanceOf[js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ]]
  inline def getPlatforms(win: Any): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlatforms")(win.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ]]
  
  inline def getTimeGivenProgression(
    p0: js.Array[Double],
    p1: js.Array[Double],
    p2: js.Array[Double],
    p3: js.Array[Double],
    progression: Double
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeGivenProgression")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], progression.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def initialize(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")().asInstanceOf[Unit]
  inline def initialize(userConfig: IonicConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(userConfig.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def iosTransitionAnimation(navEl: HTMLElement, opts: TransitionOptions): Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("iosTransitionAnimation")(navEl.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Animation]
  
  @JSImport("@ionic/core/dist/types", "isPlatform")
  @js.native
  val isPlatform: IsPlatformSignature = js.native
  
  object loadingController {
    
    @JSImport("@ionic/core/dist/types", "loadingController")
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
  
  inline def mdTransitionAnimation(_underscore: HTMLElement, opts: TransitionOptions): Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("mdTransitionAnimation")(_underscore.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Animation]
  
  object menuController {
    
    @JSImport("@ionic/core/dist/types", "menuController")
    @js.native
    val ^ : js.Any = js.native
    
    inline def close(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("close")().asInstanceOf[js.Promise[Boolean]]
    inline def close(menu: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("close")(menu.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    
    inline def createAnimation(`type`: String, menuCmp: MenuI): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_createAnimation")(`type`.asInstanceOf[js.Any], menuCmp.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def enable(shouldEnable: Boolean): js.Promise[js.UndefOr[HTMLIonMenuElement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")(shouldEnable.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[HTMLIonMenuElement]]]
    inline def enable(shouldEnable: Boolean, menu: String): js.Promise[js.UndefOr[HTMLIonMenuElement]] = (^.asInstanceOf[js.Dynamic].applyDynamic("enable")(shouldEnable.asInstanceOf[js.Any], menu.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[HTMLIonMenuElement]]]
    
    inline def get(): js.Promise[js.UndefOr[HTMLIonMenuElement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Promise[js.UndefOr[HTMLIonMenuElement]]]
    inline def get(menu: String): js.Promise[js.UndefOr[HTMLIonMenuElement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(menu.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[HTMLIonMenuElement]]]
    
    inline def getMenus(): js.Promise[js.Array[HTMLIonMenuElement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMenus")().asInstanceOf[js.Promise[js.Array[HTMLIonMenuElement]]]
    
    inline def getOpen(): js.Promise[js.UndefOr[HTMLIonMenuElement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOpen")().asInstanceOf[js.Promise[js.UndefOr[HTMLIonMenuElement]]]
    
    inline def getOpenSync(): js.UndefOr[HTMLIonMenuElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("_getOpenSync")().asInstanceOf[js.UndefOr[HTMLIonMenuElement]]
    
    inline def isAnimating(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isAnimating")().asInstanceOf[js.Promise[Boolean]]
    
    inline def isEnabled(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnabled")().asInstanceOf[js.Promise[Boolean]]
    inline def isEnabled(menu: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnabled")(menu.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    
    inline def isOpen(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isOpen")().asInstanceOf[js.Promise[Boolean]]
    inline def isOpen(menu: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isOpen")(menu.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    
    inline def open(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")().asInstanceOf[js.Promise[Boolean]]
    inline def open(menu: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(menu.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    
    inline def register(menu: MenuI): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_register")(menu.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def registerAnimation(name: String, animation: AnimationBuilder): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAnimation")(name.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setActiveMenu(menu: MenuI): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_setActiveMenu")(menu.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setOpen(menu: MenuI, shouldOpen: Boolean, animated: Boolean): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("_setOpen")(menu.asInstanceOf[js.Any], shouldOpen.asInstanceOf[js.Any], animated.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
    inline def swipeGesture(shouldEnable: Boolean): js.Promise[js.UndefOr[HTMLIonMenuElement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("swipeGesture")(shouldEnable.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[HTMLIonMenuElement]]]
    inline def swipeGesture(shouldEnable: Boolean, menu: String): js.Promise[js.UndefOr[HTMLIonMenuElement]] = (^.asInstanceOf[js.Dynamic].applyDynamic("swipeGesture")(shouldEnable.asInstanceOf[js.Any], menu.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[HTMLIonMenuElement]]]
    
    inline def toggle(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("toggle")().asInstanceOf[js.Promise[Boolean]]
    inline def toggle(menu: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(menu.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    
    inline def unregister(menu: MenuI): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_unregister")(menu.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  object modalController {
    
    @JSImport("@ionic/core/dist/types", "modalController")
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
  
  object pickerController {
    
    @JSImport("@ionic/core/dist/types", "pickerController")
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
    
    @JSImport("@ionic/core/dist/types", "popoverController")
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
  
  inline def setupConfig(config: IonicConfig): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("setupConfig")(config.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  object toastController {
    
    @JSImport("@ionic/core/dist/types", "toastController")
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
