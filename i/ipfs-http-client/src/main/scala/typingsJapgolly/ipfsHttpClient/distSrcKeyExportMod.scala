package typingsJapgolly.ipfsHttpClient

import typingsJapgolly.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typingsJapgolly.ipfsHttpClient.distSrcLibConfigureMod.Factory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcKeyExportMod {
  
  @JSImport("ipfs-http-client/dist/src/key/export", "createExport")
  @js.native
  val createExport: Factory[
    js.Function3[
      /* name */ String, 
      /* password */ String, 
      /* options */ js.UndefOr[
        AbortOptions & typingsJapgolly.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
      ], 
      js.Promise[String]
    ]
  ] = js.native
  
  type HTTPClientExtraOptions = typingsJapgolly.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
  
  type KeyAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_key.API<HTTPClientExtraOptions> */ Any
}
