package typingsJapgolly.vscodeJsonrpc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc", "ResponseError")
@js.native
class ResponseError[D] protected ()
  extends typingsJapgolly.vscodeJsonrpc.messagesMod.ResponseError[D] {
  def this(code: Double, message: String) = this()
  def this(code: Double, message: String, data: D) = this()
}

