package typingsJapgolly.ipfsHttpClient

import org.scalajs.dom.Response
import org.scalajs.dom.URL
import typingsJapgolly.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcLibCoreMod {
  
  @JSImport("ipfs-http-client/dist/src/lib/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HTTP * / any */ @JSImport("ipfs-http-client/dist/src/lib/core", "Client")
  @js.native
  /**
    * @param {Options|URL|Multiaddr|string} [options]
    */
  open class Client () extends StObject {
    def this(options: String) = this()
    def this(options: URL) = this()
    def this(options: typingsJapgolly.ipfsHttpClient.distSrcTypesMod.Options) = this()
    def this(options: Multiaddr_) = this()
  }
  
  @JSImport("ipfs-http-client/dist/src/lib/core", "HTTPError")
  @js.native
  val HTTPError: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HTTP.HTTPError */ Any = js.native
  
  inline def errorHandler(response: Response): js.Promise[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("errorHandler")(response.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Nothing]]
  
  type HTTPOptions = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_types.HTTPOptions */ Any
  
  type Multiaddr = Multiaddr_
  
  type Options = typingsJapgolly.ipfsHttpClient.distSrcTypesMod.Options
}
