package typingsJapgolly.superagentBunyan

import typingsJapgolly.bunyan.mod.^
import typingsJapgolly.superagent.mod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superagent-bunyan", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(logger: ^): Plugin = js.native
  def apply(logger: ^, requestId: String): Plugin = js.native
  def apply(logger: ^, requestId: String, extra: js.Object): Plugin = js.native
}

