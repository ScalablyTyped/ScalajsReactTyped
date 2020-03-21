package typingsJapgolly.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mongodb.mongodbStrings.primary
  - typingsJapgolly.mongodb.mongodbStrings.primaryPreferred
  - typingsJapgolly.mongodb.mongodbStrings.secondary
  - typingsJapgolly.mongodb.mongodbStrings.secondaryPreferred
  - typingsJapgolly.mongodb.mongodbStrings.nearest
*/
trait ReadPreferenceMode extends ReadPreferenceOrMode

object ReadPreferenceMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def nearest: typingsJapgolly.mongodb.mongodbStrings.nearest = this.cast("nearest")
  @scala.inline
  def primary: typingsJapgolly.mongodb.mongodbStrings.primary = this.cast("primary")
  @scala.inline
  def primaryPreferred: typingsJapgolly.mongodb.mongodbStrings.primaryPreferred = this.cast("primaryPreferred")
  @scala.inline
  def secondary: typingsJapgolly.mongodb.mongodbStrings.secondary = this.cast("secondary")
  @scala.inline
  def secondaryPreferred: typingsJapgolly.mongodb.mongodbStrings.secondaryPreferred = this.cast("secondaryPreferred")
}

