package typingsJapgolly.angularCompiler.coreMod

import typingsJapgolly.angularCompiler.angularCompilerNumbers.`1`
import typingsJapgolly.angularCompiler.angularCompilerNumbers.`2`
import typingsJapgolly.angularCompiler.angularCompilerNumbers.`4`
import typingsJapgolly.angularCompiler.angularCompilerNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.angularCompiler.angularCompilerNumbers.`1`
  - typingsJapgolly.angularCompiler.angularCompilerNumbers.`2`
  - typingsJapgolly.angularCompiler.angularCompilerNumbers.`4`
  - typingsJapgolly.angularCompiler.angularCompilerNumbers.`8`
*/
trait SelectorFlags extends js.Object

object SelectorFlags {
  /** Mode for matching attributes */
  @scala.inline
  def ATTRIBUTE: `2` = this.cast(2)
  /** Mode for matching class names */
  @scala.inline
  def CLASS: `8` = this.cast(8)
  /** Mode for matching tag names */
  @scala.inline
  def ELEMENT: `4` = this.cast(4)
  /** Indicates this is the beginning of a new negative selector */
  @scala.inline
  def NOT: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

