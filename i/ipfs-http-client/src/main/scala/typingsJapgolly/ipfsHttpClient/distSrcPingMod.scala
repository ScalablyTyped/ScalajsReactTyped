package typingsJapgolly.ipfsHttpClient

import typingsJapgolly.ipfsHttpClient.distSrcLibConfigureMod.Factory
import typingsJapgolly.libp2pInterfacePeerId.mod.PeerId
import typingsJapgolly.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPingMod {
  
  @JSImport("ipfs-http-client/dist/src/ping", "createPing")
  @js.native
  val createPing: Factory[
    js.Function2[
      /* peerId */ PeerId, 
      /* options */ js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_root.PingOptions */ Any) & typingsJapgolly.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
      ], 
      AsyncIterable[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_root.PingResult */ Any
      ]
    ]
  ] = js.native
  
  type HTTPClientExtraOptions = typingsJapgolly.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
  
  type RootAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_root.API<HTTPClientExtraOptions> */ Any
}
