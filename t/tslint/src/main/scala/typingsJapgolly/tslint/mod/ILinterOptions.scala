package typingsJapgolly.tslint.mod

import typingsJapgolly.tslint.formatterMod.FormatterConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILinterOptions extends js.Object {
  var fix: Boolean
  var formatter: js.UndefOr[String | FormatterConstructor] = js.undefined
  var formattersDirectory: js.UndefOr[String] = js.undefined
  var quiet: js.UndefOr[Boolean] = js.undefined
  var rulesDirectory: js.UndefOr[String | js.Array[String]] = js.undefined
}

object ILinterOptions {
  @scala.inline
  def apply(
    fix: Boolean,
    formatter: String | FormatterConstructor = null,
    formattersDirectory: String = null,
    quiet: js.UndefOr[Boolean] = js.undefined,
    rulesDirectory: String | js.Array[String] = null
  ): ILinterOptions = {
    val __obj = js.Dynamic.literal(fix = fix.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (formattersDirectory != null) __obj.updateDynamic("formattersDirectory")(formattersDirectory.asInstanceOf[js.Any])
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet.asInstanceOf[js.Any])
    if (rulesDirectory != null) __obj.updateDynamic("rulesDirectory")(rulesDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILinterOptions]
  }
}

