package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Count extends js.Object {
  var count: Null
  def onAnimated(): Unit
}

object Anon_Count {
  @scala.inline
  def apply(count: Null, onAnimated: Callback): Anon_Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.updateDynamic("onAnimated")(onAnimated.toJsFn)
    __obj.asInstanceOf[Anon_Count]
  }
}

