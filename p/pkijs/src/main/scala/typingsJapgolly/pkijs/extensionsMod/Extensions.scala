package typingsJapgolly.pkijs.extensionsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extensions extends js.Object {
  var extensions: js.Array[typingsJapgolly.pkijs.extensionMod.default]
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object Extensions {
  @scala.inline
  def apply(
    extensions: js.Array[typingsJapgolly.pkijs.extensionMod.default],
    fromSchema: js.Any => Callback,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any]
  ): Extensions = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    __obj.asInstanceOf[Extensions]
  }
}

