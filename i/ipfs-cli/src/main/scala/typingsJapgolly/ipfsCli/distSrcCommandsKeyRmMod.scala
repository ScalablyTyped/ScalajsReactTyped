package typingsJapgolly.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.ipfsCli.distSrcTypesMod.Context
import typingsJapgolly.yargs.mod.CommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCommandsKeyRmMod extends Shortcut {
  
  /**
    * @typedef {object} Argv
    * @property {import('../../types').Context} Argv.ctx
    * @property {string} Argv.name
    * @property {number} Argv.timeout
    */
  /** @type {import('yargs').CommandModule<Argv, Argv>} */
  @JSImport("ipfs-cli/dist/src/commands/key/rm", JSImport.Default)
  @js.native
  val default: CommandModule[Argv, Argv] = js.native
  
  trait Argv extends StObject {
    
    var ctx: Context
    
    var name: String
    
    var timeout: Double
  }
  object Argv {
    
    inline def apply(ctx: Context, name: String, timeout: Double): Argv = {
      val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argv]
    }
    
    extension [Self <: Argv](x: Self) {
      
      inline def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = CommandModule[Argv, Argv]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcCommandsKeyRmMod.foo` */
  override def _to: CommandModule[Argv, Argv] = default
}
