package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCount extends js.Object {
  var count: Null
  def onAnimated(): Unit
}

object AnonCount {
  @scala.inline
  def apply(count: Null, onAnimated: Callback): AnonCount = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.updateDynamic("onAnimated")(onAnimated.toJsFn)
    __obj.asInstanceOf[AnonCount]
  }
}

