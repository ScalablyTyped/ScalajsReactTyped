package typingsJapgolly.wegameApi

import japgolly.scalajs.react.Callback
import typingsJapgolly.wegameApi.wegameApiStrings.black
import typingsJapgolly.wegameApi.wegameApiStrings.white
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStyleSuccess extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: white | black
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object AnonStyleSuccess {
  @scala.inline
  def apply(
    style: white | black,
    complete: js.UndefOr[Callback] = js.undefined,
    fail: js.UndefOr[Callback] = js.undefined,
    success: js.UndefOr[Callback] = js.undefined
  ): AnonStyleSuccess = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    success.foreach(p => __obj.updateDynamic("success")(p.toJsFn))
    __obj.asInstanceOf[AnonStyleSuccess]
  }
}

