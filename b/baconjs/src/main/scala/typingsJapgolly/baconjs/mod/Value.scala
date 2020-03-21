package typingsJapgolly.baconjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "Value")
@js.native
abstract class Value[V] protected ()
  extends typingsJapgolly.baconjs.eventMod.Value[V] {
  def this(value: V) = this()
}

