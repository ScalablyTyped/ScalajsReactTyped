package typingsJapgolly.cliTable3.mod

import typingsJapgolly.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericTable[T] extends Array[T] {
  var options: TableInstanceOptions = js.native
  val width: Double = js.native
}

