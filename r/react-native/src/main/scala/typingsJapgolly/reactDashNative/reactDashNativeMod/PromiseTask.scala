package typingsJapgolly.reactDashNative.reactDashNativeMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromiseTask extends js.Object {
  var name: String
  def gen(): js.Promise[_]
}

object PromiseTask {
  @scala.inline
  def apply(gen: CallbackTo[js.Promise[_]], name: String): PromiseTask = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("gen")(gen.toJsFn)
    __obj.asInstanceOf[PromiseTask]
  }
}

