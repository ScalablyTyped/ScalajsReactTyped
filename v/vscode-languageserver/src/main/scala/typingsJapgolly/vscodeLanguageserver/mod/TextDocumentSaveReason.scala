package typingsJapgolly.vscodeLanguageserver.mod

import typingsJapgolly.vscodeLanguageserver.vscodeLanguageserverInts.`1`
import typingsJapgolly.vscodeLanguageserver.vscodeLanguageserverInts.`2`
import typingsJapgolly.vscodeLanguageserver.vscodeLanguageserverInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextDocumentSaveReason {
  
  /**
    * Automatic after a delay.
    */
  @JSImport("vscode-languageserver", "TextDocumentSaveReason.AfterDelay")
  @js.native
  val AfterDelay: `2` = js.native
  
  /**
    * When the editor lost focus.
    */
  @JSImport("vscode-languageserver", "TextDocumentSaveReason.FocusOut")
  @js.native
  val FocusOut: `3` = js.native
  
  /**
    * Manually triggered, e.g. by the user pressing save, by starting debugging,
    * or by an API call.
    */
  @JSImport("vscode-languageserver", "TextDocumentSaveReason.Manual")
  @js.native
  val Manual: `1` = js.native
}
