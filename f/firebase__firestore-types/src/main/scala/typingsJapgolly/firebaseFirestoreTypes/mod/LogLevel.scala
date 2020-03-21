package typingsJapgolly.firebaseFirestoreTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.debug
  - typingsJapgolly.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.error
  - typingsJapgolly.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.silent
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typingsJapgolly.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.debug = this.cast("debug")
  @scala.inline
  def error: typingsJapgolly.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.error = this.cast("error")
  @scala.inline
  def silent: typingsJapgolly.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.silent = this.cast("silent")
}

