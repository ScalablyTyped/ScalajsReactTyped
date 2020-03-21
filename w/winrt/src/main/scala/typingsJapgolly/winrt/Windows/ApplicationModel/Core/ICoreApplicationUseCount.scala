package typingsJapgolly.winrt.Windows.ApplicationModel.Core

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreApplicationUseCount extends js.Object {
  def decrementApplicationUseCount(): Unit
  def incrementApplicationUseCount(): Unit
}

object ICoreApplicationUseCount {
  @scala.inline
  def apply(decrementApplicationUseCount: Callback, incrementApplicationUseCount: Callback): ICoreApplicationUseCount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decrementApplicationUseCount")(decrementApplicationUseCount.toJsFn)
    __obj.updateDynamic("incrementApplicationUseCount")(incrementApplicationUseCount.toJsFn)
    __obj.asInstanceOf[ICoreApplicationUseCount]
  }
}

