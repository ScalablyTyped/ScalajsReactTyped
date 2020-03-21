package typingsJapgolly.objection.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationThrough extends js.Object {
  var beforeInsert: js.UndefOr[
    js.Function2[/* model */ Model, /* context */ QueryContext, js.Promise[Unit] | Unit]
  ] = js.undefined
  var extra: js.UndefOr[js.Array[String] | js.Object] = js.undefined
  var from: String | Reference | (js.Array[String | Reference])
  var modelClass: js.UndefOr[ModelClass[_] | String] = js.undefined
  var to: String | Reference | (js.Array[String | Reference])
}

object RelationThrough {
  @scala.inline
  def apply(
    from: String | Reference | (js.Array[String | Reference]),
    to: String | Reference | (js.Array[String | Reference]),
    beforeInsert: (/* model */ Model, /* context */ QueryContext) => CallbackTo[js.Promise[Unit] | Unit] = null,
    extra: js.Array[String] | js.Object = null,
    modelClass: ModelClass[_] | String = null
  ): RelationThrough = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    if (beforeInsert != null) __obj.updateDynamic("beforeInsert")(js.Any.fromFunction2((t0: /* model */ typingsJapgolly.objection.mod.Model, t1: /* context */ typingsJapgolly.objection.mod.QueryContext) => beforeInsert(t0, t1).runNow()))
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (modelClass != null) __obj.updateDynamic("modelClass")(modelClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationThrough]
  }
}

