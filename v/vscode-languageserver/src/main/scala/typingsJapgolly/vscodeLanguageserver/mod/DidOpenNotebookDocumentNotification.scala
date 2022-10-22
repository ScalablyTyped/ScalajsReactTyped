package typingsJapgolly.vscodeLanguageserver.mod

import typingsJapgolly.vscodeLanguageserver.vscodeLanguageserverStrings.notebookDocumentSlashdidOpen
import typingsJapgolly.vscodeLanguageserver.vscodeLanguageserverStrings.notebookDocumentSlashsync
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod.DidOpenNotebookDocumentParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidOpenNotebookDocumentNotification {
  
  @JSImport("vscode-languageserver", "DidOpenNotebookDocumentNotification.messageDirection")
  @js.native
  val messageDirection: typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "DidOpenNotebookDocumentNotification.method")
  @js.native
  val method: notebookDocumentSlashdidOpen = js.native
  
  /* was `typeof NotebookDocumentSyncRegistrationType.method` */
  @JSImport("vscode-languageserver", "DidOpenNotebookDocumentNotification.registrationMethod")
  @js.native
  val registrationMethod: notebookDocumentSlashsync = js.native
  
  @JSImport("vscode-languageserver", "DidOpenNotebookDocumentNotification.type")
  @js.native
  val `type`: typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType[DidOpenNotebookDocumentParams, Unit] = js.native
}
