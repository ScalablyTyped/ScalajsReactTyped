package typingsJapgolly.reactDashNative.reactDashNativeMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleTask extends js.Object {
  var name: String
  def gen(): Unit
}

object SimpleTask {
  @scala.inline
  def apply(gen: Callback, name: String): SimpleTask = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("gen")(gen.toJsFn)
    __obj.asInstanceOf[SimpleTask]
  }
}

