package typingsJapgolly.tcomb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tcomb", "dict")
@js.native
object dict extends js.Object {
  def apply[T](domain: Constructor[java.lang.String], codomain: Constructor[T]): Dict_[T] = js.native
  def apply[T](domain: Constructor[java.lang.String], codomain: Constructor[T], name: java.lang.String): Dict_[T] = js.native
}

