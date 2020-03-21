package typingsJapgolly.falcorJsonGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An envelope that wraps a JSON object.
  **/
trait JSONEnvelope[T] extends js.Object {
  var json: T
}

object JSONEnvelope {
  @scala.inline
  def apply[T](json: T): JSONEnvelope[T] = {
    val __obj = js.Dynamic.literal(json = json.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JSONEnvelope[T]]
  }
}

