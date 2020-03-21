package typingsJapgolly.feathersjsExpress

import typingsJapgolly.bodyParser.mod.OptionsJson
import typingsJapgolly.connect.mod.NextHandleFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(): NextHandleFunction = js.native
  def apply(options: OptionsJson): NextHandleFunction = js.native
}

