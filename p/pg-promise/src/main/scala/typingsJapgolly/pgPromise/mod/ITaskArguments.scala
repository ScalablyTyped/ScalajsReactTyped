package typingsJapgolly.pgPromise.mod

import typingsJapgolly.pgPromise.AnonCndMode
import typingsJapgolly.std.IArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITaskArguments[T] extends IArguments {
  var options: AnonCndMode with T = js.native
  def cb(): js.Any = js.native
}

