package typingsJapgolly.web3Core.mod

import typingsJapgolly.node.netMod.Server
import typingsJapgolly.web3CoreHelpers.mod.IpcProviderBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("web3-core", "IpcProvider")
@js.native
open class IpcProvider protected ()
  extends IpcProviderBase
     with _provider {
  def this(path: String, net: Server) = this()
}
