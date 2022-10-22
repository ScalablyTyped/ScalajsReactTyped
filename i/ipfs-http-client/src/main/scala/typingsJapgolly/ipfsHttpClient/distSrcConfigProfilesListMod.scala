package typingsJapgolly.ipfsHttpClient

import typingsJapgolly.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typingsJapgolly.ipfsHttpClient.distSrcLibConfigureMod.Factory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcConfigProfilesListMod {
  
  @JSImport("ipfs-http-client/dist/src/config/profiles/list", "createList")
  @js.native
  val createList: Factory[
    js.Function1[
      /* options */ js.UndefOr[
        AbortOptions & typingsJapgolly.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
      ], 
      js.Promise[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_profiles.Profile */ Any
        ]
      ]
    ]
  ] = js.native
  
  type ConfigProfilesAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_profiles.API<HTTPClientExtraOptions> */ Any
  
  type HTTPClientExtraOptions = typingsJapgolly.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
}
