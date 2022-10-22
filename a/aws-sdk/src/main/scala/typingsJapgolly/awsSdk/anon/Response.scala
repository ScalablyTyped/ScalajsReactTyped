package typingsJapgolly.awsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Response[D, E] extends StObject {
  
  @JSName("$response")
  var $response: typingsJapgolly.awsSdk.libResponseMod.Response[D, E]
}
object Response {
  
  inline def apply[D, E]($response: typingsJapgolly.awsSdk.libResponseMod.Response[D, E]): Response[D, E] = {
    val __obj = js.Dynamic.literal($response = $response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response[D, E]]
  }
  
  extension [Self <: Response[?, ?], D, E](x: Self & (Response[D, E])) {
    
    inline def set$response(value: typingsJapgolly.awsSdk.libResponseMod.Response[D, E]): Self = StObject.set(x, "$response", value.asInstanceOf[js.Any])
  }
}
