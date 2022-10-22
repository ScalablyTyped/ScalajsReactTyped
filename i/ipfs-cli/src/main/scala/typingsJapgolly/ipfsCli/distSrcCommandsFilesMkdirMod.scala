package typingsJapgolly.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.ipfsCli.distSrcTypesMod.Context
import typingsJapgolly.yargs.mod.CommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCommandsFilesMkdirMod extends Shortcut {
  
  /**
    * @typedef {object} Argv
    * @property {import('../../types').Context} Argv.ctx
    * @property {string} Argv.path
    * @property {boolean} Argv.parents
    * @property {import('multiformats/cid').CIDVersion} Argv.cidVersion
    * @property {string} Argv.hashAlg
    * @property {boolean} Argv.flush
    * @property {number} Argv.shardSplitThreshold
    * @property {number} Argv.mode
    * @property {number} Argv.mtime
    * @property {number} Argv.mtimeNsecs
    * @property {number} Argv.timeout
    */
  /** @type {import('yargs').CommandModule<Argv, Argv>} */
  @JSImport("ipfs-cli/dist/src/commands/files/mkdir", JSImport.Default)
  @js.native
  val default: CommandModule[Argv, Argv] = js.native
  
  trait Argv extends StObject {
    
    var cidVersion: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_cid.CIDVersion */ Any
    
    var ctx: Context
    
    var flush: Boolean
    
    var hashAlg: String
    
    var mode: Double
    
    var mtime: Double
    
    var mtimeNsecs: Double
    
    var parents: Boolean
    
    var path: String
    
    var shardSplitThreshold: Double
    
    var timeout: Double
  }
  object Argv {
    
    inline def apply(
      cidVersion: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_cid.CIDVersion */ Any,
      ctx: Context,
      flush: Boolean,
      hashAlg: String,
      mode: Double,
      mtime: Double,
      mtimeNsecs: Double,
      parents: Boolean,
      path: String,
      shardSplitThreshold: Double,
      timeout: Double
    ): Argv = {
      val __obj = js.Dynamic.literal(cidVersion = cidVersion.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], flush = flush.asInstanceOf[js.Any], hashAlg = hashAlg.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], mtimeNsecs = mtimeNsecs.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], shardSplitThreshold = shardSplitThreshold.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argv]
    }
    
    extension [Self <: Argv](x: Self) {
      
      inline def setCidVersion(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_cid.CIDVersion */ Any
      ): Self = StObject.set(x, "cidVersion", value.asInstanceOf[js.Any])
      
      inline def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setFlush(value: Boolean): Self = StObject.set(x, "flush", value.asInstanceOf[js.Any])
      
      inline def setHashAlg(value: String): Self = StObject.set(x, "hashAlg", value.asInstanceOf[js.Any])
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setMtime(value: Double): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeNsecs(value: Double): Self = StObject.set(x, "mtimeNsecs", value.asInstanceOf[js.Any])
      
      inline def setParents(value: Boolean): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setShardSplitThreshold(value: Double): Self = StObject.set(x, "shardSplitThreshold", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = CommandModule[Argv, Argv]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcCommandsFilesMkdirMod.foo` */
  override def _to: CommandModule[Argv, Argv] = default
}
