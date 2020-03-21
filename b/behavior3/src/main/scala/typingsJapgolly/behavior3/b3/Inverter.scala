package typingsJapgolly.behavior3.b3

import typingsJapgolly.behavior3.AnonChildBaseNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Inverter decorator inverts the result of the child, returning `SUCCESS`
  * for `FAILURE` and `FAILURE` for `SUCCESS`.
  *
  */
@JSGlobal("b3.Inverter")
@js.native
/**
  * Creates an instance of Inverter.
  */
class Inverter () extends Decorator {
  def this(hasChild: AnonChildBaseNode) = this()
}

