package typingsJapgolly.firebase.mod.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebase.firebaseStrings.Lessthansign
  - typingsJapgolly.firebase.firebaseStrings.LessthansignEqualssign
  - typingsJapgolly.firebase.firebaseStrings.EqualssignEqualssign
  - typingsJapgolly.firebase.firebaseStrings.GreaterthansignEqualssign
  - typingsJapgolly.firebase.firebaseStrings.Greaterthansign
  - typingsJapgolly.firebase.firebaseStrings.`array-contains`
  - typingsJapgolly.firebase.firebaseStrings.in
  - typingsJapgolly.firebase.firebaseStrings.`array-contains-any`
*/
trait WhereFilterOp extends js.Object

object WhereFilterOp {
  @scala.inline
  def EqualssignEqualssign: typingsJapgolly.firebase.firebaseStrings.EqualssignEqualssign = this.cast("==")
  @scala.inline
  def Greaterthansign: typingsJapgolly.firebase.firebaseStrings.Greaterthansign = this.cast(">")
  @scala.inline
  def GreaterthansignEqualssign: typingsJapgolly.firebase.firebaseStrings.GreaterthansignEqualssign = this.cast(">=")
  @scala.inline
  def Lessthansign: typingsJapgolly.firebase.firebaseStrings.Lessthansign = this.cast("<")
  @scala.inline
  def LessthansignEqualssign: typingsJapgolly.firebase.firebaseStrings.LessthansignEqualssign = this.cast("<=")
  @scala.inline
  def `array-contains`: typingsJapgolly.firebase.firebaseStrings.`array-contains` = this.cast("array-contains")
  @scala.inline
  def `array-contains-any`: typingsJapgolly.firebase.firebaseStrings.`array-contains-any` = this.cast("array-contains-any")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def in: typingsJapgolly.firebase.firebaseStrings.in = this.cast("in")
}

