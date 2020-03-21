package typingsJapgolly.knockoutTransformations

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDispose[TResult] extends js.Object {
  var mappedValue: TResult
  def dispose(): Unit
}

object AnonDispose {
  @scala.inline
  def apply[TResult](dispose: Callback, mappedValue: TResult): AnonDispose[TResult] = {
    val __obj = js.Dynamic.literal(mappedValue = mappedValue.asInstanceOf[js.Any])
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.asInstanceOf[AnonDispose[TResult]]
  }
}

