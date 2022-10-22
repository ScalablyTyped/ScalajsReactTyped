package typingsJapgolly.vscodeLanguageserverTypes.mod

import typingsJapgolly.vscodeLanguageserverTypes.vscodeLanguageserverTypesInts.`1`
import typingsJapgolly.vscodeLanguageserverTypes.vscodeLanguageserverTypesInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vscodeLanguageserverTypes.vscodeLanguageserverTypesInts.`1`
  - typingsJapgolly.vscodeLanguageserverTypes.vscodeLanguageserverTypesInts.`2`
*/
trait CodeActionTriggerKind extends StObject
object CodeActionTriggerKind {
  
  /**
    * Code actions were requested automatically.
    *
    * This typically happens when current selection in a file changes, but can
    * also be triggered when file content changes.
    */
  @JSImport("vscode-languageserver-types", "CodeActionTriggerKind.Automatic")
  @js.native
  val Automatic: `2` = js.native
  
  /**
    * Code actions were explicitly requested by the user or by an extension.
    */
  @JSImport("vscode-languageserver-types", "CodeActionTriggerKind.Invoked")
  @js.native
  val Invoked: `1` = js.native
}
