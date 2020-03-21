package typingsJapgolly.vscodeLanguageclient.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "CompletionList")
@js.native
object CompletionList extends js.Object {
  /**
    * Creates a new completion list.
    *
    * @param items The completion items.
    * @param isIncomplete The list is not complete.
    */
  def create(): typingsJapgolly.vscodeLanguageserverTypes.mod.CompletionList = js.native
  def create(items: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.CompletionItem]): typingsJapgolly.vscodeLanguageserverTypes.mod.CompletionList = js.native
  def create(
    items: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.CompletionItem],
    isIncomplete: Boolean
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.CompletionList = js.native
}

