package typingsJapgolly.vscodeLanguageserverProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CompletionList {
  
  @JSImport("vscode-languageserver-protocol", "CompletionList")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new completion list.
    *
    * @param items The completion items.
    * @param isIncomplete The list is not complete.
    */
  inline def create(): typingsJapgolly.vscodeLanguageserverTypes.mod.CompletionList = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.CompletionList]
  inline def create(items: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.CompletionItem]): typingsJapgolly.vscodeLanguageserverTypes.mod.CompletionList = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(items.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.CompletionList]
  inline def create(
    items: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.CompletionItem],
    isIncomplete: Boolean
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.CompletionList = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(items.asInstanceOf[js.Any], isIncomplete.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.CompletionList]
  inline def create(items: Unit, isIncomplete: Boolean): typingsJapgolly.vscodeLanguageserverTypes.mod.CompletionList = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(items.asInstanceOf[js.Any], isIncomplete.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.CompletionList]
}
