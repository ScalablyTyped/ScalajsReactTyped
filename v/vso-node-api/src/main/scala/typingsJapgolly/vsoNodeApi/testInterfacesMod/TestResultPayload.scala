package typingsJapgolly.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResultPayload extends js.Object {
  var comment: String
  var name: String
  var stream: String
}

object TestResultPayload {
  @scala.inline
  def apply(comment: String, name: String, stream: String): TestResultPayload = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TestResultPayload]
  }
}

