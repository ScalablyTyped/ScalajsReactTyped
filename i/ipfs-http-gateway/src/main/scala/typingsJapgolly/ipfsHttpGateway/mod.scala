package typingsJapgolly.ipfsHttpGateway

import typingsJapgolly.hapiHapi.mod.Server_
import typingsJapgolly.libp2pLogger.mod.Logger_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ipfs-http-gateway", "HttpGateway")
  @js.native
  open class HttpGateway protected () extends StObject {
    /**
      * @param {IPFS} ipfs
      */
    def this(ipfs: IPFS) = this()
    
    /**
      * @param {string} host
      * @param {string} port
      * @param {IPFS} ipfs
      */
    def _createGatewayServer(host: String, port: String, ipfs: IPFS): js.Promise[Server_] = js.native
    
    /** @type {Server[]} */
    var _gatewayServers: js.Array[Server] = js.native
    
    var _ipfs: typingsJapgolly.ipfsCoreTypes.mod.IPFS[Any] = js.native
    
    def _log(formatter: Any, args: Any*): Unit = js.native
    @JSName("_log")
    var _log_Original: Logger_ = js.native
    
    def start(): js.Promise[Unit] = js.native
    
    def stop(): js.Promise[Unit] = js.native
  }
  
  type IPFS = typingsJapgolly.ipfsCoreTypes.mod.IPFS[js.Object]
  
  type Server = typingsJapgolly.ipfsHttpGateway.distSrcTypesMod.Server
}
