package typingsJapgolly.mailgen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Content extends js.Object {
  var body: ContentBody
}

object Content {
  @scala.inline
  def apply(body: ContentBody): Content = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Content]
  }
}

