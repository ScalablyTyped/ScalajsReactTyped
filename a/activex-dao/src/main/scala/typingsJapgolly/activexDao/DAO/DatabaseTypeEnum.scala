package typingsJapgolly.activexDao.DAO

import typingsJapgolly.activexDao.activexDaoNumbers.`128`
import typingsJapgolly.activexDao.activexDaoNumbers.`16`
import typingsJapgolly.activexDao.activexDaoNumbers.`1`
import typingsJapgolly.activexDao.activexDaoNumbers.`256`
import typingsJapgolly.activexDao.activexDaoNumbers.`2`
import typingsJapgolly.activexDao.activexDaoNumbers.`32`
import typingsJapgolly.activexDao.activexDaoNumbers.`4`
import typingsJapgolly.activexDao.activexDaoNumbers.`512`
import typingsJapgolly.activexDao.activexDaoNumbers.`64`
import typingsJapgolly.activexDao.activexDaoNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexDao.activexDaoNumbers.`4`
  - typingsJapgolly.activexDao.activexDaoNumbers.`2`
  - typingsJapgolly.activexDao.activexDaoNumbers.`1`
  - typingsJapgolly.activexDao.activexDaoNumbers.`8`
  - typingsJapgolly.activexDao.activexDaoNumbers.`128`
  - typingsJapgolly.activexDao.activexDaoNumbers.`256`
  - typingsJapgolly.activexDao.activexDaoNumbers.`512`
  - typingsJapgolly.activexDao.activexDaoNumbers.`16`
  - typingsJapgolly.activexDao.activexDaoNumbers.`32`
  - typingsJapgolly.activexDao.activexDaoNumbers.`64`
*/
trait DatabaseTypeEnum extends js.Object

object DatabaseTypeEnum {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  /** @deprecated */
  @scala.inline
  def dbDecrypt: `4` = this.cast(4)
  /** @deprecated */
  @scala.inline
  def dbEncrypt: `2` = this.cast(2)
  @scala.inline
  def dbVersion10: `1` = this.cast(1)
  @scala.inline
  def dbVersion11: `8` = this.cast(8)
  @scala.inline
  def dbVersion120: `128` = this.cast(128)
  @scala.inline
  def dbVersion140: `256` = this.cast(256)
  @scala.inline
  def dbVersion150: `512` = this.cast(512)
  @scala.inline
  def dbVersion20: `16` = this.cast(16)
  @scala.inline
  def dbVersion30: `32` = this.cast(32)
  @scala.inline
  def dbVersion40: `64` = this.cast(64)
}

