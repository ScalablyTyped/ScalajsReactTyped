package typingsJapgolly.reactLoadable.LoadableExport

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadingComponentProps extends js.Object {
  var error: js.Any
  var isLoading: Boolean
  var pastDelay: Boolean
  var timedOut: Boolean
  def retry(): Unit
}

object LoadingComponentProps {
  @scala.inline
  def apply(error: js.Any, isLoading: Boolean, pastDelay: Boolean, retry: Callback, timedOut: Boolean): LoadingComponentProps = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any], pastDelay = pastDelay.asInstanceOf[js.Any], timedOut = timedOut.asInstanceOf[js.Any])
    __obj.updateDynamic("retry")(retry.toJsFn)
    __obj.asInstanceOf[LoadingComponentProps]
  }
}

