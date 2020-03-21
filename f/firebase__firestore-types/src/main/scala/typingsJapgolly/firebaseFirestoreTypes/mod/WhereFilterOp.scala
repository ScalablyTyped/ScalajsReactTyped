package typingsJapgolly.firebaseFirestoreTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.Lessthansign
  - typingsJapgolly.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.LessthansignEqualssign
  - typingsJapgolly.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.EqualssignEqualssign
  - typingsJapgolly.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.GreaterthansignEqualssign
  - typingsJapgolly.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.Greaterthansign
  - typingsJapgolly.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.`array-contains`
  - typingsJapgolly.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.in
  - typingsJapgolly.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.`array-contains-any`
*/
trait WhereFilterOp extends js.Object

object WhereFilterOp {
  @scala.inline
  def EqualssignEqualssign: typingsJapgolly.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.EqualssignEqualssign = this.cast("==")
  @scala.inline
  def Greaterthansign: typingsJapgolly.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.Greaterthansign = this.cast(">")
  @scala.inline
  def GreaterthansignEqualssign: typingsJapgolly.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.GreaterthansignEqualssign = this.cast(">=")
  @scala.inline
  def Lessthansign: typingsJapgolly.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.Lessthansign = this.cast("<")
  @scala.inline
  def LessthansignEqualssign: typingsJapgolly.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.LessthansignEqualssign = this.cast("<=")
  @scala.inline
  def `array-contains`: typingsJapgolly.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.`array-contains` = this.cast("array-contains")
  @scala.inline
  def `array-contains-any`: typingsJapgolly.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.`array-contains-any` = this.cast("array-contains-any")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def in: typingsJapgolly.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.in = this.cast("in")
}

