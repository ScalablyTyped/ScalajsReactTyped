package typingsJapgolly.googleCloudFirestore.FirebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.Lessthansign
  - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.LessthansignEqualssign
  - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.EqualssignEqualssign
  - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.GreaterthansignEqualssign
  - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.Greaterthansign
  - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.`array-contains`
  - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.in
  - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.`array-contains-any`
*/
trait WhereFilterOp extends js.Object

object WhereFilterOp {
  @scala.inline
  def EqualssignEqualssign: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.EqualssignEqualssign = this.cast("==")
  @scala.inline
  def Greaterthansign: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.Greaterthansign = this.cast(">")
  @scala.inline
  def GreaterthansignEqualssign: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.GreaterthansignEqualssign = this.cast(">=")
  @scala.inline
  def Lessthansign: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.Lessthansign = this.cast("<")
  @scala.inline
  def LessthansignEqualssign: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.LessthansignEqualssign = this.cast("<=")
  @scala.inline
  def `array-contains`: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.`array-contains` = this.cast("array-contains")
  @scala.inline
  def `array-contains-any`: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.`array-contains-any` = this.cast("array-contains-any")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def in: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.in = this.cast("in")
}

