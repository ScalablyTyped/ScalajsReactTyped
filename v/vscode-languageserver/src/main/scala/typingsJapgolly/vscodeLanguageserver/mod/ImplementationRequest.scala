package typingsJapgolly.vscodeLanguageserver.mod

import typingsJapgolly.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashimplementation
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotimplementationMod.ImplementationParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotimplementationMod.ImplementationRegistrationOptions
import typingsJapgolly.vscodeLanguageserverTypes.mod.Definition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ImplementationRequest {
  
  @JSImport("vscode-languageserver", "ImplementationRequest.messageDirection")
  @js.native
  val messageDirection: typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "ImplementationRequest.method")
  @js.native
  val method: textDocumentSlashimplementation = js.native
  
  @JSImport("vscode-languageserver", "ImplementationRequest.type")
  @js.native
  val `type`: typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    ImplementationParams, 
    Definition | js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.LocationLink] | Null, 
    js.Array[
      typingsJapgolly.vscodeLanguageserverTypes.mod.Location | typingsJapgolly.vscodeLanguageserverTypes.mod.LocationLink
    ], 
    Unit, 
    ImplementationRegistrationOptions
  ] = js.native
}
