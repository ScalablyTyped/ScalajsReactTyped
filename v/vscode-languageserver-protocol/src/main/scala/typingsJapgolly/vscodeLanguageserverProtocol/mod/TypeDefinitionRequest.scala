package typingsJapgolly.vscodeLanguageserverProtocol.mod

import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDottypeDefinitionMod.TypeDefinitionParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDottypeDefinitionMod.TypeDefinitionRegistrationOptions
import typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashtypeDefinition
import typingsJapgolly.vscodeLanguageserverTypes.mod.Definition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TypeDefinitionRequest {
  
  @JSImport("vscode-languageserver-protocol", "TypeDefinitionRequest.messageDirection")
  @js.native
  val messageDirection: typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "TypeDefinitionRequest.method")
  @js.native
  val method: textDocumentSlashtypeDefinition = js.native
  
  @JSImport("vscode-languageserver-protocol", "TypeDefinitionRequest.type")
  @js.native
  val `type`: typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    TypeDefinitionParams, 
    Definition | js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.LocationLink] | Null, 
    js.Array[
      typingsJapgolly.vscodeLanguageserverTypes.mod.Location | typingsJapgolly.vscodeLanguageserverTypes.mod.LocationLink
    ], 
    Unit, 
    TypeDefinitionRegistrationOptions
  ] = js.native
}
