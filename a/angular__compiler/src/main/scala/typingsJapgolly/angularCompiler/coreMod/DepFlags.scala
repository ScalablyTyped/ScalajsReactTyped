package typingsJapgolly.angularCompiler.coreMod

import typingsJapgolly.angularCompiler.angularCompilerNumbers.`0`
import typingsJapgolly.angularCompiler.angularCompilerNumbers.`1`
import typingsJapgolly.angularCompiler.angularCompilerNumbers.`2`
import typingsJapgolly.angularCompiler.angularCompilerNumbers.`4`
import typingsJapgolly.angularCompiler.angularCompilerNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.angularCompiler.angularCompilerNumbers.`0`
  - typingsJapgolly.angularCompiler.angularCompilerNumbers.`1`
  - typingsJapgolly.angularCompiler.angularCompilerNumbers.`2`
  - typingsJapgolly.angularCompiler.angularCompilerNumbers.`4`
  - typingsJapgolly.angularCompiler.angularCompilerNumbers.`8`
*/
trait DepFlags extends js.Object

object DepFlags {
  @scala.inline
  def None: `0` = this.cast(0)
  @scala.inline
  def Optional: `2` = this.cast(2)
  @scala.inline
  def Self: `4` = this.cast(4)
  @scala.inline
  def SkipSelf: `1` = this.cast(1)
  @scala.inline
  def Value: `8` = this.cast(8)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

