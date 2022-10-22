package typingsJapgolly.ionicCore

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Window
import typingsJapgolly.ionicCore.anon.AfterInit
import typingsJapgolly.ionicCore.distTypesComponentsActionSheetActionSheetInterfaceMod.ActionSheetOptions
import typingsJapgolly.ionicCore.distTypesComponentsAlertAlertInterfaceMod.AlertOptions
import typingsJapgolly.ionicCore.distTypesComponentsLoadingLoadingInterfaceMod.LoadingOptions
import typingsJapgolly.ionicCore.distTypesComponentsMenuMenuInterfaceMod.MenuI
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonAccordion
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonAccordionGroup
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonActionSheet
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonAlert
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonApp
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonAvatar
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonBackButton
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonBackdrop
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonBadge
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonBreadcrumb
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonBreadcrumbs
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonButton
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonButtons
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonCard
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonCardContent
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonCardHeader
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonCardSubtitle
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonCardTitle
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonCheckbox
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonChip
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonCol
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonContent
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonDatetime
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonDatetimeButton
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonFab
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonFabButton
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonFabList
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonFooter
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonGrid
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonHeader
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonImg
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonInfiniteScroll
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonInfiniteScrollContent
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonInput
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonItem
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonItemDivider
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonItemGroup
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonItemOption
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonItemOptions
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonItemSliding
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonLabel
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonList
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonListHeader
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonLoading
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonMenu
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonMenuButton
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonMenuToggle
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonModal
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonNav
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonNavLink
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonNote
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonPicker
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonPickerColumn
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonPickerColumnInternal
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonPickerInternal
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonPopover
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonProgressBar
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonRadio
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonRadioGroup
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonRange
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonRefresher
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonRefresherContent
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonReorder
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonReorderGroup
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonRippleEffect
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonRoute
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonRouteRedirect
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonRouter
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonRouterLink
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonRouterOutlet
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonRow
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonSearchbar
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonSegment
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonSegmentButton
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonSelect
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonSelectOption
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonSelectPopover
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonSkeletonText
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonSlide
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonSlides
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonSpinner
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonSplitPane
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonTab
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonTabBar
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonTabButton
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonTabs
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonText
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonTextarea
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonThumbnail
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonTitle
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonToast
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonToggle
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonToolbar
import typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX.IonVirtualScroll
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonAccordionElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonAccordionGroupElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonActionSheetElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonAlertElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonAppElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonAvatarElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonBackButtonElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonBackdropElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonBadgeElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonBreadcrumbElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonBreadcrumbsElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonButtonElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonButtonsElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonCardContentElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonCardElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonCardHeaderElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonCardSubtitleElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonCardTitleElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonCheckboxElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonChipElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonColElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonContentElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonDatetimeButtonElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonDatetimeElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonFabButtonElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonFabElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonFabListElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonFooterElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonGridElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonHeaderElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonImgElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonInfiniteScrollContentElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonInfiniteScrollElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonInputElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonItemDividerElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonItemElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonItemGroupElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonItemOptionElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonItemOptionsElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonItemSlidingElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonLabelElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonListElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonListHeaderElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonLoadingElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonMenuButtonElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonMenuElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonMenuToggleElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonModalElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonNavElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonNavLinkElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonNoteElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonPickerColumnElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonPickerColumnInternalElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonPickerElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonPickerInternalElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonPopoverElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonProgressBarElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonRadioElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonRadioGroupElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonRangeElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonRefresherContentElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonRefresherElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonReorderElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonReorderGroupElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonRippleEffectElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonRouteElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonRouteRedirectElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonRouterElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonRouterLinkElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonRouterOutletElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonRowElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonSearchbarElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonSegmentButtonElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonSegmentElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonSelectElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonSelectOptionElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonSelectPopoverElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonSkeletonTextElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonSlideElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonSlidesElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonSpinnerElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonSplitPaneElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonTabBarElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonTabButtonElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonTabElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonTabsElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonTextElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonTextareaElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonThumbnailElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonTitleElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonToastElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonToggleElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonToolbarElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonVirtualScrollElement
import typingsJapgolly.ionicCore.distTypesComponentsModalModalInterfaceMod.ModalOptions
import typingsJapgolly.ionicCore.distTypesComponentsPickerPickerInterfaceMod.PickerOptions
import typingsJapgolly.ionicCore.distTypesComponentsPopoverPopoverInterfaceMod.PopoverOptions
import typingsJapgolly.ionicCore.distTypesComponentsToastToastInterfaceMod.ToastOptions
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.JSXBase.HTMLAttributes
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
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ionic/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/core", "Config")
  @js.native
  open class Config_ ()
    extends typingsJapgolly.ionicCore.distTypesGlobalConfigMod.Config_
  
  @JSImport("@ionic/core", "IonicSafeString")
  @js.native
  open class IonicSafeString protected ()
    extends typingsJapgolly.ionicCore.distTypesMod.IonicSafeString {
    def this(value: String) = this()
  }
  
  inline def IonicSlides(opts: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("IonicSlides")(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  object IonicSwiper {
    
    @JSImport("@ionic/core", "IonicSwiper")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ionic/core", "IonicSwiper.name")
    @js.native
    def name: String = js.native
    inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    @JSImport("@ionic/core", "IonicSwiper.on")
    @js.native
    def on: AfterInit = js.native
    inline def on_=(x: AfterInit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("on")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@ionic/core", "LIFECYCLE_DID_ENTER")
  @js.native
  val LIFECYCLE_DID_ENTER: /* "ionViewDidEnter" */ String = js.native
  
  @JSImport("@ionic/core", "LIFECYCLE_DID_LEAVE")
  @js.native
  val LIFECYCLE_DID_LEAVE: /* "ionViewDidLeave" */ String = js.native
  
  @JSImport("@ionic/core", "LIFECYCLE_WILL_ENTER")
  @js.native
  val LIFECYCLE_WILL_ENTER: /* "ionViewWillEnter" */ String = js.native
  
  @JSImport("@ionic/core", "LIFECYCLE_WILL_LEAVE")
  @js.native
  val LIFECYCLE_WILL_LEAVE: /* "ionViewWillLeave" */ String = js.native
  
  @JSImport("@ionic/core", "LIFECYCLE_WILL_UNLOAD")
  @js.native
  val LIFECYCLE_WILL_UNLOAD: /* "ionViewWillUnload" */ String = js.native
  
  @JSImport("@ionic/core", "ViewController")
  @js.native
  open class ViewController protected ()
    extends typingsJapgolly.ionicCore.distTypesComponentsNavNavInterfaceMod.ViewController {
    def this(component: Any) = this()
    def this(component: Any, params: ComponentProps[Null]) = this()
  }
  
  object actionSheetController {
    
    @JSImport("@ionic/core", "actionSheetController")
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
    
    @JSImport("@ionic/core", "alertController")
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
  
  @JSImport("@ionic/core", "config")
  @js.native
  val config: typingsJapgolly.ionicCore.distTypesGlobalConfigMod.Config_ = js.native
  
  inline def configFromSession(win: Window): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("configFromSession")(win.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def configFromURL(win: Window): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("configFromURL")(win.asInstanceOf[js.Any]).asInstanceOf[Any]
  
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
  
  @JSImport("@ionic/core", "isPlatform")
  @js.native
  val isPlatform: IsPlatformSignature = js.native
  
  object loadingController {
    
    @JSImport("@ionic/core", "loadingController")
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
    
    @JSImport("@ionic/core", "menuController")
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
    
    @JSImport("@ionic/core", "modalController")
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
    
    @JSImport("@ionic/core", "pickerController")
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
    
    @JSImport("@ionic/core", "popoverController")
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
  
  inline def saveConfig(win: Window, c: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveConfig")(win.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setupConfig(config: IonicConfig): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("setupConfig")(config.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  object toastController {
    
    @JSImport("@ionic/core", "toastController")
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
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ionicCore.ionicCoreStrings.on
    - typingsJapgolly.ionicCore.ionicCoreStrings.off
    - typingsJapgolly.ionicCore.ionicCoreStrings.name
    - typingsJapgolly.ionicCore.ionicCoreStrings.`honorific-prefix`
    - typingsJapgolly.ionicCore.ionicCoreStrings.`given-name`
    - typingsJapgolly.ionicCore.ionicCoreStrings.`additional-name`
    - typingsJapgolly.ionicCore.ionicCoreStrings.`family-name`
    - typingsJapgolly.ionicCore.ionicCoreStrings.`honorific-suffix`
    - typingsJapgolly.ionicCore.ionicCoreStrings.nickname
    - typingsJapgolly.ionicCore.ionicCoreStrings.email
    - typingsJapgolly.ionicCore.ionicCoreStrings.username
    - typingsJapgolly.ionicCore.ionicCoreStrings.`new-password`
    - typingsJapgolly.ionicCore.ionicCoreStrings.`current-password`
    - typingsJapgolly.ionicCore.ionicCoreStrings.`one-time-code`
    - typingsJapgolly.ionicCore.ionicCoreStrings.`organization-title`
    - typingsJapgolly.ionicCore.ionicCoreStrings.organization
    - typingsJapgolly.ionicCore.ionicCoreStrings.`street-address`
    - typingsJapgolly.ionicCore.ionicCoreStrings.`address-line1`
    - typingsJapgolly.ionicCore.ionicCoreStrings.`address-line2`
    - typingsJapgolly.ionicCore.ionicCoreStrings.`address-line3`
    - typingsJapgolly.ionicCore.ionicCoreStrings.`address-level4`
    - typingsJapgolly.ionicCore.ionicCoreStrings.`address-level3`
    - typingsJapgolly.ionicCore.ionicCoreStrings.`address-level2`
    - typingsJapgolly.ionicCore.ionicCoreStrings.`address-level1`
    - typingsJapgolly.ionicCore.ionicCoreStrings.country
    - typingsJapgolly.ionicCore.ionicCoreStrings.`country-name`
    - typingsJapgolly.ionicCore.ionicCoreStrings.`postal-code`
    - typingsJapgolly.ionicCore.ionicCoreStrings.`cc-name`
    - typingsJapgolly.ionicCore.ionicCoreStrings.`cc-given-name`
    - typingsJapgolly.ionicCore.ionicCoreStrings.`cc-additional-name`
    - typingsJapgolly.ionicCore.ionicCoreStrings.`cc-family-name`
    - typingsJapgolly.ionicCore.ionicCoreStrings.`cc-number`
    - typingsJapgolly.ionicCore.ionicCoreStrings.`cc-exp`
    - typingsJapgolly.ionicCore.ionicCoreStrings.`cc-exp-month`
    - typingsJapgolly.ionicCore.ionicCoreStrings.`cc-exp-year`
    - typingsJapgolly.ionicCore.ionicCoreStrings.`cc-csc`
    - typingsJapgolly.ionicCore.ionicCoreStrings.`cc-type`
    - typingsJapgolly.ionicCore.ionicCoreStrings.`transaction-currency`
    - typingsJapgolly.ionicCore.ionicCoreStrings.`transaction-amount`
    - typingsJapgolly.ionicCore.ionicCoreStrings.language
    - typingsJapgolly.ionicCore.ionicCoreStrings.bday
    - typingsJapgolly.ionicCore.ionicCoreStrings.`bday-day`
    - typingsJapgolly.ionicCore.ionicCoreStrings.`bday-month`
    - typingsJapgolly.ionicCore.ionicCoreStrings.`bday-year`
    - typingsJapgolly.ionicCore.ionicCoreStrings.sex
    - typingsJapgolly.ionicCore.ionicCoreStrings.tel
    - typingsJapgolly.ionicCore.ionicCoreStrings.`tel-country-code`
    - typingsJapgolly.ionicCore.ionicCoreStrings.`tel-national`
    - typingsJapgolly.ionicCore.ionicCoreStrings.`tel-area-code`
    - typingsJapgolly.ionicCore.ionicCoreStrings.`tel-local`
    - typingsJapgolly.ionicCore.ionicCoreStrings.`tel-extension`
    - typingsJapgolly.ionicCore.ionicCoreStrings.impp
    - typingsJapgolly.ionicCore.ionicCoreStrings.url
    - typingsJapgolly.ionicCore.ionicCoreStrings.photo
  */
  trait AutocompleteTypes extends StObject
  object AutocompleteTypes {
    
    inline def `additional-name`: typingsJapgolly.ionicCore.ionicCoreStrings.`additional-name` = "additional-name".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`additional-name`]
    
    inline def `address-level1`: typingsJapgolly.ionicCore.ionicCoreStrings.`address-level1` = "address-level1".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`address-level1`]
    
    inline def `address-level2`: typingsJapgolly.ionicCore.ionicCoreStrings.`address-level2` = "address-level2".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`address-level2`]
    
    inline def `address-level3`: typingsJapgolly.ionicCore.ionicCoreStrings.`address-level3` = "address-level3".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`address-level3`]
    
    inline def `address-level4`: typingsJapgolly.ionicCore.ionicCoreStrings.`address-level4` = "address-level4".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`address-level4`]
    
    inline def `address-line1`: typingsJapgolly.ionicCore.ionicCoreStrings.`address-line1` = "address-line1".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`address-line1`]
    
    inline def `address-line2`: typingsJapgolly.ionicCore.ionicCoreStrings.`address-line2` = "address-line2".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`address-line2`]
    
    inline def `address-line3`: typingsJapgolly.ionicCore.ionicCoreStrings.`address-line3` = "address-line3".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`address-line3`]
    
    inline def bday: typingsJapgolly.ionicCore.ionicCoreStrings.bday = "bday".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.bday]
    
    inline def `bday-day`: typingsJapgolly.ionicCore.ionicCoreStrings.`bday-day` = "bday-day".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`bday-day`]
    
    inline def `bday-month`: typingsJapgolly.ionicCore.ionicCoreStrings.`bday-month` = "bday-month".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`bday-month`]
    
    inline def `bday-year`: typingsJapgolly.ionicCore.ionicCoreStrings.`bday-year` = "bday-year".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`bday-year`]
    
    inline def `cc-additional-name`: typingsJapgolly.ionicCore.ionicCoreStrings.`cc-additional-name` = "cc-additional-name".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`cc-additional-name`]
    
    inline def `cc-csc`: typingsJapgolly.ionicCore.ionicCoreStrings.`cc-csc` = "cc-csc".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`cc-csc`]
    
    inline def `cc-exp`: typingsJapgolly.ionicCore.ionicCoreStrings.`cc-exp` = "cc-exp".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`cc-exp`]
    
    inline def `cc-exp-month`: typingsJapgolly.ionicCore.ionicCoreStrings.`cc-exp-month` = "cc-exp-month".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`cc-exp-month`]
    
    inline def `cc-exp-year`: typingsJapgolly.ionicCore.ionicCoreStrings.`cc-exp-year` = "cc-exp-year".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`cc-exp-year`]
    
    inline def `cc-family-name`: typingsJapgolly.ionicCore.ionicCoreStrings.`cc-family-name` = "cc-family-name".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`cc-family-name`]
    
    inline def `cc-given-name`: typingsJapgolly.ionicCore.ionicCoreStrings.`cc-given-name` = "cc-given-name".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`cc-given-name`]
    
    inline def `cc-name`: typingsJapgolly.ionicCore.ionicCoreStrings.`cc-name` = "cc-name".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`cc-name`]
    
    inline def `cc-number`: typingsJapgolly.ionicCore.ionicCoreStrings.`cc-number` = "cc-number".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`cc-number`]
    
    inline def `cc-type`: typingsJapgolly.ionicCore.ionicCoreStrings.`cc-type` = "cc-type".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`cc-type`]
    
    inline def country: typingsJapgolly.ionicCore.ionicCoreStrings.country = "country".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.country]
    
    inline def `country-name`: typingsJapgolly.ionicCore.ionicCoreStrings.`country-name` = "country-name".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`country-name`]
    
    inline def `current-password`: typingsJapgolly.ionicCore.ionicCoreStrings.`current-password` = "current-password".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`current-password`]
    
    inline def email: typingsJapgolly.ionicCore.ionicCoreStrings.email = "email".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.email]
    
    inline def `family-name`: typingsJapgolly.ionicCore.ionicCoreStrings.`family-name` = "family-name".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`family-name`]
    
    inline def `given-name`: typingsJapgolly.ionicCore.ionicCoreStrings.`given-name` = "given-name".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`given-name`]
    
    inline def `honorific-prefix`: typingsJapgolly.ionicCore.ionicCoreStrings.`honorific-prefix` = "honorific-prefix".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`honorific-prefix`]
    
    inline def `honorific-suffix`: typingsJapgolly.ionicCore.ionicCoreStrings.`honorific-suffix` = "honorific-suffix".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`honorific-suffix`]
    
    inline def impp: typingsJapgolly.ionicCore.ionicCoreStrings.impp = "impp".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.impp]
    
    inline def language: typingsJapgolly.ionicCore.ionicCoreStrings.language = "language".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.language]
    
    inline def name: typingsJapgolly.ionicCore.ionicCoreStrings.name = "name".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.name]
    
    inline def `new-password`: typingsJapgolly.ionicCore.ionicCoreStrings.`new-password` = "new-password".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`new-password`]
    
    inline def nickname: typingsJapgolly.ionicCore.ionicCoreStrings.nickname = "nickname".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.nickname]
    
    inline def off: typingsJapgolly.ionicCore.ionicCoreStrings.off = "off".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.off]
    
    inline def on: typingsJapgolly.ionicCore.ionicCoreStrings.on = "on".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.on]
    
    inline def `one-time-code`: typingsJapgolly.ionicCore.ionicCoreStrings.`one-time-code` = "one-time-code".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`one-time-code`]
    
    inline def organization: typingsJapgolly.ionicCore.ionicCoreStrings.organization = "organization".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.organization]
    
    inline def `organization-title`: typingsJapgolly.ionicCore.ionicCoreStrings.`organization-title` = "organization-title".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`organization-title`]
    
    inline def photo: typingsJapgolly.ionicCore.ionicCoreStrings.photo = "photo".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.photo]
    
    inline def `postal-code`: typingsJapgolly.ionicCore.ionicCoreStrings.`postal-code` = "postal-code".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`postal-code`]
    
    inline def sex: typingsJapgolly.ionicCore.ionicCoreStrings.sex = "sex".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.sex]
    
    inline def `street-address`: typingsJapgolly.ionicCore.ionicCoreStrings.`street-address` = "street-address".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`street-address`]
    
    inline def tel: typingsJapgolly.ionicCore.ionicCoreStrings.tel = "tel".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.tel]
    
    inline def `tel-area-code`: typingsJapgolly.ionicCore.ionicCoreStrings.`tel-area-code` = "tel-area-code".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`tel-area-code`]
    
    inline def `tel-country-code`: typingsJapgolly.ionicCore.ionicCoreStrings.`tel-country-code` = "tel-country-code".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`tel-country-code`]
    
    inline def `tel-extension`: typingsJapgolly.ionicCore.ionicCoreStrings.`tel-extension` = "tel-extension".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`tel-extension`]
    
    inline def `tel-local`: typingsJapgolly.ionicCore.ionicCoreStrings.`tel-local` = "tel-local".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`tel-local`]
    
    inline def `tel-national`: typingsJapgolly.ionicCore.ionicCoreStrings.`tel-national` = "tel-national".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`tel-national`]
    
    inline def `transaction-amount`: typingsJapgolly.ionicCore.ionicCoreStrings.`transaction-amount` = "transaction-amount".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`transaction-amount`]
    
    inline def `transaction-currency`: typingsJapgolly.ionicCore.ionicCoreStrings.`transaction-currency` = "transaction-currency".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`transaction-currency`]
    
    inline def url: typingsJapgolly.ionicCore.ionicCoreStrings.url = "url".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.url]
    
    inline def username: typingsJapgolly.ionicCore.ionicCoreStrings.username = "username".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.username]
  }
  
  type BackButtonEvent = CustomEvent
  
  trait BackButtonEventDetail extends StObject {
    
    def register(
      priority: Double,
      handler: js.Function1[/* processNextHandler */ js.Function0[Unit], js.Promise[Any] | Unit]
    ): Unit
  }
  object BackButtonEventDetail {
    
    inline def apply(
      register: (Double, js.Function1[/* processNextHandler */ js.Function0[Unit], js.Promise[Any] | Unit]) => Callback
    ): BackButtonEventDetail = {
      val __obj = js.Dynamic.literal(register = js.Any.fromFunction2((t0: Double, t1: js.Function1[/* processNextHandler */ js.Function0[Unit], js.Promise[Any] | Unit]) => (register(t0, t1)).runNow()))
      __obj.asInstanceOf[BackButtonEventDetail]
    }
    
    extension [Self <: BackButtonEventDetail](x: Self) {
      
      inline def setRegister(
        value: (Double, js.Function1[/* processNextHandler */ js.Function0[Unit], js.Promise[Any] | Unit]) => Callback
      ): Self = StObject.set(x, "register", js.Any.fromFunction2((t0: Double, t1: js.Function1[/* processNextHandler */ js.Function0[Unit], js.Promise[Any] | Unit]) => (value(t0, t1)).runNow()))
    }
  }
  
  type Color = LiteralUnion[PredefinedColors, String]
  
  type ComponentProps[T] = StringDictionary[Any]
  
  type ComponentRef = js.Function | HTMLElement | String | Null
  
  type ComponentTags = String
  
  type CssClassMap = StringDictionary[Boolean]
  
  @js.native
  trait FrameworkDelegate extends StObject {
    
    def attachViewToDom(container: Any, component: Any): js.Promise[HTMLElement] = js.native
    def attachViewToDom(container: Any, component: Any, propsOrDataObj: Any): js.Promise[HTMLElement] = js.native
    def attachViewToDom(container: Any, component: Any, propsOrDataObj: Any, cssClasses: js.Array[String]): js.Promise[HTMLElement] = js.native
    def attachViewToDom(container: Any, component: Any, propsOrDataObj: Unit, cssClasses: js.Array[String]): js.Promise[HTMLElement] = js.native
    
    def removeViewFromDom(container: Any, component: Any): js.Promise[Unit] = js.native
  }
  
  trait KeyboardEventDetail extends StObject {
    
    var keyboardHeight: Double
  }
  object KeyboardEventDetail {
    
    inline def apply(keyboardHeight: Double): KeyboardEventDetail = {
      val __obj = js.Dynamic.literal(keyboardHeight = keyboardHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyboardEventDetail]
    }
    
    extension [Self <: KeyboardEventDetail](x: Self) {
      
      inline def setKeyboardHeight(value: Double): Self = StObject.set(x, "keyboardHeight", value.asInstanceOf[js.Any])
    }
  }
  
  type LiteralUnion[T /* <: U */, U] = T | (U & (Record[scala.Nothing, scala.Nothing]))
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ionicCore.ionicCoreStrings.ios
    - typingsJapgolly.ionicCore.ionicCoreStrings.md
  */
  trait Mode extends StObject
  object Mode {
    
    inline def ios: typingsJapgolly.ionicCore.ionicCoreStrings.ios = "ios".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.ios]
    
    inline def md: typingsJapgolly.ionicCore.ionicCoreStrings.md = "md".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.md]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ionicCore.ionicCoreStrings.primary
    - typingsJapgolly.ionicCore.ionicCoreStrings.secondary
    - typingsJapgolly.ionicCore.ionicCoreStrings.tertiary
    - typingsJapgolly.ionicCore.ionicCoreStrings.success
    - typingsJapgolly.ionicCore.ionicCoreStrings.warning
    - typingsJapgolly.ionicCore.ionicCoreStrings.danger
    - typingsJapgolly.ionicCore.ionicCoreStrings.light
    - typingsJapgolly.ionicCore.ionicCoreStrings.medium
    - typingsJapgolly.ionicCore.ionicCoreStrings.dark
  */
  trait PredefinedColors extends StObject
  object PredefinedColors {
    
    inline def danger: typingsJapgolly.ionicCore.ionicCoreStrings.danger = "danger".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.danger]
    
    inline def dark: typingsJapgolly.ionicCore.ionicCoreStrings.dark = "dark".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.dark]
    
    inline def light: typingsJapgolly.ionicCore.ionicCoreStrings.light = "light".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.light]
    
    inline def medium: typingsJapgolly.ionicCore.ionicCoreStrings.medium = "medium".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.medium]
    
    inline def primary: typingsJapgolly.ionicCore.ionicCoreStrings.primary = "primary".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.primary]
    
    inline def secondary: typingsJapgolly.ionicCore.ionicCoreStrings.secondary = "secondary".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.secondary]
    
    inline def success: typingsJapgolly.ionicCore.ionicCoreStrings.success = "success".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.success]
    
    inline def tertiary: typingsJapgolly.ionicCore.ionicCoreStrings.tertiary = "tertiary".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.tertiary]
    
    inline def warning: typingsJapgolly.ionicCore.ionicCoreStrings.warning = "warning".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.warning]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ionicCore.ionicCoreStrings.start
    - typingsJapgolly.ionicCore.ionicCoreStrings.end
  */
  trait Side extends StObject
  object Side {
    
    inline def end: typingsJapgolly.ionicCore.ionicCoreStrings.end = "end".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.end]
    
    inline def start: typingsJapgolly.ionicCore.ionicCoreStrings.start = "start".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.start]
  }
  
  type StyleEventDetail = StringDictionary[Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ionicCore.ionicCoreStrings.date
    - typingsJapgolly.ionicCore.ionicCoreStrings.email
    - typingsJapgolly.ionicCore.ionicCoreStrings.number
    - typingsJapgolly.ionicCore.ionicCoreStrings.password
    - typingsJapgolly.ionicCore.ionicCoreStrings.search
    - typingsJapgolly.ionicCore.ionicCoreStrings.tel
    - typingsJapgolly.ionicCore.ionicCoreStrings.text
    - typingsJapgolly.ionicCore.ionicCoreStrings.url
    - typingsJapgolly.ionicCore.ionicCoreStrings.time
    - typingsJapgolly.ionicCore.ionicCoreStrings.week
    - typingsJapgolly.ionicCore.ionicCoreStrings.month
    - typingsJapgolly.ionicCore.ionicCoreStrings.`datetime-local`
  */
  trait TextFieldTypes extends StObject
  object TextFieldTypes {
    
    inline def date: typingsJapgolly.ionicCore.ionicCoreStrings.date = "date".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.date]
    
    inline def `datetime-local`: typingsJapgolly.ionicCore.ionicCoreStrings.`datetime-local` = "datetime-local".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`datetime-local`]
    
    inline def email: typingsJapgolly.ionicCore.ionicCoreStrings.email = "email".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.email]
    
    inline def month: typingsJapgolly.ionicCore.ionicCoreStrings.month = "month".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.month]
    
    inline def number: typingsJapgolly.ionicCore.ionicCoreStrings.number = "number".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.number]
    
    inline def password: typingsJapgolly.ionicCore.ionicCoreStrings.password = "password".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.password]
    
    inline def search: typingsJapgolly.ionicCore.ionicCoreStrings.search = "search".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.search]
    
    inline def tel: typingsJapgolly.ionicCore.ionicCoreStrings.tel = "tel".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.tel]
    
    inline def text: typingsJapgolly.ionicCore.ionicCoreStrings.text = "text".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.text]
    
    inline def time: typingsJapgolly.ionicCore.ionicCoreStrings.time = "time".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.time]
    
    inline def url: typingsJapgolly.ionicCore.ionicCoreStrings.url = "url".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.url]
    
    inline def week: typingsJapgolly.ionicCore.ionicCoreStrings.week = "week".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.week]
  }
  
  /* augmented module */
  object ionicCoreDistTypesComponentsAugmentingMod {
    
    object Components {
      
      type IonIcon = typingsJapgolly.ionicons.distTypesComponentsMod.Components.IonIcon
    }
    
    object JSX {
      
      type IonIcon = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IoniconsJSX.IonIcon */ Any
    }
  }
  
  /* augmented module */
  object stencilCoreAugmentingMod {
    
    object JSX {
      
      trait IntrinsicElements extends StObject {
        
        var `ion-accordion`: IonAccordion & HTMLAttributes[HTMLIonAccordionElement]
        
        var `ion-accordion-group`: IonAccordionGroup & HTMLAttributes[HTMLIonAccordionGroupElement]
        
        var `ion-action-sheet`: IonActionSheet & HTMLAttributes[HTMLIonActionSheetElement]
        
        var `ion-alert`: IonAlert & HTMLAttributes[HTMLIonAlertElement]
        
        var `ion-app`: IonApp & HTMLAttributes[HTMLIonAppElement]
        
        var `ion-avatar`: IonAvatar & HTMLAttributes[HTMLIonAvatarElement]
        
        var `ion-back-button`: IonBackButton & HTMLAttributes[HTMLIonBackButtonElement]
        
        var `ion-backdrop`: IonBackdrop & HTMLAttributes[HTMLIonBackdropElement]
        
        var `ion-badge`: IonBadge & HTMLAttributes[HTMLIonBadgeElement]
        
        var `ion-breadcrumb`: IonBreadcrumb & HTMLAttributes[HTMLIonBreadcrumbElement]
        
        var `ion-breadcrumbs`: IonBreadcrumbs & HTMLAttributes[HTMLIonBreadcrumbsElement]
        
        var `ion-button`: IonButton & HTMLAttributes[HTMLIonButtonElement]
        
        var `ion-buttons`: IonButtons & HTMLAttributes[HTMLIonButtonsElement]
        
        var `ion-card`: IonCard & HTMLAttributes[HTMLIonCardElement]
        
        var `ion-card-content`: IonCardContent & HTMLAttributes[HTMLIonCardContentElement]
        
        var `ion-card-header`: IonCardHeader & HTMLAttributes[HTMLIonCardHeaderElement]
        
        var `ion-card-subtitle`: IonCardSubtitle & HTMLAttributes[HTMLIonCardSubtitleElement]
        
        var `ion-card-title`: IonCardTitle & HTMLAttributes[HTMLIonCardTitleElement]
        
        var `ion-checkbox`: IonCheckbox & HTMLAttributes[HTMLIonCheckboxElement]
        
        var `ion-chip`: IonChip & HTMLAttributes[HTMLIonChipElement]
        
        var `ion-col`: IonCol & HTMLAttributes[HTMLIonColElement]
        
        var `ion-content`: IonContent & HTMLAttributes[HTMLIonContentElement]
        
        var `ion-datetime`: IonDatetime & HTMLAttributes[HTMLIonDatetimeElement]
        
        var `ion-datetime-button`: IonDatetimeButton & HTMLAttributes[HTMLIonDatetimeButtonElement]
        
        var `ion-fab`: IonFab & HTMLAttributes[HTMLIonFabElement]
        
        var `ion-fab-button`: IonFabButton & HTMLAttributes[HTMLIonFabButtonElement]
        
        var `ion-fab-list`: IonFabList & HTMLAttributes[HTMLIonFabListElement]
        
        var `ion-footer`: IonFooter & HTMLAttributes[HTMLIonFooterElement]
        
        var `ion-grid`: IonGrid & HTMLAttributes[HTMLIonGridElement]
        
        var `ion-header`: IonHeader & HTMLAttributes[HTMLIonHeaderElement]
        
        var `ion-img`: IonImg & HTMLAttributes[HTMLIonImgElement]
        
        var `ion-infinite-scroll`: IonInfiniteScroll & HTMLAttributes[HTMLIonInfiniteScrollElement]
        
        var `ion-infinite-scroll-content`: IonInfiniteScrollContent & HTMLAttributes[HTMLIonInfiniteScrollContentElement]
        
        var `ion-input`: IonInput & HTMLAttributes[HTMLIonInputElement]
        
        var `ion-item`: IonItem & HTMLAttributes[HTMLIonItemElement]
        
        var `ion-item-divider`: IonItemDivider & HTMLAttributes[HTMLIonItemDividerElement]
        
        var `ion-item-group`: IonItemGroup & HTMLAttributes[HTMLIonItemGroupElement]
        
        var `ion-item-option`: IonItemOption & HTMLAttributes[HTMLIonItemOptionElement]
        
        var `ion-item-options`: IonItemOptions & HTMLAttributes[HTMLIonItemOptionsElement]
        
        var `ion-item-sliding`: IonItemSliding & HTMLAttributes[HTMLIonItemSlidingElement]
        
        var `ion-label`: IonLabel & HTMLAttributes[HTMLIonLabelElement]
        
        var `ion-list`: IonList & HTMLAttributes[HTMLIonListElement]
        
        var `ion-list-header`: IonListHeader & HTMLAttributes[HTMLIonListHeaderElement]
        
        var `ion-loading`: IonLoading & HTMLAttributes[HTMLIonLoadingElement]
        
        var `ion-menu`: IonMenu & HTMLAttributes[HTMLIonMenuElement]
        
        var `ion-menu-button`: IonMenuButton & HTMLAttributes[HTMLIonMenuButtonElement]
        
        var `ion-menu-toggle`: IonMenuToggle & HTMLAttributes[HTMLIonMenuToggleElement]
        
        var `ion-modal`: IonModal & HTMLAttributes[HTMLIonModalElement]
        
        var `ion-nav`: IonNav & HTMLAttributes[HTMLIonNavElement]
        
        var `ion-nav-link`: IonNavLink & HTMLAttributes[HTMLIonNavLinkElement]
        
        var `ion-note`: IonNote & HTMLAttributes[HTMLIonNoteElement]
        
        var `ion-picker`: IonPicker & HTMLAttributes[HTMLIonPickerElement]
        
        var `ion-picker-column`: IonPickerColumn & HTMLAttributes[HTMLIonPickerColumnElement]
        
        var `ion-picker-column-internal`: IonPickerColumnInternal & HTMLAttributes[HTMLIonPickerColumnInternalElement]
        
        var `ion-picker-internal`: IonPickerInternal & HTMLAttributes[HTMLIonPickerInternalElement]
        
        var `ion-popover`: IonPopover & HTMLAttributes[HTMLIonPopoverElement]
        
        var `ion-progress-bar`: IonProgressBar & HTMLAttributes[HTMLIonProgressBarElement]
        
        var `ion-radio`: IonRadio & HTMLAttributes[HTMLIonRadioElement]
        
        var `ion-radio-group`: IonRadioGroup & HTMLAttributes[HTMLIonRadioGroupElement]
        
        var `ion-range`: IonRange & HTMLAttributes[HTMLIonRangeElement]
        
        var `ion-refresher`: IonRefresher & HTMLAttributes[HTMLIonRefresherElement]
        
        var `ion-refresher-content`: IonRefresherContent & HTMLAttributes[HTMLIonRefresherContentElement]
        
        var `ion-reorder`: IonReorder & HTMLAttributes[HTMLIonReorderElement]
        
        var `ion-reorder-group`: IonReorderGroup & HTMLAttributes[HTMLIonReorderGroupElement]
        
        var `ion-ripple-effect`: IonRippleEffect & HTMLAttributes[HTMLIonRippleEffectElement]
        
        var `ion-route`: IonRoute & HTMLAttributes[HTMLIonRouteElement]
        
        var `ion-route-redirect`: IonRouteRedirect & HTMLAttributes[HTMLIonRouteRedirectElement]
        
        var `ion-router`: IonRouter & HTMLAttributes[HTMLIonRouterElement]
        
        var `ion-router-link`: IonRouterLink & HTMLAttributes[HTMLIonRouterLinkElement]
        
        var `ion-router-outlet`: IonRouterOutlet & HTMLAttributes[HTMLIonRouterOutletElement]
        
        var `ion-row`: IonRow & HTMLAttributes[HTMLIonRowElement]
        
        var `ion-searchbar`: IonSearchbar & HTMLAttributes[HTMLIonSearchbarElement]
        
        var `ion-segment`: IonSegment & HTMLAttributes[HTMLIonSegmentElement]
        
        var `ion-segment-button`: IonSegmentButton & HTMLAttributes[HTMLIonSegmentButtonElement]
        
        var `ion-select`: IonSelect & HTMLAttributes[HTMLIonSelectElement]
        
        var `ion-select-option`: IonSelectOption & HTMLAttributes[HTMLIonSelectOptionElement]
        
        var `ion-select-popover`: IonSelectPopover & HTMLAttributes[HTMLIonSelectPopoverElement]
        
        var `ion-skeleton-text`: IonSkeletonText & HTMLAttributes[HTMLIonSkeletonTextElement]
        
        var `ion-slide`: IonSlide & HTMLAttributes[HTMLIonSlideElement]
        
        var `ion-slides`: IonSlides & HTMLAttributes[HTMLIonSlidesElement]
        
        var `ion-spinner`: IonSpinner & HTMLAttributes[HTMLIonSpinnerElement]
        
        var `ion-split-pane`: IonSplitPane & HTMLAttributes[HTMLIonSplitPaneElement]
        
        var `ion-tab`: IonTab & HTMLAttributes[HTMLIonTabElement]
        
        var `ion-tab-bar`: IonTabBar & HTMLAttributes[HTMLIonTabBarElement]
        
        var `ion-tab-button`: IonTabButton & HTMLAttributes[HTMLIonTabButtonElement]
        
        var `ion-tabs`: IonTabs & HTMLAttributes[HTMLIonTabsElement]
        
        var `ion-text`: IonText & HTMLAttributes[HTMLIonTextElement]
        
        var `ion-textarea`: IonTextarea & HTMLAttributes[HTMLIonTextareaElement]
        
        var `ion-thumbnail`: IonThumbnail & HTMLAttributes[HTMLIonThumbnailElement]
        
        var `ion-title`: IonTitle & HTMLAttributes[HTMLIonTitleElement]
        
        var `ion-toast`: IonToast & HTMLAttributes[HTMLIonToastElement]
        
        var `ion-toggle`: IonToggle & HTMLAttributes[HTMLIonToggleElement]
        
        var `ion-toolbar`: IonToolbar & HTMLAttributes[HTMLIonToolbarElement]
        
        var `ion-virtual-scroll`: IonVirtualScroll & HTMLAttributes[HTMLIonVirtualScrollElement]
      }
      object IntrinsicElements {
        
        inline def apply(
          `ion-accordion`: IonAccordion & HTMLAttributes[HTMLIonAccordionElement],
          `ion-accordion-group`: IonAccordionGroup & HTMLAttributes[HTMLIonAccordionGroupElement],
          `ion-action-sheet`: IonActionSheet & HTMLAttributes[HTMLIonActionSheetElement],
          `ion-alert`: IonAlert & HTMLAttributes[HTMLIonAlertElement],
          `ion-app`: IonApp & HTMLAttributes[HTMLIonAppElement],
          `ion-avatar`: IonAvatar & HTMLAttributes[HTMLIonAvatarElement],
          `ion-back-button`: IonBackButton & HTMLAttributes[HTMLIonBackButtonElement],
          `ion-backdrop`: IonBackdrop & HTMLAttributes[HTMLIonBackdropElement],
          `ion-badge`: IonBadge & HTMLAttributes[HTMLIonBadgeElement],
          `ion-breadcrumb`: IonBreadcrumb & HTMLAttributes[HTMLIonBreadcrumbElement],
          `ion-breadcrumbs`: IonBreadcrumbs & HTMLAttributes[HTMLIonBreadcrumbsElement],
          `ion-button`: IonButton & HTMLAttributes[HTMLIonButtonElement],
          `ion-buttons`: IonButtons & HTMLAttributes[HTMLIonButtonsElement],
          `ion-card`: IonCard & HTMLAttributes[HTMLIonCardElement],
          `ion-card-content`: IonCardContent & HTMLAttributes[HTMLIonCardContentElement],
          `ion-card-header`: IonCardHeader & HTMLAttributes[HTMLIonCardHeaderElement],
          `ion-card-subtitle`: IonCardSubtitle & HTMLAttributes[HTMLIonCardSubtitleElement],
          `ion-card-title`: IonCardTitle & HTMLAttributes[HTMLIonCardTitleElement],
          `ion-checkbox`: IonCheckbox & HTMLAttributes[HTMLIonCheckboxElement],
          `ion-chip`: IonChip & HTMLAttributes[HTMLIonChipElement],
          `ion-col`: IonCol & HTMLAttributes[HTMLIonColElement],
          `ion-content`: IonContent & HTMLAttributes[HTMLIonContentElement],
          `ion-datetime`: IonDatetime & HTMLAttributes[HTMLIonDatetimeElement],
          `ion-datetime-button`: IonDatetimeButton & HTMLAttributes[HTMLIonDatetimeButtonElement],
          `ion-fab`: IonFab & HTMLAttributes[HTMLIonFabElement],
          `ion-fab-button`: IonFabButton & HTMLAttributes[HTMLIonFabButtonElement],
          `ion-fab-list`: IonFabList & HTMLAttributes[HTMLIonFabListElement],
          `ion-footer`: IonFooter & HTMLAttributes[HTMLIonFooterElement],
          `ion-grid`: IonGrid & HTMLAttributes[HTMLIonGridElement],
          `ion-header`: IonHeader & HTMLAttributes[HTMLIonHeaderElement],
          `ion-img`: IonImg & HTMLAttributes[HTMLIonImgElement],
          `ion-infinite-scroll`: IonInfiniteScroll & HTMLAttributes[HTMLIonInfiniteScrollElement],
          `ion-infinite-scroll-content`: IonInfiniteScrollContent & HTMLAttributes[HTMLIonInfiniteScrollContentElement],
          `ion-input`: IonInput & HTMLAttributes[HTMLIonInputElement],
          `ion-item`: IonItem & HTMLAttributes[HTMLIonItemElement],
          `ion-item-divider`: IonItemDivider & HTMLAttributes[HTMLIonItemDividerElement],
          `ion-item-group`: IonItemGroup & HTMLAttributes[HTMLIonItemGroupElement],
          `ion-item-option`: IonItemOption & HTMLAttributes[HTMLIonItemOptionElement],
          `ion-item-options`: IonItemOptions & HTMLAttributes[HTMLIonItemOptionsElement],
          `ion-item-sliding`: IonItemSliding & HTMLAttributes[HTMLIonItemSlidingElement],
          `ion-label`: IonLabel & HTMLAttributes[HTMLIonLabelElement],
          `ion-list`: IonList & HTMLAttributes[HTMLIonListElement],
          `ion-list-header`: IonListHeader & HTMLAttributes[HTMLIonListHeaderElement],
          `ion-loading`: IonLoading & HTMLAttributes[HTMLIonLoadingElement],
          `ion-menu`: IonMenu & HTMLAttributes[HTMLIonMenuElement],
          `ion-menu-button`: IonMenuButton & HTMLAttributes[HTMLIonMenuButtonElement],
          `ion-menu-toggle`: IonMenuToggle & HTMLAttributes[HTMLIonMenuToggleElement],
          `ion-modal`: IonModal & HTMLAttributes[HTMLIonModalElement],
          `ion-nav`: IonNav & HTMLAttributes[HTMLIonNavElement],
          `ion-nav-link`: IonNavLink & HTMLAttributes[HTMLIonNavLinkElement],
          `ion-note`: IonNote & HTMLAttributes[HTMLIonNoteElement],
          `ion-picker`: IonPicker & HTMLAttributes[HTMLIonPickerElement],
          `ion-picker-column`: IonPickerColumn & HTMLAttributes[HTMLIonPickerColumnElement],
          `ion-picker-column-internal`: IonPickerColumnInternal & HTMLAttributes[HTMLIonPickerColumnInternalElement],
          `ion-picker-internal`: IonPickerInternal & HTMLAttributes[HTMLIonPickerInternalElement],
          `ion-popover`: IonPopover & HTMLAttributes[HTMLIonPopoverElement],
          `ion-progress-bar`: IonProgressBar & HTMLAttributes[HTMLIonProgressBarElement],
          `ion-radio`: IonRadio & HTMLAttributes[HTMLIonRadioElement],
          `ion-radio-group`: IonRadioGroup & HTMLAttributes[HTMLIonRadioGroupElement],
          `ion-range`: IonRange & HTMLAttributes[HTMLIonRangeElement],
          `ion-refresher`: IonRefresher & HTMLAttributes[HTMLIonRefresherElement],
          `ion-refresher-content`: IonRefresherContent & HTMLAttributes[HTMLIonRefresherContentElement],
          `ion-reorder`: IonReorder & HTMLAttributes[HTMLIonReorderElement],
          `ion-reorder-group`: IonReorderGroup & HTMLAttributes[HTMLIonReorderGroupElement],
          `ion-ripple-effect`: IonRippleEffect & HTMLAttributes[HTMLIonRippleEffectElement],
          `ion-route`: IonRoute & HTMLAttributes[HTMLIonRouteElement],
          `ion-route-redirect`: IonRouteRedirect & HTMLAttributes[HTMLIonRouteRedirectElement],
          `ion-router`: IonRouter & HTMLAttributes[HTMLIonRouterElement],
          `ion-router-link`: IonRouterLink & HTMLAttributes[HTMLIonRouterLinkElement],
          `ion-router-outlet`: IonRouterOutlet & HTMLAttributes[HTMLIonRouterOutletElement],
          `ion-row`: IonRow & HTMLAttributes[HTMLIonRowElement],
          `ion-searchbar`: IonSearchbar & HTMLAttributes[HTMLIonSearchbarElement],
          `ion-segment`: IonSegment & HTMLAttributes[HTMLIonSegmentElement],
          `ion-segment-button`: IonSegmentButton & HTMLAttributes[HTMLIonSegmentButtonElement],
          `ion-select`: IonSelect & HTMLAttributes[HTMLIonSelectElement],
          `ion-select-option`: IonSelectOption & HTMLAttributes[HTMLIonSelectOptionElement],
          `ion-select-popover`: IonSelectPopover & HTMLAttributes[HTMLIonSelectPopoverElement],
          `ion-skeleton-text`: IonSkeletonText & HTMLAttributes[HTMLIonSkeletonTextElement],
          `ion-slide`: IonSlide & HTMLAttributes[HTMLIonSlideElement],
          `ion-slides`: IonSlides & HTMLAttributes[HTMLIonSlidesElement],
          `ion-spinner`: IonSpinner & HTMLAttributes[HTMLIonSpinnerElement],
          `ion-split-pane`: IonSplitPane & HTMLAttributes[HTMLIonSplitPaneElement],
          `ion-tab`: IonTab & HTMLAttributes[HTMLIonTabElement],
          `ion-tab-bar`: IonTabBar & HTMLAttributes[HTMLIonTabBarElement],
          `ion-tab-button`: IonTabButton & HTMLAttributes[HTMLIonTabButtonElement],
          `ion-tabs`: IonTabs & HTMLAttributes[HTMLIonTabsElement],
          `ion-text`: IonText & HTMLAttributes[HTMLIonTextElement],
          `ion-textarea`: IonTextarea & HTMLAttributes[HTMLIonTextareaElement],
          `ion-thumbnail`: IonThumbnail & HTMLAttributes[HTMLIonThumbnailElement],
          `ion-title`: IonTitle & HTMLAttributes[HTMLIonTitleElement],
          `ion-toast`: IonToast & HTMLAttributes[HTMLIonToastElement],
          `ion-toggle`: IonToggle & HTMLAttributes[HTMLIonToggleElement],
          `ion-toolbar`: IonToolbar & HTMLAttributes[HTMLIonToolbarElement],
          `ion-virtual-scroll`: IonVirtualScroll & HTMLAttributes[HTMLIonVirtualScrollElement]
        ): IntrinsicElements = {
          val __obj = js.Dynamic.literal()
          __obj.updateDynamic("ion-accordion")(`ion-accordion`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-accordion-group")(`ion-accordion-group`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-action-sheet")(`ion-action-sheet`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-alert")(`ion-alert`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-app")(`ion-app`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-avatar")(`ion-avatar`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-back-button")(`ion-back-button`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-backdrop")(`ion-backdrop`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-badge")(`ion-badge`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-breadcrumb")(`ion-breadcrumb`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-breadcrumbs")(`ion-breadcrumbs`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-button")(`ion-button`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-buttons")(`ion-buttons`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-card")(`ion-card`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-card-content")(`ion-card-content`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-card-header")(`ion-card-header`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-card-subtitle")(`ion-card-subtitle`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-card-title")(`ion-card-title`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-checkbox")(`ion-checkbox`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-chip")(`ion-chip`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-col")(`ion-col`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-content")(`ion-content`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-datetime")(`ion-datetime`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-datetime-button")(`ion-datetime-button`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-fab")(`ion-fab`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-fab-button")(`ion-fab-button`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-fab-list")(`ion-fab-list`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-footer")(`ion-footer`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-grid")(`ion-grid`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-header")(`ion-header`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-img")(`ion-img`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-infinite-scroll")(`ion-infinite-scroll`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-infinite-scroll-content")(`ion-infinite-scroll-content`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-input")(`ion-input`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-item")(`ion-item`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-item-divider")(`ion-item-divider`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-item-group")(`ion-item-group`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-item-option")(`ion-item-option`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-item-options")(`ion-item-options`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-item-sliding")(`ion-item-sliding`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-label")(`ion-label`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-list")(`ion-list`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-list-header")(`ion-list-header`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-loading")(`ion-loading`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-menu")(`ion-menu`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-menu-button")(`ion-menu-button`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-menu-toggle")(`ion-menu-toggle`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-modal")(`ion-modal`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-nav")(`ion-nav`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-nav-link")(`ion-nav-link`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-note")(`ion-note`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-picker")(`ion-picker`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-picker-column")(`ion-picker-column`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-picker-column-internal")(`ion-picker-column-internal`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-picker-internal")(`ion-picker-internal`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-popover")(`ion-popover`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-progress-bar")(`ion-progress-bar`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-radio")(`ion-radio`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-radio-group")(`ion-radio-group`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-range")(`ion-range`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-refresher")(`ion-refresher`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-refresher-content")(`ion-refresher-content`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-reorder")(`ion-reorder`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-reorder-group")(`ion-reorder-group`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-ripple-effect")(`ion-ripple-effect`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-route")(`ion-route`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-route-redirect")(`ion-route-redirect`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-router")(`ion-router`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-router-link")(`ion-router-link`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-router-outlet")(`ion-router-outlet`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-row")(`ion-row`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-searchbar")(`ion-searchbar`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-segment")(`ion-segment`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-segment-button")(`ion-segment-button`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-select")(`ion-select`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-select-option")(`ion-select-option`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-select-popover")(`ion-select-popover`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-skeleton-text")(`ion-skeleton-text`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-slide")(`ion-slide`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-slides")(`ion-slides`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-spinner")(`ion-spinner`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-split-pane")(`ion-split-pane`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-tab")(`ion-tab`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-tab-bar")(`ion-tab-bar`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-tab-button")(`ion-tab-button`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-tabs")(`ion-tabs`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-text")(`ion-text`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-textarea")(`ion-textarea`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-thumbnail")(`ion-thumbnail`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-title")(`ion-title`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-toast")(`ion-toast`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-toggle")(`ion-toggle`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-toolbar")(`ion-toolbar`.asInstanceOf[js.Any])
          __obj.updateDynamic("ion-virtual-scroll")(`ion-virtual-scroll`.asInstanceOf[js.Any])
          __obj.asInstanceOf[IntrinsicElements]
        }
        
        extension [Self <: IntrinsicElements](x: Self) {
          
          inline def `setIon-accordion`(value: IonAccordion & HTMLAttributes[HTMLIonAccordionElement]): Self = StObject.set(x, "ion-accordion", value.asInstanceOf[js.Any])
          
          inline def `setIon-accordion-group`(value: IonAccordionGroup & HTMLAttributes[HTMLIonAccordionGroupElement]): Self = StObject.set(x, "ion-accordion-group", value.asInstanceOf[js.Any])
          
          inline def `setIon-action-sheet`(value: IonActionSheet & HTMLAttributes[HTMLIonActionSheetElement]): Self = StObject.set(x, "ion-action-sheet", value.asInstanceOf[js.Any])
          
          inline def `setIon-alert`(value: IonAlert & HTMLAttributes[HTMLIonAlertElement]): Self = StObject.set(x, "ion-alert", value.asInstanceOf[js.Any])
          
          inline def `setIon-app`(value: IonApp & HTMLAttributes[HTMLIonAppElement]): Self = StObject.set(x, "ion-app", value.asInstanceOf[js.Any])
          
          inline def `setIon-avatar`(value: IonAvatar & HTMLAttributes[HTMLIonAvatarElement]): Self = StObject.set(x, "ion-avatar", value.asInstanceOf[js.Any])
          
          inline def `setIon-back-button`(value: IonBackButton & HTMLAttributes[HTMLIonBackButtonElement]): Self = StObject.set(x, "ion-back-button", value.asInstanceOf[js.Any])
          
          inline def `setIon-backdrop`(value: IonBackdrop & HTMLAttributes[HTMLIonBackdropElement]): Self = StObject.set(x, "ion-backdrop", value.asInstanceOf[js.Any])
          
          inline def `setIon-badge`(value: IonBadge & HTMLAttributes[HTMLIonBadgeElement]): Self = StObject.set(x, "ion-badge", value.asInstanceOf[js.Any])
          
          inline def `setIon-breadcrumb`(value: IonBreadcrumb & HTMLAttributes[HTMLIonBreadcrumbElement]): Self = StObject.set(x, "ion-breadcrumb", value.asInstanceOf[js.Any])
          
          inline def `setIon-breadcrumbs`(value: IonBreadcrumbs & HTMLAttributes[HTMLIonBreadcrumbsElement]): Self = StObject.set(x, "ion-breadcrumbs", value.asInstanceOf[js.Any])
          
          inline def `setIon-button`(value: IonButton & HTMLAttributes[HTMLIonButtonElement]): Self = StObject.set(x, "ion-button", value.asInstanceOf[js.Any])
          
          inline def `setIon-buttons`(value: IonButtons & HTMLAttributes[HTMLIonButtonsElement]): Self = StObject.set(x, "ion-buttons", value.asInstanceOf[js.Any])
          
          inline def `setIon-card`(value: IonCard & HTMLAttributes[HTMLIonCardElement]): Self = StObject.set(x, "ion-card", value.asInstanceOf[js.Any])
          
          inline def `setIon-card-content`(value: IonCardContent & HTMLAttributes[HTMLIonCardContentElement]): Self = StObject.set(x, "ion-card-content", value.asInstanceOf[js.Any])
          
          inline def `setIon-card-header`(value: IonCardHeader & HTMLAttributes[HTMLIonCardHeaderElement]): Self = StObject.set(x, "ion-card-header", value.asInstanceOf[js.Any])
          
          inline def `setIon-card-subtitle`(value: IonCardSubtitle & HTMLAttributes[HTMLIonCardSubtitleElement]): Self = StObject.set(x, "ion-card-subtitle", value.asInstanceOf[js.Any])
          
          inline def `setIon-card-title`(value: IonCardTitle & HTMLAttributes[HTMLIonCardTitleElement]): Self = StObject.set(x, "ion-card-title", value.asInstanceOf[js.Any])
          
          inline def `setIon-checkbox`(value: IonCheckbox & HTMLAttributes[HTMLIonCheckboxElement]): Self = StObject.set(x, "ion-checkbox", value.asInstanceOf[js.Any])
          
          inline def `setIon-chip`(value: IonChip & HTMLAttributes[HTMLIonChipElement]): Self = StObject.set(x, "ion-chip", value.asInstanceOf[js.Any])
          
          inline def `setIon-col`(value: IonCol & HTMLAttributes[HTMLIonColElement]): Self = StObject.set(x, "ion-col", value.asInstanceOf[js.Any])
          
          inline def `setIon-content`(value: IonContent & HTMLAttributes[HTMLIonContentElement]): Self = StObject.set(x, "ion-content", value.asInstanceOf[js.Any])
          
          inline def `setIon-datetime`(value: IonDatetime & HTMLAttributes[HTMLIonDatetimeElement]): Self = StObject.set(x, "ion-datetime", value.asInstanceOf[js.Any])
          
          inline def `setIon-datetime-button`(value: IonDatetimeButton & HTMLAttributes[HTMLIonDatetimeButtonElement]): Self = StObject.set(x, "ion-datetime-button", value.asInstanceOf[js.Any])
          
          inline def `setIon-fab`(value: IonFab & HTMLAttributes[HTMLIonFabElement]): Self = StObject.set(x, "ion-fab", value.asInstanceOf[js.Any])
          
          inline def `setIon-fab-button`(value: IonFabButton & HTMLAttributes[HTMLIonFabButtonElement]): Self = StObject.set(x, "ion-fab-button", value.asInstanceOf[js.Any])
          
          inline def `setIon-fab-list`(value: IonFabList & HTMLAttributes[HTMLIonFabListElement]): Self = StObject.set(x, "ion-fab-list", value.asInstanceOf[js.Any])
          
          inline def `setIon-footer`(value: IonFooter & HTMLAttributes[HTMLIonFooterElement]): Self = StObject.set(x, "ion-footer", value.asInstanceOf[js.Any])
          
          inline def `setIon-grid`(value: IonGrid & HTMLAttributes[HTMLIonGridElement]): Self = StObject.set(x, "ion-grid", value.asInstanceOf[js.Any])
          
          inline def `setIon-header`(value: IonHeader & HTMLAttributes[HTMLIonHeaderElement]): Self = StObject.set(x, "ion-header", value.asInstanceOf[js.Any])
          
          inline def `setIon-img`(value: IonImg & HTMLAttributes[HTMLIonImgElement]): Self = StObject.set(x, "ion-img", value.asInstanceOf[js.Any])
          
          inline def `setIon-infinite-scroll`(value: IonInfiniteScroll & HTMLAttributes[HTMLIonInfiniteScrollElement]): Self = StObject.set(x, "ion-infinite-scroll", value.asInstanceOf[js.Any])
          
          inline def `setIon-infinite-scroll-content`(value: IonInfiniteScrollContent & HTMLAttributes[HTMLIonInfiniteScrollContentElement]): Self = StObject.set(x, "ion-infinite-scroll-content", value.asInstanceOf[js.Any])
          
          inline def `setIon-input`(value: IonInput & HTMLAttributes[HTMLIonInputElement]): Self = StObject.set(x, "ion-input", value.asInstanceOf[js.Any])
          
          inline def `setIon-item`(value: IonItem & HTMLAttributes[HTMLIonItemElement]): Self = StObject.set(x, "ion-item", value.asInstanceOf[js.Any])
          
          inline def `setIon-item-divider`(value: IonItemDivider & HTMLAttributes[HTMLIonItemDividerElement]): Self = StObject.set(x, "ion-item-divider", value.asInstanceOf[js.Any])
          
          inline def `setIon-item-group`(value: IonItemGroup & HTMLAttributes[HTMLIonItemGroupElement]): Self = StObject.set(x, "ion-item-group", value.asInstanceOf[js.Any])
          
          inline def `setIon-item-option`(value: IonItemOption & HTMLAttributes[HTMLIonItemOptionElement]): Self = StObject.set(x, "ion-item-option", value.asInstanceOf[js.Any])
          
          inline def `setIon-item-options`(value: IonItemOptions & HTMLAttributes[HTMLIonItemOptionsElement]): Self = StObject.set(x, "ion-item-options", value.asInstanceOf[js.Any])
          
          inline def `setIon-item-sliding`(value: IonItemSliding & HTMLAttributes[HTMLIonItemSlidingElement]): Self = StObject.set(x, "ion-item-sliding", value.asInstanceOf[js.Any])
          
          inline def `setIon-label`(value: IonLabel & HTMLAttributes[HTMLIonLabelElement]): Self = StObject.set(x, "ion-label", value.asInstanceOf[js.Any])
          
          inline def `setIon-list`(value: IonList & HTMLAttributes[HTMLIonListElement]): Self = StObject.set(x, "ion-list", value.asInstanceOf[js.Any])
          
          inline def `setIon-list-header`(value: IonListHeader & HTMLAttributes[HTMLIonListHeaderElement]): Self = StObject.set(x, "ion-list-header", value.asInstanceOf[js.Any])
          
          inline def `setIon-loading`(value: IonLoading & HTMLAttributes[HTMLIonLoadingElement]): Self = StObject.set(x, "ion-loading", value.asInstanceOf[js.Any])
          
          inline def `setIon-menu`(value: IonMenu & HTMLAttributes[HTMLIonMenuElement]): Self = StObject.set(x, "ion-menu", value.asInstanceOf[js.Any])
          
          inline def `setIon-menu-button`(value: IonMenuButton & HTMLAttributes[HTMLIonMenuButtonElement]): Self = StObject.set(x, "ion-menu-button", value.asInstanceOf[js.Any])
          
          inline def `setIon-menu-toggle`(value: IonMenuToggle & HTMLAttributes[HTMLIonMenuToggleElement]): Self = StObject.set(x, "ion-menu-toggle", value.asInstanceOf[js.Any])
          
          inline def `setIon-modal`(value: IonModal & HTMLAttributes[HTMLIonModalElement]): Self = StObject.set(x, "ion-modal", value.asInstanceOf[js.Any])
          
          inline def `setIon-nav`(value: IonNav & HTMLAttributes[HTMLIonNavElement]): Self = StObject.set(x, "ion-nav", value.asInstanceOf[js.Any])
          
          inline def `setIon-nav-link`(value: IonNavLink & HTMLAttributes[HTMLIonNavLinkElement]): Self = StObject.set(x, "ion-nav-link", value.asInstanceOf[js.Any])
          
          inline def `setIon-note`(value: IonNote & HTMLAttributes[HTMLIonNoteElement]): Self = StObject.set(x, "ion-note", value.asInstanceOf[js.Any])
          
          inline def `setIon-picker`(value: IonPicker & HTMLAttributes[HTMLIonPickerElement]): Self = StObject.set(x, "ion-picker", value.asInstanceOf[js.Any])
          
          inline def `setIon-picker-column`(value: IonPickerColumn & HTMLAttributes[HTMLIonPickerColumnElement]): Self = StObject.set(x, "ion-picker-column", value.asInstanceOf[js.Any])
          
          inline def `setIon-picker-column-internal`(value: IonPickerColumnInternal & HTMLAttributes[HTMLIonPickerColumnInternalElement]): Self = StObject.set(x, "ion-picker-column-internal", value.asInstanceOf[js.Any])
          
          inline def `setIon-picker-internal`(value: IonPickerInternal & HTMLAttributes[HTMLIonPickerInternalElement]): Self = StObject.set(x, "ion-picker-internal", value.asInstanceOf[js.Any])
          
          inline def `setIon-popover`(value: IonPopover & HTMLAttributes[HTMLIonPopoverElement]): Self = StObject.set(x, "ion-popover", value.asInstanceOf[js.Any])
          
          inline def `setIon-progress-bar`(value: IonProgressBar & HTMLAttributes[HTMLIonProgressBarElement]): Self = StObject.set(x, "ion-progress-bar", value.asInstanceOf[js.Any])
          
          inline def `setIon-radio`(value: IonRadio & HTMLAttributes[HTMLIonRadioElement]): Self = StObject.set(x, "ion-radio", value.asInstanceOf[js.Any])
          
          inline def `setIon-radio-group`(value: IonRadioGroup & HTMLAttributes[HTMLIonRadioGroupElement]): Self = StObject.set(x, "ion-radio-group", value.asInstanceOf[js.Any])
          
          inline def `setIon-range`(value: IonRange & HTMLAttributes[HTMLIonRangeElement]): Self = StObject.set(x, "ion-range", value.asInstanceOf[js.Any])
          
          inline def `setIon-refresher`(value: IonRefresher & HTMLAttributes[HTMLIonRefresherElement]): Self = StObject.set(x, "ion-refresher", value.asInstanceOf[js.Any])
          
          inline def `setIon-refresher-content`(value: IonRefresherContent & HTMLAttributes[HTMLIonRefresherContentElement]): Self = StObject.set(x, "ion-refresher-content", value.asInstanceOf[js.Any])
          
          inline def `setIon-reorder`(value: IonReorder & HTMLAttributes[HTMLIonReorderElement]): Self = StObject.set(x, "ion-reorder", value.asInstanceOf[js.Any])
          
          inline def `setIon-reorder-group`(value: IonReorderGroup & HTMLAttributes[HTMLIonReorderGroupElement]): Self = StObject.set(x, "ion-reorder-group", value.asInstanceOf[js.Any])
          
          inline def `setIon-ripple-effect`(value: IonRippleEffect & HTMLAttributes[HTMLIonRippleEffectElement]): Self = StObject.set(x, "ion-ripple-effect", value.asInstanceOf[js.Any])
          
          inline def `setIon-route`(value: IonRoute & HTMLAttributes[HTMLIonRouteElement]): Self = StObject.set(x, "ion-route", value.asInstanceOf[js.Any])
          
          inline def `setIon-route-redirect`(value: IonRouteRedirect & HTMLAttributes[HTMLIonRouteRedirectElement]): Self = StObject.set(x, "ion-route-redirect", value.asInstanceOf[js.Any])
          
          inline def `setIon-router`(value: IonRouter & HTMLAttributes[HTMLIonRouterElement]): Self = StObject.set(x, "ion-router", value.asInstanceOf[js.Any])
          
          inline def `setIon-router-link`(value: IonRouterLink & HTMLAttributes[HTMLIonRouterLinkElement]): Self = StObject.set(x, "ion-router-link", value.asInstanceOf[js.Any])
          
          inline def `setIon-router-outlet`(value: IonRouterOutlet & HTMLAttributes[HTMLIonRouterOutletElement]): Self = StObject.set(x, "ion-router-outlet", value.asInstanceOf[js.Any])
          
          inline def `setIon-row`(value: IonRow & HTMLAttributes[HTMLIonRowElement]): Self = StObject.set(x, "ion-row", value.asInstanceOf[js.Any])
          
          inline def `setIon-searchbar`(value: IonSearchbar & HTMLAttributes[HTMLIonSearchbarElement]): Self = StObject.set(x, "ion-searchbar", value.asInstanceOf[js.Any])
          
          inline def `setIon-segment`(value: IonSegment & HTMLAttributes[HTMLIonSegmentElement]): Self = StObject.set(x, "ion-segment", value.asInstanceOf[js.Any])
          
          inline def `setIon-segment-button`(value: IonSegmentButton & HTMLAttributes[HTMLIonSegmentButtonElement]): Self = StObject.set(x, "ion-segment-button", value.asInstanceOf[js.Any])
          
          inline def `setIon-select`(value: IonSelect & HTMLAttributes[HTMLIonSelectElement]): Self = StObject.set(x, "ion-select", value.asInstanceOf[js.Any])
          
          inline def `setIon-select-option`(value: IonSelectOption & HTMLAttributes[HTMLIonSelectOptionElement]): Self = StObject.set(x, "ion-select-option", value.asInstanceOf[js.Any])
          
          inline def `setIon-select-popover`(value: IonSelectPopover & HTMLAttributes[HTMLIonSelectPopoverElement]): Self = StObject.set(x, "ion-select-popover", value.asInstanceOf[js.Any])
          
          inline def `setIon-skeleton-text`(value: IonSkeletonText & HTMLAttributes[HTMLIonSkeletonTextElement]): Self = StObject.set(x, "ion-skeleton-text", value.asInstanceOf[js.Any])
          
          inline def `setIon-slide`(value: IonSlide & HTMLAttributes[HTMLIonSlideElement]): Self = StObject.set(x, "ion-slide", value.asInstanceOf[js.Any])
          
          inline def `setIon-slides`(value: IonSlides & HTMLAttributes[HTMLIonSlidesElement]): Self = StObject.set(x, "ion-slides", value.asInstanceOf[js.Any])
          
          inline def `setIon-spinner`(value: IonSpinner & HTMLAttributes[HTMLIonSpinnerElement]): Self = StObject.set(x, "ion-spinner", value.asInstanceOf[js.Any])
          
          inline def `setIon-split-pane`(value: IonSplitPane & HTMLAttributes[HTMLIonSplitPaneElement]): Self = StObject.set(x, "ion-split-pane", value.asInstanceOf[js.Any])
          
          inline def `setIon-tab`(value: IonTab & HTMLAttributes[HTMLIonTabElement]): Self = StObject.set(x, "ion-tab", value.asInstanceOf[js.Any])
          
          inline def `setIon-tab-bar`(value: IonTabBar & HTMLAttributes[HTMLIonTabBarElement]): Self = StObject.set(x, "ion-tab-bar", value.asInstanceOf[js.Any])
          
          inline def `setIon-tab-button`(value: IonTabButton & HTMLAttributes[HTMLIonTabButtonElement]): Self = StObject.set(x, "ion-tab-button", value.asInstanceOf[js.Any])
          
          inline def `setIon-tabs`(value: IonTabs & HTMLAttributes[HTMLIonTabsElement]): Self = StObject.set(x, "ion-tabs", value.asInstanceOf[js.Any])
          
          inline def `setIon-text`(value: IonText & HTMLAttributes[HTMLIonTextElement]): Self = StObject.set(x, "ion-text", value.asInstanceOf[js.Any])
          
          inline def `setIon-textarea`(value: IonTextarea & HTMLAttributes[HTMLIonTextareaElement]): Self = StObject.set(x, "ion-textarea", value.asInstanceOf[js.Any])
          
          inline def `setIon-thumbnail`(value: IonThumbnail & HTMLAttributes[HTMLIonThumbnailElement]): Self = StObject.set(x, "ion-thumbnail", value.asInstanceOf[js.Any])
          
          inline def `setIon-title`(value: IonTitle & HTMLAttributes[HTMLIonTitleElement]): Self = StObject.set(x, "ion-title", value.asInstanceOf[js.Any])
          
          inline def `setIon-toast`(value: IonToast & HTMLAttributes[HTMLIonToastElement]): Self = StObject.set(x, "ion-toast", value.asInstanceOf[js.Any])
          
          inline def `setIon-toggle`(value: IonToggle & HTMLAttributes[HTMLIonToggleElement]): Self = StObject.set(x, "ion-toggle", value.asInstanceOf[js.Any])
          
          inline def `setIon-toolbar`(value: IonToolbar & HTMLAttributes[HTMLIonToolbarElement]): Self = StObject.set(x, "ion-toolbar", value.asInstanceOf[js.Any])
          
          inline def `setIon-virtual-scroll`(value: IonVirtualScroll & HTMLAttributes[HTMLIonVirtualScrollElement]): Self = StObject.set(x, "ion-virtual-scroll", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
