package typingsJapgolly.nodegit.submoduleMod.Submodule

import typingsJapgolly.nodegit.nodegitNumbers.`1024`
import typingsJapgolly.nodegit.nodegitNumbers.`128`
import typingsJapgolly.nodegit.nodegitNumbers.`16`
import typingsJapgolly.nodegit.nodegitNumbers.`1`
import typingsJapgolly.nodegit.nodegitNumbers.`2048`
import typingsJapgolly.nodegit.nodegitNumbers.`256`
import typingsJapgolly.nodegit.nodegitNumbers.`2`
import typingsJapgolly.nodegit.nodegitNumbers.`32`
import typingsJapgolly.nodegit.nodegitNumbers.`4096`
import typingsJapgolly.nodegit.nodegitNumbers.`4`
import typingsJapgolly.nodegit.nodegitNumbers.`512`
import typingsJapgolly.nodegit.nodegitNumbers.`64`
import typingsJapgolly.nodegit.nodegitNumbers.`8192`
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
  - typingsJapgolly.nodegit.nodegitNumbers.`128`
  - typingsJapgolly.nodegit.nodegitNumbers.`256`
  - typingsJapgolly.nodegit.nodegitNumbers.`512`
  - typingsJapgolly.nodegit.nodegitNumbers.`1024`
  - typingsJapgolly.nodegit.nodegitNumbers.`2048`
  - typingsJapgolly.nodegit.nodegitNumbers.`4096`
  - typingsJapgolly.nodegit.nodegitNumbers.`8192`
*/
trait STATUS extends js.Object

object STATUS {
  @scala.inline
  def INDEX_ADDED: `16` = this.cast(16)
  @scala.inline
  def INDEX_DELETED: `32` = this.cast(32)
  @scala.inline
  def INDEX_MODIFIED: `64` = this.cast(64)
  @scala.inline
  def IN_CONFIG: `4` = this.cast(4)
  @scala.inline
  def IN_HEAD: `1` = this.cast(1)
  @scala.inline
  def IN_INDEX: `2` = this.cast(2)
  @scala.inline
  def IN_WD: `8` = this.cast(8)
  @scala.inline
  def WD_ADDED: `256` = this.cast(256)
  @scala.inline
  def WD_DELETED: `512` = this.cast(512)
  @scala.inline
  def WD_INDEX_MODIFIED: `2048` = this.cast(2048)
  @scala.inline
  def WD_MODIFIED: `1024` = this.cast(1024)
  @scala.inline
  def WD_UNINITIALIZED: `128` = this.cast(128)
  @scala.inline
  def WD_UNTRACKED: `8192` = this.cast(8192)
  @scala.inline
  def WD_WD_MODIFIED: `4096` = this.cast(4096)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

