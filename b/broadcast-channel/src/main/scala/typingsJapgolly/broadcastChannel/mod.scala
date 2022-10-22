package typingsJapgolly.broadcastChannel

import typingsJapgolly.broadcastChannel.broadcastChannelBooleans.`false`
import typingsJapgolly.broadcastChannel.typesBroadcastChannelMod.BroadcastChannelOptions
import typingsJapgolly.broadcastChannel.typesLeaderElectionMod.CreateFunction
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("broadcast-channel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("broadcast-channel", "BroadcastChannel")
  @js.native
  open class BroadcastChannel[T] protected ()
    extends typingsJapgolly.broadcastChannel.typesBroadcastChannelMod.BroadcastChannel[T] {
    def this(name: String) = this()
    def this(name: String, opts: BroadcastChannelOptions) = this()
  }
  
  @JSImport("broadcast-channel", "LeaderElector")
  @js.native
  open class LeaderElector ()
    extends typingsJapgolly.broadcastChannel.typesLeaderElectionMod.LeaderElector
  
  @JSImport("broadcast-channel", "OPEN_BROADCAST_CHANNELS")
  @js.native
  val OPEN_BROADCAST_CHANNELS: Set[typingsJapgolly.broadcastChannel.typesBroadcastChannelMod.BroadcastChannel[Any]] = js.native
  
  inline def clearNodeFolder(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("clearNodeFolder")().asInstanceOf[js.Promise[Boolean]]
  inline def clearNodeFolder(opts: BroadcastChannelOptions): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("clearNodeFolder")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  @JSImport("broadcast-channel", "createLeaderElection")
  @js.native
  val createLeaderElection: CreateFunction = js.native
  
  inline def enforceOptions(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enforceOptions")().asInstanceOf[Unit]
  inline def enforceOptions(opts: BroadcastChannelOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enforceOptions")(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def enforceOptions_false(opts: `false`): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enforceOptions")(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
