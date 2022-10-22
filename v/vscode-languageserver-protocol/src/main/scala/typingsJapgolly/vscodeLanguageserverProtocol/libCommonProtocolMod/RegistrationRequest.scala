package typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod

import typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.clientSlashregisterCapability
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RegistrationRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "RegistrationRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "RegistrationRequest.method")
  @js.native
  val method: clientSlashregisterCapability = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "RegistrationRequest.type")
  @js.native
  val `type`: ProtocolRequestType[RegistrationParams, Unit, scala.Nothing, Unit, Unit] = js.native
}
