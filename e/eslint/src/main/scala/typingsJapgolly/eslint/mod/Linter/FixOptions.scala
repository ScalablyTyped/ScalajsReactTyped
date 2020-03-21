package typingsJapgolly.eslint.mod.Linter

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FixOptions extends LintOptions {
  var fix: js.UndefOr[Boolean] = js.undefined
}

object FixOptions {
  @scala.inline
  def apply(
    allowInlineConfig: js.UndefOr[Boolean] = js.undefined,
    filename: String = null,
    fix: js.UndefOr[Boolean] = js.undefined,
    postprocess: /* problemLists */ js.Array[js.Array[LintMessage]] => CallbackTo[js.Array[LintMessage]] = null,
    preprocess: /* code */ String => CallbackTo[js.Array[String]] = null,
    reportUnusedDisableDirectives: js.UndefOr[Boolean] = js.undefined
  ): FixOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowInlineConfig)) __obj.updateDynamic("allowInlineConfig")(allowInlineConfig.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (!js.isUndefined(fix)) __obj.updateDynamic("fix")(fix.asInstanceOf[js.Any])
    if (postprocess != null) __obj.updateDynamic("postprocess")(js.Any.fromFunction1((t0: /* problemLists */ js.Array[js.Array[typingsJapgolly.eslint.mod.Linter.LintMessage]]) => postprocess(t0).runNow()))
    if (preprocess != null) __obj.updateDynamic("preprocess")(js.Any.fromFunction1((t0: /* code */ java.lang.String) => preprocess(t0).runNow()))
    if (!js.isUndefined(reportUnusedDisableDirectives)) __obj.updateDynamic("reportUnusedDisableDirectives")(reportUnusedDisableDirectives.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixOptions]
  }
}

