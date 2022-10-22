package typingsJapgolly.vscodeLanguageclient.mod

import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.workspaceSlashdidChangeWatchedFiles
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DidChangeWatchedFilesParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DidChangeWatchedFilesRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidChangeWatchedFilesNotification {
  
  @JSImport("vscode-languageclient", "DidChangeWatchedFilesNotification.messageDirection")
  @js.native
  val messageDirection: typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "DidChangeWatchedFilesNotification.method")
  @js.native
  val method: workspaceSlashdidChangeWatchedFiles = js.native
  
  @JSImport("vscode-languageclient", "DidChangeWatchedFilesNotification.type")
  @js.native
  val `type`: typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType[DidChangeWatchedFilesParams, DidChangeWatchedFilesRegistrationOptions] = js.native
}
