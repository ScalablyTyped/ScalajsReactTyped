package typingsJapgolly.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.ipfsCli.distSrcTypesMod.Context
import typingsJapgolly.ipfsCli.ipfsCliStrings.all
import typingsJapgolly.ipfsCli.ipfsCliStrings.direct
import typingsJapgolly.ipfsCli.ipfsCliStrings.indirect
import typingsJapgolly.ipfsCli.ipfsCliStrings.recursive
import typingsJapgolly.yargs.mod.CommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCommandsPinLsMod extends Shortcut {
  
  /**
    * @typedef {object} Argv
    * @property {import('../../types').Context} Argv.ctx
    * @property {string[]} Argv.ipfsPath
    * @property {'direct' | 'indirect' | 'recursive' | 'all'} Argv.type
    * @property {boolean} Argv.quiet
    * @property {string} Argv.cidBase
    * @property {number} Argv.timeout
    */
  /** @type {import('yargs').CommandModule<Argv, Argv>} */
  @JSImport("ipfs-cli/dist/src/commands/pin/ls", JSImport.Default)
  @js.native
  val default: CommandModule[Argv, Argv] = js.native
  
  trait Argv extends StObject {
    
    var cidBase: String
    
    var ctx: Context
    
    var ipfsPath: js.Array[String]
    
    var quiet: Boolean
    
    var timeout: Double
    
    var `type`: direct | indirect | recursive | all
  }
  object Argv {
    
    inline def apply(
      cidBase: String,
      ctx: Context,
      ipfsPath: js.Array[String],
      quiet: Boolean,
      timeout: Double,
      `type`: direct | indirect | recursive | all
    ): Argv = {
      val __obj = js.Dynamic.literal(cidBase = cidBase.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], ipfsPath = ipfsPath.asInstanceOf[js.Any], quiet = quiet.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argv]
    }
    
    extension [Self <: Argv](x: Self) {
      
      inline def setCidBase(value: String): Self = StObject.set(x, "cidBase", value.asInstanceOf[js.Any])
      
      inline def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setIpfsPath(value: js.Array[String]): Self = StObject.set(x, "ipfsPath", value.asInstanceOf[js.Any])
      
      inline def setIpfsPathVarargs(value: String*): Self = StObject.set(x, "ipfsPath", js.Array(value*))
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setType(value: direct | indirect | recursive | all): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = CommandModule[Argv, Argv]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcCommandsPinLsMod.foo` */
  override def _to: CommandModule[Argv, Argv] = default
}
