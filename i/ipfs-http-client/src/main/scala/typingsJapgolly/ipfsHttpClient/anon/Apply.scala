package typingsJapgolly.ipfsHttpClient.anon

import typingsJapgolly.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typingsJapgolly.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Apply extends StObject {
  
  @JSName("apply")
  def apply(profile: String): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.ProfilesApplyResult */ Any
  ] = js.native
  @JSName("apply")
  def apply(
    profile: String,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.ProfilesApplyOptions */ Any) & HTTPClientExtraOptions
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.ProfilesApplyResult */ Any
  ] = js.native
  
  def list(): js.Promise[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.Profile */ Any
    ]
  ] = js.native
  def list(options: AbortOptions & HTTPClientExtraOptions): js.Promise[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.Profile */ Any
    ]
  ] = js.native
}
