package typingsJapgolly.firebaseClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushResponse extends js.Object {
  /**
  	 * Name ref (key) of the child resource
  	 */
  var name: String
}

object PushResponse {
  @scala.inline
  def apply(name: String): PushResponse = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PushResponse]
  }
}

