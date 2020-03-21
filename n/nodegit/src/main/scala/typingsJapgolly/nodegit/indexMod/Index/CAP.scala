package typingsJapgolly.nodegit.indexMod.Index

import typingsJapgolly.nodegit.nodegitNumbers.`-1`
import typingsJapgolly.nodegit.nodegitNumbers.`1`
import typingsJapgolly.nodegit.nodegitNumbers.`2`
import typingsJapgolly.nodegit.nodegitNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodegit.nodegitNumbers.`1`
  - typingsJapgolly.nodegit.nodegitNumbers.`2`
  - typingsJapgolly.nodegit.nodegitNumbers.`4`
  - typingsJapgolly.nodegit.nodegitNumbers.`-1`
*/
trait CAP extends js.Object

object CAP {
  @scala.inline
  def FROM_OWNER: `-1` = this.cast(-1)
  @scala.inline
  def IGNORE_CASE: `1` = this.cast(1)
  @scala.inline
  def NO_FILEMODE: `2` = this.cast(2)
  @scala.inline
  def NO_SYMLINKS: `4` = this.cast(4)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

