package typingsJapgolly.uirouterCore.urlInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.uirouterCore.uirouterCoreStrings.STATE
  - typingsJapgolly.uirouterCore.uirouterCoreStrings.URLMATCHER
  - typingsJapgolly.uirouterCore.uirouterCoreStrings.REGEXP
  - typingsJapgolly.uirouterCore.uirouterCoreStrings.RAW
  - typingsJapgolly.uirouterCore.uirouterCoreStrings.OTHER
*/
trait UrlRuleType extends js.Object

object UrlRuleType {
  @scala.inline
  def OTHER: typingsJapgolly.uirouterCore.uirouterCoreStrings.OTHER = this.cast("OTHER")
  @scala.inline
  def RAW: typingsJapgolly.uirouterCore.uirouterCoreStrings.RAW = this.cast("RAW")
  @scala.inline
  def REGEXP: typingsJapgolly.uirouterCore.uirouterCoreStrings.REGEXP = this.cast("REGEXP")
  @scala.inline
  def STATE: typingsJapgolly.uirouterCore.uirouterCoreStrings.STATE = this.cast("STATE")
  @scala.inline
  def URLMATCHER: typingsJapgolly.uirouterCore.uirouterCoreStrings.URLMATCHER = this.cast("URLMATCHER")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

