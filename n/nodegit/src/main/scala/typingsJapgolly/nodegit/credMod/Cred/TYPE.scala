package typingsJapgolly.nodegit.credMod.Cred

import typingsJapgolly.nodegit.nodegitNumbers.`16`
import typingsJapgolly.nodegit.nodegitNumbers.`1`
import typingsJapgolly.nodegit.nodegitNumbers.`2`
import typingsJapgolly.nodegit.nodegitNumbers.`32`
import typingsJapgolly.nodegit.nodegitNumbers.`4`
import typingsJapgolly.nodegit.nodegitNumbers.`64`
import typingsJapgolly.nodegit.nodegitNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodegit.nodegitNumbers.`1`
  - typingsJapgolly.nodegit.nodegitNumbers.`2`
  - typingsJapgolly.nodegit.nodegitNumbers.`4`
  - typingsJapgolly.nodegit.nodegitNumbers.`8`
  - typingsJapgolly.nodegit.nodegitNumbers.`16`
  - typingsJapgolly.nodegit.nodegitNumbers.`32`
  - typingsJapgolly.nodegit.nodegitNumbers.`64`
*/
trait TYPE extends js.Object

object TYPE {
  @scala.inline
  def DEFAULT: `8` = this.cast(8)
  @scala.inline
  def SSH_CUSTOM: `4` = this.cast(4)
  @scala.inline
  def SSH_INTERACTIVE: `16` = this.cast(16)
  @scala.inline
  def SSH_KEY: `2` = this.cast(2)
  @scala.inline
  def SSH_MEMORY: `64` = this.cast(64)
  @scala.inline
  def USERNAME: `32` = this.cast(32)
  @scala.inline
  def USERPASS_PLAINTEXT: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

