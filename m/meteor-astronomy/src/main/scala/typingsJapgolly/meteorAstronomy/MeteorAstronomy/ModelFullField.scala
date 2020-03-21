package typingsJapgolly.meteorAstronomy.MeteorAstronomy

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelFullField[Field, Doc] extends js.Object {
  var default: js.UndefOr[js.Function0[Field]] = js.undefined
  var immutable: js.UndefOr[Boolean] = js.undefined
  var index: js.UndefOr[String | Double] = js.undefined
  var optional: js.UndefOr[Boolean] = js.undefined
  var resolve: js.UndefOr[js.Function1[/* doc */ Doc, Field]] = js.undefined
  var transient: js.UndefOr[Boolean] = js.undefined
  var `type`: TypeOptions
  var validators: js.UndefOr[js.Array[Validator]] = js.undefined
}

object ModelFullField {
  @scala.inline
  def apply[Field, Doc](
    `type`: TypeOptions,
    default: js.UndefOr[CallbackTo[Field]] = js.undefined,
    immutable: js.UndefOr[Boolean] = js.undefined,
    index: String | Double = null,
    optional: js.UndefOr[Boolean] = js.undefined,
    resolve: /* doc */ Doc => CallbackTo[Field] = null,
    transient: js.UndefOr[Boolean] = js.undefined,
    validators: js.Array[Validator] = null
  ): ModelFullField[Field, Doc] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    default.foreach(p => __obj.updateDynamic("default")(p.toJsFn))
    if (!js.isUndefined(immutable)) __obj.updateDynamic("immutable")(immutable.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (resolve != null) __obj.updateDynamic("resolve")(js.Any.fromFunction1((t0: /* doc */ Doc) => resolve(t0).runNow()))
    if (!js.isUndefined(transient)) __obj.updateDynamic("transient")(transient.asInstanceOf[js.Any])
    if (validators != null) __obj.updateDynamic("validators")(validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelFullField[Field, Doc]]
  }
}

