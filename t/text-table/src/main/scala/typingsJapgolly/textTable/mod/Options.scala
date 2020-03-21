package typingsJapgolly.textTable.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.textTable.textTableStrings.Dot
import typingsJapgolly.textTable.textTableStrings.c
import typingsJapgolly.textTable.textTableStrings.l
import typingsJapgolly.textTable.textTableStrings.r
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** An array of alignment types for each column, default ['l','l',...]. */
  var align: js.UndefOr[js.Array[js.UndefOr[l | r | c | Dot | Null]]] = js.undefined
  /** Separator to use between columns, (default: ' '). */
  var hsep: js.UndefOr[String] = js.undefined
  /** A callback function to use when calculating the string length. */
  var stringLength: js.UndefOr[js.Function1[/* str */ String, Double]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    align: js.Array[js.UndefOr[l | r | c | Dot | Null]] = null,
    hsep: String = null,
    stringLength: /* str */ String => CallbackTo[Double] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (hsep != null) __obj.updateDynamic("hsep")(hsep.asInstanceOf[js.Any])
    if (stringLength != null) __obj.updateDynamic("stringLength")(js.Any.fromFunction1((t0: /* str */ java.lang.String) => stringLength(t0).runNow()))
    __obj.asInstanceOf[Options]
  }
}

