package typingsJapgolly.winrt.Windows.ApplicationModel.Core

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrt.Windows.UI.Core.CoreWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFrameworkView extends js.Object {
  def initialize(applicationView: CoreApplicationView): Unit
  def load(entryPoint: String): Unit
  def run(): Unit
  def setWindow(window: CoreWindow): Unit
  def uninitialize(): Unit
}

object IFrameworkView {
  @scala.inline
  def apply(
    initialize: CoreApplicationView => Callback,
    load: String => Callback,
    run: Callback,
    setWindow: CoreWindow => Callback,
    uninitialize: Callback
  ): IFrameworkView = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("initialize")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.ApplicationModel.Core.CoreApplicationView) => initialize(t0).runNow()))
    __obj.updateDynamic("load")(js.Any.fromFunction1((t0: java.lang.String) => load(t0).runNow()))
    __obj.updateDynamic("run")(run.toJsFn)
    __obj.updateDynamic("setWindow")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.UI.Core.CoreWindow) => setWindow(t0).runNow()))
    __obj.updateDynamic("uninitialize")(uninitialize.toJsFn)
    __obj.asInstanceOf[IFrameworkView]
  }
}

