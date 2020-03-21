package typingsJapgolly.atlaskitFeedbackCollector.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeedbackFormProps extends js.Object {
  /** Function that will be called to initiate the exit transition. */
  def onClose(): Unit
  /** Function that will be called immediately after the submit action  */
  def onSubmit(formValues: FormFields): Unit
}

object FeedbackFormProps {
  @scala.inline
  def apply(onClose: Callback, onSubmit: FormFields => Callback): FeedbackFormProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onClose")(onClose.toJsFn)
    __obj.updateDynamic("onSubmit")(js.Any.fromFunction1((t0: typingsJapgolly.atlaskitFeedbackCollector.mod.FormFields) => onSubmit(t0).runNow()))
    __obj.asInstanceOf[FeedbackFormProps]
  }
}

