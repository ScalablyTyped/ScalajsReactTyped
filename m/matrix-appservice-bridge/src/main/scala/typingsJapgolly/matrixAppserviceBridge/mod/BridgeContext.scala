package typingsJapgolly.matrixAppserviceBridge.mod

import typingsJapgolly.matrixAppserviceBridge.anon.Room
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "BridgeContext")
@js.native
open class BridgeContext protected ()
  extends typingsJapgolly.matrixAppserviceBridge.libComponentsBridgeContextMod.BridgeContext {
  /**
    * @param ctx Event related data
    * @param ctx.sender Matrix user ID of the sender.
    * @param ctx.target Matrix user ID of the target.
    * @param ctx.room Matrix room ID.
    */
  def this(ctx: Room) = this()
}
