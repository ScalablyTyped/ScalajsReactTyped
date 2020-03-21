package typingsJapgolly.aphrodite.cssPropertiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// See CSS 3 CSS-wide keywords https://www.w3.org/TR/css3-values/#common-keywords
// See CSS 3 Explicit Defaulting https://www.w3.org/TR/css-cascade-3/#defaulting-keywords
// "all CSS properties can accept these values"
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.aphrodite.aphroditeStrings.initial
  - typingsJapgolly.aphrodite.aphroditeStrings.inherit
  - typingsJapgolly.aphrodite.aphroditeStrings.unset
*/
trait CSSWideKeyword extends js.Object

object CSSWideKeyword {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def inherit: typingsJapgolly.aphrodite.aphroditeStrings.inherit = this.cast("inherit")
  @scala.inline
  def initial: typingsJapgolly.aphrodite.aphroditeStrings.initial = this.cast("initial")
  @scala.inline
  def unset: typingsJapgolly.aphrodite.aphroditeStrings.unset = this.cast("unset")
}

