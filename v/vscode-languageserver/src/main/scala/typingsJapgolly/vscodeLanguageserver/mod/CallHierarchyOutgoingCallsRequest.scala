package typingsJapgolly.vscodeLanguageserver.mod

import typingsJapgolly.vscodeLanguageserver.vscodeLanguageserverStrings.callHierarchySlashoutgoingCalls
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotcallHierarchyMod.CallHierarchyOutgoingCallsParams
import typingsJapgolly.vscodeLanguageserverTypes.mod.CallHierarchyOutgoingCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CallHierarchyOutgoingCallsRequest {
  
  @JSImport("vscode-languageserver", "CallHierarchyOutgoingCallsRequest.messageDirection")
  @js.native
  val messageDirection: typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "CallHierarchyOutgoingCallsRequest.method")
  @js.native
  val method: callHierarchySlashoutgoingCalls = js.native
  
  @JSImport("vscode-languageserver", "CallHierarchyOutgoingCallsRequest.type")
  @js.native
  val `type`: typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    CallHierarchyOutgoingCallsParams, 
    js.Array[CallHierarchyOutgoingCall] | Null, 
    js.Array[CallHierarchyOutgoingCall], 
    Unit, 
    Unit
  ] = js.native
}
