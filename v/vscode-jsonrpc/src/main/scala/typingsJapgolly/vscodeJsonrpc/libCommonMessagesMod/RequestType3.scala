package typingsJapgolly.vscodeJsonrpc.libCommonMessagesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-jsonrpc/lib/common/messages", "RequestType3")
@js.native
open class RequestType3[P1, P2, P3, R, E] protected () extends AbstractMessageSignature {
  def this(method: String) = this()
  
  /**
    * Clients must not use this property. It is here to ensure correct typing.
    */
  @JSName("_")
  val _underscore: js.UndefOr[js.Tuple6[P1, P2, P3, R, E, _EM]] = js.native
}
