package typingsJapgolly.pkijs.nameConstraintsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameConstraints extends js.Object {
  var excludedSubtrees: js.UndefOr[js.Array[typingsJapgolly.pkijs.generalSubtreeMod.default]] = js.undefined
  var permittedSubtrees: js.UndefOr[js.Array[typingsJapgolly.pkijs.generalSubtreeMod.default]] = js.undefined
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object NameConstraints {
  @scala.inline
  def apply(
    fromSchema: js.Any => Callback,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any],
    excludedSubtrees: js.Array[typingsJapgolly.pkijs.generalSubtreeMod.default] = null,
    permittedSubtrees: js.Array[typingsJapgolly.pkijs.generalSubtreeMod.default] = null
  ): NameConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    if (excludedSubtrees != null) __obj.updateDynamic("excludedSubtrees")(excludedSubtrees.asInstanceOf[js.Any])
    if (permittedSubtrees != null) __obj.updateDynamic("permittedSubtrees")(permittedSubtrees.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameConstraints]
  }
}

