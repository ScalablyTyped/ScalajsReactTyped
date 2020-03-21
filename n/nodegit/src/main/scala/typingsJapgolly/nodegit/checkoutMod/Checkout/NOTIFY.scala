package typingsJapgolly.nodegit.checkoutMod.Checkout

import typingsJapgolly.nodegit.nodegitNumbers.`0`
import typingsJapgolly.nodegit.nodegitNumbers.`16`
import typingsJapgolly.nodegit.nodegitNumbers.`1`
import typingsJapgolly.nodegit.nodegitNumbers.`2`
import typingsJapgolly.nodegit.nodegitNumbers.`4`
import typingsJapgolly.nodegit.nodegitNumbers.`65535`
import typingsJapgolly.nodegit.nodegitNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodegit.nodegitNumbers.`0`
  - typingsJapgolly.nodegit.nodegitNumbers.`1`
  - typingsJapgolly.nodegit.nodegitNumbers.`2`
  - typingsJapgolly.nodegit.nodegitNumbers.`4`
  - typingsJapgolly.nodegit.nodegitNumbers.`8`
  - typingsJapgolly.nodegit.nodegitNumbers.`16`
  - typingsJapgolly.nodegit.nodegitNumbers.`65535`
*/
trait NOTIFY extends js.Object

object NOTIFY {
  @scala.inline
  def ALL: `65535` = this.cast(65535)
  @scala.inline
  def CONFLICT: `1` = this.cast(1)
  @scala.inline
  def DIRTY: `2` = this.cast(2)
  @scala.inline
  def IGNORED: `16` = this.cast(16)
  @scala.inline
  def NONE: `0` = this.cast(0)
  @scala.inline
  def UNTRACKED: `8` = this.cast(8)
  @scala.inline
  def UPDATED: `4` = this.cast(4)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

