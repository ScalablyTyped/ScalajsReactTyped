package typingsJapgolly.firebaseComponent.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebaseComponent.firebaseComponentStrings.LAZY
  - typingsJapgolly.firebaseComponent.firebaseComponentStrings.EAGER
*/
trait InstantiationMode extends js.Object

object InstantiationMode {
  @scala.inline
  def EAGER: typingsJapgolly.firebaseComponent.firebaseComponentStrings.EAGER = this.cast("EAGER")
  @scala.inline
  def LAZY: typingsJapgolly.firebaseComponent.firebaseComponentStrings.LAZY = this.cast("LAZY")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

