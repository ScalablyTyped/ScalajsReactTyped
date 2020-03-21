package typingsJapgolly.emberTest.adapterMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Adapter extends js.Object {
  /**
    * This callback will be called whenever an async operation has completed.
    */
  def asyncEnd(): js.Any
  /**
    * This callback will be called whenever an async operation is about to start.
    */
  def asyncStart(): js.Any
  /**
    * Override this method with your testing framework's false assertion.
    * This function is called whenever an exception occurs causing the testing
    * promise to fail.
    */
  def exception(error: String): js.Any
}

object Adapter {
  @scala.inline
  def apply(
    asyncEnd: CallbackTo[js.Any],
    asyncStart: CallbackTo[js.Any],
    exception: String => CallbackTo[js.Any]
  ): Adapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("asyncEnd")(asyncEnd.toJsFn)
    __obj.updateDynamic("asyncStart")(asyncStart.toJsFn)
    __obj.updateDynamic("exception")(js.Any.fromFunction1((t0: java.lang.String) => exception(t0).runNow()))
    __obj.asInstanceOf[Adapter]
  }
}

