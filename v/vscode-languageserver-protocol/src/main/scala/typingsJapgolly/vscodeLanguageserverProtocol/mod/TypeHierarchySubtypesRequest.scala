package typingsJapgolly.vscodeLanguageserverProtocol.mod

import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDottypeHierarchyMod.TypeHierarchySubtypesParams
import typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.typeHierarchySlashsubtypes
import typingsJapgolly.vscodeLanguageserverTypes.mod.TypeHierarchyItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TypeHierarchySubtypesRequest {
  
  @JSImport("vscode-languageserver-protocol", "TypeHierarchySubtypesRequest.messageDirection")
  @js.native
  val messageDirection: typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "TypeHierarchySubtypesRequest.method")
  @js.native
  val method: typeHierarchySlashsubtypes = js.native
  
  @JSImport("vscode-languageserver-protocol", "TypeHierarchySubtypesRequest.type")
  @js.native
  val `type`: typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    TypeHierarchySubtypesParams, 
    js.Array[TypeHierarchyItem] | Null, 
    js.Array[TypeHierarchyItem], 
    Unit, 
    Unit
  ] = js.native
}
