package typingsJapgolly.cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAbort extends js.Object {
  var abort: js.Array[_]
  var error: js.Array[_]
  var load: js.Array[_]
  var progress: js.Array[_]
}

object AnonAbort {
  @scala.inline
  def apply(abort: js.Array[_], error: js.Array[_], load: js.Array[_], progress: js.Array[_]): AnonAbort = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAbort]
  }
}

