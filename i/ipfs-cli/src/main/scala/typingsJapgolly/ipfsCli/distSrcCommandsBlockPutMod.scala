package typingsJapgolly.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.ipfsCli.distSrcTypesMod.Context
import typingsJapgolly.yargs.mod.CommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCommandsBlockPutMod extends Shortcut {
  
  /**
    * @typedef {object} Argv
    * @property {import('../../types').Context} Argv.ctx
    * @property {string} Argv.block
    * @property {string} Argv.format
    * @property {string} Argv.mhtype
    * @property {number} Argv.mhlen
    * @property {import('multiformats/cid').CIDVersion} Argv.version
    * @property {boolean} Argv.pin
    * @property {string} Argv.cidBase
    * @property {number} Argv.timeout
    */
  /** @type {import('yargs').CommandModule<Argv, Argv>} */
  @JSImport("ipfs-cli/dist/src/commands/block/put", JSImport.Default)
  @js.native
  val default: CommandModule[Argv, Argv] = js.native
  
  trait Argv extends StObject {
    
    var block: String
    
    var cidBase: String
    
    var ctx: Context
    
    var format: String
    
    var mhlen: Double
    
    var mhtype: String
    
    var pin: Boolean
    
    var timeout: Double
    
    var version: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_cid.CIDVersion */ Any
  }
  object Argv {
    
    inline def apply(
      block: String,
      cidBase: String,
      ctx: Context,
      format: String,
      mhlen: Double,
      mhtype: String,
      pin: Boolean,
      timeout: Double,
      version: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_cid.CIDVersion */ Any
    ): Argv = {
      val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], cidBase = cidBase.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], mhlen = mhlen.asInstanceOf[js.Any], mhtype = mhtype.asInstanceOf[js.Any], pin = pin.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argv]
    }
    
    extension [Self <: Argv](x: Self) {
      
      inline def setBlock(value: String): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setCidBase(value: String): Self = StObject.set(x, "cidBase", value.asInstanceOf[js.Any])
      
      inline def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setMhlen(value: Double): Self = StObject.set(x, "mhlen", value.asInstanceOf[js.Any])
      
      inline def setMhtype(value: String): Self = StObject.set(x, "mhtype", value.asInstanceOf[js.Any])
      
      inline def setPin(value: Boolean): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setVersion(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_cid.CIDVersion */ Any
      ): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = CommandModule[Argv, Argv]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcCommandsBlockPutMod.foo` */
  override def _to: CommandModule[Argv, Argv] = default
}
