package typingsJapgolly.vscodeLanguageclient.mod

import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.typeHierarchySlashsupertypes
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDottypeHierarchyMod.TypeHierarchySupertypesParams
import typingsJapgolly.vscodeLanguageserverTypes.mod.TypeHierarchyItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TypeHierarchySupertypesRequest {
  
  @JSImport("vscode-languageclient", "TypeHierarchySupertypesRequest.messageDirection")
  @js.native
  val messageDirection: typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "TypeHierarchySupertypesRequest.method")
  @js.native
  val method: typeHierarchySlashsupertypes = js.native
  
  @JSImport("vscode-languageclient", "TypeHierarchySupertypesRequest.type")
  @js.native
  val `type`: typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    TypeHierarchySupertypesParams, 
    js.Array[TypeHierarchyItem] | Null, 
    js.Array[TypeHierarchyItem], 
    Unit, 
    Unit
  ] = js.native
}
