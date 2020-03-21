package typingsJapgolly.edtrIoMathquill

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.edtrIoMathquill.mod.MQ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEdit extends js.Object {
  var edit: js.UndefOr[js.Function1[/* mathField */ MQ, _]] = js.undefined
  var enter: js.UndefOr[js.Function1[/* mathField */ MQ, _]] = js.undefined
  var moveOutOf: js.UndefOr[js.Function2[/* direction */ Double, /* mathField */ MQ, _]] = js.undefined
  var upOutOf: js.UndefOr[js.Function1[/* mathField */ MQ, _]] = js.undefined
}

object AnonEdit {
  @scala.inline
  def apply(
    edit: /* mathField */ MQ => CallbackTo[js.Any] = null,
    enter: /* mathField */ MQ => CallbackTo[js.Any] = null,
    moveOutOf: (/* direction */ Double, /* mathField */ MQ) => CallbackTo[js.Any] = null,
    upOutOf: /* mathField */ MQ => CallbackTo[js.Any] = null
  ): AnonEdit = {
    val __obj = js.Dynamic.literal()
    if (edit != null) __obj.updateDynamic("edit")(js.Any.fromFunction1((t0: /* mathField */ typingsJapgolly.edtrIoMathquill.mod.MQ) => edit(t0).runNow()))
    if (enter != null) __obj.updateDynamic("enter")(js.Any.fromFunction1((t0: /* mathField */ typingsJapgolly.edtrIoMathquill.mod.MQ) => enter(t0).runNow()))
    if (moveOutOf != null) __obj.updateDynamic("moveOutOf")(js.Any.fromFunction2((t0: /* direction */ scala.Double, t1: /* mathField */ typingsJapgolly.edtrIoMathquill.mod.MQ) => moveOutOf(t0, t1).runNow()))
    if (upOutOf != null) __obj.updateDynamic("upOutOf")(js.Any.fromFunction1((t0: /* mathField */ typingsJapgolly.edtrIoMathquill.mod.MQ) => upOutOf(t0).runNow()))
    __obj.asInstanceOf[AnonEdit]
  }
}

