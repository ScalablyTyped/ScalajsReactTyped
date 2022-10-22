package typingsJapgolly.ky

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Blob
import org.scalajs.dom.FormData
import org.scalajs.dom.Headers
import org.scalajs.dom.ResponseType
import typingsJapgolly.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distributionTypesResponseMod {
  
  trait KyResponse
    extends StObject
       with Response
  object KyResponse {
    
    inline def apply(
      arrayBuffer: CallbackTo[js.Promise[js.typedarray.ArrayBuffer]],
      blob: CallbackTo[js.Promise[Blob]],
      bodyUsed: Boolean,
      formData: CallbackTo[js.Promise[FormData]],
      headers: Headers,
      json: CallbackTo[js.Promise[Any]],
      ok: Boolean,
      redirected: Boolean,
      status: Double,
      statusText: String,
      text: CallbackTo[js.Promise[String]],
      `type`: ResponseType,
      url: String
    ): KyResponse = {
      val __obj = js.Dynamic.literal(arrayBuffer = arrayBuffer.toJsFn, blob = blob.toJsFn, bodyUsed = bodyUsed.asInstanceOf[js.Any], formData = formData.toJsFn, headers = headers.asInstanceOf[js.Any], json = json.toJsFn, ok = ok.asInstanceOf[js.Any], redirected = redirected.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = text.toJsFn, url = url.asInstanceOf[js.Any], body = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[KyResponse]
    }
  }
}
