package typingsJapgolly.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.ethers.mod.ethers.providers.AnkrProvider
import typingsJapgolly.ethersprojectNetworks.libTypesMod.Network
import typingsJapgolly.ethersprojectWeb.mod.ConnectionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofAnkrProvider
  extends StObject
     with Instantiable0[AnkrProvider] {
  
  def getApiKey(apiKey: Any): Any = js.native
  
  def getUrl(network: Network, apiKey: Any): ConnectionInfo = js.native
}
