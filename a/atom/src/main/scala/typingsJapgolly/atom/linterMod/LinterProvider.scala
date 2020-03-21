package typingsJapgolly.atom.linterMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.atom.atomStrings.file
import typingsJapgolly.atom.atomStrings.project
import typingsJapgolly.atom.mod.TextEditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinterProvider extends js.Object {
  var grammarScopes: js.Array[String]
  var lintsOnChange: Boolean
  var name: String
  var scope: file | project
  def lint(editor: TextEditor): LintResult | js.Promise[LintResult]
}

object LinterProvider {
  @scala.inline
  def apply(
    grammarScopes: js.Array[String],
    lint: TextEditor => CallbackTo[LintResult | js.Promise[LintResult]],
    lintsOnChange: Boolean,
    name: String,
    scope: file | project
  ): LinterProvider = {
    val __obj = js.Dynamic.literal(grammarScopes = grammarScopes.asInstanceOf[js.Any], lintsOnChange = lintsOnChange.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.updateDynamic("lint")(js.Any.fromFunction1((t0: typingsJapgolly.atom.mod.TextEditor) => lint(t0).runNow()))
    __obj.asInstanceOf[LinterProvider]
  }
}

