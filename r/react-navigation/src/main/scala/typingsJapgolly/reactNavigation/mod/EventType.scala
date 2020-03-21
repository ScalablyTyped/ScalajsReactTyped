package typingsJapgolly.reactNavigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactNavigation.reactNavigationStrings.willFocus
  - typingsJapgolly.reactNavigation.reactNavigationStrings.didFocus
  - typingsJapgolly.reactNavigation.reactNavigationStrings.willBlur
  - typingsJapgolly.reactNavigation.reactNavigationStrings.didBlur
  - typingsJapgolly.reactNavigation.reactNavigationStrings.action
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  def action: typingsJapgolly.reactNavigation.reactNavigationStrings.action = this.cast("action")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def didBlur: typingsJapgolly.reactNavigation.reactNavigationStrings.didBlur = this.cast("didBlur")
  @scala.inline
  def didFocus: typingsJapgolly.reactNavigation.reactNavigationStrings.didFocus = this.cast("didFocus")
  @scala.inline
  def willBlur: typingsJapgolly.reactNavigation.reactNavigationStrings.willBlur = this.cast("willBlur")
  @scala.inline
  def willFocus: typingsJapgolly.reactNavigation.reactNavigationStrings.willFocus = this.cast("willFocus")
}

