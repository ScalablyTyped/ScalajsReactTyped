package typingsJapgolly.awsSdkTypes.abortMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbortSignal extends js.Object {
  /**
    * Whether the action represented by this signal has been cancelled.
    */
  val aborted: Boolean
  /**
    * A function to be invoked when the action represented by this signal has
    * been cancelled.
    */
  var onabort: js.UndefOr[AbortHandler] = js.undefined
}

object AbortSignal {
  @scala.inline
  def apply(aborted: Boolean, onabort: js.UndefOr[Callback] = js.undefined): AbortSignal = {
    val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any])
    onabort.foreach(p => __obj.updateDynamic("onabort")(p.toJsFn))
    __obj.asInstanceOf[AbortSignal]
  }
}

