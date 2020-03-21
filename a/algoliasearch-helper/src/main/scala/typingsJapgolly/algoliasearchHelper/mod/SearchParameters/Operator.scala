package typingsJapgolly.algoliasearchHelper.mod.SearchParameters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.algoliasearchHelper.algoliasearchHelperStrings.Equalssign
  - typingsJapgolly.algoliasearchHelper.algoliasearchHelperStrings.Greaterthansign
  - typingsJapgolly.algoliasearchHelper.algoliasearchHelperStrings.GreaterthansignEqualssign
  - typingsJapgolly.algoliasearchHelper.algoliasearchHelperStrings.Lessthansign
  - typingsJapgolly.algoliasearchHelper.algoliasearchHelperStrings.LessthansignEqualssign
  - typingsJapgolly.algoliasearchHelper.algoliasearchHelperStrings.ExclamationmarkEqualssign
*/
trait Operator extends js.Object

object Operator {
  @scala.inline
  def Equalssign: typingsJapgolly.algoliasearchHelper.algoliasearchHelperStrings.Equalssign = this.cast("=")
  @scala.inline
  def ExclamationmarkEqualssign: typingsJapgolly.algoliasearchHelper.algoliasearchHelperStrings.ExclamationmarkEqualssign = this.cast("!=")
  @scala.inline
  def Greaterthansign: typingsJapgolly.algoliasearchHelper.algoliasearchHelperStrings.Greaterthansign = this.cast(">")
  @scala.inline
  def GreaterthansignEqualssign: typingsJapgolly.algoliasearchHelper.algoliasearchHelperStrings.GreaterthansignEqualssign = this.cast(">=")
  @scala.inline
  def Lessthansign: typingsJapgolly.algoliasearchHelper.algoliasearchHelperStrings.Lessthansign = this.cast("<")
  @scala.inline
  def LessthansignEqualssign: typingsJapgolly.algoliasearchHelper.algoliasearchHelperStrings.LessthansignEqualssign = this.cast("<=")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

