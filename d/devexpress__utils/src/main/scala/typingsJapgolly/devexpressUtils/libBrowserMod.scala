package typingsJapgolly.devexpressUtils

import typingsJapgolly.std.RegExpExecArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBrowserMod {
  
  @JSImport("@devexpress/utils/lib/browser", "Browser")
  @js.native
  open class Browser () extends StObject
  /* static members */
  object Browser {
    
    @JSImport("@devexpress/utils/lib/browser", "Browser")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@devexpress/utils/lib/browser", "Browser.AndroidChromeBrowser")
    @js.native
    def AndroidChromeBrowser: Boolean = js.native
    inline def AndroidChromeBrowser_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AndroidChromeBrowser")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/browser", "Browser.AndroidDefaultBrowser")
    @js.native
    def AndroidDefaultBrowser: Boolean = js.native
    inline def AndroidDefaultBrowser_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AndroidDefaultBrowser")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/browser", "Browser.AndroidMobilePlatform")
    @js.native
    def AndroidMobilePlatform: Boolean = js.native
    inline def AndroidMobilePlatform_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AndroidMobilePlatform")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/browser", "Browser.Chrome")
    @js.native
    def Chrome: Boolean = js.native
    inline def Chrome_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Chrome")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/browser", "Browser.Edge")
    @js.native
    def Edge: Boolean = js.native
    inline def Edge_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Edge")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/browser", "Browser.Firefox")
    @js.native
    def Firefox: Boolean = js.native
    inline def Firefox_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Firefox")(x.asInstanceOf[js.Any])
    
    inline def GetBrowserVersion(
      userAgent: String,
      matches: RegExpExecArray,
      tridentPattern: String,
      ieCompatibleVersionString: String
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("GetBrowserVersion")(userAgent.asInstanceOf[js.Any], matches.asInstanceOf[js.Any], tridentPattern.asInstanceOf[js.Any], ieCompatibleVersionString.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @JSImport("@devexpress/utils/lib/browser", "Browser.IE")
    @js.native
    def IE: Boolean = js.native
    inline def IE_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IE")(x.asInstanceOf[js.Any])
    
    inline def IdentUserAgent(userAgent: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("IdentUserAgent")(userAgent.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def IdentUserAgent(userAgent: String, ignoreDocumentMode: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("IdentUserAgent")(userAgent.asInstanceOf[js.Any], ignoreDocumentMode.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("@devexpress/utils/lib/browser", "Browser.Info")
    @js.native
    def Info: String = js.native
    inline def Info_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Info")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/browser", "Browser.MSTouchUI")
    @js.native
    def MSTouchUI: Boolean = js.native
    inline def MSTouchUI_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MSTouchUI")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/browser", "Browser.MacOSMobilePlatform")
    @js.native
    def MacOSMobilePlatform: Boolean = js.native
    inline def MacOSMobilePlatform_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MacOSMobilePlatform")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/browser", "Browser.MacOSPlatform")
    @js.native
    def MacOSPlatform: Boolean = js.native
    inline def MacOSPlatform_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MacOSPlatform")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/browser", "Browser.MajorVersion")
    @js.native
    def MajorVersion: Double = js.native
    inline def MajorVersion_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MajorVersion")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/browser", "Browser.MobileUI")
    @js.native
    def MobileUI: Boolean = js.native
    inline def MobileUI_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MobileUI")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/browser", "Browser.Mozilla")
    @js.native
    def Mozilla: Boolean = js.native
    inline def Mozilla_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Mozilla")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/browser", "Browser.Netscape")
    @js.native
    def Netscape: Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/browser", "Browser.NetscapeFamily")
    @js.native
    def NetscapeFamily: Boolean = js.native
    inline def NetscapeFamily_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NetscapeFamily")(x.asInstanceOf[js.Any])
    
    inline def Netscape_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Netscape")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/browser", "Browser.Opera")
    @js.native
    def Opera: Boolean = js.native
    inline def Opera_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Opera")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/browser", "Browser.PlaformMajorVersion")
    @js.native
    def PlaformMajorVersion: String = js.native
    inline def PlaformMajorVersion_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PlaformMajorVersion")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/browser", "Browser.Safari")
    @js.native
    def Safari: Boolean = js.native
    inline def Safari_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Safari")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/browser", "Browser.SamsungAndroidDevice")
    @js.native
    def SamsungAndroidDevice: Boolean = js.native
    inline def SamsungAndroidDevice_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SamsungAndroidDevice")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/browser", "Browser.TouchUI")
    @js.native
    def TouchUI: Boolean = js.native
    inline def TouchUI_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TouchUI")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/browser", "Browser.UserAgent")
    @js.native
    def UserAgent: String = js.native
    inline def UserAgent_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UserAgent")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/browser", "Browser.Version")
    @js.native
    def Version: Double = js.native
    inline def Version_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Version")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/browser", "Browser.VirtualKeyboardSupported")
    @js.native
    def VirtualKeyboardSupported: Boolean = js.native
    inline def VirtualKeyboardSupported_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VirtualKeyboardSupported")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/browser", "Browser.WebKitFamily")
    @js.native
    def WebKitFamily: Boolean = js.native
    inline def WebKitFamily_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WebKitFamily")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/browser", "Browser.WebKitTouchUI")
    @js.native
    def WebKitTouchUI: Boolean = js.native
    inline def WebKitTouchUI_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WebKitTouchUI")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/browser", "Browser.WindowsPhonePlatform")
    @js.native
    def WindowsPhonePlatform: Boolean = js.native
    inline def WindowsPhonePlatform_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WindowsPhonePlatform")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/browser", "Browser.WindowsPlatform")
    @js.native
    def WindowsPlatform: Boolean = js.native
    inline def WindowsPlatform_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WindowsPlatform")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/browser", "Browser._foo")
    @js.native
    def _foo: Unit = js.native
    inline def _foo_=(x: Unit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_foo")(x.asInstanceOf[js.Any])
    
    inline def fillDocumentElementBrowserTypeClassNames(browserTypesOrderedList: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fillDocumentElementBrowserTypeClassNames")(browserTypesOrderedList.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def fillUserAgentInfo(browserTypesOrderedList: js.Array[String], browserType: String, version: Double, platform: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fillUserAgentInfo")(browserTypesOrderedList.asInstanceOf[js.Any], browserType.asInstanceOf[js.Any], version.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def fillUserAgentInfo(
      browserTypesOrderedList: js.Array[String],
      browserType: String,
      version: Double,
      platform: String,
      isSamsungAndroidDevice: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fillUserAgentInfo")(browserTypesOrderedList.asInstanceOf[js.Any], browserType.asInstanceOf[js.Any], version.asInstanceOf[js.Any], platform.asInstanceOf[js.Any], isSamsungAndroidDevice.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("@devexpress/utils/lib/browser", "Browser.getIECompatibleVersionString")
    @js.native
    def getIECompatibleVersionString: Any = js.native
    inline def getIECompatibleVersionString_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getIECompatibleVersionString")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/browser", "Browser.getUserAgent")
    @js.native
    def getUserAgent: Any = js.native
    inline def getUserAgent_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getUserAgent")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/browser", "Browser.getVersionFromMatches")
    @js.native
    def getVersionFromMatches: Any = js.native
    inline def getVersionFromMatches_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getVersionFromMatches")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/browser", "Browser.getVersionFromTrident")
    @js.native
    def getVersionFromTrident: Any = js.native
    inline def getVersionFromTrident_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getVersionFromTrident")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/browser", "Browser.hasMaxTouchPoints")
    @js.native
    def hasMaxTouchPoints: Any = js.native
    inline def hasMaxTouchPoints_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hasMaxTouchPoints")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/browser", "Browser.hasMsMaxTouchPoints")
    @js.native
    def hasMsMaxTouchPoints: Any = js.native
    inline def hasMsMaxTouchPoints_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hasMsMaxTouchPoints")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/browser", "Browser.hasNavigator")
    @js.native
    def hasNavigator: Any = js.native
    inline def hasNavigator_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hasNavigator")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/browser", "Browser.hasTouchStart")
    @js.native
    def hasTouchStart: Any = js.native
    inline def hasTouchStart_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hasTouchStart")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/browser", "Browser.indentPlatformMajorVersion")
    @js.native
    def indentPlatformMajorVersion: Any = js.native
    inline def indentPlatformMajorVersion_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indentPlatformMajorVersion")(x.asInstanceOf[js.Any])
    
    inline def isTouchEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTouchEnabled")().asInstanceOf[Boolean]
  }
}
