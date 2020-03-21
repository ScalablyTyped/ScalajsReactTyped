package typingsJapgolly.pkijs.revocationInfoChoicesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevocationInfoChoices extends js.Object {
  var crls: js.Array[typingsJapgolly.pkijs.certificateRevocationListMod.default]
  var otherRevocationInfos: js.Array[typingsJapgolly.pkijs.otherRevocationInfoFormatMod.default]
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object RevocationInfoChoices {
  @scala.inline
  def apply(
    crls: js.Array[typingsJapgolly.pkijs.certificateRevocationListMod.default],
    fromSchema: js.Any => Callback,
    otherRevocationInfos: js.Array[typingsJapgolly.pkijs.otherRevocationInfoFormatMod.default],
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any]
  ): RevocationInfoChoices = {
    val __obj = js.Dynamic.literal(crls = crls.asInstanceOf[js.Any], otherRevocationInfos = otherRevocationInfos.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    __obj.asInstanceOf[RevocationInfoChoices]
  }
}

