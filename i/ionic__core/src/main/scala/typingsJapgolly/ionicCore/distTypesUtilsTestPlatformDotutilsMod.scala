package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.anon.Capacitor
import typingsJapgolly.ionicCore.anon.Cordova
import typingsJapgolly.ionicCore.anon.InnerHeight
import typingsJapgolly.ionicCore.anon.InnerWidth
import typingsJapgolly.ionicCore.anon.MatchMedia
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsTestPlatformDotutilsMod {
  
  @JSImport("@ionic/core/dist/types/utils/test/platform.utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object PlatformConfiguration {
    
    @JSImport("@ionic/core/dist/types/utils/test/platform.utils", "PlatformConfiguration")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ionic/core/dist/types/utils/test/platform.utils", "PlatformConfiguration.AndroidTablet")
    @js.native
    def AndroidTablet: InnerHeight = js.native
    inline def AndroidTablet_=(x: InnerHeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AndroidTablet")(x.asInstanceOf[js.Any])
    
    @JSImport("@ionic/core/dist/types/utils/test/platform.utils", "PlatformConfiguration.Capacitor")
    @js.native
    def Capacitor: typingsJapgolly.ionicCore.anon.Capacitor = js.native
    inline def Capacitor_=(x: Capacitor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Capacitor")(x.asInstanceOf[js.Any])
    
    @JSImport("@ionic/core/dist/types/utils/test/platform.utils", "PlatformConfiguration.Cordova")
    @js.native
    def Cordova: typingsJapgolly.ionicCore.anon.Cordova = js.native
    inline def Cordova_=(x: Cordova): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Cordova")(x.asInstanceOf[js.Any])
    
    @JSImport("@ionic/core/dist/types/utils/test/platform.utils", "PlatformConfiguration.DesktopSafari")
    @js.native
    def DesktopSafari: InnerWidth = js.native
    inline def DesktopSafari_=(x: InnerWidth): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DesktopSafari")(x.asInstanceOf[js.Any])
    
    @JSImport("@ionic/core/dist/types/utils/test/platform.utils", "PlatformConfiguration.GalaxyS9Plus")
    @js.native
    def GalaxyS9Plus: InnerHeight = js.native
    inline def GalaxyS9Plus_=(x: InnerHeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GalaxyS9Plus")(x.asInstanceOf[js.Any])
    
    @JSImport("@ionic/core/dist/types/utils/test/platform.utils", "PlatformConfiguration.GalaxyView")
    @js.native
    def GalaxyView: InnerHeight = js.native
    inline def GalaxyView_=(x: InnerHeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GalaxyView")(x.asInstanceOf[js.Any])
    
    @JSImport("@ionic/core/dist/types/utils/test/platform.utils", "PlatformConfiguration.PWA")
    @js.native
    def PWA: MatchMedia = js.native
    inline def PWA_=(x: MatchMedia): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PWA")(x.asInstanceOf[js.Any])
    
    @JSImport("@ionic/core/dist/types/utils/test/platform.utils", "PlatformConfiguration.Pixel2XL")
    @js.native
    def Pixel2XL: InnerHeight = js.native
    inline def Pixel2XL_=(x: InnerHeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Pixel2XL")(x.asInstanceOf[js.Any])
    
    @JSImport("@ionic/core/dist/types/utils/test/platform.utils", "PlatformConfiguration.iPadOS")
    @js.native
    def iPadOS: InnerHeight = js.native
    inline def iPadOS_=(x: InnerHeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("iPadOS")(x.asInstanceOf[js.Any])
    
    @JSImport("@ionic/core/dist/types/utils/test/platform.utils", "PlatformConfiguration.iPadPro")
    @js.native
    def iPadPro: InnerHeight = js.native
    inline def iPadPro_=(x: InnerHeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("iPadPro")(x.asInstanceOf[js.Any])
    
    @JSImport("@ionic/core/dist/types/utils/test/platform.utils", "PlatformConfiguration.iPhone")
    @js.native
    def iPhone: InnerHeight = js.native
    inline def iPhone_=(x: InnerHeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("iPhone")(x.asInstanceOf[js.Any])
  }
  
  inline def configureBrowser(config: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("configureBrowser")(config.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def configureBrowser(config: Any, win: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("configureBrowser")(config.asInstanceOf[js.Any], win.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def mockMatchMedia(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mockMatchMedia")().asInstanceOf[Any]
  inline def mockMatchMedia(media: js.Array[String]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mockMatchMedia")(media.asInstanceOf[js.Any]).asInstanceOf[Any]
}
