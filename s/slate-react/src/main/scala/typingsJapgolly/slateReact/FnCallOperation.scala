package typingsJapgolly.slateReact

import typingsJapgolly.slate.mod.Controller
import typingsJapgolly.slate.mod.Operation
import typingsJapgolly.slate.mod.OperationJSON
import typingsJapgolly.slate.mod.OperationProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallOperation extends js.Object {
  def apply(operation: Operation): Controller = js.native
  def apply(operation: OperationJSON): Controller = js.native
  def apply(operation: OperationProperties): Controller = js.native
}

