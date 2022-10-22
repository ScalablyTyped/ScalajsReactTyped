package typingsJapgolly.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.ipfsCli.distSrcTypesMod.Context
import typingsJapgolly.yargs.mod.CommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCommandsPubsubSubMod extends Shortcut {
  
  /**
    * @typedef {import('@libp2p/interface-pubsub').Message} Message
    */
  /**
    * @typedef {object} Argv
    * @property {import('../../types').Context} Argv.ctx
    * @property {string} Argv.topic
    * @property {number} Argv.timeout
    */
  /** @type {import('yargs').CommandModule<Argv, Argv>} */
  @JSImport("ipfs-cli/dist/src/commands/pubsub/sub", JSImport.Default)
  @js.native
  val default: CommandModule[Argv, Argv] = js.native
  
  trait Argv extends StObject {
    
    var ctx: Context
    
    var timeout: Double
    
    var topic: String
  }
  object Argv {
    
    inline def apply(ctx: Context, timeout: Double, topic: String): Argv = {
      val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argv]
    }
    
    extension [Self <: Argv](x: Self) {
      
      inline def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    }
  }
  
  type Message = typingsJapgolly.libp2pInterfacePubsub.mod.Message
  
  type _To = CommandModule[Argv, Argv]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcCommandsPubsubSubMod.foo` */
  override def _to: CommandModule[Argv, Argv] = default
}
