package typingsJapgolly.winrt.Windows.Networking.Sockets

import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrt.Windows.Security.Credentials.PasswordCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStreamWebSocketControl
  extends StObject
     with IWebSocketControl {
  
  var noDelay: Boolean
}
object IStreamWebSocketControl {
  
  inline def apply(
    noDelay: Boolean,
    outboundBufferSizeInBytes: Double,
    proxyCredential: PasswordCredential,
    serverCredential: PasswordCredential,
    supportedProtocols: IVector[String]
  ): IStreamWebSocketControl = {
    val __obj = js.Dynamic.literal(noDelay = noDelay.asInstanceOf[js.Any], outboundBufferSizeInBytes = outboundBufferSizeInBytes.asInstanceOf[js.Any], proxyCredential = proxyCredential.asInstanceOf[js.Any], serverCredential = serverCredential.asInstanceOf[js.Any], supportedProtocols = supportedProtocols.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStreamWebSocketControl]
  }
  
  extension [Self <: IStreamWebSocketControl](x: Self) {
    
    inline def setNoDelay(value: Boolean): Self = StObject.set(x, "noDelay", value.asInstanceOf[js.Any])
  }
}
