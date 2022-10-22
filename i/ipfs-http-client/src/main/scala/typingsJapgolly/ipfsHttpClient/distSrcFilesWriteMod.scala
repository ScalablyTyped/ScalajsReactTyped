package typingsJapgolly.ipfsHttpClient

import org.scalajs.dom.Blob
import typingsJapgolly.ipfsHttpClient.distSrcLibConfigureMod.Factory
import typingsJapgolly.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFilesWriteMod {
  
  @JSImport("ipfs-http-client/dist/src/files/write", "createWrite")
  @js.native
  val createWrite: Factory[
    js.Function3[
      /* path */ String, 
      /* input */ String | Blob | js.typedarray.Uint8Array | js.Iterable[js.typedarray.Uint8Array] | AsyncIterable[js.typedarray.Uint8Array], 
      /* options */ js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_files.WriteOptions */ Any) & typingsJapgolly.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
      ], 
      js.Promise[Unit]
    ]
  ] = js.native
  
  type FilesAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_files.API<HTTPClientExtraOptions> */ Any
  
  type HTTPClientExtraOptions = typingsJapgolly.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
}
