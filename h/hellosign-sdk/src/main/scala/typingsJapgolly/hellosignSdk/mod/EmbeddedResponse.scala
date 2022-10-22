package typingsJapgolly.hellosignSdk.mod

import typingsJapgolly.hellosignSdk.anon.Editurl
import typingsJapgolly.node.httpMod.IncomingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmbeddedResponse
  extends StObject
     with BaseResponse {
  
  var embedded: Editurl
}
object EmbeddedResponse {
  
  inline def apply(embedded: Editurl, resHeaders: IncomingHttpHeaders): EmbeddedResponse = {
    val __obj = js.Dynamic.literal(embedded = embedded.asInstanceOf[js.Any], resHeaders = resHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmbeddedResponse]
  }
  
  extension [Self <: EmbeddedResponse](x: Self) {
    
    inline def setEmbedded(value: Editurl): Self = StObject.set(x, "embedded", value.asInstanceOf[js.Any])
  }
}
