package typingsJapgolly.azureMsalNode

import typingsJapgolly.azureMsalCommon.distNetworkInetworkmoduleMod.INetworkModule
import typingsJapgolly.azureMsalCommon.distNetworkInetworkmoduleMod.NetworkRequestOptions
import typingsJapgolly.azureMsalCommon.distNetworkNetworkManagerMod.NetworkResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNetworkHttpClientMod {
  
  @JSImport("@azure/msal-node/dist/network/HttpClient", "HttpClient")
  @js.native
  open class HttpClient ()
    extends StObject
       with INetworkModule {
    
    def sendPostRequestAsync[T](url: String, options: Unit, cancellationToken: Double): js.Promise[NetworkResponse[T]] = js.native
    def sendPostRequestAsync[T](url: String, options: NetworkRequestOptions, cancellationToken: Double): js.Promise[NetworkResponse[T]] = js.native
  }
}
