package typingsJapgolly.tslint.formatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.tslint.tslintStrings.human
  - typingsJapgolly.tslint.tslintStrings.machine
*/
trait ConsumerType extends js.Object

object ConsumerType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def human: typingsJapgolly.tslint.tslintStrings.human = this.cast("human")
  @scala.inline
  def machine: typingsJapgolly.tslint.tslintStrings.machine = this.cast("machine")
}

