package typingsJapgolly.protractorHttpMock.mod.requests

import typingsJapgolly.protractorHttpMock.AnonData
import typingsJapgolly.protractorHttpMock.AnonPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * POST request mock.
  */
trait Post[TResponse] extends js.Object {
  var request: AnonPath
  var response: AnonData[TResponse]
}

object Post {
  @scala.inline
  def apply[TResponse](request: AnonPath, response: AnonData[TResponse]): Post[TResponse] = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Post[TResponse]]
  }
}

