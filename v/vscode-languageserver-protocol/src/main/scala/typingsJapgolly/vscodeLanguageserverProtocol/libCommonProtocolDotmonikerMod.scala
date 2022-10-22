package typingsJapgolly.vscodeLanguageserverProtocol

import typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.PartialResultParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentPositionParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentRegistrationOptions
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.WorkDoneProgressOptions
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.WorkDoneProgressParams
import typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashmoniker
import typingsJapgolly.vscodeLanguageserverTypes.mod.Position
import typingsJapgolly.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonProtocolDotmonikerMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.`import`
    - typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.`export`
    - typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.local
  */
  trait MonikerKind extends StObject
  object MonikerKind {
    
    /**
      * The moniker represents a symbol that is exported from a project
      */
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.moniker", "MonikerKind.$export")
    @js.native
    val `export`: /* "export" */ String = js.native
    
    /**
      * The moniker represent a symbol that is imported into a project
      */
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.moniker", "MonikerKind.$import")
    @js.native
    val `import`: /* "import" */ String = js.native
    
    /**
      * The moniker represents a symbol that is local to a project (e.g. a local
      * variable of a function, a class not visible outside the project, ...)
      */
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.moniker", "MonikerKind.local")
    @js.native
    val local: /* "local" */ String = js.native
  }
  
  object MonikerRequest {
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.moniker", "MonikerRequest.messageDirection")
    @js.native
    val messageDirection: MessageDirection = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.moniker", "MonikerRequest.method")
    @js.native
    val method: textDocumentSlashmoniker = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.moniker", "MonikerRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        MonikerParams, 
        js.Array[Moniker] | Null, 
        js.Array[Moniker], 
        Unit, 
        MonikerRegistrationOptions
      ] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.document
    - typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.project
    - typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.group
    - typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.scheme
    - typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.global
  */
  trait UniquenessLevel extends StObject
  object UniquenessLevel {
    
    /**
      * The moniker is only unique inside a document
      */
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.moniker", "UniquenessLevel.document")
    @js.native
    val document: /* "document" */ String = js.native
    
    /**
      * The moniker is globally unique
      */
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.moniker", "UniquenessLevel.global")
    @js.native
    val global: /* "global" */ String = js.native
    
    /**
      * The moniker is unique inside the group to which a project belongs
      */
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.moniker", "UniquenessLevel.group")
    @js.native
    val group: /* "group" */ String = js.native
    
    /**
      * The moniker is unique inside a project for which a dump got created
      */
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.moniker", "UniquenessLevel.project")
    @js.native
    val project: /* "project" */ String = js.native
    
    /**
      * The moniker is unique inside the moniker scheme.
      */
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.moniker", "UniquenessLevel.scheme")
    @js.native
    val scheme: /* "scheme" */ String = js.native
  }
  
  trait Moniker extends StObject {
    
    /**
      * The identifier of the moniker. The value is opaque in LSIF however
      * schema owners are allowed to define the structure if they want.
      */
    var identifier: String
    
    /**
      * The moniker kind if known.
      */
    var kind: js.UndefOr[MonikerKind] = js.undefined
    
    /**
      * The scheme of the moniker. For example tsc or .Net
      */
    var scheme: String
    
    /**
      * The scope in which the moniker is unique
      */
    var unique: UniquenessLevel
  }
  object Moniker {
    
    inline def apply(identifier: String, scheme: String, unique: UniquenessLevel): Moniker = {
      val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], unique = unique.asInstanceOf[js.Any])
      __obj.asInstanceOf[Moniker]
    }
    
    extension [Self <: Moniker](x: Self) {
      
      inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setKind(value: MonikerKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      inline def setUnique(value: UniquenessLevel): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
    }
  }
  
  trait MonikerClientCapabilities extends StObject {
    
    /**
      * Whether moniker supports dynamic registration. If this is set to `true`
      * the client supports the new `MonikerRegistrationOptions` return value
      * for the corresponding server capability as well.
      */
    var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  }
  object MonikerClientCapabilities {
    
    inline def apply(): MonikerClientCapabilities = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MonikerClientCapabilities]
    }
    
    extension [Self <: MonikerClientCapabilities](x: Self) {
      
      inline def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
      
      inline def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
    }
  }
  
  type MonikerOptions = WorkDoneProgressOptions
  
  trait MonikerParams
    extends StObject
       with TextDocumentPositionParams
       with WorkDoneProgressParams
       with PartialResultParams
  object MonikerParams {
    
    inline def apply(position: Position, textDocument: TextDocumentIdentifier): MonikerParams = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
      __obj.asInstanceOf[MonikerParams]
    }
  }
  
  trait MonikerRegistrationOptions
    extends StObject
       with TextDocumentRegistrationOptions
       with WorkDoneProgressOptions
  object MonikerRegistrationOptions {
    
    inline def apply(): MonikerRegistrationOptions = {
      val __obj = js.Dynamic.literal(documentSelector = null)
      __obj.asInstanceOf[MonikerRegistrationOptions]
    }
  }
  
  trait MonikerServerCapabilities extends StObject
}
