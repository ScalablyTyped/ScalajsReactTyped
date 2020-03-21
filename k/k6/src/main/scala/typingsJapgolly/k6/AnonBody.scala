package typingsJapgolly.k6

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.k6.httpMod.RequestCookie
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBody extends js.Object {
  /** Request body. */
  var body: String
  /** Request cookies. */
  var cookies: StringDictionary[js.Array[RequestCookie]]
  /** Request headers. */
  var headers: StringDictionary[js.Array[String]]
  /** Request method. */
  var method: String
  /** Request URL. */
  var url: String
}

object AnonBody {
  @scala.inline
  def apply(
    body: String,
    cookies: StringDictionary[js.Array[RequestCookie]],
    headers: StringDictionary[js.Array[String]],
    method: String,
    url: String
  ): AnonBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], cookies = cookies.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBody]
  }
}

