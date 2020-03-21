package typingsJapgolly.dojo.dojo.robotx

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/robotx._runsemaphore.html
  *
  *
  */
trait runsemaphore extends js.Object {
  /**
    *
    */
  var lock: js.Array[_]
  /**
    *
    */
  def unlock(): js.Any
}

object runsemaphore {
  @scala.inline
  def apply(lock: js.Array[_], unlock: CallbackTo[js.Any]): runsemaphore = {
    val __obj = js.Dynamic.literal(lock = lock.asInstanceOf[js.Any])
    __obj.updateDynamic("unlock")(unlock.toJsFn)
    __obj.asInstanceOf[runsemaphore]
  }
}

