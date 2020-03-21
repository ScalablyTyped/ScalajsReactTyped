package typingsJapgolly.reactLoadable.LoadableExport

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadableCaptureProps extends js.Object {
  /**
    * Function called for every moduleName that is rendered via React Loadable.
    */
  def report(moduleName: String): Unit
}

object LoadableCaptureProps {
  @scala.inline
  def apply(report: String => Callback): LoadableCaptureProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("report")(js.Any.fromFunction1((t0: java.lang.String) => report(t0).runNow()))
    __obj.asInstanceOf[LoadableCaptureProps]
  }
}

