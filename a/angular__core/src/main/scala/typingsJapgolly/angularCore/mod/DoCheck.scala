package typingsJapgolly.angularCore.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoCheck extends js.Object {
  /**
    * A callback method that performs change-detection, invoked
    * after the default change-detector runs.
    * See `KeyValueDiffers` and `IterableDiffers` for implementing
    * custom change checking for collections.
    *
    */
  def ngDoCheck(): Unit
}

object DoCheck {
  @scala.inline
  def apply(ngDoCheck: Callback): DoCheck = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ngDoCheck")(ngDoCheck.toJsFn)
    __obj.asInstanceOf[DoCheck]
  }
}

