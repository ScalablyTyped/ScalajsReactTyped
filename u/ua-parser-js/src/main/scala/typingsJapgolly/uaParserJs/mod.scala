package typingsJapgolly.uaParserJs

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Record
import typingsJapgolly.uaParserJs.anon.TypeofuaParserJs
import typingsJapgolly.uaParserJs.uaParserJsStrings.`type`
import typingsJapgolly.uaParserJs.uaParserJsStrings.architecture
import typingsJapgolly.uaParserJs.uaParserJsStrings.console
import typingsJapgolly.uaParserJs.uaParserJsStrings.embedded
import typingsJapgolly.uaParserJs.uaParserJsStrings.major
import typingsJapgolly.uaParserJs.uaParserJsStrings.mobile
import typingsJapgolly.uaParserJs.uaParserJsStrings.model
import typingsJapgolly.uaParserJs.uaParserJsStrings.name
import typingsJapgolly.uaParserJs.uaParserJsStrings.smarttv
import typingsJapgolly.uaParserJs.uaParserJsStrings.tablet
import typingsJapgolly.uaParserJs.uaParserJsStrings.vendor
import typingsJapgolly.uaParserJs.uaParserJsStrings.version
import typingsJapgolly.uaParserJs.uaParserJsStrings.wearable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): IResult = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[IResult]
  inline def apply(extensions: Record[String, Any]): IResult = ^.asInstanceOf[js.Dynamic].apply(extensions.asInstanceOf[js.Any]).asInstanceOf[IResult]
  inline def apply(uastring: String): IResult = ^.asInstanceOf[js.Dynamic].apply(uastring.asInstanceOf[js.Any]).asInstanceOf[IResult]
  inline def apply(uastring: String, extensions: Record[String, Any]): IResult = (^.asInstanceOf[js.Dynamic].apply(uastring.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any])).asInstanceOf[IResult]
  inline def apply(uastring: Unit, extensions: Record[String, Any]): IResult = (^.asInstanceOf[js.Dynamic].apply(uastring.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any])).asInstanceOf[IResult]
  
  @JSImport("ua-parser-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait BROWSER extends StObject {
    
    /**
      * @deprecated
      */
    var MAJOR: major
    
    var NAME: name
    
    var VERSION: version
  }
  object BROWSER {
    
    @JSImport("ua-parser-js", "BROWSER")
    @js.native
    val ^ : BROWSER = js.native
    
    extension [Self <: BROWSER](x: Self) {
      
      inline def setMAJOR(value: major): Self = StObject.set(x, "MAJOR", value.asInstanceOf[js.Any])
      
      inline def setNAME(value: name): Self = StObject.set(x, "NAME", value.asInstanceOf[js.Any])
      
      inline def setVERSION(value: version): Self = StObject.set(x, "VERSION", value.asInstanceOf[js.Any])
    }
  }
  
  trait CPU extends StObject {
    
    var ARCHITECTURE: architecture
  }
  object CPU {
    
    @JSImport("ua-parser-js", "CPU")
    @js.native
    val ^ : CPU = js.native
    
    extension [Self <: CPU](x: Self) {
      
      inline def setARCHITECTURE(value: architecture): Self = StObject.set(x, "ARCHITECTURE", value.asInstanceOf[js.Any])
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("ua-parser-js", JSImport.Namespace)
  @js.native
  /**
    * Create a new parser with UA prepopulated and extensions extended
    */
  open class Class ()
    extends StObject
       with UAParserInstance {
    def this(extensions: Record[String, Any]) = this()
    def this(uastring: String) = this()
    def this(uastring: String, extensions: Record[String, Any]) = this()
    def this(uastring: Unit, extensions: Record[String, Any]) = this()
    
    /**
      *  Returns browser information
      */
    /* CompleteClass */
    override def getBrowser(): IBrowser = js.native
    
    /**
      *  Returns parsed CPU information
      */
    /* CompleteClass */
    override def getCPU(): ICPU = js.native
    
    /**
      *  Returns device information
      */
    /* CompleteClass */
    override def getDevice(): IDevice = js.native
    
    /**
      *  Returns browsers engine information
      */
    /* CompleteClass */
    override def getEngine(): IEngine = js.native
    
    /**
      *  Returns OS information
      */
    /* CompleteClass */
    override def getOS(): IOS = js.native
    
    /**
      *  Returns parse result
      */
    /* CompleteClass */
    override def getResult(): IResult = js.native
    
    /**
      *  Returns UA string of current instance
      */
    /* CompleteClass */
    override def getUA(): String = js.native
    
    /**
      *  Set & parse UA string
      */
    /* CompleteClass */
    override def setUA(uastring: String): UAParserInstance = js.native
  }
  
  trait DEVICE extends StObject {
    
    var CONSOLE: console
    
    var EMBEDDED: embedded
    
    var MOBILE: mobile
    
    var MODEL: model
    
    var SMARTTV: smarttv
    
    var TABLET: tablet
    
    var TYPE: `type`
    
    var VENDOR: vendor
    
    var WEARABLE: wearable
  }
  object DEVICE {
    
    @JSImport("ua-parser-js", "DEVICE")
    @js.native
    val ^ : DEVICE = js.native
    
    extension [Self <: DEVICE](x: Self) {
      
      inline def setCONSOLE(value: console): Self = StObject.set(x, "CONSOLE", value.asInstanceOf[js.Any])
      
      inline def setEMBEDDED(value: embedded): Self = StObject.set(x, "EMBEDDED", value.asInstanceOf[js.Any])
      
      inline def setMOBILE(value: mobile): Self = StObject.set(x, "MOBILE", value.asInstanceOf[js.Any])
      
      inline def setMODEL(value: model): Self = StObject.set(x, "MODEL", value.asInstanceOf[js.Any])
      
      inline def setSMARTTV(value: smarttv): Self = StObject.set(x, "SMARTTV", value.asInstanceOf[js.Any])
      
      inline def setTABLET(value: tablet): Self = StObject.set(x, "TABLET", value.asInstanceOf[js.Any])
      
      inline def setTYPE(value: `type`): Self = StObject.set(x, "TYPE", value.asInstanceOf[js.Any])
      
      inline def setVENDOR(value: vendor): Self = StObject.set(x, "VENDOR", value.asInstanceOf[js.Any])
      
      inline def setWEARABLE(value: wearable): Self = StObject.set(x, "WEARABLE", value.asInstanceOf[js.Any])
    }
  }
  
  trait ENGINE extends StObject {
    
    var NAME: name
    
    var VERSION: version
  }
  object ENGINE {
    
    @JSImport("ua-parser-js", "ENGINE")
    @js.native
    val ^ : ENGINE = js.native
    
    extension [Self <: ENGINE](x: Self) {
      
      inline def setNAME(value: name): Self = StObject.set(x, "NAME", value.asInstanceOf[js.Any])
      
      inline def setVERSION(value: version): Self = StObject.set(x, "VERSION", value.asInstanceOf[js.Any])
    }
  }
  
  trait OS extends StObject {
    
    var NAME: name
    
    var VERSION: version
  }
  object OS {
    
    @JSImport("ua-parser-js", "OS")
    @js.native
    val ^ : OS = js.native
    
    extension [Self <: OS](x: Self) {
      
      inline def setNAME(value: name): Self = StObject.set(x, "NAME", value.asInstanceOf[js.Any])
      
      inline def setVERSION(value: version): Self = StObject.set(x, "VERSION", value.asInstanceOf[js.Any])
    }
  }
  
  // alias for older syntax
  @JSImport("ua-parser-js", "UAParser")
  @js.native
  def UAParser: TypeofuaParserJs = js.native
  type UAParser = UAParserInstance
  inline def UAParser_=(x: TypeofuaParserJs): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UAParser")(x.asInstanceOf[js.Any])
  
  @JSImport("ua-parser-js", "VERSION")
  @js.native
  def VERSION: String = js.native
  inline def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  
  // tslint:disable:interface-name backward compatible exclusion
  trait IBrowser extends StObject {
    
    /**
      * Determined dynamically
      * @deprecated
      */
    var major: js.UndefOr[String] = js.undefined
    
    /**
      * Possible values :
      * Amaya, Android Browser, Arora, Avant, Baidu, Blazer, Bolt, Camino, Chimera, Chrome,
      * Chromium, Comodo Dragon, Conkeror, Dillo, Dolphin, Doris, Edge, Epiphany, Fennec,
      * Firebird, Firefox, Flock, GoBrowser, iCab, ICE Browser, IceApe, IceCat, IceDragon,
      * Iceweasel, IE [Mobile], Iron, Jasmine, K-Meleon, Konqueror, Kindle, Links,
      * Lunascape, Lynx, Maemo, Maxthon, Midori, Minimo, MIUI Browser, [Mobile] Safari,
      * Mosaic, Mozilla, Netfront, Netscape, NetSurf, Nokia, OmniWeb, Opera [Mini/Mobi/Tablet],
      * Phoenix, Polaris, QQBrowser, RockMelt, Silk, Skyfire, SeaMonkey, SlimBrowser, Swiftfox,
      * Tizen, UCBrowser, Vivaldi, w3m, Yandex
      *
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Determined dynamically
      */
    var version: js.UndefOr[String] = js.undefined
  }
  object IBrowser {
    
    inline def apply(): IBrowser = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBrowser]
    }
    
    extension [Self <: IBrowser](x: Self) {
      
      inline def setMajor(value: String): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
      
      inline def setMajorUndefined: Self = StObject.set(x, "major", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait ICPU extends StObject {
    
    /**
      * Possible architecture:
      *  68k, amd64, arm, arm64, avr, ia32, ia64, irix, irix64, mips, mips64, pa-risc,
      *  ppc, sparc, sparc64
      */
    var architecture: js.UndefOr[String] = js.undefined
  }
  object ICPU {
    
    inline def apply(): ICPU = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICPU]
    }
    
    extension [Self <: ICPU](x: Self) {
      
      inline def setArchitecture(value: String): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
      
      inline def setArchitectureUndefined: Self = StObject.set(x, "architecture", js.undefined)
    }
  }
  
  trait IDevice extends StObject {
    
    /**
      * Determined dynamically
      */
    var model: js.UndefOr[String] = js.undefined
    
    /**
      * Possible type:
      * console, mobile, tablet, smarttv, wearable, embedded
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /**
      * Possible vendor:
      * Acer, Alcatel, Amazon, Apple, Archos, Asus, BenQ, BlackBerry, Dell, GeeksPhone,
      * Google, HP, HTC, Huawei, Jolla, Lenovo, LG, Meizu, Microsoft, Motorola, Nexian,
      * Nintendo, Nokia, Nvidia, Ouya, Palm, Panasonic, Polytron, RIM, Samsung, Sharp,
      * Siemens, Sony-Ericsson, Sprint, Xbox, ZTE
      */
    var vendor: js.UndefOr[String] = js.undefined
  }
  object IDevice {
    
    inline def apply(): IDevice = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDevice]
    }
    
    extension [Self <: IDevice](x: Self) {
      
      inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
      
      inline def setVendorUndefined: Self = StObject.set(x, "vendor", js.undefined)
    }
  }
  
  trait IEngine extends StObject {
    
    /**
      * Possible name:
      * Amaya, EdgeHTML, Gecko, iCab, KHTML, Links, Lynx, NetFront, NetSurf, Presto,
      * Tasman, Trident, w3m, WebKit
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Determined dynamically
      */
    var version: js.UndefOr[String] = js.undefined
  }
  object IEngine {
    
    inline def apply(): IEngine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEngine]
    }
    
    extension [Self <: IEngine](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait IOS extends StObject {
    
    /**
      * Possible 'os.name'
      * AIX, Amiga OS, Android, Arch, Bada, BeOS, BlackBerry, CentOS, Chromium OS, Contiki,
      * Fedora, Firefox OS, FreeBSD, Debian, DragonFly, Gentoo, GNU, Haiku, Hurd, iOS,
      * Joli, Linpus, Linux, Mac OS, Mageia, Mandriva, MeeGo, Minix, Mint, Morph OS, NetBSD,
      * Nintendo, OpenBSD, OpenVMS, OS/2, Palm, PCLinuxOS, Plan9, Playstation, QNX, RedHat,
      * RIM Tablet OS, RISC OS, Sailfish, Series40, Slackware, Solaris, SUSE, Symbian, Tizen,
      * Ubuntu, UNIX, VectorLinux, WebOS, Windows [Phone/Mobile], Zenwalk
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Determined dynamically
      */
    var version: js.UndefOr[String] = js.undefined
  }
  object IOS {
    
    inline def apply(): IOS = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOS]
    }
    
    extension [Self <: IOS](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait IResult extends StObject {
    
    var browser: IBrowser
    
    var cpu: ICPU
    
    var device: IDevice
    
    var engine: IEngine
    
    var os: IOS
    
    var ua: String
  }
  object IResult {
    
    inline def apply(browser: IBrowser, cpu: ICPU, device: IDevice, engine: IEngine, os: IOS, ua: String): IResult = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], cpu = cpu.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], ua = ua.asInstanceOf[js.Any])
      __obj.asInstanceOf[IResult]
    }
    
    extension [Self <: IResult](x: Self) {
      
      inline def setBrowser(value: IBrowser): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setCpu(value: ICPU): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
      
      inline def setDevice(value: IDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setEngine(value: IEngine): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      inline def setOs(value: IOS): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      inline def setUa(value: String): Self = StObject.set(x, "ua", value.asInstanceOf[js.Any])
    }
  }
  
  trait UAParserInstance extends StObject {
    
    /**
      *  Returns browser information
      */
    def getBrowser(): IBrowser
    
    /**
      *  Returns parsed CPU information
      */
    def getCPU(): ICPU
    
    /**
      *  Returns device information
      */
    def getDevice(): IDevice
    
    /**
      *  Returns browsers engine information
      */
    def getEngine(): IEngine
    
    /**
      *  Returns OS information
      */
    def getOS(): IOS
    
    /**
      *  Returns parse result
      */
    def getResult(): IResult
    
    /**
      *  Returns UA string of current instance
      */
    def getUA(): String
    
    /**
      *  Set & parse UA string
      */
    def setUA(uastring: String): UAParserInstance
  }
  object UAParserInstance {
    
    inline def apply(
      getBrowser: CallbackTo[IBrowser],
      getCPU: CallbackTo[ICPU],
      getDevice: CallbackTo[IDevice],
      getEngine: CallbackTo[IEngine],
      getOS: CallbackTo[IOS],
      getResult: CallbackTo[IResult],
      getUA: CallbackTo[String],
      setUA: String => UAParserInstance
    ): UAParserInstance = {
      val __obj = js.Dynamic.literal(getBrowser = getBrowser.toJsFn, getCPU = getCPU.toJsFn, getDevice = getDevice.toJsFn, getEngine = getEngine.toJsFn, getOS = getOS.toJsFn, getResult = getResult.toJsFn, getUA = getUA.toJsFn, setUA = js.Any.fromFunction1(setUA))
      __obj.asInstanceOf[UAParserInstance]
    }
    
    extension [Self <: UAParserInstance](x: Self) {
      
      inline def setGetBrowser(value: CallbackTo[IBrowser]): Self = StObject.set(x, "getBrowser", value.toJsFn)
      
      inline def setGetCPU(value: CallbackTo[ICPU]): Self = StObject.set(x, "getCPU", value.toJsFn)
      
      inline def setGetDevice(value: CallbackTo[IDevice]): Self = StObject.set(x, "getDevice", value.toJsFn)
      
      inline def setGetEngine(value: CallbackTo[IEngine]): Self = StObject.set(x, "getEngine", value.toJsFn)
      
      inline def setGetOS(value: CallbackTo[IOS]): Self = StObject.set(x, "getOS", value.toJsFn)
      
      inline def setGetResult(value: CallbackTo[IResult]): Self = StObject.set(x, "getResult", value.toJsFn)
      
      inline def setGetUA(value: CallbackTo[String]): Self = StObject.set(x, "getUA", value.toJsFn)
      
      inline def setSetUA(value: String => UAParserInstance): Self = StObject.set(x, "setUA", js.Any.fromFunction1(value))
    }
  }
}
