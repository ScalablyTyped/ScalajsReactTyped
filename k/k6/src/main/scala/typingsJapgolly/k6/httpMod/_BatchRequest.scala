package typingsJapgolly.k6.httpMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _BatchRequest extends StObject
object _BatchRequest {
  
  inline def HttpURL(): typingsJapgolly.k6.httpMod.HttpURL = {
    val __obj = js.Dynamic.literal(__brand = "http-url")
    __obj.asInstanceOf[typingsJapgolly.k6.httpMod.HttpURL]
  }
  
  inline def ObjectBatchRequest(method: String, url: String | HttpURL): typingsJapgolly.k6.httpMod.ObjectBatchRequest = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.k6.httpMod.ObjectBatchRequest]
  }
}
