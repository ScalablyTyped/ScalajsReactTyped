package typingsJapgolly.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.ethers.mod.ethers.providers.BaseProvider
import typingsJapgolly.ethersprojectNetworks.libTypesMod.Network
import typingsJapgolly.ethersprojectNetworks.libTypesMod.Networkish
import typingsJapgolly.ethersprojectProviders.libFormatterMod.Formatter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofBaseProvider
  extends StObject
     with Instantiable1[/* network */ Networkish, BaseProvider] {
  
  def getFormatter(): Formatter = js.native
  
  def getNetwork(network: Networkish): Network = js.native
}
