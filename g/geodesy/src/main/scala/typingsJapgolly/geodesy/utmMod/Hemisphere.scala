package typingsJapgolly.geodesy.utmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.geodesy.geodesyStrings.N
  - typingsJapgolly.geodesy.geodesyStrings.S
*/
trait Hemisphere extends js.Object

object Hemisphere {
  @scala.inline
  def N: typingsJapgolly.geodesy.geodesyStrings.N = this.cast("N")
  @scala.inline
  def S: typingsJapgolly.geodesy.geodesyStrings.S = this.cast("S")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

