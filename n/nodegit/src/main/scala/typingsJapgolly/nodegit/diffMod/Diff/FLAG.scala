package typingsJapgolly.nodegit.diffMod.Diff

import typingsJapgolly.nodegit.nodegitNumbers.`1`
import typingsJapgolly.nodegit.nodegitNumbers.`2`
import typingsJapgolly.nodegit.nodegitNumbers.`4`
import typingsJapgolly.nodegit.nodegitNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodegit.nodegitNumbers.`1`
  - typingsJapgolly.nodegit.nodegitNumbers.`2`
  - typingsJapgolly.nodegit.nodegitNumbers.`4`
  - typingsJapgolly.nodegit.nodegitNumbers.`8`
*/
trait FLAG extends js.Object

object FLAG {
  @scala.inline
  def BINARY: `1` = this.cast(1)
  @scala.inline
  def EXISTS: `8` = this.cast(8)
  @scala.inline
  def NOT_BINARY: `2` = this.cast(2)
  @scala.inline
  def VALID_ID: `4` = this.cast(4)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

