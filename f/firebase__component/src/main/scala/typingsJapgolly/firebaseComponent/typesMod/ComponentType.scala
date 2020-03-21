package typingsJapgolly.firebaseComponent.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebaseComponent.firebaseComponentStrings.PUBLIC
  - typingsJapgolly.firebaseComponent.firebaseComponentStrings.PRIVATE
  - typingsJapgolly.firebaseComponent.firebaseComponentStrings.VERSION
*/
trait ComponentType extends js.Object

object ComponentType {
  @scala.inline
  def PRIVATE: typingsJapgolly.firebaseComponent.firebaseComponentStrings.PRIVATE = this.cast("PRIVATE")
  @scala.inline
  def PUBLIC: typingsJapgolly.firebaseComponent.firebaseComponentStrings.PUBLIC = this.cast("PUBLIC")
  @scala.inline
  def VERSION: typingsJapgolly.firebaseComponent.firebaseComponentStrings.VERSION = this.cast("VERSION")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

