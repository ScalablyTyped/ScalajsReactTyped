package typingsJapgolly.ipfsHttpClient

import typingsJapgolly.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typingsJapgolly.ipfsHttpClient.distSrcLibCoreMod.Client
import typingsJapgolly.multiformats.cidMod.CID
import typingsJapgolly.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPinRemoteAddMod {
  
  @JSImport("ipfs-http-client/dist/src/pin/remote/add", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createAdd(client: Client): js.Function2[
    /* cid */ CID[Any, Double, Double, Version], 
    /* hasTimeoutSignalHeadersQuery */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_remote.AddOptions */ Any) & AbortOptions & typingsJapgolly.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions, 
    js.Promise[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_remote.Pin */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAdd")(client.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* cid */ CID[Any, Double, Double, Version], 
    /* hasTimeoutSignalHeadersQuery */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_remote.AddOptions */ Any) & AbortOptions & typingsJapgolly.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions, 
    js.Promise[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_remote.Pin */ Any
    ]
  ]]
  
  type HTTPClientExtraOptions = typingsJapgolly.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
  
  type RemotePiningAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_remote.API<HTTPClientExtraOptions> */ Any
}
