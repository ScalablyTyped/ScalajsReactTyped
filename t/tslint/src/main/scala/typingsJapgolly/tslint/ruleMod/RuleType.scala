package typingsJapgolly.tslint.ruleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.tslint.tslintStrings.functionality
  - typingsJapgolly.tslint.tslintStrings.maintainability
  - typingsJapgolly.tslint.tslintStrings.style
  - typingsJapgolly.tslint.tslintStrings.typescript
  - typingsJapgolly.tslint.tslintStrings.formatting
*/
trait RuleType extends js.Object

object RuleType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def formatting: typingsJapgolly.tslint.tslintStrings.formatting = this.cast("formatting")
  @scala.inline
  def functionality: typingsJapgolly.tslint.tslintStrings.functionality = this.cast("functionality")
  @scala.inline
  def maintainability: typingsJapgolly.tslint.tslintStrings.maintainability = this.cast("maintainability")
  @scala.inline
  def style: typingsJapgolly.tslint.tslintStrings.style = this.cast("style")
  @scala.inline
  def typescript: typingsJapgolly.tslint.tslintStrings.typescript = this.cast("typescript")
}

