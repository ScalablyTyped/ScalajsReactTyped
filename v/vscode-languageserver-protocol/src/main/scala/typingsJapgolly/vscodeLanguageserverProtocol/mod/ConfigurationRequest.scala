package typingsJapgolly.vscodeLanguageserverProtocol.mod

import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotconfigurationMod.ConfigurationParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.PartialResultParams
import typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.workspaceSlashconfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ConfigurationRequest {
  
  @JSImport("vscode-languageserver-protocol", "ConfigurationRequest.messageDirection")
  @js.native
  val messageDirection: typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "ConfigurationRequest.method")
  @js.native
  val method: workspaceSlashconfiguration = js.native
  
  @JSImport("vscode-languageserver-protocol", "ConfigurationRequest.type")
  @js.native
  val `type`: typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[ConfigurationParams & PartialResultParams, js.Array[Any], scala.Nothing, Unit, Unit] = js.native
}
