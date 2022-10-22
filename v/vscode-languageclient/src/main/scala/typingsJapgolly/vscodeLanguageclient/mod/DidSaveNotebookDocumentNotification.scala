package typingsJapgolly.vscodeLanguageclient.mod

import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.notebookDocumentSlashdidSave
import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.notebookDocumentSlashsync
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod.DidSaveNotebookDocumentParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidSaveNotebookDocumentNotification {
  
  @JSImport("vscode-languageclient", "DidSaveNotebookDocumentNotification.messageDirection")
  @js.native
  val messageDirection: typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "DidSaveNotebookDocumentNotification.method")
  @js.native
  val method: notebookDocumentSlashdidSave = js.native
  
  /* was `typeof NotebookDocumentSyncRegistrationType.method` */
  @JSImport("vscode-languageclient", "DidSaveNotebookDocumentNotification.registrationMethod")
  @js.native
  val registrationMethod: notebookDocumentSlashsync = js.native
  
  @JSImport("vscode-languageclient", "DidSaveNotebookDocumentNotification.type")
  @js.native
  val `type`: typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType[DidSaveNotebookDocumentParams, Unit] = js.native
}
