package typingsJapgolly.ipfsHttpClient

import typingsJapgolly.ipfsHttpClient.distSrcLibConfigureMod.Factory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFilesMkdirMod {
  
  @JSImport("ipfs-http-client/dist/src/files/mkdir", "createMkdir")
  @js.native
  val createMkdir: Factory[
    js.Function2[
      /* path */ String, 
      /* options */ js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_files.MkdirOptions */ Any) & typingsJapgolly.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
      ], 
      js.Promise[Unit]
    ]
  ] = js.native
  
  type FilesAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_files.API<HTTPClientExtraOptions> */ Any
  
  type HTTPClientExtraOptions = typingsJapgolly.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
}
