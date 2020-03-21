package typingsJapgolly.firebase.mod.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebase.firebaseStrings.debug
  - typingsJapgolly.firebase.firebaseStrings.error
  - typingsJapgolly.firebase.firebaseStrings.silent
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typingsJapgolly.firebase.firebaseStrings.debug = this.cast("debug")
  @scala.inline
  def error: typingsJapgolly.firebase.firebaseStrings.error = this.cast("error")
  @scala.inline
  def silent: typingsJapgolly.firebase.firebaseStrings.silent = this.cast("silent")
}

