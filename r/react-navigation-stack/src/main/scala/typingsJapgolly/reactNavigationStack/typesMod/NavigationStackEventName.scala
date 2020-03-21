package typingsJapgolly.reactNavigationStack.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactNavigationStack.reactNavigationStackStrings.willFocus
  - typingsJapgolly.reactNavigationStack.reactNavigationStackStrings.didFocus
  - typingsJapgolly.reactNavigationStack.reactNavigationStackStrings.willBlur
  - typingsJapgolly.reactNavigationStack.reactNavigationStackStrings.didBlur
*/
trait NavigationStackEventName extends js.Object

object NavigationStackEventName {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def didBlur: typingsJapgolly.reactNavigationStack.reactNavigationStackStrings.didBlur = this.cast("didBlur")
  @scala.inline
  def didFocus: typingsJapgolly.reactNavigationStack.reactNavigationStackStrings.didFocus = this.cast("didFocus")
  @scala.inline
  def willBlur: typingsJapgolly.reactNavigationStack.reactNavigationStackStrings.willBlur = this.cast("willBlur")
  @scala.inline
  def willFocus: typingsJapgolly.reactNavigationStack.reactNavigationStackStrings.willFocus = this.cast("willFocus")
}

