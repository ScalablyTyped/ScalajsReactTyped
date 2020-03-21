package typingsJapgolly.tampermonkey

import typingsJapgolly.tampermonkey.Tampermonkey.AbortHandle
import typingsJapgolly.tampermonkey.Tampermonkey.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GM_xmlhttpRequest")
@js.native
object GMXmlhttpRequest extends js.Object {
  // Requests
  /** Makes an xmlHttpRequest */
  def apply[TContext](details: Request[TContext]): AbortHandle[Unit] = js.native
}

