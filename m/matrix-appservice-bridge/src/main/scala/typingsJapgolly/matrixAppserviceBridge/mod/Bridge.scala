package typingsJapgolly.matrixAppserviceBridge.mod

import typingsJapgolly.matrixAppserviceBridge.libBridgeMod.BridgeOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "Bridge")
@js.native
open class Bridge protected ()
  extends typingsJapgolly.matrixAppserviceBridge.libBridgeMod.Bridge {
  /**
    * @param opts Options to pass to the bridge
    * @param opts.roomUpgradeOpts Options to supply to
    * the room upgrade handler. If not defined then upgrades are NOT handled by the bridge.
    */
  def this(opts: BridgeOpts) = this()
}
