package typingsJapgolly.vscodeLanguageserverProtocol.mod

import typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolInts.`1`
import typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolInts.`2`
import typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolInts.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WatchKind {
  
  /**
    * Interested in change events
    */
  @JSImport("vscode-languageserver-protocol", "WatchKind.Change")
  @js.native
  val Change: `2` = js.native
  
  /**
    * Interested in create events.
    */
  @JSImport("vscode-languageserver-protocol", "WatchKind.Create")
  @js.native
  val Create: `1` = js.native
  
  /**
    * Interested in delete events
    */
  @JSImport("vscode-languageserver-protocol", "WatchKind.Delete")
  @js.native
  val Delete: `4` = js.native
}
