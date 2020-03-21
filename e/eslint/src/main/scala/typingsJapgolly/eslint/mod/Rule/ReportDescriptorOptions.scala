package typingsJapgolly.eslint.mod.Rule

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportDescriptorOptions extends js.Object {
  var data: js.UndefOr[StringDictionary[String]] = js.undefined
  var fix: js.UndefOr[
    js.Function1[/* fixer */ RuleFixer, Null | Fix | IterableIterator[Fix] | js.Array[Fix]]
  ] = js.undefined
}

object ReportDescriptorOptions {
  @scala.inline
  def apply(
    data: StringDictionary[String] = null,
    fix: /* fixer */ RuleFixer => CallbackTo[Null | Fix | IterableIterator[Fix] | js.Array[Fix]] = null
  ): ReportDescriptorOptions = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (fix != null) __obj.updateDynamic("fix")(js.Any.fromFunction1((t0: /* fixer */ typingsJapgolly.eslint.mod.Rule.RuleFixer) => fix(t0).runNow()))
    __obj.asInstanceOf[ReportDescriptorOptions]
  }
}

