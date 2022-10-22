package typingsJapgolly.akamaiEdgeworkers.EW

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// responseProvider
trait ResponseProviderRequest
  extends StObject
     with Request
     with ReadsHeaders
     with ReadAllHeader
     with ReadsBody
     with ReadsVariables
object ResponseProviderRequest {
  
  inline def apply(
    body: ReadableStreamEW[Any],
    cpCode: Double,
    getHeader: String => js.Array[String] | Null,
    getHeaders: CallbackTo[Headers],
    getVariable: String => js.UndefOr[String],
    host: String,
    json: CallbackTo[js.Promise[Any]],
    method: String,
    path: String,
    query: String,
    scheme: String,
    text: CallbackTo[js.Promise[String]],
    url: String
  ): ResponseProviderRequest = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], cpCode = cpCode.asInstanceOf[js.Any], getHeader = js.Any.fromFunction1(getHeader), getHeaders = getHeaders.toJsFn, getVariable = js.Any.fromFunction1(getVariable), host = host.asInstanceOf[js.Any], json = json.toJsFn, method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], text = text.toJsFn, url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseProviderRequest]
  }
}
