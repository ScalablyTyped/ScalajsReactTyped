package typingsJapgolly.pkijs.extKeyUsageMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtKeyUsage extends js.Object {
  var keyPurposes: js.Array[String]
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object ExtKeyUsage {
  @scala.inline
  def apply(
    fromSchema: js.Any => Callback,
    keyPurposes: js.Array[String],
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any]
  ): ExtKeyUsage = {
    val __obj = js.Dynamic.literal(keyPurposes = keyPurposes.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    __obj.asInstanceOf[ExtKeyUsage]
  }
}

