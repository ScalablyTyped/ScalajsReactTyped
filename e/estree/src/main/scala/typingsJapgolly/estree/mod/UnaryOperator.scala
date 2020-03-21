package typingsJapgolly.estree.mod

import typingsJapgolly.estree.estreeStrings.`-_`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.estree.estreeStrings.`-_`
  - typingsJapgolly.estree.estreeStrings.Plussign
  - typingsJapgolly.estree.estreeStrings.Exclamationmark
  - typingsJapgolly.estree.estreeStrings.Tilde
  - typingsJapgolly.estree.estreeStrings.typeof
  - typingsJapgolly.estree.estreeStrings.void
  - typingsJapgolly.estree.estreeStrings.delete
*/
trait UnaryOperator extends js.Object

object UnaryOperator {
  @scala.inline
  def Exclamationmark: typingsJapgolly.estree.estreeStrings.Exclamationmark = this.cast("!")
  @scala.inline
  def Plussign: typingsJapgolly.estree.estreeStrings.Plussign = this.cast("+")
  @scala.inline
  def Tilde: typingsJapgolly.estree.estreeStrings.Tilde = this.cast("~")
  @scala.inline
  def _dash: `-_` = this.cast("-")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delete: typingsJapgolly.estree.estreeStrings.delete = this.cast("delete")
  @scala.inline
  def typeof: typingsJapgolly.estree.estreeStrings.typeof = this.cast("typeof")
  @scala.inline
  def void: typingsJapgolly.estree.estreeStrings.void = this.cast("void")
}

