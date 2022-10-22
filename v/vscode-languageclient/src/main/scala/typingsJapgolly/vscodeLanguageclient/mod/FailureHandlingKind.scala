package typingsJapgolly.vscodeLanguageclient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FailureHandlingKind {
  
  /**
    * Applying the workspace change is simply aborted if one of the changes provided
    * fails. All operations executed before the failing operation stay executed.
    */
  @JSImport("vscode-languageclient", "FailureHandlingKind.Abort")
  @js.native
  val Abort: typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.FailureHandlingKind = js.native
  
  /**
    * If the workspace edit contains only textual file changes they are executed transactional.
    * If resource changes (create, rename or delete file) are part of the change the failure
    * handling strategy is abort.
    */
  @JSImport("vscode-languageclient", "FailureHandlingKind.TextOnlyTransactional")
  @js.native
  val TextOnlyTransactional: typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.FailureHandlingKind = js.native
  
  /**
    * All operations are executed transactional. That means they either all
    * succeed or no changes at all are applied to the workspace.
    */
  @JSImport("vscode-languageclient", "FailureHandlingKind.Transactional")
  @js.native
  val Transactional: typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.FailureHandlingKind = js.native
  
  /**
    * The client tries to undo the operations already executed. But there is no
    * guarantee that this is succeeding.
    */
  @JSImport("vscode-languageclient", "FailureHandlingKind.Undo")
  @js.native
  val Undo: typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.FailureHandlingKind = js.native
}
