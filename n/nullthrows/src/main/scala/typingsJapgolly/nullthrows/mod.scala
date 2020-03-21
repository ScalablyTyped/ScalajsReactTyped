package typingsJapgolly.nullthrows

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nullthrows", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def default[T](): T = js.native
  def default[T](value: T): T = js.native
  def default[T](value: T, message: String): T = js.native
  def default[T](value: Null, message: String): T = js.native
}

