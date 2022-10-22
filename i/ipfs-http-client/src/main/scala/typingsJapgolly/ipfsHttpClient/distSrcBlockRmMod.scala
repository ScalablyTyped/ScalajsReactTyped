package typingsJapgolly.ipfsHttpClient

import typingsJapgolly.ipfsHttpClient.distSrcLibConfigureMod.Factory
import typingsJapgolly.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcBlockRmMod {
  
  @JSImport("ipfs-http-client/dist/src/block/rm", "createRm")
  @js.native
  val createRm: Factory[
    js.Function2[
      /* cid */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any) | (js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
      ]), 
      /* options */ js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_block.RmOptions */ Any) & typingsJapgolly.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
      ], 
      AsyncIterable[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_block.RmResult */ Any
      ]
    ]
  ] = js.native
  
  type BlockAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_block.API<HTTPClientExtraOptions> */ Any
  
  type HTTPClientExtraOptions = typingsJapgolly.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
  
  type RmResult = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_block.RmResult */ Any
}
