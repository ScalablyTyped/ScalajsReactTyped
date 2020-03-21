package typingsJapgolly.idyllCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.idyllCompiler.idyllCompilerStrings.variable
  - typingsJapgolly.idyllCompiler.idyllCompilerStrings.value
  - typingsJapgolly.idyllCompiler.idyllCompilerStrings.expression
*/
trait PropType extends js.Object

object PropType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def expression: typingsJapgolly.idyllCompiler.idyllCompilerStrings.expression = this.cast("expression")
  @scala.inline
  def value: typingsJapgolly.idyllCompiler.idyllCompilerStrings.value = this.cast("value")
  @scala.inline
  def variable: typingsJapgolly.idyllCompiler.idyllCompilerStrings.variable = this.cast("variable")
}

