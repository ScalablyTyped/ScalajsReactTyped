package typingsJapgolly.ipfsHttpClient

import typingsJapgolly.ipfsHttpClient.distSrcLibConfigureMod.Factory
import typingsJapgolly.libp2pInterfacePeerId.mod.PeerId
import typingsJapgolly.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcNameResolveMod {
  
  @JSImport("ipfs-http-client/dist/src/name/resolve", "createResolve")
  @js.native
  val createResolve: Factory[
    js.Function2[
      /* path */ String | PeerId, 
      /* options */ js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_name.ResolveOptions */ Any) & typingsJapgolly.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
      ], 
      AsyncIterable[String]
    ]
  ] = js.native
  
  type HTTPClientExtraOptions = typingsJapgolly.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
  
  type NameAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_name.API<HTTPClientExtraOptions> */ Any
}
