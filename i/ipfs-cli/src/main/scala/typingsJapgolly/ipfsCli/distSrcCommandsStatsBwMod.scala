package typingsJapgolly.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.ipfsCli.distSrcTypesMod.Context
import typingsJapgolly.libp2pInterfacePeerId.mod.PeerId
import typingsJapgolly.yargs.mod.CommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCommandsStatsBwMod extends Shortcut {
  
  /**
    * @typedef {object} Argv
    * @property {import('../../types').Context} Argv.ctx
    * @property {import('@libp2p/interface-peer-id').PeerId} Argv.peer
    * @property {string} Argv.proto
    * @property {boolean} Argv.poll
    * @property {number} Argv.interval
    * @property {number} Argv.timeout
    */
  /** @type {import('yargs').CommandModule<Argv, Argv>} */
  @JSImport("ipfs-cli/dist/src/commands/stats/bw", JSImport.Default)
  @js.native
  val default: CommandModule[Argv, Argv] = js.native
  
  trait Argv extends StObject {
    
    var ctx: Context
    
    var interval: Double
    
    var peer: PeerId
    
    var poll: Boolean
    
    var proto: String
    
    var timeout: Double
  }
  object Argv {
    
    inline def apply(ctx: Context, interval: Double, peer: PeerId, poll: Boolean, proto: String, timeout: Double): Argv = {
      val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], peer = peer.asInstanceOf[js.Any], poll = poll.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argv]
    }
    
    extension [Self <: Argv](x: Self) {
      
      inline def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setPeer(value: PeerId): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
      
      inline def setPoll(value: Boolean): Self = StObject.set(x, "poll", value.asInstanceOf[js.Any])
      
      inline def setProto(value: String): Self = StObject.set(x, "proto", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = CommandModule[Argv, Argv]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcCommandsStatsBwMod.foo` */
  override def _to: CommandModule[Argv, Argv] = default
}
