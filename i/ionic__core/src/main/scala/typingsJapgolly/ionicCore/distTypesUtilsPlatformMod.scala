package typingsJapgolly.ionicCore

import org.scalajs.dom.Window
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsPlatformMod {
  
  @JSImport("@ionic/core/dist/types/utils/platform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  @JSImport("@ionic/core/dist/types/utils/platform", "isPlatform")
  @js.native
  val isPlatform: IsPlatformSignature = js.native
  
  inline def setupPlatforms(): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("setupPlatforms")().asInstanceOf[js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ]]
  inline def setupPlatforms(win: Any): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("setupPlatforms")(win.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ]]
  
  inline def testUserAgent(win: Window, expr: js.RegExp): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("testUserAgent")(win.asInstanceOf[js.Any], expr.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @js.native
  trait IsPlatformSignature extends StObject {
    
    def apply(plt: Platforms): Boolean = js.native
    def apply(win: Window, plt: Platforms): Boolean = js.native
  }
  
  /* Inlined std.Partial<{ipad (win : std.Window): boolean, iphone (win : std.Window): boolean, ios (win : std.Window): boolean, android (win : std.Window): boolean, phablet (win : std.Window): boolean, tablet (win : std.Window): boolean, cordova (win : any): boolean, capacitor (win : any): boolean, electron (win : std.Window): boolean, pwa (win : std.Window): boolean, mobile (win : std.Window): boolean, mobileweb (win : std.Window): boolean, desktop (win : std.Window): boolean, hybrid (win : std.Window): boolean}> */
  trait PlatformConfig extends StObject {
    
    var android: js.UndefOr[js.Function1[/* win */ Window, Boolean]] = js.undefined
    
    var capacitor: js.UndefOr[js.Function1[/* win */ Any, Boolean]] = js.undefined
    
    var cordova: js.UndefOr[js.Function1[/* win */ Any, Boolean]] = js.undefined
    
    var desktop: js.UndefOr[js.Function1[/* win */ Window, Boolean]] = js.undefined
    
    var electron: js.UndefOr[js.Function1[/* win */ Window, Boolean]] = js.undefined
    
    var hybrid: js.UndefOr[js.Function1[/* win */ Window, Boolean]] = js.undefined
    
    var ios: js.UndefOr[js.Function1[/* win */ Window, Boolean]] = js.undefined
    
    var ipad: js.UndefOr[js.Function1[/* win */ Window, Boolean]] = js.undefined
    
    var iphone: js.UndefOr[js.Function1[/* win */ Window, Boolean]] = js.undefined
    
    var mobile: js.UndefOr[js.Function1[/* win */ Window, Boolean]] = js.undefined
    
    var mobileweb: js.UndefOr[js.Function1[/* win */ Window, Boolean]] = js.undefined
    
    var phablet: js.UndefOr[js.Function1[/* win */ Window, Boolean]] = js.undefined
    
    var pwa: js.UndefOr[js.Function1[/* win */ Window, Boolean]] = js.undefined
    
    var tablet: js.UndefOr[js.Function1[/* win */ Window, Boolean]] = js.undefined
  }
  object PlatformConfig {
    
    inline def apply(): PlatformConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlatformConfig]
    }
    
    extension [Self <: PlatformConfig](x: Self) {
      
      inline def setAndroid(value: /* win */ Window => Boolean): Self = StObject.set(x, "android", js.Any.fromFunction1(value))
      
      inline def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
      
      inline def setCapacitor(value: /* win */ Any => Boolean): Self = StObject.set(x, "capacitor", js.Any.fromFunction1(value))
      
      inline def setCapacitorUndefined: Self = StObject.set(x, "capacitor", js.undefined)
      
      inline def setCordova(value: /* win */ Any => Boolean): Self = StObject.set(x, "cordova", js.Any.fromFunction1(value))
      
      inline def setCordovaUndefined: Self = StObject.set(x, "cordova", js.undefined)
      
      inline def setDesktop(value: /* win */ Window => Boolean): Self = StObject.set(x, "desktop", js.Any.fromFunction1(value))
      
      inline def setDesktopUndefined: Self = StObject.set(x, "desktop", js.undefined)
      
      inline def setElectron(value: /* win */ Window => Boolean): Self = StObject.set(x, "electron", js.Any.fromFunction1(value))
      
      inline def setElectronUndefined: Self = StObject.set(x, "electron", js.undefined)
      
      inline def setHybrid(value: /* win */ Window => Boolean): Self = StObject.set(x, "hybrid", js.Any.fromFunction1(value))
      
      inline def setHybridUndefined: Self = StObject.set(x, "hybrid", js.undefined)
      
      inline def setIos(value: /* win */ Window => Boolean): Self = StObject.set(x, "ios", js.Any.fromFunction1(value))
      
      inline def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
      
      inline def setIpad(value: /* win */ Window => Boolean): Self = StObject.set(x, "ipad", js.Any.fromFunction1(value))
      
      inline def setIpadUndefined: Self = StObject.set(x, "ipad", js.undefined)
      
      inline def setIphone(value: /* win */ Window => Boolean): Self = StObject.set(x, "iphone", js.Any.fromFunction1(value))
      
      inline def setIphoneUndefined: Self = StObject.set(x, "iphone", js.undefined)
      
      inline def setMobile(value: /* win */ Window => Boolean): Self = StObject.set(x, "mobile", js.Any.fromFunction1(value))
      
      inline def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
      
      inline def setMobileweb(value: /* win */ Window => Boolean): Self = StObject.set(x, "mobileweb", js.Any.fromFunction1(value))
      
      inline def setMobilewebUndefined: Self = StObject.set(x, "mobileweb", js.undefined)
      
      inline def setPhablet(value: /* win */ Window => Boolean): Self = StObject.set(x, "phablet", js.Any.fromFunction1(value))
      
      inline def setPhabletUndefined: Self = StObject.set(x, "phablet", js.undefined)
      
      inline def setPwa(value: /* win */ Window => Boolean): Self = StObject.set(x, "pwa", js.Any.fromFunction1(value))
      
      inline def setPwaUndefined: Self = StObject.set(x, "pwa", js.undefined)
      
      inline def setTablet(value: /* win */ Window => Boolean): Self = StObject.set(x, "tablet", js.Any.fromFunction1(value))
      
      inline def setTabletUndefined: Self = StObject.set(x, "tablet", js.undefined)
    }
  }
  
  /* keyof @ionic/core.anon.Android */ /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ionicCore.ionicCoreStrings.ipad
    - typingsJapgolly.ionicCore.ionicCoreStrings.iphone
    - typingsJapgolly.ionicCore.ionicCoreStrings.ios
    - typingsJapgolly.ionicCore.ionicCoreStrings.android
    - typingsJapgolly.ionicCore.ionicCoreStrings.phablet
    - typingsJapgolly.ionicCore.ionicCoreStrings.tablet
    - typingsJapgolly.ionicCore.ionicCoreStrings.cordova
    - typingsJapgolly.ionicCore.ionicCoreStrings.capacitor
    - typingsJapgolly.ionicCore.ionicCoreStrings.electron
    - typingsJapgolly.ionicCore.ionicCoreStrings.pwa
    - typingsJapgolly.ionicCore.ionicCoreStrings.mobile
    - typingsJapgolly.ionicCore.ionicCoreStrings.mobileweb
    - typingsJapgolly.ionicCore.ionicCoreStrings.desktop
    - typingsJapgolly.ionicCore.ionicCoreStrings.hybrid
  */
  trait Platforms extends StObject
}
