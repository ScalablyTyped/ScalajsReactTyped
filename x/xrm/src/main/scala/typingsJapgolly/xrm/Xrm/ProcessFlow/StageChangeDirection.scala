package typingsJapgolly.xrm.Xrm.ProcessFlow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Direction types for a process stage change event
  * @see {@link XrmEnum.StageChangeDirection}
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.xrm.xrmStrings.Next
  - typingsJapgolly.xrm.xrmStrings.Previous
*/
trait StageChangeDirection extends js.Object

object StageChangeDirection {
  @scala.inline
  def Next: typingsJapgolly.xrm.xrmStrings.Next = this.cast("Next")
  @scala.inline
  def Previous: typingsJapgolly.xrm.xrmStrings.Previous = this.cast("Previous")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

