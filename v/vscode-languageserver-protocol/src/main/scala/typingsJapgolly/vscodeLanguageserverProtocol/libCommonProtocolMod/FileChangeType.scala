package typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolInts.`1`
  - typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolInts.`2`
  - typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolInts.`3`
*/
trait FileChangeType extends StObject
object FileChangeType {
  
  /**
    * The file got changed.
    */
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "FileChangeType.Changed")
  @js.native
  val Changed: /* 2 */ Double = js.native
  
  /**
    * The file got created.
    */
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "FileChangeType.Created")
  @js.native
  val Created: /* 1 */ Double = js.native
  
  /**
    * The file got deleted.
    */
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "FileChangeType.Deleted")
  @js.native
  val Deleted: /* 3 */ Double = js.native
}
