package typingsJapgolly.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.documentdb.documentdbStrings.Strong
  - typingsJapgolly.documentdb.documentdbStrings.BoundedStaleness
  - typingsJapgolly.documentdb.documentdbStrings.Session
  - typingsJapgolly.documentdb.documentdbStrings.Eventual
*/
trait ConsistencyLevel extends js.Object

object ConsistencyLevel {
  @scala.inline
  def BoundedStaleness: typingsJapgolly.documentdb.documentdbStrings.BoundedStaleness = this.cast("BoundedStaleness")
  @scala.inline
  def Eventual: typingsJapgolly.documentdb.documentdbStrings.Eventual = this.cast("Eventual")
  @scala.inline
  def Session: typingsJapgolly.documentdb.documentdbStrings.Session = this.cast("Session")
  @scala.inline
  def Strong: typingsJapgolly.documentdb.documentdbStrings.Strong = this.cast("Strong")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

