package typingsJapgolly.firebaseFirestore.inputValidationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.undefined
  - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.`object`
  - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.function
  - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.boolean
  - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.number
  - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.string
  - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.`non-empty string`
*/
trait ValidationType extends js.Object

object ValidationType {
  @scala.inline
  def boolean: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def function: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.function = this.cast("function")
  @scala.inline
  def `non-empty string`: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.`non-empty string` = this.cast("non-empty string")
  @scala.inline
  def number: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.number = this.cast("number")
  @scala.inline
  def `object`: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.`object` = this.cast("object")
  @scala.inline
  def string: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.string = this.cast("string")
  @scala.inline
  def undefined: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.undefined = this.cast("undefined")
}

