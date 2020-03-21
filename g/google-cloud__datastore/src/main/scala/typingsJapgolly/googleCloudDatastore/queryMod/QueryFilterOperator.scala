package typingsJapgolly.googleCloudDatastore.queryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.googleCloudDatastore.googleCloudDatastoreStrings.Lessthansign
  - typingsJapgolly.googleCloudDatastore.googleCloudDatastoreStrings.LessthansignEqualssign
  - typingsJapgolly.googleCloudDatastore.googleCloudDatastoreStrings.Equalssign
  - typingsJapgolly.googleCloudDatastore.googleCloudDatastoreStrings.GreaterthansignEqualssign
  - typingsJapgolly.googleCloudDatastore.googleCloudDatastoreStrings.Greaterthansign
*/
trait QueryFilterOperator extends js.Object

object QueryFilterOperator {
  @scala.inline
  def Equalssign: typingsJapgolly.googleCloudDatastore.googleCloudDatastoreStrings.Equalssign = this.cast("=")
  @scala.inline
  def Greaterthansign: typingsJapgolly.googleCloudDatastore.googleCloudDatastoreStrings.Greaterthansign = this.cast(">")
  @scala.inline
  def GreaterthansignEqualssign: typingsJapgolly.googleCloudDatastore.googleCloudDatastoreStrings.GreaterthansignEqualssign = this.cast(">=")
  @scala.inline
  def Lessthansign: typingsJapgolly.googleCloudDatastore.googleCloudDatastoreStrings.Lessthansign = this.cast("<")
  @scala.inline
  def LessthansignEqualssign: typingsJapgolly.googleCloudDatastore.googleCloudDatastoreStrings.LessthansignEqualssign = this.cast("<=")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

