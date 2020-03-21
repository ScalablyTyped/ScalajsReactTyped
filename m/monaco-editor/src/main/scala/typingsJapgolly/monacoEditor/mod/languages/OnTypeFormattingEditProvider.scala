package typingsJapgolly.monacoEditor.mod.languages

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.monacoEditor.mod.CancellationToken
import typingsJapgolly.monacoEditor.mod.Position
import typingsJapgolly.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnTypeFormattingEditProvider extends js.Object {
  var autoFormatTriggerCharacters: js.Array[String]
  /**
    * Provide formatting edits after a character has been typed.
    *
    * The given position and character should hint to the provider
    * what range the position to expand to, like find the matching `{`
    * when `}` has been entered.
    */
  def provideOnTypeFormattingEdits(
    model: ITextModel,
    position: Position,
    ch: String,
    options: FormattingOptions,
    token: CancellationToken
  ): ProviderResult[js.Array[TextEdit]]
}

object OnTypeFormattingEditProvider {
  @scala.inline
  def apply(
    autoFormatTriggerCharacters: js.Array[String],
    provideOnTypeFormattingEdits: (ITextModel, Position, String, FormattingOptions, CancellationToken) => CallbackTo[ProviderResult[js.Array[TextEdit]]]
  ): OnTypeFormattingEditProvider = {
    val __obj = js.Dynamic.literal(autoFormatTriggerCharacters = autoFormatTriggerCharacters.asInstanceOf[js.Any])
    __obj.updateDynamic("provideOnTypeFormattingEdits")(js.Any.fromFunction5((t0: typingsJapgolly.monacoEditor.mod.editor.ITextModel, t1: typingsJapgolly.monacoEditor.mod.Position, t2: java.lang.String, t3: typingsJapgolly.monacoEditor.mod.languages.FormattingOptions, t4: typingsJapgolly.monacoEditor.mod.CancellationToken) => provideOnTypeFormattingEdits(t0, t1, t2, t3, t4).runNow()))
    __obj.asInstanceOf[OnTypeFormattingEditProvider]
  }
}

