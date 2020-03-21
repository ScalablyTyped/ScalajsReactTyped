package typingsJapgolly.astTypes

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmptyArray extends js.Object {
  def emptyArray(): js.Array[scala.Nothing]
  def `false`(): Boolean
  def `null`(): Null
  def `true`(): Boolean
  def undefined(): Unit
  def `use strict`(): String
}

object AnonEmptyArray {
  @scala.inline
  def apply(
    emptyArray: CallbackTo[js.Array[scala.Nothing]],
    `false`: CallbackTo[Boolean],
    `null`: CallbackTo[Null],
    `true`: CallbackTo[Boolean],
    undefined: Callback,
    `use strict`: CallbackTo[String]
  ): AnonEmptyArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("emptyArray")(emptyArray.toJsFn)
    __obj.updateDynamic("false")(`false`.toJsFn)
    __obj.updateDynamic("null")(`null`.toJsFn)
    __obj.updateDynamic("true")(`true`.toJsFn)
    __obj.updateDynamic("undefined")(undefined.toJsFn)
    __obj.updateDynamic("use strict")(`use strict`.toJsFn)
    __obj.asInstanceOf[AnonEmptyArray]
  }
}

