package typingsJapgolly.ipfsHttpClient

import typingsJapgolly.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typingsJapgolly.ipfsHttpClient.distSrcLibCoreMod.Client
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPinRemoteServiceAddMod {
  
  @JSImport("ipfs-http-client/dist/src/pin/remote/service/add", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createAdd(client: Client): js.Function2[
    /* name */ String, 
    /* options */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_service.Credentials */ Any) & AbortOptions & typingsJapgolly.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions, 
    js.Promise[Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAdd")(client.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* name */ String, 
    /* options */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_service.Credentials */ Any) & AbortOptions & typingsJapgolly.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions, 
    js.Promise[Unit]
  ]]
  
  type HTTPClientExtraOptions = typingsJapgolly.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
  
  type RemotePiningServiceAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_service.API<HTTPClientExtraOptions> */ Any
}
