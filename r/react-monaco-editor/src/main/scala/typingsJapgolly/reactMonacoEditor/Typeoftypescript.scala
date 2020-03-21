package typingsJapgolly.reactMonacoEditor

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.monacoEditor.mod.languages.typescript.LanguageServiceDefaults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoftypescript extends js.Object {
  var getJavaScriptWorker: js.Function0[js.Promise[_]]
  var getTypeScriptWorker: js.Function0[js.Promise[_]]
  var javascriptDefaults: LanguageServiceDefaults
  var typescriptDefaults: LanguageServiceDefaults
  var typescriptVersion: String
}

object Typeoftypescript {
  @scala.inline
  def apply(
    getJavaScriptWorker: CallbackTo[js.Promise[js.Any]],
    getTypeScriptWorker: CallbackTo[js.Promise[js.Any]],
    javascriptDefaults: LanguageServiceDefaults,
    typescriptDefaults: LanguageServiceDefaults,
    typescriptVersion: String
  ): Typeoftypescript = {
    val __obj = js.Dynamic.literal(javascriptDefaults = javascriptDefaults.asInstanceOf[js.Any], typescriptDefaults = typescriptDefaults.asInstanceOf[js.Any], typescriptVersion = typescriptVersion.asInstanceOf[js.Any])
    __obj.updateDynamic("getJavaScriptWorker")(getJavaScriptWorker.toJsFn)
    __obj.updateDynamic("getTypeScriptWorker")(getTypeScriptWorker.toJsFn)
    __obj.asInstanceOf[Typeoftypescript]
  }
}

