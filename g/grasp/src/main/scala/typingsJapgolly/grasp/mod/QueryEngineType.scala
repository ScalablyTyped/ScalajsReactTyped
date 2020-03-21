package typingsJapgolly.grasp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.grasp.graspStrings.squery
  - typingsJapgolly.grasp.graspStrings.equery
*/
trait QueryEngineType extends js.Object

object QueryEngineType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def equery: typingsJapgolly.grasp.graspStrings.equery = this.cast("equery")
  @scala.inline
  def squery: typingsJapgolly.grasp.graspStrings.squery = this.cast("squery")
}

