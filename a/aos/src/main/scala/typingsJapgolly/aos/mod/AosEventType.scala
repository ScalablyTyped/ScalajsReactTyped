package typingsJapgolly.aos.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.aos.aosStrings.aosColonin
  - typingsJapgolly.aos.aosStrings.aosColonout
*/
trait AosEventType extends js.Object

object AosEventType {
  @scala.inline
  def aosColonin: typingsJapgolly.aos.aosStrings.aosColonin = this.cast("aos:in")
  @scala.inline
  def aosColonout: typingsJapgolly.aos.aosStrings.aosColonout = this.cast("aos:out")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

