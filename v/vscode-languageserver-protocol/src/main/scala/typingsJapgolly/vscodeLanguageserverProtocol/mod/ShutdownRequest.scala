package typingsJapgolly.vscodeLanguageserverProtocol.mod

import typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.shutdown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ShutdownRequest {
  
  @JSImport("vscode-languageserver-protocol", "ShutdownRequest.messageDirection")
  @js.native
  val messageDirection: typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "ShutdownRequest.method")
  @js.native
  val method: shutdown = js.native
  
  @JSImport("vscode-languageserver-protocol", "ShutdownRequest.type")
  @js.native
  val `type`: typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType0[Unit, scala.Nothing, Unit, Unit] = js.native
}
