package typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.create
  - typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.rename
  - typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.delete
*/
trait ResourceOperationKind extends StObject
object ResourceOperationKind {
  
  /**
    * Supports creating new files and folders.
    */
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "ResourceOperationKind.Create")
  @js.native
  val Create: ResourceOperationKind = js.native
  
  /**
    * Supports deleting existing files and folders.
    */
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "ResourceOperationKind.Delete")
  @js.native
  val Delete: ResourceOperationKind = js.native
  
  /**
    * Supports renaming existing files and folders.
    */
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "ResourceOperationKind.Rename")
  @js.native
  val Rename: ResourceOperationKind = js.native
}
