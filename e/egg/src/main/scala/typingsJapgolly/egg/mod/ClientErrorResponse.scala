package typingsJapgolly.egg.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientErrorResponse extends js.Object {
  var body: String | Buffer
  var headers: StringDictionary[String]
  var status: Double
}

object ClientErrorResponse {
  @scala.inline
  def apply(body: String | Buffer, headers: StringDictionary[String], status: Double): ClientErrorResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClientErrorResponse]
  }
}

