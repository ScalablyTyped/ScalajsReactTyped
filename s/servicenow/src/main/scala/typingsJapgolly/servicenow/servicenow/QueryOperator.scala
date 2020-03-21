package typingsJapgolly.servicenow.servicenow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.servicenow.servicenowStrings.Equalssign
  - typingsJapgolly.servicenow.servicenowStrings.ExclamationmarkEqualssign
  - typingsJapgolly.servicenow.servicenowStrings.Greaterthansign
  - typingsJapgolly.servicenow.servicenowStrings.GreaterthansignEqualssign
  - typingsJapgolly.servicenow.servicenowStrings.Lessthansign
  - typingsJapgolly.servicenow.servicenowStrings.LessthansignEqualssign
  - typingsJapgolly.servicenow.servicenowStrings.IN
  - typingsJapgolly.servicenow.servicenowStrings.STARTSWITH
  - typingsJapgolly.servicenow.servicenowStrings.ENDSWITH
  - typingsJapgolly.servicenow.servicenowStrings.CONTAINS
  - typingsJapgolly.servicenow.servicenowStrings.DOESNOTCONTAIN
  - typingsJapgolly.servicenow.servicenowStrings.INSTANCEOF
*/
trait QueryOperator extends js.Object

object QueryOperator {
  @scala.inline
  def CONTAINS: typingsJapgolly.servicenow.servicenowStrings.CONTAINS = this.cast("CONTAINS")
  @scala.inline
  def DOESNOTCONTAIN: typingsJapgolly.servicenow.servicenowStrings.DOESNOTCONTAIN = this.cast("DOESNOTCONTAIN")
  @scala.inline
  def ENDSWITH: typingsJapgolly.servicenow.servicenowStrings.ENDSWITH = this.cast("ENDSWITH")
  @scala.inline
  def Equalssign: typingsJapgolly.servicenow.servicenowStrings.Equalssign = this.cast("=")
  @scala.inline
  def ExclamationmarkEqualssign: typingsJapgolly.servicenow.servicenowStrings.ExclamationmarkEqualssign = this.cast("!=")
  @scala.inline
  def Greaterthansign: typingsJapgolly.servicenow.servicenowStrings.Greaterthansign = this.cast(">")
  @scala.inline
  def GreaterthansignEqualssign: typingsJapgolly.servicenow.servicenowStrings.GreaterthansignEqualssign = this.cast(">=")
  @scala.inline
  def IN: typingsJapgolly.servicenow.servicenowStrings.IN = this.cast("IN")
  @scala.inline
  def INSTANCEOF: typingsJapgolly.servicenow.servicenowStrings.INSTANCEOF = this.cast("INSTANCEOF")
  @scala.inline
  def Lessthansign: typingsJapgolly.servicenow.servicenowStrings.Lessthansign = this.cast("<")
  @scala.inline
  def LessthansignEqualssign: typingsJapgolly.servicenow.servicenowStrings.LessthansignEqualssign = this.cast("<=")
  @scala.inline
  def STARTSWITH: typingsJapgolly.servicenow.servicenowStrings.STARTSWITH = this.cast("STARTSWITH")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

