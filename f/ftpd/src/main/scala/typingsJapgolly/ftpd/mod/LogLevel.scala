package typingsJapgolly.ftpd.mod

import typingsJapgolly.ftpd.ftpdNumbers.`0`
import typingsJapgolly.ftpd.ftpdNumbers.`1`
import typingsJapgolly.ftpd.ftpdNumbers.`2`
import typingsJapgolly.ftpd.ftpdNumbers.`3`
import typingsJapgolly.ftpd.ftpdNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ftpd.ftpdNumbers.`0`
  - typingsJapgolly.ftpd.ftpdNumbers.`1`
  - typingsJapgolly.ftpd.ftpdNumbers.`2`
  - typingsJapgolly.ftpd.ftpdNumbers.`3`
  - typingsJapgolly.ftpd.ftpdNumbers.`4`
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  def DEBUG: `3` = this.cast(3)
  @scala.inline
  def ERROR: `0` = this.cast(0)
  @scala.inline
  def INFO: `2` = this.cast(2)
  @scala.inline
  def TRACE: `4` = this.cast(4)
  @scala.inline
  def WARN: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

