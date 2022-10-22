package typingsJapgolly.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.ipfsCli.distSrcTypesMod.Context
import typingsJapgolly.ipfsCli.ipfsCliStrings.base64
import typingsJapgolly.ipfsCli.ipfsCliStrings.hex
import typingsJapgolly.ipfsCli.ipfsCliStrings.text
import typingsJapgolly.multiformats.cidMod.CID
import typingsJapgolly.multiformats.distTypesSrcLinkInterfaceMod.Version
import typingsJapgolly.yargs.mod.CommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCommandsObjectGetMod extends Shortcut {
  
  /**
    * @typedef {object} Argv
    * @property {import('../../types').Context} Argv.ctx
    * @property {import('multiformats/cid').CID} Argv.key
    * @property {'base64' | 'text' | 'hex'} Argv.dataEncoding
    * @property {string} Argv.cidBase
    * @property {number} Argv.timeout
    */
  /** @type {import('yargs').CommandModule<Argv, Argv>} */
  @JSImport("ipfs-cli/dist/src/commands/object/get", JSImport.Default)
  @js.native
  val default: CommandModule[Argv, Argv] = js.native
  
  trait Argv extends StObject {
    
    var cidBase: String
    
    var ctx: Context
    
    var dataEncoding: base64 | text | hex
    
    var key: CID[Any, Double, Double, Version]
    
    var timeout: Double
  }
  object Argv {
    
    inline def apply(
      cidBase: String,
      ctx: Context,
      dataEncoding: base64 | text | hex,
      key: CID[Any, Double, Double, Version],
      timeout: Double
    ): Argv = {
      val __obj = js.Dynamic.literal(cidBase = cidBase.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], dataEncoding = dataEncoding.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argv]
    }
    
    extension [Self <: Argv](x: Self) {
      
      inline def setCidBase(value: String): Self = StObject.set(x, "cidBase", value.asInstanceOf[js.Any])
      
      inline def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setDataEncoding(value: base64 | text | hex): Self = StObject.set(x, "dataEncoding", value.asInstanceOf[js.Any])
      
      inline def setKey(value: CID[Any, Double, Double, Version]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = CommandModule[Argv, Argv]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcCommandsObjectGetMod.foo` */
  override def _to: CommandModule[Argv, Argv] = default
}
