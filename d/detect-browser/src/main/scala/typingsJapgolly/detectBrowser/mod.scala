package typingsJapgolly.detectBrowser

import typingsJapgolly.detectBrowser.detectBrowserBooleans.`true`
import typingsJapgolly.detectBrowser.detectBrowserStrings.`bot-device`
import typingsJapgolly.detectBrowser.detectBrowserStrings.`react-native`
import typingsJapgolly.detectBrowser.detectBrowserStrings.browser
import typingsJapgolly.detectBrowser.detectBrowserStrings.ios_
import typingsJapgolly.detectBrowser.detectBrowserStrings.node
import typingsJapgolly.node.processMod.global.NodeJS.Platform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("detect-browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("detect-browser", "BotInfo")
  @js.native
  open class BotInfo ()
    extends StObject
       with DetectedInfo[
          typingsJapgolly.detectBrowser.detectBrowserStrings.bot, 
          typingsJapgolly.detectBrowser.detectBrowserStrings.bot, 
          Null, 
          Null
        ] {
    
    val bot: `true` = js.native
    
    /* CompleteClass */
    override val name: typingsJapgolly.detectBrowser.detectBrowserStrings.bot = js.native
    
    /* CompleteClass */
    override val os: Null = js.native
    
    /* CompleteClass */
    override val `type`: typingsJapgolly.detectBrowser.detectBrowserStrings.bot = js.native
    @JSName("type")
    val type_BotInfo: /* "bot" */ String = js.native
    
    /* CompleteClass */
    override val version: Null = js.native
  }
  
  @JSImport("detect-browser", "BrowserInfo")
  @js.native
  open class BrowserInfo protected ()
    extends StObject
       with DetectedInfo[browser, Browser, OperatingSystem | Null, String] {
    def this(name: Browser, version: String) = this()
    def this(name: Browser, version: String, os: OperatingSystem) = this()
    
    /* CompleteClass */
    override val name: Browser = js.native
    
    /* CompleteClass */
    override val os: OperatingSystem | Null = js.native
    
    /* CompleteClass */
    override val `type`: browser = js.native
    @JSName("type")
    val type_BrowserInfo: /* "browser" */ String = js.native
    
    /* CompleteClass */
    override val version: String = js.native
  }
  
  @JSImport("detect-browser", "NodeInfo")
  @js.native
  open class NodeInfo protected ()
    extends StObject
       with DetectedInfo[node, node, Platform, String] {
    def this(version: String) = this()
    
    /* CompleteClass */
    override val name: node = js.native
    
    /* CompleteClass */
    override val os: Platform = js.native
    
    /* CompleteClass */
    override val `type`: node = js.native
    @JSName("type")
    val type_NodeInfo: /* "node" */ String = js.native
    
    /* CompleteClass */
    override val version: String = js.native
  }
  
  @JSImport("detect-browser", "ReactNativeInfo")
  @js.native
  open class ReactNativeInfo ()
    extends StObject
       with DetectedInfo[`react-native`, `react-native`, Null, Null] {
    
    /* CompleteClass */
    override val name: `react-native` = js.native
    
    /* CompleteClass */
    override val os: Null = js.native
    
    /* CompleteClass */
    override val `type`: `react-native` = js.native
    @JSName("type")
    val type_ReactNativeInfo: /* "react-native" */ String = js.native
    
    /* CompleteClass */
    override val version: Null = js.native
  }
  
  @JSImport("detect-browser", "SearchBotDeviceInfo")
  @js.native
  open class SearchBotDeviceInfo protected ()
    extends StObject
       with DetectedInfo[`bot-device`, Browser, OperatingSystem | Null, String] {
    def this(name: Browser, version: String, os: Null, bot: String) = this()
    def this(name: Browser, version: String, os: OperatingSystem, bot: String) = this()
    
    val bot: String = js.native
    
    /* CompleteClass */
    override val name: Browser = js.native
    
    /* CompleteClass */
    override val os: OperatingSystem | Null = js.native
    
    /* CompleteClass */
    override val `type`: `bot-device` = js.native
    @JSName("type")
    val type_SearchBotDeviceInfo: /* "bot-device" */ String = js.native
    
    /* CompleteClass */
    override val version: String = js.native
  }
  
  inline def browserName(ua: String): Browser | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("browserName")(ua.asInstanceOf[js.Any]).asInstanceOf[Browser | Null]
  
  inline def detect(): BrowserInfo | SearchBotDeviceInfo | BotInfo | NodeInfo | ReactNativeInfo | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("detect")().asInstanceOf[BrowserInfo | SearchBotDeviceInfo | BotInfo | NodeInfo | ReactNativeInfo | Null]
  inline def detect(userAgent: String): BrowserInfo | SearchBotDeviceInfo | BotInfo | NodeInfo | ReactNativeInfo | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("detect")(userAgent.asInstanceOf[js.Any]).asInstanceOf[BrowserInfo | SearchBotDeviceInfo | BotInfo | NodeInfo | ReactNativeInfo | Null]
  
  inline def detectOS(ua: String): OperatingSystem | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("detectOS")(ua.asInstanceOf[js.Any]).asInstanceOf[OperatingSystem | Null]
  
  inline def getNodeVersion(): NodeInfo | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodeVersion")().asInstanceOf[NodeInfo | Null]
  
  inline def parseUserAgent(ua: String): BrowserInfo | SearchBotDeviceInfo | BotInfo | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUserAgent")(ua.asInstanceOf[js.Any]).asInstanceOf[BrowserInfo | SearchBotDeviceInfo | BotInfo | Null]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.detectBrowser.detectBrowserStrings.aol
    - typingsJapgolly.detectBrowser.detectBrowserStrings.edge
    - typingsJapgolly.detectBrowser.detectBrowserStrings.`edge-ios`
    - typingsJapgolly.detectBrowser.detectBrowserStrings.yandexbrowser
    - typingsJapgolly.detectBrowser.detectBrowserStrings.kakaotalk
    - typingsJapgolly.detectBrowser.detectBrowserStrings.samsung
    - typingsJapgolly.detectBrowser.detectBrowserStrings.silk
    - typingsJapgolly.detectBrowser.detectBrowserStrings.miui
    - typingsJapgolly.detectBrowser.detectBrowserStrings.beaker
    - typingsJapgolly.detectBrowser.detectBrowserStrings.`edge-chromium`
    - typingsJapgolly.detectBrowser.detectBrowserStrings.chrome
    - typingsJapgolly.detectBrowser.detectBrowserStrings.`chromium-webview`
    - typingsJapgolly.detectBrowser.detectBrowserStrings.phantomjs
    - typingsJapgolly.detectBrowser.detectBrowserStrings.crios
    - typingsJapgolly.detectBrowser.detectBrowserStrings.firefox
    - typingsJapgolly.detectBrowser.detectBrowserStrings.fxios
    - typingsJapgolly.detectBrowser.detectBrowserStrings.`opera-mini`
    - typingsJapgolly.detectBrowser.detectBrowserStrings.opera
    - typingsJapgolly.detectBrowser.detectBrowserStrings.pie
    - typingsJapgolly.detectBrowser.detectBrowserStrings.netfront
    - typingsJapgolly.detectBrowser.detectBrowserStrings.ie
    - typingsJapgolly.detectBrowser.detectBrowserStrings.bb10
    - typingsJapgolly.detectBrowser.detectBrowserStrings.android
    - typingsJapgolly.detectBrowser.detectBrowserStrings.ios_
    - typingsJapgolly.detectBrowser.detectBrowserStrings.safari
    - typingsJapgolly.detectBrowser.detectBrowserStrings.facebook
    - typingsJapgolly.detectBrowser.detectBrowserStrings.instagram
    - typingsJapgolly.detectBrowser.detectBrowserStrings.`ios-webview`
    - typingsJapgolly.detectBrowser.detectBrowserStrings.curl
    - typingsJapgolly.detectBrowser.detectBrowserStrings.searchbot
  */
  trait Browser extends StObject
  object Browser {
    
    inline def android: typingsJapgolly.detectBrowser.detectBrowserStrings.android = "android".asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.android]
    
    inline def aol: typingsJapgolly.detectBrowser.detectBrowserStrings.aol = "aol".asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.aol]
    
    inline def bb10: typingsJapgolly.detectBrowser.detectBrowserStrings.bb10 = "bb10".asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.bb10]
    
    inline def beaker: typingsJapgolly.detectBrowser.detectBrowserStrings.beaker = "beaker".asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.beaker]
    
    inline def chrome: typingsJapgolly.detectBrowser.detectBrowserStrings.chrome = "chrome".asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.chrome]
    
    inline def `chromium-webview`: typingsJapgolly.detectBrowser.detectBrowserStrings.`chromium-webview` = "chromium-webview".asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.`chromium-webview`]
    
    inline def crios: typingsJapgolly.detectBrowser.detectBrowserStrings.crios = "crios".asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.crios]
    
    inline def curl: typingsJapgolly.detectBrowser.detectBrowserStrings.curl = "curl".asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.curl]
    
    inline def edge: typingsJapgolly.detectBrowser.detectBrowserStrings.edge = "edge".asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.edge]
    
    inline def `edge-chromium`: typingsJapgolly.detectBrowser.detectBrowserStrings.`edge-chromium` = "edge-chromium".asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.`edge-chromium`]
    
    inline def `edge-ios`: typingsJapgolly.detectBrowser.detectBrowserStrings.`edge-ios` = "edge-ios".asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.`edge-ios`]
    
    inline def facebook: typingsJapgolly.detectBrowser.detectBrowserStrings.facebook = "facebook".asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.facebook]
    
    inline def firefox: typingsJapgolly.detectBrowser.detectBrowserStrings.firefox = "firefox".asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.firefox]
    
    inline def fxios: typingsJapgolly.detectBrowser.detectBrowserStrings.fxios = "fxios".asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.fxios]
    
    inline def ie: typingsJapgolly.detectBrowser.detectBrowserStrings.ie = "ie".asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.ie]
    
    inline def instagram: typingsJapgolly.detectBrowser.detectBrowserStrings.instagram = "instagram".asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.instagram]
    
    inline def ios: ios_ = "ios".asInstanceOf[ios_]
    
    inline def `ios-webview`: typingsJapgolly.detectBrowser.detectBrowserStrings.`ios-webview` = "ios-webview".asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.`ios-webview`]
    
    inline def kakaotalk: typingsJapgolly.detectBrowser.detectBrowserStrings.kakaotalk = "kakaotalk".asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.kakaotalk]
    
    inline def miui: typingsJapgolly.detectBrowser.detectBrowserStrings.miui = "miui".asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.miui]
    
    inline def netfront: typingsJapgolly.detectBrowser.detectBrowserStrings.netfront = "netfront".asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.netfront]
    
    inline def opera: typingsJapgolly.detectBrowser.detectBrowserStrings.opera = "opera".asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.opera]
    
    inline def `opera-mini`: typingsJapgolly.detectBrowser.detectBrowserStrings.`opera-mini` = "opera-mini".asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.`opera-mini`]
    
    inline def phantomjs: typingsJapgolly.detectBrowser.detectBrowserStrings.phantomjs = "phantomjs".asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.phantomjs]
    
    inline def pie: typingsJapgolly.detectBrowser.detectBrowserStrings.pie = "pie".asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.pie]
    
    inline def safari: typingsJapgolly.detectBrowser.detectBrowserStrings.safari = "safari".asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.safari]
    
    inline def samsung: typingsJapgolly.detectBrowser.detectBrowserStrings.samsung = "samsung".asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.samsung]
    
    inline def searchbot: typingsJapgolly.detectBrowser.detectBrowserStrings.searchbot = "searchbot".asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.searchbot]
    
    inline def silk: typingsJapgolly.detectBrowser.detectBrowserStrings.silk = "silk".asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.silk]
    
    inline def yandexbrowser: typingsJapgolly.detectBrowser.detectBrowserStrings.yandexbrowser = "yandexbrowser".asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.yandexbrowser]
  }
  
  trait DetectedInfo[T /* <: DetectedInfoType */, N /* <: String */, O, V] extends StObject {
    
    val name: N
    
    val os: O
    
    val `type`: T
    
    val version: V
  }
  object DetectedInfo {
    
    inline def apply[T /* <: DetectedInfoType */, N /* <: String */, O, V](name: N, os: O, `type`: T, version: V): DetectedInfo[T, N, O, V] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DetectedInfo[T, N, O, V]]
    }
    
    extension [Self <: DetectedInfo[?, ?, ?, ?], T /* <: DetectedInfoType */, N /* <: String */, O, V](x: Self & (DetectedInfo[T, N, O, V])) {
      
      inline def setName(value: N): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOs(value: O): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: V): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.detectBrowser.detectBrowserStrings.browser
    - typingsJapgolly.detectBrowser.detectBrowserStrings.node
    - typingsJapgolly.detectBrowser.detectBrowserStrings.`bot-device`
    - typingsJapgolly.detectBrowser.detectBrowserStrings.bot
    - typingsJapgolly.detectBrowser.detectBrowserStrings.`react-native`
  */
  trait DetectedInfoType extends StObject
  object DetectedInfoType {
    
    inline def bot: typingsJapgolly.detectBrowser.detectBrowserStrings.bot = "bot".asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.bot]
    
    inline def `bot-device`: typingsJapgolly.detectBrowser.detectBrowserStrings.`bot-device` = "bot-device".asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.`bot-device`]
    
    inline def browser: typingsJapgolly.detectBrowser.detectBrowserStrings.browser = "browser".asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.browser]
    
    inline def node: typingsJapgolly.detectBrowser.detectBrowserStrings.node = "node".asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.node]
    
    inline def `react-native`: typingsJapgolly.detectBrowser.detectBrowserStrings.`react-native` = "react-native".asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.`react-native`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.detectBrowser.detectBrowserStrings.iOS
    - typingsJapgolly.detectBrowser.detectBrowserStrings.`Android OS`
    - typingsJapgolly.detectBrowser.detectBrowserStrings.`BlackBerry OS`
    - typingsJapgolly.detectBrowser.detectBrowserStrings.`Windows Mobile`
    - typingsJapgolly.detectBrowser.detectBrowserStrings.`Amazon OS`
    - typingsJapgolly.detectBrowser.detectBrowserStrings.`Windows 3Dot11`
    - typingsJapgolly.detectBrowser.detectBrowserStrings.`Windows 95`
    - typingsJapgolly.detectBrowser.detectBrowserStrings.`Windows 98`
    - typingsJapgolly.detectBrowser.detectBrowserStrings.`Windows 2000`
    - typingsJapgolly.detectBrowser.detectBrowserStrings.`Windows XP`
    - typingsJapgolly.detectBrowser.detectBrowserStrings.`Windows Server 2003`
    - typingsJapgolly.detectBrowser.detectBrowserStrings.`Windows Vista`
    - typingsJapgolly.detectBrowser.detectBrowserStrings.`Windows 7`
    - typingsJapgolly.detectBrowser.detectBrowserStrings.`Windows 8`
    - typingsJapgolly.detectBrowser.detectBrowserStrings.`Windows 8Dot1`
    - typingsJapgolly.detectBrowser.detectBrowserStrings.`Windows 10`
    - typingsJapgolly.detectBrowser.detectBrowserStrings.`Windows ME`
    - typingsJapgolly.detectBrowser.detectBrowserStrings.`Windows CE`
    - typingsJapgolly.detectBrowser.detectBrowserStrings.`Open BSD`
    - typingsJapgolly.detectBrowser.detectBrowserStrings.`Sun OS`
    - typingsJapgolly.detectBrowser.detectBrowserStrings.Linux
    - typingsJapgolly.detectBrowser.detectBrowserStrings.`Mac OS`
    - typingsJapgolly.detectBrowser.detectBrowserStrings.QNX
    - typingsJapgolly.detectBrowser.detectBrowserStrings.BeOS
    - typingsJapgolly.detectBrowser.detectBrowserStrings.OSSlash2
    - typingsJapgolly.detectBrowser.detectBrowserStrings.`Chrome OS`
  */
  trait OperatingSystem extends StObject
  object OperatingSystem {
    
    inline def `Amazon OS`: typingsJapgolly.detectBrowser.detectBrowserStrings.`Amazon OS` = ("Amazon OS").asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.`Amazon OS`]
    
    inline def `Android OS`: typingsJapgolly.detectBrowser.detectBrowserStrings.`Android OS` = ("Android OS").asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.`Android OS`]
    
    inline def BeOS: typingsJapgolly.detectBrowser.detectBrowserStrings.BeOS = "BeOS".asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.BeOS]
    
    inline def `BlackBerry OS`: typingsJapgolly.detectBrowser.detectBrowserStrings.`BlackBerry OS` = ("BlackBerry OS").asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.`BlackBerry OS`]
    
    inline def `Chrome OS`: typingsJapgolly.detectBrowser.detectBrowserStrings.`Chrome OS` = ("Chrome OS").asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.`Chrome OS`]
    
    inline def Linux: typingsJapgolly.detectBrowser.detectBrowserStrings.Linux = "Linux".asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.Linux]
    
    inline def `Mac OS`: typingsJapgolly.detectBrowser.detectBrowserStrings.`Mac OS` = ("Mac OS").asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.`Mac OS`]
    
    inline def OSSlash2: typingsJapgolly.detectBrowser.detectBrowserStrings.OSSlash2 = "OS/2".asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.OSSlash2]
    
    inline def `Open BSD`: typingsJapgolly.detectBrowser.detectBrowserStrings.`Open BSD` = ("Open BSD").asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.`Open BSD`]
    
    inline def QNX: typingsJapgolly.detectBrowser.detectBrowserStrings.QNX = "QNX".asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.QNX]
    
    inline def `Sun OS`: typingsJapgolly.detectBrowser.detectBrowserStrings.`Sun OS` = ("Sun OS").asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.`Sun OS`]
    
    inline def `Windows 10`: typingsJapgolly.detectBrowser.detectBrowserStrings.`Windows 10` = ("Windows 10").asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.`Windows 10`]
    
    inline def `Windows 2000`: typingsJapgolly.detectBrowser.detectBrowserStrings.`Windows 2000` = ("Windows 2000").asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.`Windows 2000`]
    
    inline def `Windows 3Dot11`: typingsJapgolly.detectBrowser.detectBrowserStrings.`Windows 3Dot11` = ("Windows 3.11").asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.`Windows 3Dot11`]
    
    inline def `Windows 7`: typingsJapgolly.detectBrowser.detectBrowserStrings.`Windows 7` = ("Windows 7").asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.`Windows 7`]
    
    inline def `Windows 8`: typingsJapgolly.detectBrowser.detectBrowserStrings.`Windows 8` = ("Windows 8").asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.`Windows 8`]
    
    inline def `Windows 8Dot1`: typingsJapgolly.detectBrowser.detectBrowserStrings.`Windows 8Dot1` = ("Windows 8.1").asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.`Windows 8Dot1`]
    
    inline def `Windows 95`: typingsJapgolly.detectBrowser.detectBrowserStrings.`Windows 95` = ("Windows 95").asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.`Windows 95`]
    
    inline def `Windows 98`: typingsJapgolly.detectBrowser.detectBrowserStrings.`Windows 98` = ("Windows 98").asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.`Windows 98`]
    
    inline def `Windows CE`: typingsJapgolly.detectBrowser.detectBrowserStrings.`Windows CE` = ("Windows CE").asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.`Windows CE`]
    
    inline def `Windows ME`: typingsJapgolly.detectBrowser.detectBrowserStrings.`Windows ME` = ("Windows ME").asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.`Windows ME`]
    
    inline def `Windows Mobile`: typingsJapgolly.detectBrowser.detectBrowserStrings.`Windows Mobile` = ("Windows Mobile").asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.`Windows Mobile`]
    
    inline def `Windows Server 2003`: typingsJapgolly.detectBrowser.detectBrowserStrings.`Windows Server 2003` = ("Windows Server 2003").asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.`Windows Server 2003`]
    
    inline def `Windows Vista`: typingsJapgolly.detectBrowser.detectBrowserStrings.`Windows Vista` = ("Windows Vista").asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.`Windows Vista`]
    
    inline def `Windows XP`: typingsJapgolly.detectBrowser.detectBrowserStrings.`Windows XP` = ("Windows XP").asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.`Windows XP`]
    
    inline def iOS: typingsJapgolly.detectBrowser.detectBrowserStrings.iOS = "iOS".asInstanceOf[typingsJapgolly.detectBrowser.detectBrowserStrings.iOS]
  }
}
