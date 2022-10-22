package typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod

import typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.initialize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InitializeRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "InitializeRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "InitializeRequest.method")
  @js.native
  val method: initialize = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "InitializeRequest.type")
  @js.native
  val `type`: ProtocolRequestType[InitializeParams, InitializeResult[Any], scala.Nothing, InitializeError, Unit] = js.native
}
