package typingsJapgolly.vscodeLanguageserverProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol", "MessageDirection")
@js.native
object MessageDirection extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[
    typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection & String
  ] = js.native
  
  /* "both" */ val both: typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection.both & String = js.native
  
  /* "clientToServer" */ val clientToServer: typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection.clientToServer & String = js.native
  
  /* "serverToClient" */ val serverToClient: typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection.serverToClient & String = js.native
}
