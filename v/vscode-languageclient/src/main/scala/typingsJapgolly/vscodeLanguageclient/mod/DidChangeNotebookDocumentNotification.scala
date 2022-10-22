package typingsJapgolly.vscodeLanguageclient.mod

import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.notebookDocumentSlashdidChange
import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.notebookDocumentSlashsync
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod.DidChangeNotebookDocumentParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidChangeNotebookDocumentNotification {
  
  @JSImport("vscode-languageclient", "DidChangeNotebookDocumentNotification.messageDirection")
  @js.native
  val messageDirection: typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "DidChangeNotebookDocumentNotification.method")
  @js.native
  val method: notebookDocumentSlashdidChange = js.native
  
  /* was `typeof NotebookDocumentSyncRegistrationType.method` */
  @JSImport("vscode-languageclient", "DidChangeNotebookDocumentNotification.registrationMethod")
  @js.native
  val registrationMethod: notebookDocumentSlashsync = js.native
  
  @JSImport("vscode-languageclient", "DidChangeNotebookDocumentNotification.type")
  @js.native
  val `type`: typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType[DidChangeNotebookDocumentParams, Unit] = js.native
}
