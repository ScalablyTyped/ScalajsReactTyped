package typingsJapgolly.eslint.mod.Linter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.eslint.eslintNumbers.`0`
  - typingsJapgolly.eslint.eslintNumbers.`1`
  - typingsJapgolly.eslint.eslintNumbers.`2`
  - typingsJapgolly.eslint.eslintStrings.off
  - typingsJapgolly.eslint.eslintStrings.warn
  - typingsJapgolly.eslint.eslintStrings.error
*/
trait RuleLevel extends js.Object

object RuleLevel {
  @scala.inline
  def `0`: typingsJapgolly.eslint.eslintNumbers.`0` = this.cast(0)
  @scala.inline
  def `1`: typingsJapgolly.eslint.eslintNumbers.`1` = this.cast(1)
  @scala.inline
  def `2`: typingsJapgolly.eslint.eslintNumbers.`2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsJapgolly.eslint.eslintStrings.error = this.cast("error")
  @scala.inline
  def off: typingsJapgolly.eslint.eslintStrings.off = this.cast("off")
  @scala.inline
  def warn: typingsJapgolly.eslint.eslintStrings.warn = this.cast("warn")
}

