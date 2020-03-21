package typingsJapgolly.vscodeLanguageclient.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "ResponseError")
@js.native
class ResponseError[D] protected ()
  extends typingsJapgolly.vscodeLanguageserverProtocol.mod.ResponseError[D] {
  def this(code: Double, message: String) = this()
  def this(code: Double, message: String, data: D) = this()
}

