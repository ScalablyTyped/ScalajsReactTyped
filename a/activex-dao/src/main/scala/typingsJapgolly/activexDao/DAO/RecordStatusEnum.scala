package typingsJapgolly.activexDao.DAO

import typingsJapgolly.activexDao.activexDaoNumbers.`0`
import typingsJapgolly.activexDao.activexDaoNumbers.`1`
import typingsJapgolly.activexDao.activexDaoNumbers.`2`
import typingsJapgolly.activexDao.activexDaoNumbers.`3`
import typingsJapgolly.activexDao.activexDaoNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexDao.activexDaoNumbers.`4`
  - typingsJapgolly.activexDao.activexDaoNumbers.`3`
  - typingsJapgolly.activexDao.activexDaoNumbers.`1`
  - typingsJapgolly.activexDao.activexDaoNumbers.`2`
  - typingsJapgolly.activexDao.activexDaoNumbers.`0`
*/
trait RecordStatusEnum extends js.Object

object RecordStatusEnum {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dbRecordDBDeleted: `4` = this.cast(4)
  @scala.inline
  def dbRecordDeleted: `3` = this.cast(3)
  @scala.inline
  def dbRecordModified: `1` = this.cast(1)
  @scala.inline
  def dbRecordNew: `2` = this.cast(2)
  @scala.inline
  def dbRecordUnmodified: `0` = this.cast(0)
}

