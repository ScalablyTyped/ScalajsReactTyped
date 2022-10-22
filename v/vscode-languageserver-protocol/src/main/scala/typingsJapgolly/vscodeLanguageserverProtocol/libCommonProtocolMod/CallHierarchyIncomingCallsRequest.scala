package typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod

import typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotcallHierarchyMod.CallHierarchyIncomingCallsParams
import typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.callHierarchySlashincomingCalls
import typingsJapgolly.vscodeLanguageserverTypes.mod.CallHierarchyIncomingCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CallHierarchyIncomingCallsRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "CallHierarchyIncomingCallsRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "CallHierarchyIncomingCallsRequest.method")
  @js.native
  val method: callHierarchySlashincomingCalls = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "CallHierarchyIncomingCallsRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    CallHierarchyIncomingCallsParams, 
    js.Array[CallHierarchyIncomingCall] | Null, 
    js.Array[CallHierarchyIncomingCall], 
    Unit, 
    Unit
  ] = js.native
}
