package typingsJapgolly.winrt.Windows.UI.Core

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInitializeWithCoreWindow extends js.Object {
  def initialize(window: CoreWindow): Unit
}

object IInitializeWithCoreWindow {
  @scala.inline
  def apply(initialize: CoreWindow => Callback): IInitializeWithCoreWindow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("initialize")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.UI.Core.CoreWindow) => initialize(t0).runNow()))
    __obj.asInstanceOf[IInitializeWithCoreWindow]
  }
}

