package typingsJapgolly.ipfsHttpClient

import typingsJapgolly.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typingsJapgolly.ipfsHttpClient.distSrcLibCoreMod.Client
import typingsJapgolly.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPinRemoteLsMod {
  
  @JSImport("ipfs-http-client/dist/src/pin/remote/ls", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createLs(client: Client): js.Function1[
    /* hasTimeoutSignalHeadersQuery */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_remote.Query */ Any) & AbortOptions & typingsJapgolly.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions, 
    AsyncIterable[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_remote.Pin */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLs")(client.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* hasTimeoutSignalHeadersQuery */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_remote.Query */ Any) & AbortOptions & typingsJapgolly.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions, 
    AsyncIterable[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_remote.Pin */ Any
    ]
  ]]
  
  type HTTPClientExtraOptions = typingsJapgolly.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
  
  type RemotePiningAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_remote.API<HTTPClientExtraOptions> */ Any
}
