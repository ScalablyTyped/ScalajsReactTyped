package typingsJapgolly.reachRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPath extends js.Object {
  var path: String
  var uri: String
}

object AnonPath {
  @scala.inline
  def apply(path: String, uri: String): AnonPath = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPath]
  }
}

