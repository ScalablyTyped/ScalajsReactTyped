package typingsJapgolly.aqb.mod

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnaryOperation
  extends Expression
     with Instantiable2[/* operator */ String, /* value */ js.Any, Expression] {
  var _operator: String = js.native
  def toAQL(): String = js.native
}

