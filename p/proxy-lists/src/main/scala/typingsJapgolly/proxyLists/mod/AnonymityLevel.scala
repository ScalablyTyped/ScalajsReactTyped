package typingsJapgolly.proxyLists.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.proxyLists.proxyListsStrings.transparent
  - typingsJapgolly.proxyLists.proxyListsStrings.anonymous
  - typingsJapgolly.proxyLists.proxyListsStrings.elite
*/
trait AnonymityLevel extends js.Object

object AnonymityLevel {
  @scala.inline
  def anonymous: typingsJapgolly.proxyLists.proxyListsStrings.anonymous = this.cast("anonymous")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def elite: typingsJapgolly.proxyLists.proxyListsStrings.elite = this.cast("elite")
  @scala.inline
  def transparent: typingsJapgolly.proxyLists.proxyListsStrings.transparent = this.cast("transparent")
}

