package typingsJapgolly.vscodeLanguageserver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "DocumentHighlight")
@js.native
object DocumentHighlight extends js.Object {
  /**
    * Create a DocumentHighlight object.
    * @param range The range the highlight applies to.
    */
  def create(range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range): typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentHighlight = js.native
  def create(
    range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range,
    kind: typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentHighlightKind
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentHighlight = js.native
}

