package typingsJapgolly.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.ipfsCli.distSrcTypesMod.Context
import typingsJapgolly.multiformatsMultiaddr.mod.Multiaddr_
import typingsJapgolly.yargs.mod.CommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCommandsBootstrapRmMod extends Shortcut {
  
  /**
    * @typedef {object} Argv
    * @property {import('../../types').Context} Argv.ctx
    * @property {import('@multiformats/multiaddr').Multiaddr} Argv.peer
    * @property {boolean} Argv.all
    * @property {number} Argv.timeout
    */
  /** @type {import('yargs').CommandModule<Argv, Argv>} */
  @JSImport("ipfs-cli/dist/src/commands/bootstrap/rm", JSImport.Default)
  @js.native
  val default: CommandModule[Argv, Argv] = js.native
  
  trait Argv extends StObject {
    
    var all: Boolean
    
    var ctx: Context
    
    var peer: Multiaddr_
    
    var timeout: Double
  }
  object Argv {
    
    inline def apply(all: Boolean, ctx: Context, peer: Multiaddr_, timeout: Double): Argv = {
      val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], peer = peer.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argv]
    }
    
    extension [Self <: Argv](x: Self) {
      
      inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setPeer(value: Multiaddr_): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = CommandModule[Argv, Argv]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcCommandsBootstrapRmMod.foo` */
  override def _to: CommandModule[Argv, Argv] = default
}
