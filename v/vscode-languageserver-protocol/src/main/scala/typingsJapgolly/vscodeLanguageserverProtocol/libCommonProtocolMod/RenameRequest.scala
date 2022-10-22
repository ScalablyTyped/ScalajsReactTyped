package typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod

import typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashrename
import typingsJapgolly.vscodeLanguageserverTypes.mod.WorkspaceEdit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RenameRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "RenameRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "RenameRequest.method")
  @js.native
  val method: textDocumentSlashrename = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "RenameRequest.type")
  @js.native
  val `type`: ProtocolRequestType[RenameParams, WorkspaceEdit | Null, scala.Nothing, Unit, RenameRegistrationOptions] = js.native
}
