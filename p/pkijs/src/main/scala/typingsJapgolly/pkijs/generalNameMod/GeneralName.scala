package typingsJapgolly.pkijs.generalNameMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneralName extends js.Object {
  /**
    * value type - from a tagged value (0 for "otherName", 1 for "rfc822Name" etc.)
    * 
    * @type {number}
    * @memberOf GeneralName
    */
  var `type`: Double
  /**
    * asn1js object having GENERAL_NAME value (type depends on "type" value)
    * 
    * @type {*}
    * @memberOf GeneralName
    */
  var value: js.Any
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object GeneralName {
  @scala.inline
  def apply(
    fromSchema: js.Any => Callback,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any],
    `type`: Double,
    value: js.Any
  ): GeneralName = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralName]
  }
}

