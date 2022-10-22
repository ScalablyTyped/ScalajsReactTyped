package typingsJapgolly.ipfsHttpClient.anon

import typingsJapgolly.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typingsJapgolly.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ls extends StObject {
  
  def add(
    name: String,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.Credentials */ Any) & AbortOptions & HTTPClientExtraOptions
  ): js.Promise[Unit] = js.native
  
  def ls(): js.Promise[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.RemotePinServiceWithStat */ Any
    ]
  ] = js.native
  def ls(options: js.Object): js.Promise[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.RemotePinServiceWithStat */ Any
    ]
  ] = js.native
  
  def rm(name: String): js.Promise[Unit] = js.native
  def rm(name: String, options: AbortOptions & HTTPClientExtraOptions): js.Promise[Unit] = js.native
}
