package typingsJapgolly.storybookCoreServer

import typingsJapgolly.storybookCoreServer.anon.Https
import typingsJapgolly.storybookCoreServer.anon.NetworkAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9UtilsServerAddressMod {
  
  @JSImport("@storybook/core-server/dist/ts3.9/utils/server-address", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getServerAddresses(port: Double, host: String, proto: String): NetworkAddress = (^.asInstanceOf[js.Dynamic].applyDynamic("getServerAddresses")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], proto.asInstanceOf[js.Any])).asInstanceOf[NetworkAddress]
  
  inline def getServerChannelUrl(port: Double, hasHttps: Https): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getServerChannelUrl")(port.asInstanceOf[js.Any], hasHttps.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getServerPort(port: Double): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getServerPort")(port.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
}
