package typingsJapgolly.nodegit.filterMod.Filter

import typingsJapgolly.nodegit.nodegitNumbers.`0`
import typingsJapgolly.nodegit.nodegitNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodegit.nodegitNumbers.`0`
  - typingsJapgolly.nodegit.nodegitNumbers.`1`
*/
trait MODE extends js.Object

object MODE {
  @scala.inline
  def CLEAN: `1` = this.cast(1)
  @scala.inline
  def SMUDGE: `0` = this.cast(0)
  @scala.inline
  def TO_ODB: `1` = this.cast(1)
  @scala.inline
  def TO_WORKTREE: `0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

