package typingsJapgolly.rifatMiio

import typingsJapgolly.rifatMiio.deviceMod.MiioDevice
import typingsJapgolly.rifatMiio.deviceMod.MiioDeviceOptions
import typingsJapgolly.rifatMiio.discoveryMod.BasicDiscovery
import typingsJapgolly.rifatMiio.discoveryMod.BasicDiscoveryOptions
import typingsJapgolly.rifatMiio.discoveryMod.TimedDiscovery
import typingsJapgolly.rifatMiio.discoveryMod.TimedDiscoveryOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rifat/miio", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def browse(options: TimedDiscoveryOptions): TimedDiscovery = ^.asInstanceOf[js.Dynamic].applyDynamic("browse")(options.asInstanceOf[js.Any]).asInstanceOf[TimedDiscovery]
  
  inline def device(options: MiioDeviceOptions): js.Promise[MiioDevice] = ^.asInstanceOf[js.Dynamic].applyDynamic("device")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MiioDevice]]
  
  inline def devices(options: BasicDiscoveryOptions): BasicDiscovery = ^.asInstanceOf[js.Dynamic].applyDynamic("devices")(options.asInstanceOf[js.Any]).asInstanceOf[BasicDiscovery]
}
