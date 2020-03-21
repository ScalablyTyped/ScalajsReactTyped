package typingsJapgolly.googleCloudCommon.utilMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Abortable extends js.Object {
  def abort(): Unit
}

object Abortable {
  @scala.inline
  def apply(abort: Callback): Abortable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abort")(abort.toJsFn)
    __obj.asInstanceOf[Abortable]
  }
}

