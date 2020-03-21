package typingsJapgolly.oracleOraclejet.ojvalidationBaseMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Validator[V] extends js.Object {
  var getHint: js.UndefOr[js.Function0[String | Null]] = js.undefined
  def validate(value: V): Unit
}

object Validator {
  @scala.inline
  def apply[V](validate: V => Callback, getHint: js.UndefOr[CallbackTo[String | Null]] = js.undefined): Validator[V] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("validate")(js.Any.fromFunction1((t0: V) => validate(t0).runNow()))
    getHint.foreach(p => __obj.updateDynamic("getHint")(p.toJsFn))
    __obj.asInstanceOf[Validator[V]]
  }
}

