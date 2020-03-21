package typingsJapgolly.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.documentdb.documentdbStrings.Hash
  - typingsJapgolly.documentdb.documentdbStrings.Range
  - typingsJapgolly.documentdb.documentdbStrings.Spatial
*/
trait IndexKind extends js.Object

object IndexKind {
  @scala.inline
  def Hash: typingsJapgolly.documentdb.documentdbStrings.Hash = this.cast("Hash")
  @scala.inline
  def Range: typingsJapgolly.documentdb.documentdbStrings.Range = this.cast("Range")
  @scala.inline
  def Spatial: typingsJapgolly.documentdb.documentdbStrings.Spatial = this.cast("Spatial")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

