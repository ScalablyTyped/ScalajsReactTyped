package typingsJapgolly.puppeteerCore

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.puppeteerCore.anon.UpdatedSelector
import typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonPuppeteerMod.ConnectOptions
import typingsJapgolly.puppeteerCore.libCjsPuppeteerTypesMod.Browser
import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonDeviceMod.Device
import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonErrorsMod.PuppeteerErrors
import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonNetworkManagerMod.NetworkConditions
import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonPuppeteerMod.CommonPuppeteerSettings
import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonQueryHandlerMod.CustomQueryHandler
import typingsJapgolly.puppeteerCore.libEsmPuppeteerNodeBrowserFetcherMod.BrowserFetcherOptions
import typingsJapgolly.puppeteerCore.libEsmPuppeteerNodePuppeteerNodeMod.PuppeteerNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmPuppeteerPuppeteerCoreMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @public
    */
  @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", JSImport.Default)
  @js.native
  val default: PuppeteerNode = js.native
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "BrowserFetcher")
  @js.native
  /**
    * Constructs a browser fetcher for the given options.
    */
  open class BrowserFetcher ()
    extends typingsJapgolly.puppeteerCore.libEsmPuppeteerNodeBrowserFetcherMod.BrowserFetcher {
    def this(options: BrowserFetcherOptions) = this()
  }
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "CustomError")
  @js.native
  /**
    * @internal
    */
  open class CustomError ()
    extends typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonErrorsMod.CustomError {
    def this(message: String) = this()
  }
  
  /* Inlined std.Readonly<std.Record<'Blackberry PlayBook' | 'Blackberry PlayBook landscape' | 'BlackBerry Z30' | 'BlackBerry Z30 landscape' | 'Galaxy Note 3' | 'Galaxy Note 3 landscape' | 'Galaxy Note II' | 'Galaxy Note II landscape' | 'Galaxy S III' | 'Galaxy S III landscape' | 'Galaxy S5' | 'Galaxy S5 landscape' | 'Galaxy S8' | 'Galaxy S8 landscape' | 'Galaxy S9+' | 'Galaxy S9+ landscape' | 'Galaxy Tab S4' | 'Galaxy Tab S4 landscape' | 'iPad' | 'iPad landscape' | 'iPad (gen 6)' | 'iPad (gen 6) landscape' | 'iPad (gen 7)' | 'iPad (gen 7) landscape' | 'iPad Mini' | 'iPad Mini landscape' | 'iPad Pro' | 'iPad Pro landscape' | 'iPad Pro 11' | 'iPad Pro 11 landscape' | 'iPhone 4' | 'iPhone 4 landscape' | 'iPhone 5' | 'iPhone 5 landscape' | 'iPhone 6' | 'iPhone 6 landscape' | 'iPhone 6 Plus' | 'iPhone 6 Plus landscape' | 'iPhone 7' | 'iPhone 7 landscape' | 'iPhone 7 Plus' | 'iPhone 7 Plus landscape' | 'iPhone 8' | 'iPhone 8 landscape' | 'iPhone 8 Plus' | 'iPhone 8 Plus landscape' | 'iPhone SE' | 'iPhone SE landscape' | 'iPhone X' | 'iPhone X landscape' | 'iPhone XR' | 'iPhone XR landscape' | 'iPhone 11' | 'iPhone 11 landscape' | 'iPhone 11 Pro' | 'iPhone 11 Pro landscape' | 'iPhone 11 Pro Max' | 'iPhone 11 Pro Max landscape' | 'iPhone 12' | 'iPhone 12 landscape' | 'iPhone 12 Pro' | 'iPhone 12 Pro landscape' | 'iPhone 12 Pro Max' | 'iPhone 12 Pro Max landscape' | 'iPhone 12 Mini' | 'iPhone 12 Mini landscape' | 'iPhone 13' | 'iPhone 13 landscape' | 'iPhone 13 Pro' | 'iPhone 13 Pro landscape' | 'iPhone 13 Pro Max' | 'iPhone 13 Pro Max landscape' | 'iPhone 13 Mini' | 'iPhone 13 Mini landscape' | 'JioPhone 2' | 'JioPhone 2 landscape' | 'Kindle Fire HDX' | 'Kindle Fire HDX landscape' | 'LG Optimus L70' | 'LG Optimus L70 landscape' | 'Microsoft Lumia 550' | 'Microsoft Lumia 950' | 'Microsoft Lumia 950 landscape' | 'Nexus 10' | 'Nexus 10 landscape' | 'Nexus 4' | 'Nexus 4 landscape' | 'Nexus 5' | 'Nexus 5 landscape' | 'Nexus 5X' | 'Nexus 5X landscape' | 'Nexus 6' | 'Nexus 6 landscape' | 'Nexus 6P' | 'Nexus 6P landscape' | 'Nexus 7' | 'Nexus 7 landscape' | 'Nokia Lumia 520' | 'Nokia Lumia 520 landscape' | 'Nokia N9' | 'Nokia N9 landscape' | 'Pixel 2' | 'Pixel 2 landscape' | 'Pixel 2 XL' | 'Pixel 2 XL landscape' | 'Pixel 3' | 'Pixel 3 landscape' | 'Pixel 4' | 'Pixel 4 landscape' | 'Pixel 4a (5G)' | 'Pixel 4a (5G) landscape' | 'Pixel 5' | 'Pixel 5 landscape' | 'Moto G4' | 'Moto G4 landscape', puppeteer-core.puppeteer-core/lib/esm/puppeteer/common/Device.Device>> */
  object KnownDevices {
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.BlackBerry Z30")
    @js.native
    val BlackBerryZ30: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.BlackBerry Z30 landscape")
    @js.native
    val BlackBerryZ30Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Blackberry PlayBook")
    @js.native
    val BlackberryPlayBook: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Blackberry PlayBook landscape")
    @js.native
    val BlackberryPlayBookLandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Galaxy Note 3")
    @js.native
    val GalaxyNote3: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Galaxy Note 3 landscape")
    @js.native
    val GalaxyNote3Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Galaxy Note II")
    @js.native
    val GalaxyNoteII: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Galaxy Note II landscape")
    @js.native
    val GalaxyNoteIILandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Galaxy S5")
    @js.native
    val GalaxyS5: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Galaxy S5 landscape")
    @js.native
    val GalaxyS5Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Galaxy S8")
    @js.native
    val GalaxyS8: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Galaxy S8 landscape")
    @js.native
    val GalaxyS8Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Galaxy S9+")
    @js.native
    val GalaxyS9: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Galaxy S9+ landscape")
    @js.native
    val GalaxyS9Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Galaxy S III")
    @js.native
    val GalaxySIII: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Galaxy S III landscape")
    @js.native
    val GalaxySIIILandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Galaxy Tab S4")
    @js.native
    val GalaxyTabS4: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Galaxy Tab S4 landscape")
    @js.native
    val GalaxyTabS4Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.JioPhone 2")
    @js.native
    val JioPhone2: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.JioPhone 2 landscape")
    @js.native
    val JioPhone2Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Kindle Fire HDX")
    @js.native
    val KindleFireHDX: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Kindle Fire HDX landscape")
    @js.native
    val KindleFireHDXLandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.LG Optimus L70")
    @js.native
    val LGOptimusL70: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.LG Optimus L70 landscape")
    @js.native
    val LGOptimusL70Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Microsoft Lumia 550")
    @js.native
    val MicrosoftLumia550: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Microsoft Lumia 950")
    @js.native
    val MicrosoftLumia950: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Microsoft Lumia 950 landscape")
    @js.native
    val MicrosoftLumia950Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Moto G4")
    @js.native
    val MotoG4: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Moto G4 landscape")
    @js.native
    val MotoG4Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Nexus 10")
    @js.native
    val Nexus10: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Nexus 10 landscape")
    @js.native
    val Nexus10Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Nexus 4")
    @js.native
    val Nexus4: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Nexus 4 landscape")
    @js.native
    val Nexus4Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Nexus 5")
    @js.native
    val Nexus5: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Nexus 5 landscape")
    @js.native
    val Nexus5Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Nexus 5X")
    @js.native
    val Nexus5X: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Nexus 5X landscape")
    @js.native
    val Nexus5XLandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Nexus 6")
    @js.native
    val Nexus6: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Nexus 6 landscape")
    @js.native
    val Nexus6Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Nexus 6P")
    @js.native
    val Nexus6P: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Nexus 6P landscape")
    @js.native
    val Nexus6PLandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Nexus 7")
    @js.native
    val Nexus7: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Nexus 7 landscape")
    @js.native
    val Nexus7Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Nokia Lumia 520")
    @js.native
    val NokiaLumia520: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Nokia Lumia 520 landscape")
    @js.native
    val NokiaLumia520Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Nokia N9")
    @js.native
    val NokiaN9: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Nokia N9 landscape")
    @js.native
    val NokiaN9Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Pixel 2")
    @js.native
    val Pixel2: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Pixel 2 landscape")
    @js.native
    val Pixel2Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Pixel 2 XL")
    @js.native
    val Pixel2XL: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Pixel 2 XL landscape")
    @js.native
    val Pixel2XLLandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Pixel 3")
    @js.native
    val Pixel3: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Pixel 3 landscape")
    @js.native
    val Pixel3Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Pixel 4")
    @js.native
    val Pixel4: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Pixel 4 landscape")
    @js.native
    val Pixel4Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Pixel 4a (5G)")
    @js.native
    val Pixel4a5G: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Pixel 4a (5G) landscape")
    @js.native
    val Pixel4a5GLandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Pixel 5")
    @js.native
    val Pixel5: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.Pixel 5 landscape")
    @js.native
    val Pixel5Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPad")
    @js.native
    val iPad: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPad landscape")
    @js.native
    val iPadLandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPad Mini")
    @js.native
    val iPadMini: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPad Mini landscape")
    @js.native
    val iPadMiniLandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPad Pro")
    @js.native
    val iPadPro: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPad Pro 11")
    @js.native
    val iPadPro11: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPad Pro 11 landscape")
    @js.native
    val iPadPro11Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPad Pro landscape")
    @js.native
    val iPadProLandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPad (gen 6)")
    @js.native
    val iPadgen6: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPad (gen 6) landscape")
    @js.native
    val iPadgen6Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPad (gen 7)")
    @js.native
    val iPadgen7: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPad (gen 7) landscape")
    @js.native
    val iPadgen7Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPhone 11")
    @js.native
    val iPhone11: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPhone 11 landscape")
    @js.native
    val iPhone11Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPhone 11 Pro")
    @js.native
    val iPhone11Pro: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPhone 11 Pro landscape")
    @js.native
    val iPhone11ProLandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPhone 11 Pro Max")
    @js.native
    val iPhone11ProMax: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPhone 11 Pro Max landscape")
    @js.native
    val iPhone11ProMaxLandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPhone 12")
    @js.native
    val iPhone12: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPhone 12 landscape")
    @js.native
    val iPhone12Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPhone 12 Mini")
    @js.native
    val iPhone12Mini: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPhone 12 Mini landscape")
    @js.native
    val iPhone12MiniLandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPhone 12 Pro")
    @js.native
    val iPhone12Pro: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPhone 12 Pro landscape")
    @js.native
    val iPhone12ProLandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPhone 12 Pro Max")
    @js.native
    val iPhone12ProMax: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPhone 12 Pro Max landscape")
    @js.native
    val iPhone12ProMaxLandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPhone 13")
    @js.native
    val iPhone13: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPhone 13 landscape")
    @js.native
    val iPhone13Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPhone 13 Mini")
    @js.native
    val iPhone13Mini: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPhone 13 Mini landscape")
    @js.native
    val iPhone13MiniLandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPhone 13 Pro")
    @js.native
    val iPhone13Pro: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPhone 13 Pro landscape")
    @js.native
    val iPhone13ProLandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPhone 13 Pro Max")
    @js.native
    val iPhone13ProMax: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPhone 13 Pro Max landscape")
    @js.native
    val iPhone13ProMaxLandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPhone 4")
    @js.native
    val iPhone4: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPhone 4 landscape")
    @js.native
    val iPhone4Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPhone 5")
    @js.native
    val iPhone5: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPhone 5 landscape")
    @js.native
    val iPhone5Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPhone 6")
    @js.native
    val iPhone6: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPhone 6 landscape")
    @js.native
    val iPhone6Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPhone 6 Plus")
    @js.native
    val iPhone6Plus: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPhone 6 Plus landscape")
    @js.native
    val iPhone6PlusLandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPhone 7")
    @js.native
    val iPhone7: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPhone 7 landscape")
    @js.native
    val iPhone7Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPhone 7 Plus")
    @js.native
    val iPhone7Plus: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPhone 7 Plus landscape")
    @js.native
    val iPhone7PlusLandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPhone 8")
    @js.native
    val iPhone8: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPhone 8 landscape")
    @js.native
    val iPhone8Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPhone 8 Plus")
    @js.native
    val iPhone8Plus: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPhone 8 Plus landscape")
    @js.native
    val iPhone8PlusLandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPhone SE")
    @js.native
    val iPhoneSE: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPhone SE landscape")
    @js.native
    val iPhoneSELandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPhone X")
    @js.native
    val iPhoneX: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPhone X landscape")
    @js.native
    val iPhoneXLandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPhone XR")
    @js.native
    val iPhoneXR: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "KnownDevices.iPhone XR landscape")
    @js.native
    val iPhoneXRLandscape: Device = js.native
  }
  
  /* Inlined std.Readonly<{  Slow 3G :puppeteer-core.puppeteer-core/lib/esm/puppeteer/common/NetworkManager.NetworkConditions,   Fast 3G :puppeteer-core.puppeteer-core/lib/esm/puppeteer/common/NetworkManager.NetworkConditions}> */
  object PredefinedNetworkConditions {
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "PredefinedNetworkConditions.Fast 3G")
    @js.native
    val Fast3G: NetworkConditions = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "PredefinedNetworkConditions.Slow 3G")
    @js.native
    val Slow3G: NetworkConditions = js.native
  }
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "ProtocolError")
  @js.native
  /**
    * @internal
    */
  open class ProtocolError ()
    extends typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonErrorsMod.ProtocolError {
    def this(message: String) = this()
  }
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "Puppeteer")
  @js.native
  open class Puppeteer protected ()
    extends typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonPuppeteerMod.Puppeteer {
    /**
      * @internal
      */
    def this(settings: CommonPuppeteerSettings) = this()
  }
  /* static members */
  object Puppeteer {
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "Puppeteer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Unregisters all custom query handlers.
      */
    inline def clearCustomQueryHandlers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCustomQueryHandlers")().asInstanceOf[Unit]
    
    /**
      * Gets the names of all custom query handlers.
      */
    inline def customQueryHandlerNames(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("customQueryHandlerNames")().asInstanceOf[js.Array[String]]
    
    /**
      * Registers a {@link CustomQueryHandler | custom query handler}.
      *
      * @remarks
      * After registration, the handler can be used everywhere where a selector is
      * expected by prepending the selection string with `<name>/`. The name is only
      * allowed to consist of lower- and upper case latin letters.
      *
      * @example
      *
      * ```
      * puppeteer.registerCustomQueryHandler('text', { … });
      * const aHandle = await page.$('text/…');
      * ```
      *
      * @param name - The name that the custom query handler will be registered
      * under.
      * @param queryHandler - The {@link CustomQueryHandler | custom query handler}
      * to register.
      *
      * @public
      */
    inline def registerCustomQueryHandler(name: String, queryHandler: CustomQueryHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCustomQueryHandler")(name.asInstanceOf[js.Any], queryHandler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Unregisters a custom query handler for a given name.
      */
    inline def unregisterCustomQueryHandler(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterCustomQueryHandler")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "TimeoutError")
  @js.native
  /**
    * @internal
    */
  open class TimeoutError ()
    extends typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonErrorsMod.TimeoutError {
    def this(message: String) = this()
  }
  
  inline def clearCustomQueryHandlers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCustomQueryHandlers")().asInstanceOf[Unit]
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(createBrowserFetcher, defaultArgs, executablePath, launch) */ inline def connect(options: ConnectOptions): js.Promise[Browser] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Browser]]
  
  inline def customQueryHandlerNames(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("customQueryHandlerNames")().asInstanceOf[js.Array[String]]
  
  /* Inlined std.Readonly<std.Record<'Blackberry PlayBook' | 'Blackberry PlayBook landscape' | 'BlackBerry Z30' | 'BlackBerry Z30 landscape' | 'Galaxy Note 3' | 'Galaxy Note 3 landscape' | 'Galaxy Note II' | 'Galaxy Note II landscape' | 'Galaxy S III' | 'Galaxy S III landscape' | 'Galaxy S5' | 'Galaxy S5 landscape' | 'Galaxy S8' | 'Galaxy S8 landscape' | 'Galaxy S9+' | 'Galaxy S9+ landscape' | 'Galaxy Tab S4' | 'Galaxy Tab S4 landscape' | 'iPad' | 'iPad landscape' | 'iPad (gen 6)' | 'iPad (gen 6) landscape' | 'iPad (gen 7)' | 'iPad (gen 7) landscape' | 'iPad Mini' | 'iPad Mini landscape' | 'iPad Pro' | 'iPad Pro landscape' | 'iPad Pro 11' | 'iPad Pro 11 landscape' | 'iPhone 4' | 'iPhone 4 landscape' | 'iPhone 5' | 'iPhone 5 landscape' | 'iPhone 6' | 'iPhone 6 landscape' | 'iPhone 6 Plus' | 'iPhone 6 Plus landscape' | 'iPhone 7' | 'iPhone 7 landscape' | 'iPhone 7 Plus' | 'iPhone 7 Plus landscape' | 'iPhone 8' | 'iPhone 8 landscape' | 'iPhone 8 Plus' | 'iPhone 8 Plus landscape' | 'iPhone SE' | 'iPhone SE landscape' | 'iPhone X' | 'iPhone X landscape' | 'iPhone XR' | 'iPhone XR landscape' | 'iPhone 11' | 'iPhone 11 landscape' | 'iPhone 11 Pro' | 'iPhone 11 Pro landscape' | 'iPhone 11 Pro Max' | 'iPhone 11 Pro Max landscape' | 'iPhone 12' | 'iPhone 12 landscape' | 'iPhone 12 Pro' | 'iPhone 12 Pro landscape' | 'iPhone 12 Pro Max' | 'iPhone 12 Pro Max landscape' | 'iPhone 12 Mini' | 'iPhone 12 Mini landscape' | 'iPhone 13' | 'iPhone 13 landscape' | 'iPhone 13 Pro' | 'iPhone 13 Pro landscape' | 'iPhone 13 Pro Max' | 'iPhone 13 Pro Max landscape' | 'iPhone 13 Mini' | 'iPhone 13 Mini landscape' | 'JioPhone 2' | 'JioPhone 2 landscape' | 'Kindle Fire HDX' | 'Kindle Fire HDX landscape' | 'LG Optimus L70' | 'LG Optimus L70 landscape' | 'Microsoft Lumia 550' | 'Microsoft Lumia 950' | 'Microsoft Lumia 950 landscape' | 'Nexus 10' | 'Nexus 10 landscape' | 'Nexus 4' | 'Nexus 4 landscape' | 'Nexus 5' | 'Nexus 5 landscape' | 'Nexus 5X' | 'Nexus 5X landscape' | 'Nexus 6' | 'Nexus 6 landscape' | 'Nexus 6P' | 'Nexus 6P landscape' | 'Nexus 7' | 'Nexus 7 landscape' | 'Nokia Lumia 520' | 'Nokia Lumia 520 landscape' | 'Nokia N9' | 'Nokia N9 landscape' | 'Pixel 2' | 'Pixel 2 landscape' | 'Pixel 2 XL' | 'Pixel 2 XL landscape' | 'Pixel 3' | 'Pixel 3 landscape' | 'Pixel 4' | 'Pixel 4 landscape' | 'Pixel 4a (5G)' | 'Pixel 4a (5G) landscape' | 'Pixel 5' | 'Pixel 5 landscape' | 'Moto G4' | 'Moto G4 landscape', puppeteer-core.puppeteer-core/lib/esm/puppeteer/common/Device.Device>> */
  object devices {
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.BlackBerry Z30")
    @js.native
    val BlackBerryZ30: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.BlackBerry Z30 landscape")
    @js.native
    val BlackBerryZ30Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Blackberry PlayBook")
    @js.native
    val BlackberryPlayBook: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Blackberry PlayBook landscape")
    @js.native
    val BlackberryPlayBookLandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Galaxy Note 3")
    @js.native
    val GalaxyNote3: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Galaxy Note 3 landscape")
    @js.native
    val GalaxyNote3Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Galaxy Note II")
    @js.native
    val GalaxyNoteII: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Galaxy Note II landscape")
    @js.native
    val GalaxyNoteIILandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Galaxy S5")
    @js.native
    val GalaxyS5: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Galaxy S5 landscape")
    @js.native
    val GalaxyS5Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Galaxy S8")
    @js.native
    val GalaxyS8: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Galaxy S8 landscape")
    @js.native
    val GalaxyS8Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Galaxy S9+")
    @js.native
    val GalaxyS9: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Galaxy S9+ landscape")
    @js.native
    val GalaxyS9Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Galaxy S III")
    @js.native
    val GalaxySIII: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Galaxy S III landscape")
    @js.native
    val GalaxySIIILandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Galaxy Tab S4")
    @js.native
    val GalaxyTabS4: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Galaxy Tab S4 landscape")
    @js.native
    val GalaxyTabS4Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.JioPhone 2")
    @js.native
    val JioPhone2: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.JioPhone 2 landscape")
    @js.native
    val JioPhone2Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Kindle Fire HDX")
    @js.native
    val KindleFireHDX: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Kindle Fire HDX landscape")
    @js.native
    val KindleFireHDXLandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.LG Optimus L70")
    @js.native
    val LGOptimusL70: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.LG Optimus L70 landscape")
    @js.native
    val LGOptimusL70Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Microsoft Lumia 550")
    @js.native
    val MicrosoftLumia550: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Microsoft Lumia 950")
    @js.native
    val MicrosoftLumia950: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Microsoft Lumia 950 landscape")
    @js.native
    val MicrosoftLumia950Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Moto G4")
    @js.native
    val MotoG4: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Moto G4 landscape")
    @js.native
    val MotoG4Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Nexus 10")
    @js.native
    val Nexus10: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Nexus 10 landscape")
    @js.native
    val Nexus10Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Nexus 4")
    @js.native
    val Nexus4: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Nexus 4 landscape")
    @js.native
    val Nexus4Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Nexus 5")
    @js.native
    val Nexus5: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Nexus 5 landscape")
    @js.native
    val Nexus5Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Nexus 5X")
    @js.native
    val Nexus5X: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Nexus 5X landscape")
    @js.native
    val Nexus5XLandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Nexus 6")
    @js.native
    val Nexus6: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Nexus 6 landscape")
    @js.native
    val Nexus6Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Nexus 6P")
    @js.native
    val Nexus6P: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Nexus 6P landscape")
    @js.native
    val Nexus6PLandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Nexus 7")
    @js.native
    val Nexus7: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Nexus 7 landscape")
    @js.native
    val Nexus7Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Nokia Lumia 520")
    @js.native
    val NokiaLumia520: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Nokia Lumia 520 landscape")
    @js.native
    val NokiaLumia520Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Nokia N9")
    @js.native
    val NokiaN9: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Nokia N9 landscape")
    @js.native
    val NokiaN9Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Pixel 2")
    @js.native
    val Pixel2: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Pixel 2 landscape")
    @js.native
    val Pixel2Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Pixel 2 XL")
    @js.native
    val Pixel2XL: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Pixel 2 XL landscape")
    @js.native
    val Pixel2XLLandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Pixel 3")
    @js.native
    val Pixel3: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Pixel 3 landscape")
    @js.native
    val Pixel3Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Pixel 4")
    @js.native
    val Pixel4: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Pixel 4 landscape")
    @js.native
    val Pixel4Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Pixel 4a (5G)")
    @js.native
    val Pixel4a5G: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Pixel 4a (5G) landscape")
    @js.native
    val Pixel4a5GLandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Pixel 5")
    @js.native
    val Pixel5: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.Pixel 5 landscape")
    @js.native
    val Pixel5Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPad")
    @js.native
    val iPad: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPad landscape")
    @js.native
    val iPadLandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPad Mini")
    @js.native
    val iPadMini: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPad Mini landscape")
    @js.native
    val iPadMiniLandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPad Pro")
    @js.native
    val iPadPro: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPad Pro 11")
    @js.native
    val iPadPro11: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPad Pro 11 landscape")
    @js.native
    val iPadPro11Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPad Pro landscape")
    @js.native
    val iPadProLandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPad (gen 6)")
    @js.native
    val iPadgen6: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPad (gen 6) landscape")
    @js.native
    val iPadgen6Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPad (gen 7)")
    @js.native
    val iPadgen7: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPad (gen 7) landscape")
    @js.native
    val iPadgen7Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPhone 11")
    @js.native
    val iPhone11: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPhone 11 landscape")
    @js.native
    val iPhone11Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPhone 11 Pro")
    @js.native
    val iPhone11Pro: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPhone 11 Pro landscape")
    @js.native
    val iPhone11ProLandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPhone 11 Pro Max")
    @js.native
    val iPhone11ProMax: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPhone 11 Pro Max landscape")
    @js.native
    val iPhone11ProMaxLandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPhone 12")
    @js.native
    val iPhone12: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPhone 12 landscape")
    @js.native
    val iPhone12Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPhone 12 Mini")
    @js.native
    val iPhone12Mini: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPhone 12 Mini landscape")
    @js.native
    val iPhone12MiniLandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPhone 12 Pro")
    @js.native
    val iPhone12Pro: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPhone 12 Pro landscape")
    @js.native
    val iPhone12ProLandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPhone 12 Pro Max")
    @js.native
    val iPhone12ProMax: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPhone 12 Pro Max landscape")
    @js.native
    val iPhone12ProMaxLandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPhone 13")
    @js.native
    val iPhone13: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPhone 13 landscape")
    @js.native
    val iPhone13Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPhone 13 Mini")
    @js.native
    val iPhone13Mini: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPhone 13 Mini landscape")
    @js.native
    val iPhone13MiniLandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPhone 13 Pro")
    @js.native
    val iPhone13Pro: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPhone 13 Pro landscape")
    @js.native
    val iPhone13ProLandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPhone 13 Pro Max")
    @js.native
    val iPhone13ProMax: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPhone 13 Pro Max landscape")
    @js.native
    val iPhone13ProMaxLandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPhone 4")
    @js.native
    val iPhone4: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPhone 4 landscape")
    @js.native
    val iPhone4Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPhone 5")
    @js.native
    val iPhone5: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPhone 5 landscape")
    @js.native
    val iPhone5Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPhone 6")
    @js.native
    val iPhone6: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPhone 6 landscape")
    @js.native
    val iPhone6Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPhone 6 Plus")
    @js.native
    val iPhone6Plus: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPhone 6 Plus landscape")
    @js.native
    val iPhone6PlusLandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPhone 7")
    @js.native
    val iPhone7: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPhone 7 landscape")
    @js.native
    val iPhone7Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPhone 7 Plus")
    @js.native
    val iPhone7Plus: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPhone 7 Plus landscape")
    @js.native
    val iPhone7PlusLandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPhone 8")
    @js.native
    val iPhone8: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPhone 8 landscape")
    @js.native
    val iPhone8Landscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPhone 8 Plus")
    @js.native
    val iPhone8Plus: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPhone 8 Plus landscape")
    @js.native
    val iPhone8PlusLandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPhone SE")
    @js.native
    val iPhoneSE: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPhone SE landscape")
    @js.native
    val iPhoneSELandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPhone X")
    @js.native
    val iPhoneX: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPhone X landscape")
    @js.native
    val iPhoneXLandscape: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPhone XR")
    @js.native
    val iPhoneXR: Device = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "devices.iPhone XR landscape")
    @js.native
    val iPhoneXRLandscape: Device = js.native
  }
  
  object errors extends Shortcut {
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "errors")
    @js.native
    val ^ : PuppeteerErrors = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "errors.ProtocolError")
    @js.native
    open class ProtocolErrorCls ()
      extends typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonErrorsMod.ProtocolError
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "errors.TimeoutError")
    @js.native
    open class TimeoutErrorCls ()
      extends typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonErrorsMod.TimeoutError
    
    type _To = PuppeteerErrors
    
    /* This means you don't have to write `^`, but can instead just say `errors.foo` */
    override def _to: PuppeteerErrors = ^
  }
  
  inline def getQueryHandlerAndSelector(selector: String): UpdatedSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("getQueryHandlerAndSelector")(selector.asInstanceOf[js.Any]).asInstanceOf[UpdatedSelector]
  
  /* Inlined std.Readonly<{  Slow 3G :puppeteer-core.puppeteer-core/lib/esm/puppeteer/common/NetworkManager.NetworkConditions,   Fast 3G :puppeteer-core.puppeteer-core/lib/esm/puppeteer/common/NetworkManager.NetworkConditions}> */
  object networkConditions {
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "networkConditions.Fast 3G")
    @js.native
    val Fast3G: NetworkConditions = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/puppeteer-core", "networkConditions.Slow 3G")
    @js.native
    val Slow3G: NetworkConditions = js.native
  }
  
  inline def registerCustomQueryHandler(name: String, handler: CustomQueryHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCustomQueryHandler")(name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unregisterCustomQueryHandler(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterCustomQueryHandler")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
