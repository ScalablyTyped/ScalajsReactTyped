package typingsJapgolly.nodegit.blameMod.Blame

import typingsJapgolly.nodegit.nodegitNumbers.`0`
import typingsJapgolly.nodegit.nodegitNumbers.`16`
import typingsJapgolly.nodegit.nodegitNumbers.`1`
import typingsJapgolly.nodegit.nodegitNumbers.`2`
import typingsJapgolly.nodegit.nodegitNumbers.`4`
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
*/
trait FLAG extends js.Object

object FLAG {
  @scala.inline
  def FIRST_PARENT: `16` = this.cast(16)
  @scala.inline
  def NORMAL: `0` = this.cast(0)
  @scala.inline
  def TRACK_COPIES_ANY_COMMIT_COPIES: `8` = this.cast(8)
  @scala.inline
  def TRACK_COPIES_SAME_COMMIT_COPIES: `4` = this.cast(4)
  @scala.inline
  def TRACK_COPIES_SAME_COMMIT_MOVES: `2` = this.cast(2)
  @scala.inline
  def TRACK_COPIES_SAME_FILE: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

