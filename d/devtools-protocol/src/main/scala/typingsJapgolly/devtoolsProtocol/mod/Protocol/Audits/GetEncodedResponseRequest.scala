package typingsJapgolly.devtoolsProtocol.mod.Protocol.Audits

import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.jpeg
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.png
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.webp
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.RequestId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEncodedResponseRequest extends StObject {
  
  /**
    * The encoding to use. (GetEncodedResponseRequestEncoding enum)
    */
  var encoding: webp | jpeg | png
  
  /**
    * The quality of the encoding (0-1). (defaults to 1)
    */
  var quality: js.UndefOr[Double] = js.undefined
  
  /**
    * Identifier of the network request to get content for.
    */
  var requestId: RequestId
  
  /**
    * Whether to only return the size information (defaults to false).
    */
  var sizeOnly: js.UndefOr[Boolean] = js.undefined
}
object GetEncodedResponseRequest {
  
  inline def apply(encoding: webp | jpeg | png, requestId: RequestId): GetEncodedResponseRequest = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEncodedResponseRequest]
  }
  
  extension [Self <: GetEncodedResponseRequest](x: Self) {
    
    inline def setEncoding(value: webp | jpeg | png): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    inline def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setSizeOnly(value: Boolean): Self = StObject.set(x, "sizeOnly", value.asInstanceOf[js.Any])
    
    inline def setSizeOnlyUndefined: Self = StObject.set(x, "sizeOnly", js.undefined)
  }
}
