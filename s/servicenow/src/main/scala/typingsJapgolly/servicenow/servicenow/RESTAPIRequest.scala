package typingsJapgolly.servicenow.servicenow

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RESTAPIRequest[T] extends js.Object {
  val body: RESTAPIRequestBody[T]
  val headers: StringDictionary[String]
  val pathParams: StringDictionary[String]
  val queryParams: StringDictionary[js.Array[String]]
  val queryString: String
  val url: String
  def getHeader(header: String): String
  def getSupportedResponseContentTypes(): js.Array[String]
}

object RESTAPIRequest {
  @scala.inline
  def apply[T](
    body: RESTAPIRequestBody[T],
    getHeader: String => CallbackTo[String],
    getSupportedResponseContentTypes: CallbackTo[js.Array[String]],
    headers: StringDictionary[String],
    pathParams: StringDictionary[String],
    queryParams: StringDictionary[js.Array[String]],
    queryString: String,
    url: String
  ): RESTAPIRequest[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], pathParams = pathParams.asInstanceOf[js.Any], queryParams = queryParams.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("getHeader")(js.Any.fromFunction1((t0: java.lang.String) => getHeader(t0).runNow()))
    __obj.updateDynamic("getSupportedResponseContentTypes")(getSupportedResponseContentTypes.toJsFn)
    __obj.asInstanceOf[RESTAPIRequest[T]]
  }
}

