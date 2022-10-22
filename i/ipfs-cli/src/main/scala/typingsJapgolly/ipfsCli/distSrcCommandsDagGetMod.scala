package typingsJapgolly.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.ipfsCli.distSrcTypesMod.Context
import typingsJapgolly.ipfsCli.ipfsCliStrings.`dag-cbor`
import typingsJapgolly.ipfsCli.ipfsCliStrings.`dag-json`
import typingsJapgolly.ipfsCli.ipfsCliStrings.`dag-pb`
import typingsJapgolly.ipfsCli.ipfsCliStrings.base16
import typingsJapgolly.ipfsCli.ipfsCliStrings.base58btc
import typingsJapgolly.ipfsCli.ipfsCliStrings.base64
import typingsJapgolly.ipfsCli.ipfsCliStrings.raw
import typingsJapgolly.yargs.mod.CommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCommandsDagGetMod extends Shortcut {
  
  /**
    * @typedef {object} Argv
    * @property {import('../../types').Context} Argv.ctx
    * @property {string} Argv.cidpath
    * @property {'dag-json' | 'dag-cbor' | 'dag-pb' | 'raw'} Argv.outputCodec
    * @property {'base16' | 'base64' | 'base58btc'} Argv.dataEnc
    * @property {boolean} Argv.localResolve
    * @property {number} Argv.timeout
    */
  /** @type {import('yargs').CommandModule<Argv, Argv>} */
  @JSImport("ipfs-cli/dist/src/commands/dag/get", JSImport.Default)
  @js.native
  val default: CommandModule[Argv, Argv] = js.native
  
  trait Argv extends StObject {
    
    var cidpath: String
    
    var ctx: Context
    
    var dataEnc: base16 | base64 | base58btc
    
    var localResolve: Boolean
    
    var outputCodec: `dag-json` | `dag-cbor` | `dag-pb` | raw
    
    var timeout: Double
  }
  object Argv {
    
    inline def apply(
      cidpath: String,
      ctx: Context,
      dataEnc: base16 | base64 | base58btc,
      localResolve: Boolean,
      outputCodec: `dag-json` | `dag-cbor` | `dag-pb` | raw,
      timeout: Double
    ): Argv = {
      val __obj = js.Dynamic.literal(cidpath = cidpath.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], dataEnc = dataEnc.asInstanceOf[js.Any], localResolve = localResolve.asInstanceOf[js.Any], outputCodec = outputCodec.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argv]
    }
    
    extension [Self <: Argv](x: Self) {
      
      inline def setCidpath(value: String): Self = StObject.set(x, "cidpath", value.asInstanceOf[js.Any])
      
      inline def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setDataEnc(value: base16 | base64 | base58btc): Self = StObject.set(x, "dataEnc", value.asInstanceOf[js.Any])
      
      inline def setLocalResolve(value: Boolean): Self = StObject.set(x, "localResolve", value.asInstanceOf[js.Any])
      
      inline def setOutputCodec(value: `dag-json` | `dag-cbor` | `dag-pb` | raw): Self = StObject.set(x, "outputCodec", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  type BlockCodec[T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.BlockCodec<number, T> */ Any
  
  type _To = CommandModule[Argv, Argv]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcCommandsDagGetMod.foo` */
  override def _to: CommandModule[Argv, Argv] = default
}
