package typingsJapgolly.web3ProvidersWs

import typingsJapgolly.web3CoreHelpers.mod.WebsocketProviderBase
import typingsJapgolly.web3CoreHelpers.mod.WebsocketProviderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("web3-providers-ws", "WebsocketProvider")
  @js.native
  open class WebsocketProvider protected () extends WebsocketProviderBase {
    def this(host: String) = this()
    def this(host: String, options: WebsocketProviderOptions) = this()
  }
}
