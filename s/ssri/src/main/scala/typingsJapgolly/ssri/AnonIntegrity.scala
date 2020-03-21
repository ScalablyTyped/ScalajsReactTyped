package typingsJapgolly.ssri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ssri.mod.HashLike
import typingsJapgolly.ssri.mod.IntegrityLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIntegrity extends js.Object {
  var algorithms: js.UndefOr[js.Array[String]] = js.undefined
  var integrity: js.UndefOr[String | IntegrityLike | HashLike] = js.undefined
  var options: js.UndefOr[js.Array[String]] = js.undefined
  var pickAlgorithm: js.UndefOr[js.Function2[/* algo1 */ String, /* algo2 */ String, String]] = js.undefined
  var single: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object AnonIntegrity {
  @scala.inline
  def apply(
    algorithms: js.Array[String] = null,
    integrity: String | IntegrityLike | HashLike = null,
    options: js.Array[String] = null,
    pickAlgorithm: (/* algo1 */ String, /* algo2 */ String) => CallbackTo[String] = null,
    single: js.UndefOr[Boolean] = js.undefined,
    size: Int | Double = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): AnonIntegrity = {
    val __obj = js.Dynamic.literal()
    if (algorithms != null) __obj.updateDynamic("algorithms")(algorithms.asInstanceOf[js.Any])
    if (integrity != null) __obj.updateDynamic("integrity")(integrity.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (pickAlgorithm != null) __obj.updateDynamic("pickAlgorithm")(js.Any.fromFunction2((t0: /* algo1 */ java.lang.String, t1: /* algo2 */ java.lang.String) => pickAlgorithm(t0, t1).runNow()))
    if (!js.isUndefined(single)) __obj.updateDynamic("single")(single.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIntegrity]
  }
}

