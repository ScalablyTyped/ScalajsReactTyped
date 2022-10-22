package typingsJapgolly.vscodeLanguageserverProtocol

import typingsJapgolly.vscodeJsonrpc.libCommonConnectionMod.RequestHandler
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.PartialResultParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.StaticRegistrationOptions
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentRegistrationOptions
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.WorkDoneProgressOptions
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.WorkDoneProgressParams
import typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashcolorPresentation
import typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdocumentColor
import typingsJapgolly.vscodeLanguageserverTypes.mod.Color
import typingsJapgolly.vscodeLanguageserverTypes.mod.ColorInformation
import typingsJapgolly.vscodeLanguageserverTypes.mod.ColorPresentation
import typingsJapgolly.vscodeLanguageserverTypes.mod.Range
import typingsJapgolly.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonProtocolDotcolorProviderMod {
  
  object ColorPresentationRequest {
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.colorProvider", "ColorPresentationRequest.messageDirection")
    @js.native
    val messageDirection: MessageDirection = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.colorProvider", "ColorPresentationRequest.method")
    @js.native
    val method: textDocumentSlashcolorPresentation = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.colorProvider", "ColorPresentationRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        ColorPresentationParams, 
        js.Array[ColorPresentation], 
        js.Array[ColorPresentation], 
        Unit, 
        WorkDoneProgressOptions & TextDocumentRegistrationOptions
      ] = js.native
    
    type HandlerSignature = RequestHandler[ColorPresentationParams, js.Array[ColorPresentation], Unit]
  }
  
  object DocumentColorRequest {
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.colorProvider", "DocumentColorRequest.messageDirection")
    @js.native
    val messageDirection: MessageDirection = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.colorProvider", "DocumentColorRequest.method")
    @js.native
    val method: textDocumentSlashdocumentColor = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.colorProvider", "DocumentColorRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        DocumentColorParams, 
        js.Array[ColorInformation], 
        js.Array[ColorInformation], 
        Unit, 
        DocumentColorRegistrationOptions
      ] = js.native
    
    type HandlerSignature = RequestHandler[DocumentColorParams, js.Array[ColorInformation], Unit]
  }
  
  trait ColorPresentationParams
    extends StObject
       with WorkDoneProgressParams
       with PartialResultParams {
    
    /**
      * The color to request presentations for.
      */
    var color: Color
    
    /**
      * The range where the color would be inserted. Serves as a context.
      */
    var range: Range
    
    /**
      * The text document.
      */
    var textDocument: TextDocumentIdentifier
  }
  object ColorPresentationParams {
    
    inline def apply(color: Color, range: Range, textDocument: TextDocumentIdentifier): ColorPresentationParams = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorPresentationParams]
    }
    
    extension [Self <: ColorPresentationParams](x: Self) {
      
      inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setTextDocument(value: TextDocumentIdentifier): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
    }
  }
  
  trait DocumentColorClientCapabilities extends StObject {
    
    /**
      * Whether implementation supports dynamic registration. If this is set to `true`
      * the client supports the new `DocumentColorRegistrationOptions` return value
      * for the corresponding server capability as well.
      */
    var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  }
  object DocumentColorClientCapabilities {
    
    inline def apply(): DocumentColorClientCapabilities = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentColorClientCapabilities]
    }
    
    extension [Self <: DocumentColorClientCapabilities](x: Self) {
      
      inline def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
      
      inline def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
    }
  }
  
  type DocumentColorOptions = WorkDoneProgressOptions
  
  trait DocumentColorParams
    extends StObject
       with WorkDoneProgressParams
       with PartialResultParams {
    
    /**
      * The text document.
      */
    var textDocument: TextDocumentIdentifier
  }
  object DocumentColorParams {
    
    inline def apply(textDocument: TextDocumentIdentifier): DocumentColorParams = {
      val __obj = js.Dynamic.literal(textDocument = textDocument.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocumentColorParams]
    }
    
    extension [Self <: DocumentColorParams](x: Self) {
      
      inline def setTextDocument(value: TextDocumentIdentifier): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
    }
  }
  
  trait DocumentColorRegistrationOptions
    extends StObject
       with TextDocumentRegistrationOptions
       with StaticRegistrationOptions
       with WorkDoneProgressOptions
  object DocumentColorRegistrationOptions {
    
    inline def apply(): DocumentColorRegistrationOptions = {
      val __obj = js.Dynamic.literal(documentSelector = null)
      __obj.asInstanceOf[DocumentColorRegistrationOptions]
    }
  }
}
