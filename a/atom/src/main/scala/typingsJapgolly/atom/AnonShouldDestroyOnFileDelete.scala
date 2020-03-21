package typingsJapgolly.atom

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonShouldDestroyOnFileDelete extends js.Object {
  /**
    *  A function that returns a Boolean indicating whether the buffer should
    *  be destroyed if its file is deleted.
    */
  var shouldDestroyOnFileDelete: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** The initial string text of the buffer. */
  var text: js.UndefOr[String] = js.undefined
}

object AnonShouldDestroyOnFileDelete {
  @scala.inline
  def apply(shouldDestroyOnFileDelete: js.UndefOr[CallbackTo[Boolean]] = js.undefined, text: String = null): AnonShouldDestroyOnFileDelete = {
    val __obj = js.Dynamic.literal()
    shouldDestroyOnFileDelete.foreach(p => __obj.updateDynamic("shouldDestroyOnFileDelete")(p.toJsFn))
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonShouldDestroyOnFileDelete]
  }
}

