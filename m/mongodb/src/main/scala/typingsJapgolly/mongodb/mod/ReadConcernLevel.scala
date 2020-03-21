package typingsJapgolly.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://mongodb.github.io/node-mongodb-native/3.1/api/global.html#ReadConcern
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mongodb.mongodbStrings.local
  - typingsJapgolly.mongodb.mongodbStrings.available
  - typingsJapgolly.mongodb.mongodbStrings.majority
  - typingsJapgolly.mongodb.mongodbStrings.linearizable
  - typingsJapgolly.mongodb.mongodbStrings.snapshot
*/
trait ReadConcernLevel extends js.Object

object ReadConcernLevel {
  @scala.inline
  def available: typingsJapgolly.mongodb.mongodbStrings.available = this.cast("available")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def linearizable: typingsJapgolly.mongodb.mongodbStrings.linearizable = this.cast("linearizable")
  @scala.inline
  def local: typingsJapgolly.mongodb.mongodbStrings.local = this.cast("local")
  @scala.inline
  def majority: typingsJapgolly.mongodb.mongodbStrings.majority = this.cast("majority")
  @scala.inline
  def snapshot: typingsJapgolly.mongodb.mongodbStrings.snapshot = this.cast("snapshot")
}

