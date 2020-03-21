package typingsJapgolly.compareVersions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allowed arithmetic operators
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.compareVersions.compareVersionsStrings.Greaterthansign
  - typingsJapgolly.compareVersions.compareVersionsStrings.GreaterthansignEqualssign
  - typingsJapgolly.compareVersions.compareVersionsStrings.Equalssign
  - typingsJapgolly.compareVersions.compareVersionsStrings.Lessthansign
  - typingsJapgolly.compareVersions.compareVersionsStrings.LessthansignEqualssign
*/
trait CompareOperator extends js.Object

object CompareOperator {
  @scala.inline
  def Equalssign: typingsJapgolly.compareVersions.compareVersionsStrings.Equalssign = this.cast("=")
  @scala.inline
  def Greaterthansign: typingsJapgolly.compareVersions.compareVersionsStrings.Greaterthansign = this.cast(">")
  @scala.inline
  def GreaterthansignEqualssign: typingsJapgolly.compareVersions.compareVersionsStrings.GreaterthansignEqualssign = this.cast(">=")
  @scala.inline
  def Lessthansign: typingsJapgolly.compareVersions.compareVersionsStrings.Lessthansign = this.cast("<")
  @scala.inline
  def LessthansignEqualssign: typingsJapgolly.compareVersions.compareVersionsStrings.LessthansignEqualssign = this.cast("<=")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

