package typingsJapgolly.nodegit.stashMod.Stash

import typingsJapgolly.nodegit.nodegitNumbers.`0`
import typingsJapgolly.nodegit.nodegitNumbers.`1`
import typingsJapgolly.nodegit.nodegitNumbers.`2`
import typingsJapgolly.nodegit.nodegitNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodegit.nodegitNumbers.`0`
  - typingsJapgolly.nodegit.nodegitNumbers.`1`
  - typingsJapgolly.nodegit.nodegitNumbers.`2`
  - typingsJapgolly.nodegit.nodegitNumbers.`4`
*/
trait FLAGS extends js.Object

object FLAGS {
  @scala.inline
  def DEFAULT: `0` = this.cast(0)
  @scala.inline
  def INCLUDE_IGNORED: `4` = this.cast(4)
  @scala.inline
  def INCLUDE_UNTRACKED: `2` = this.cast(2)
  @scala.inline
  def KEEP_INDEX: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

