package typingsJapgolly.vscodeLanguageserverProtocol

import typingsJapgolly.vscodeJsonrpc.libCommonConnectionMod.RequestHandler
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.PartialResultParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.StaticRegistrationOptions
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentPositionParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentRegistrationOptions
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.WorkDoneProgressOptions
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.WorkDoneProgressParams
import typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.callHierarchySlashincomingCalls
import typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.callHierarchySlashoutgoingCalls
import typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashprepareCallHierarchy
import typingsJapgolly.vscodeLanguageserverTypes.mod.CallHierarchyIncomingCall
import typingsJapgolly.vscodeLanguageserverTypes.mod.CallHierarchyItem
import typingsJapgolly.vscodeLanguageserverTypes.mod.CallHierarchyOutgoingCall
import typingsJapgolly.vscodeLanguageserverTypes.mod.Position
import typingsJapgolly.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonProtocolDotcallHierarchyMod {
  
  object CallHierarchyIncomingCallsRequest {
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.callHierarchy", "CallHierarchyIncomingCallsRequest.messageDirection")
    @js.native
    val messageDirection: MessageDirection = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.callHierarchy", "CallHierarchyIncomingCallsRequest.method")
    @js.native
    val method: callHierarchySlashincomingCalls = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.callHierarchy", "CallHierarchyIncomingCallsRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        CallHierarchyIncomingCallsParams, 
        js.Array[CallHierarchyIncomingCall] | Null, 
        js.Array[CallHierarchyIncomingCall], 
        Unit, 
        Unit
      ] = js.native
    
    type HandlerSignature = RequestHandler[CallHierarchyIncomingCallsParams, js.Array[CallHierarchyIncomingCall] | Null, Unit]
  }
  
  object CallHierarchyOutgoingCallsRequest {
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.callHierarchy", "CallHierarchyOutgoingCallsRequest.messageDirection")
    @js.native
    val messageDirection: MessageDirection = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.callHierarchy", "CallHierarchyOutgoingCallsRequest.method")
    @js.native
    val method: callHierarchySlashoutgoingCalls = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.callHierarchy", "CallHierarchyOutgoingCallsRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        CallHierarchyOutgoingCallsParams, 
        js.Array[CallHierarchyOutgoingCall] | Null, 
        js.Array[CallHierarchyOutgoingCall], 
        Unit, 
        Unit
      ] = js.native
    
    type HandlerSignature = RequestHandler[CallHierarchyOutgoingCallsParams, js.Array[CallHierarchyOutgoingCall] | Null, Unit]
  }
  
  object CallHierarchyPrepareRequest {
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.callHierarchy", "CallHierarchyPrepareRequest.messageDirection")
    @js.native
    val messageDirection: MessageDirection = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.callHierarchy", "CallHierarchyPrepareRequest.method")
    @js.native
    val method: textDocumentSlashprepareCallHierarchy = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.callHierarchy", "CallHierarchyPrepareRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        CallHierarchyPrepareParams, 
        js.Array[CallHierarchyItem] | Null, 
        scala.Nothing, 
        Unit, 
        CallHierarchyRegistrationOptions
      ] = js.native
    
    type HandlerSignature = RequestHandler[CallHierarchyPrepareParams, js.Array[CallHierarchyItem] | Null, Unit]
  }
  
  trait CallHierarchyClientCapabilities extends StObject {
    
    /**
      * Whether implementation supports dynamic registration. If this is set to `true`
      * the client supports the new `(TextDocumentRegistrationOptions & StaticRegistrationOptions)`
      * return value for the corresponding server capability as well.
      */
    var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  }
  object CallHierarchyClientCapabilities {
    
    inline def apply(): CallHierarchyClientCapabilities = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CallHierarchyClientCapabilities]
    }
    
    extension [Self <: CallHierarchyClientCapabilities](x: Self) {
      
      inline def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
      
      inline def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
    }
  }
  
  trait CallHierarchyIncomingCallsParams
    extends StObject
       with WorkDoneProgressParams
       with PartialResultParams {
    
    var item: CallHierarchyItem
  }
  object CallHierarchyIncomingCallsParams {
    
    inline def apply(item: CallHierarchyItem): CallHierarchyIncomingCallsParams = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallHierarchyIncomingCallsParams]
    }
    
    extension [Self <: CallHierarchyIncomingCallsParams](x: Self) {
      
      inline def setItem(value: CallHierarchyItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  type CallHierarchyOptions = WorkDoneProgressOptions
  
  trait CallHierarchyOutgoingCallsParams
    extends StObject
       with WorkDoneProgressParams
       with PartialResultParams {
    
    var item: CallHierarchyItem
  }
  object CallHierarchyOutgoingCallsParams {
    
    inline def apply(item: CallHierarchyItem): CallHierarchyOutgoingCallsParams = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallHierarchyOutgoingCallsParams]
    }
    
    extension [Self <: CallHierarchyOutgoingCallsParams](x: Self) {
      
      inline def setItem(value: CallHierarchyItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  trait CallHierarchyPrepareParams
    extends StObject
       with TextDocumentPositionParams
       with WorkDoneProgressParams
  object CallHierarchyPrepareParams {
    
    inline def apply(position: Position, textDocument: TextDocumentIdentifier): CallHierarchyPrepareParams = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallHierarchyPrepareParams]
    }
  }
  
  trait CallHierarchyRegistrationOptions
    extends StObject
       with TextDocumentRegistrationOptions
       with WorkDoneProgressOptions
       with StaticRegistrationOptions
  object CallHierarchyRegistrationOptions {
    
    inline def apply(): CallHierarchyRegistrationOptions = {
      val __obj = js.Dynamic.literal(documentSelector = null)
      __obj.asInstanceOf[CallHierarchyRegistrationOptions]
    }
  }
}
