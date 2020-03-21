package typingsJapgolly.mri.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Additional aliases for specific flags */
  var alias: js.UndefOr[DictionaryObject[ArrayOrString]] = js.undefined
  /** A flag or array of flags whose values are boolean */
  var boolean: js.UndefOr[ArrayOrString] = js.undefined
  /** Default values for flags */
  var default: js.UndefOr[DictionaryObject[_]] = js.undefined
  var string: js.UndefOr[ArrayOrString] = js.undefined
  var unknown: js.UndefOr[js.Function1[/* flag */ String, Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    alias: DictionaryObject[ArrayOrString] = null,
    boolean: ArrayOrString = null,
    default: DictionaryObject[_] = null,
    string: ArrayOrString = null,
    unknown: /* flag */ String => Callback = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (boolean != null) __obj.updateDynamic("boolean")(boolean.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (string != null) __obj.updateDynamic("string")(string.asInstanceOf[js.Any])
    if (unknown != null) __obj.updateDynamic("unknown")(js.Any.fromFunction1((t0: /* flag */ java.lang.String) => unknown(t0).runNow()))
    __obj.asInstanceOf[Options]
  }
}

