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
import typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdeclaration
import typingsJapgolly.vscodeLanguageserverTypes.mod.Declaration
import typingsJapgolly.vscodeLanguageserverTypes.mod.DeclarationLink
import typingsJapgolly.vscodeLanguageserverTypes.mod.Location
import typingsJapgolly.vscodeLanguageserverTypes.mod.LocationLink
import typingsJapgolly.vscodeLanguageserverTypes.mod.Position
import typingsJapgolly.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonProtocolDotdeclarationMod {
  
  object DeclarationRequest {
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.declaration", "DeclarationRequest.messageDirection")
    @js.native
    val messageDirection: MessageDirection = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.declaration", "DeclarationRequest.method")
    @js.native
    val method: textDocumentSlashdeclaration = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.declaration", "DeclarationRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        DeclarationParams, 
        Declaration | js.Array[LocationLink] | Null, 
        js.Array[Location | LocationLink], 
        Unit, 
        DeclarationRegistrationOptions
      ] = js.native
    
    type HandlerSignature = RequestHandler[DeclarationParams, Declaration | js.Array[DeclarationLink] | Null, Unit]
  }
  
  trait DeclarationClientCapabilities extends StObject {
    
    /**
      * Whether declaration supports dynamic registration. If this is set to `true`
      * the client supports the new `DeclarationRegistrationOptions` return value
      * for the corresponding server capability as well.
      */
    var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The client supports additional metadata in the form of declaration links.
      */
    var linkSupport: js.UndefOr[Boolean] = js.undefined
  }
  object DeclarationClientCapabilities {
    
    inline def apply(): DeclarationClientCapabilities = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeclarationClientCapabilities]
    }
    
    extension [Self <: DeclarationClientCapabilities](x: Self) {
      
      inline def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
      
      inline def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
      
      inline def setLinkSupport(value: Boolean): Self = StObject.set(x, "linkSupport", value.asInstanceOf[js.Any])
      
      inline def setLinkSupportUndefined: Self = StObject.set(x, "linkSupport", js.undefined)
    }
  }
  
  type DeclarationOptions = WorkDoneProgressOptions
  
  trait DeclarationParams
    extends StObject
       with TextDocumentPositionParams
       with WorkDoneProgressParams
       with PartialResultParams
  object DeclarationParams {
    
    inline def apply(position: Position, textDocument: TextDocumentIdentifier): DeclarationParams = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeclarationParams]
    }
  }
  
  trait DeclarationRegistrationOptions
    extends StObject
       with WorkDoneProgressOptions
       with TextDocumentRegistrationOptions
       with StaticRegistrationOptions
  object DeclarationRegistrationOptions {
    
    inline def apply(): DeclarationRegistrationOptions = {
      val __obj = js.Dynamic.literal(documentSelector = null)
      __obj.asInstanceOf[DeclarationRegistrationOptions]
    }
  }
}
