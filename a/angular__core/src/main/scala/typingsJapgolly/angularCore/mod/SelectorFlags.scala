package typingsJapgolly.angularCore.mod

import typingsJapgolly.angularCore.angularCoreNumbers.`1`
import typingsJapgolly.angularCore.angularCoreNumbers.`2`
import typingsJapgolly.angularCore.angularCoreNumbers.`4`
import typingsJapgolly.angularCore.angularCoreNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Flags used to build up CssSelectors */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.angularCore.angularCoreNumbers.`1`
  - typingsJapgolly.angularCore.angularCoreNumbers.`2`
  - typingsJapgolly.angularCore.angularCoreNumbers.`4`
  - typingsJapgolly.angularCore.angularCoreNumbers.`8`
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

