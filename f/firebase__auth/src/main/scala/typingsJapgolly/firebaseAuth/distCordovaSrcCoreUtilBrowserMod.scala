package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseAuth.firebaseAuthStrings.Android
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.Blackberry
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.Chrome
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.Edge
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.Firefox
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.IEMobile
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.Opera
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.Other
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.Safari
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.Silk
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.Webos
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCordovaSrcCoreUtilBrowserMod {
  
  @JSImport("@firebase/auth/dist/cordova/src/core/util/browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBrowserName(userAgent: String): BrowserName | String = ^.asInstanceOf[js.Dynamic].applyDynamic("_getBrowserName")(userAgent.asInstanceOf[js.Any]).asInstanceOf[BrowserName | String]
  
  inline def isAndroid(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isAndroid")().asInstanceOf[Boolean]
  inline def isAndroid(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isAndroid")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBlackBerry(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isBlackBerry")().asInstanceOf[Boolean]
  inline def isBlackBerry(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isBlackBerry")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isChromeIOS(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isChromeIOS")().asInstanceOf[Boolean]
  inline def isChromeIOS(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isChromeIOS")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFirefox(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isFirefox")().asInstanceOf[Boolean]
  inline def isFirefox(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isFirefox")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isIE10(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isIE10")().asInstanceOf[Boolean]
  
  inline def isIEMobile(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isIEMobile")().asInstanceOf[Boolean]
  inline def isIEMobile(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isIEMobile")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isIOS(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isIOS")().asInstanceOf[Boolean]
  inline def isIOS(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isIOS")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isIOS7Or8(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isIOS7Or8")().asInstanceOf[Boolean]
  inline def isIOS7Or8(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isIOS7Or8")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isIOSStandalone(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isIOSStandalone")().asInstanceOf[Boolean]
  inline def isIOSStandalone(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isIOSStandalone")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isIframe(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isIframe")().asInstanceOf[Boolean]
  
  inline def isMobileBrowser(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isMobileBrowser")().asInstanceOf[Boolean]
  inline def isMobileBrowser(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isMobileBrowser")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSafari(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isSafari")().asInstanceOf[Boolean]
  inline def isSafari(userAgent: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isSafari")(userAgent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isWebOS(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isWebOS")().asInstanceOf[Boolean]
  inline def isWebOS(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isWebOS")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.Android
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.Blackberry
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.Edge
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.Firefox
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.IE
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.IEMobile
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.Opera
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.Other
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.Chrome
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.Safari
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.Silk
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.Webos
  */
  trait BrowserName extends StObject
  object BrowserName {
    
    inline def ANDROID: Android = "Android".asInstanceOf[Android]
    
    inline def BLACKBERRY: Blackberry = "Blackberry".asInstanceOf[Blackberry]
    
    inline def CHROME: Chrome = "Chrome".asInstanceOf[Chrome]
    
    inline def EDGE: Edge = "Edge".asInstanceOf[Edge]
    
    inline def FIREFOX: Firefox = "Firefox".asInstanceOf[Firefox]
    
    inline def IE: typingsJapgolly.firebaseAuth.firebaseAuthStrings.IE = "IE".asInstanceOf[typingsJapgolly.firebaseAuth.firebaseAuthStrings.IE]
    
    inline def IEMOBILE: IEMobile = "IEMobile".asInstanceOf[IEMobile]
    
    inline def OPERA: Opera = "Opera".asInstanceOf[Opera]
    
    inline def OTHER: Other = "Other".asInstanceOf[Other]
    
    inline def SAFARI: Safari = "Safari".asInstanceOf[Safari]
    
    inline def SILK: Silk = "Silk".asInstanceOf[Silk]
    
    inline def WEBOS: Webos = "Webos".asInstanceOf[Webos]
  }
}
