package typingsJapgolly.ipfsHttpClient

import typingsJapgolly.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typingsJapgolly.ipfsHttpClient.distSrcLibConfigureMod.Factory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcKeyRenameMod {
  
  @JSImport("ipfs-http-client/dist/src/key/rename", "createRename")
  @js.native
  val createRename: Factory[
    js.Function3[
      /* oldName */ String, 
      /* newName */ String, 
      /* options */ js.UndefOr[
        AbortOptions & typingsJapgolly.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
      ], 
      js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_key.RenameKeyResult */ Any
      ]
    ]
  ] = js.native
  
  type HTTPClientExtraOptions = typingsJapgolly.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
  
  type KeyAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_key.API<HTTPClientExtraOptions> */ Any
}
