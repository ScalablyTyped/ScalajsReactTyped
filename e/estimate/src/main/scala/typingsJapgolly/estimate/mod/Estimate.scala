package typingsJapgolly.estimate.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Estimate extends js.Object {
  var progress: Double
  var remaining: Double
  var total: Double
  def initialize(): Unit
  def update(): Unit
}

object Estimate {
  @scala.inline
  def apply(initialize: Callback, progress: Double, remaining: Double, total: Double, update: Callback): Estimate = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any], remaining = remaining.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.updateDynamic("initialize")(initialize.toJsFn)
    __obj.updateDynamic("update")(update.toJsFn)
    __obj.asInstanceOf[Estimate]
  }
}

