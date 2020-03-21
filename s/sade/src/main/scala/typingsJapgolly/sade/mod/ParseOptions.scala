package typingsJapgolly.sade.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.mri.mod.ArrayOrString
import typingsJapgolly.mri.mod.DictionaryObject
import typingsJapgolly.mri.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends Options {
  var `lazy`: js.UndefOr[Boolean] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(
    alias: DictionaryObject[ArrayOrString] = null,
    boolean: ArrayOrString = null,
    default: DictionaryObject[_] = null,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    string: ArrayOrString = null,
    unknown: /* flag */ String => Callback = null
  ): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (boolean != null) __obj.updateDynamic("boolean")(boolean.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (string != null) __obj.updateDynamic("string")(string.asInstanceOf[js.Any])
    if (unknown != null) __obj.updateDynamic("unknown")(js.Any.fromFunction1((t0: /* flag */ java.lang.String) => unknown(t0).runNow()))
    __obj.asInstanceOf[ParseOptions]
  }
}

