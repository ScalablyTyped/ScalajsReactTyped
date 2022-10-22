package typingsJapgolly.reactNativeAdManager

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactNativeAdManager.anon.Remove
import typingsJapgolly.reactNativeAdManager.helperTypesMod.AdFailedToLoadEvent
import typingsJapgolly.reactNativeAdManager.helperTypesMod.InterstialEventType
import typingsJapgolly.reactNativeAdManager.helperTypesMod.Targeting
import typingsJapgolly.reactNativeAdManager.srcNativeAdsWithNativeAdMod.NativeAdWrapperProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-ad-manager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Display a DFP Publisher banner
    */
  @JSImport("react-native-ad-manager", "Banner")
  @js.native
  open class Banner ()
    extends typingsJapgolly.reactNativeAdManager.srcCtkadmanagerbannerMod.^
  object Banner {
    
    @JSImport("react-native-ad-manager", "Banner.simulatorId")
    @js.native
    val simulatorId: String = js.native
  }
  
  object Interstitial {
    
    @JSImport("react-native-ad-manager", "Interstitial")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addEventListener(`type`: InterstialEventType, handler: js.Function1[/* event */ AdFailedToLoadEvent | Null, Unit]): Remove = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Remove]
    
    inline def isReady(callback: js.Function1[/* isLoaded */ Boolean, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isReady")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def removeAllListeners(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllListeners")().asInstanceOf[Unit]
    
    inline def removeEventListener(`type`: String, handler: js.Function1[/* event */ AdFailedToLoadEvent | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def requestAd(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestAd")().asInstanceOf[js.Promise[Unit]]
    
    inline def setAdUnitID(adUnitID: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAdUnitID")(adUnitID.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setTargeting(targetingObjects: Targeting): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTargeting")(targetingObjects.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setTestDevices(testDevices: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTestDevices")(testDevices.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def showAd(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("showAd")().asInstanceOf[js.Promise[Unit]]
    
    @JSImport("react-native-ad-manager", "Interstitial.simulatorId")
    @js.native
    val simulatorId: String = js.native
  }
  
  @JSImport("react-native-ad-manager", "NativeAdsManager")
  @js.native
  open class NativeAdsManager protected ()
    extends typingsJapgolly.reactNativeAdManager.srcNativeAdsNativeAdsManagerMod.^ {
    def this(adUnitID: String, testDevices: js.Array[String]) = this()
  }
  object NativeAdsManager {
    
    @JSImport("react-native-ad-manager", "NativeAdsManager")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def registerViewsForInteractionAsync(nativeAdViewTag: Double, clickable: js.Array[Double]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerViewsForInteractionAsync")(nativeAdViewTag.asInstanceOf[js.Any], clickable.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  }
  
  @JSImport("react-native-ad-manager", "TriggerableView")
  @js.native
  open class TriggerableView ()
    extends typingsJapgolly.reactNativeAdManager.srcNativeAdsTriggerableViewManagerMod.^
  
  inline def withNativeAd[P](Component: ComponentType[P]): ComponentClassP[P & NativeAdWrapperProps & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("withNativeAd")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[P & NativeAdWrapperProps & js.Object]]
}
