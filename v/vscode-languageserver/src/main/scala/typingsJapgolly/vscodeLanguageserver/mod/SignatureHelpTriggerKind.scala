package typingsJapgolly.vscodeLanguageserver.mod

import typingsJapgolly.vscodeLanguageserver.vscodeLanguageserverInts.`1`
import typingsJapgolly.vscodeLanguageserver.vscodeLanguageserverInts.`2`
import typingsJapgolly.vscodeLanguageserver.vscodeLanguageserverInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SignatureHelpTriggerKind {
  
  /**
    * Signature help was triggered by the cursor moving or by the document content changing.
    */
  @JSImport("vscode-languageserver", "SignatureHelpTriggerKind.ContentChange")
  @js.native
  val ContentChange: `3` = js.native
  
  /**
    * Signature help was invoked manually by the user or by a command.
    */
  @JSImport("vscode-languageserver", "SignatureHelpTriggerKind.Invoked")
  @js.native
  val Invoked: `1` = js.native
  
  /**
    * Signature help was triggered by a trigger character.
    */
  @JSImport("vscode-languageserver", "SignatureHelpTriggerKind.TriggerCharacter")
  @js.native
  val TriggerCharacter: `2` = js.native
}
