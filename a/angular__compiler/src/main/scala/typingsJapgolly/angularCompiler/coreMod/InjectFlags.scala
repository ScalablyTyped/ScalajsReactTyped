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
trait InjectFlags extends js.Object

object InjectFlags {
  @scala.inline
  def Default: `0` = this.cast(0)
  /**
    * Specifies that an injector should retrieve a dependency from any injector until reaching the
    * host element of the current component. (Only used with Element Injector)
    */
  @scala.inline
  def Host: `1` = this.cast(1)
  /** Inject `defaultValue` instead if token not found. */
  @scala.inline
  def Optional: `8` = this.cast(8)
  /** Don't descend into ancestors of the node requesting injection. */
  @scala.inline
  def Self: `2` = this.cast(2)
  /** Skip the node that is requesting injection. */
  @scala.inline
  def SkipSelf: `4` = this.cast(4)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

