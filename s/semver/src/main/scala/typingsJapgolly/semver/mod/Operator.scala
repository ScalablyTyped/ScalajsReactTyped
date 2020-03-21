package typingsJapgolly.semver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.semver.semverStrings.EqualssignEqualssignEqualssign
  - typingsJapgolly.semver.semverStrings.ExclamationmarkEqualssignEqualssign
  - typingsJapgolly.semver.semverStrings._empty
  - typingsJapgolly.semver.semverStrings.Equalssign
  - typingsJapgolly.semver.semverStrings.EqualssignEqualssign
  - typingsJapgolly.semver.semverStrings.ExclamationmarkEqualssign
  - typingsJapgolly.semver.semverStrings.Greaterthansign
  - typingsJapgolly.semver.semverStrings.GreaterthansignEqualssign
  - typingsJapgolly.semver.semverStrings.Lessthansign
  - typingsJapgolly.semver.semverStrings.LessthansignEqualssign
*/
trait Operator extends js.Object

object Operator {
  @scala.inline
  def Equalssign: typingsJapgolly.semver.semverStrings.Equalssign = this.cast("=")
  @scala.inline
  def EqualssignEqualssign: typingsJapgolly.semver.semverStrings.EqualssignEqualssign = this.cast("==")
  @scala.inline
  def EqualssignEqualssignEqualssign: typingsJapgolly.semver.semverStrings.EqualssignEqualssignEqualssign = this.cast("===")
  @scala.inline
  def ExclamationmarkEqualssign: typingsJapgolly.semver.semverStrings.ExclamationmarkEqualssign = this.cast("!=")
  @scala.inline
  def ExclamationmarkEqualssignEqualssign: typingsJapgolly.semver.semverStrings.ExclamationmarkEqualssignEqualssign = this.cast("!==")
  @scala.inline
  def Greaterthansign: typingsJapgolly.semver.semverStrings.Greaterthansign = this.cast(">")
  @scala.inline
  def GreaterthansignEqualssign: typingsJapgolly.semver.semverStrings.GreaterthansignEqualssign = this.cast(">=")
  @scala.inline
  def Lessthansign: typingsJapgolly.semver.semverStrings.Lessthansign = this.cast("<")
  @scala.inline
  def LessthansignEqualssign: typingsJapgolly.semver.semverStrings.LessthansignEqualssign = this.cast("<=")
  @scala.inline
  def _empty: typingsJapgolly.semver.semverStrings._empty = this.cast("")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

