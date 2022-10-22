package typingsJapgolly.vscodeLanguageserver.mod

import typingsJapgolly.vscodeLanguageserver.vscodeLanguageserverStrings.notebookDocumentSlashdidChange
import typingsJapgolly.vscodeLanguageserver.vscodeLanguageserverStrings.notebookDocumentSlashsync
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod.DidChangeNotebookDocumentParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidChangeNotebookDocumentNotification {
  
  @JSImport("vscode-languageserver", "DidChangeNotebookDocumentNotification.messageDirection")
  @js.native
  val messageDirection: typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "DidChangeNotebookDocumentNotification.method")
  @js.native
  val method: notebookDocumentSlashdidChange = js.native
  
  /* was `typeof NotebookDocumentSyncRegistrationType.method` */
  @JSImport("vscode-languageserver", "DidChangeNotebookDocumentNotification.registrationMethod")
  @js.native
  val registrationMethod: notebookDocumentSlashsync = js.native
  
  @JSImport("vscode-languageserver", "DidChangeNotebookDocumentNotification.type")
  @js.native
  val `type`: typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType[DidChangeNotebookDocumentParams, Unit] = js.native
}
