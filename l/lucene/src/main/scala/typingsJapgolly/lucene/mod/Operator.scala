package typingsJapgolly.lucene.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.lucene.luceneStrings.LessthansignimplicitGreaterthansign
  - typingsJapgolly.lucene.luceneStrings.NOT
  - typingsJapgolly.lucene.luceneStrings.OR
  - typingsJapgolly.lucene.luceneStrings.AND
  - typingsJapgolly.lucene.luceneStrings.`AND NOT`
  - typingsJapgolly.lucene.luceneStrings.`OR NOT`
*/
trait Operator extends js.Object

object Operator {
  @scala.inline
  def AND: typingsJapgolly.lucene.luceneStrings.AND = this.cast("AND")
  @scala.inline
  def `AND NOT`: typingsJapgolly.lucene.luceneStrings.`AND NOT` = this.cast("AND NOT")
  @scala.inline
  def LessthansignimplicitGreaterthansign: typingsJapgolly.lucene.luceneStrings.LessthansignimplicitGreaterthansign = this.cast("<implicit>")
  @scala.inline
  def NOT: typingsJapgolly.lucene.luceneStrings.NOT = this.cast("NOT")
  @scala.inline
  def OR: typingsJapgolly.lucene.luceneStrings.OR = this.cast("OR")
  @scala.inline
  def `OR NOT`: typingsJapgolly.lucene.luceneStrings.`OR NOT` = this.cast("OR NOT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

