package typingsJapgolly.objection.mod

import typingsJapgolly.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Executable[RV] extends Promise[RV] {
  def execute(): js.Promise[RV] = js.native
}

