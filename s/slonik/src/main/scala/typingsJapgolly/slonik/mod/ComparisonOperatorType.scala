package typingsJapgolly.slonik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.slonik.slonikStrings.Lessthansign
  - typingsJapgolly.slonik.slonikStrings.Greaterthansign
  - typingsJapgolly.slonik.slonikStrings.LessthansignEqualssign
  - typingsJapgolly.slonik.slonikStrings.GreaterthansignEqualssign
  - typingsJapgolly.slonik.slonikStrings.Equalssign
  - typingsJapgolly.slonik.slonikStrings.LessthansignGreaterthansign
  - typingsJapgolly.slonik.slonikStrings.ExclamationmarkEqualssign
*/
trait ComparisonOperatorType extends js.Object

object ComparisonOperatorType {
  @scala.inline
  def Equalssign: typingsJapgolly.slonik.slonikStrings.Equalssign = this.cast("=")
  @scala.inline
  def ExclamationmarkEqualssign: typingsJapgolly.slonik.slonikStrings.ExclamationmarkEqualssign = this.cast("!=")
  @scala.inline
  def Greaterthansign: typingsJapgolly.slonik.slonikStrings.Greaterthansign = this.cast(">")
  @scala.inline
  def GreaterthansignEqualssign: typingsJapgolly.slonik.slonikStrings.GreaterthansignEqualssign = this.cast(">=")
  @scala.inline
  def Lessthansign: typingsJapgolly.slonik.slonikStrings.Lessthansign = this.cast("<")
  @scala.inline
  def LessthansignEqualssign: typingsJapgolly.slonik.slonikStrings.LessthansignEqualssign = this.cast("<=")
  @scala.inline
  def LessthansignGreaterthansign: typingsJapgolly.slonik.slonikStrings.LessthansignGreaterthansign = this.cast("<>")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

