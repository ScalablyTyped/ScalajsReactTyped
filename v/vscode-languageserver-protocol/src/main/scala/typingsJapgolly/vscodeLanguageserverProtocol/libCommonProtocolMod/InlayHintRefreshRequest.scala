package typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod

import typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InlayHintRefreshRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "InlayHintRefreshRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "InlayHintRefreshRequest.method")
  @js.native
  val method: /* template literal string: workspace/inlayHint/refresh */ String = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "InlayHintRefreshRequest.type")
  @js.native
  val `type`: ProtocolRequestType0[Unit, Unit, Unit, Unit] = js.native
}
