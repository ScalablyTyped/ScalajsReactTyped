package typingsJapgolly.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.fridaGum.fridaGumStrings.steal
  - typingsJapgolly.fridaGum.fridaGumStrings.propagate
*/
trait ExceptionsBehavior extends js.Object

object ExceptionsBehavior {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def propagate: typingsJapgolly.fridaGum.fridaGumStrings.propagate = this.cast("propagate")
  @scala.inline
  def steal: typingsJapgolly.fridaGum.fridaGumStrings.steal = this.cast("steal")
}

