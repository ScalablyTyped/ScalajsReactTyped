package typingsJapgolly.vscodeLanguageclient.mod

import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.clientSlashunregisterCapability
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.UnregistrationParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UnregistrationRequest {
  
  @JSImport("vscode-languageclient", "UnregistrationRequest.messageDirection")
  @js.native
  val messageDirection: typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "UnregistrationRequest.method")
  @js.native
  val method: clientSlashunregisterCapability = js.native
  
  @JSImport("vscode-languageclient", "UnregistrationRequest.type")
  @js.native
  val `type`: typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[UnregistrationParams, Unit, scala.Nothing, Unit, Unit] = js.native
}
