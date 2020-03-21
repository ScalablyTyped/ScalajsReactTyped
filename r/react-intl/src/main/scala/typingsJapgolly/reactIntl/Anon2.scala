package typingsJapgolly.reactIntl

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon2 extends js.Object {
  var children: js.UndefOr[js.Function1[/* val */ String, Element | Null]] = js.undefined
  var value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DisplayNames * / any['of']>[0], opts ? : react-intl.react-intl/lib/types.FormatDisplayNameOptions): string | undefined>[0] */ js.Any
}

object Anon2 {
  @scala.inline
  def apply(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DisplayNames * / any['of']>[0], opts ? : react-intl.react-intl/lib/types.FormatDisplayNameOptions): string | undefined>[0] */ js.Any,
    children: /* val */ String => CallbackTo[Element | Null] = null
  ): Anon2 = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* val */ java.lang.String) => children(t0).runNow()))
    __obj.asInstanceOf[Anon2]
  }
}

