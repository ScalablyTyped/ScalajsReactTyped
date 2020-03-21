package typingsJapgolly.cachefactory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.cachefactory.cachefactoryStrings.none
  - typingsJapgolly.cachefactory.cachefactoryStrings.passive
  - typingsJapgolly.cachefactory.cachefactoryStrings.aggressive
*/
trait DeleteOnExpire extends js.Object

object DeleteOnExpire {
  @scala.inline
  def aggressive: typingsJapgolly.cachefactory.cachefactoryStrings.aggressive = this.cast("aggressive")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typingsJapgolly.cachefactory.cachefactoryStrings.none = this.cast("none")
  @scala.inline
  def passive: typingsJapgolly.cachefactory.cachefactoryStrings.passive = this.cast("passive")
}

