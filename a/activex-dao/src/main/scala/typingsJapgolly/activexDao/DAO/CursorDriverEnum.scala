package typingsJapgolly.activexDao.DAO

import typingsJapgolly.activexDao.activexDaoNumbers.`-1`
import typingsJapgolly.activexDao.activexDaoNumbers.`1`
import typingsJapgolly.activexDao.activexDaoNumbers.`2`
import typingsJapgolly.activexDao.activexDaoNumbers.`3`
import typingsJapgolly.activexDao.activexDaoNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexDao.activexDaoNumbers.`3`
  - typingsJapgolly.activexDao.activexDaoNumbers.`-1`
  - typingsJapgolly.activexDao.activexDaoNumbers.`4`
  - typingsJapgolly.activexDao.activexDaoNumbers.`1`
  - typingsJapgolly.activexDao.activexDaoNumbers.`2`
*/
trait CursorDriverEnum extends js.Object

object CursorDriverEnum {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dbUseClientBatchCursor: `3` = this.cast(3)
  @scala.inline
  def dbUseDefaultCursor: `-1` = this.cast(-1)
  @scala.inline
  def dbUseNoCursor: `4` = this.cast(4)
  @scala.inline
  def dbUseODBCCursor: `1` = this.cast(1)
  @scala.inline
  def dbUseServerCursor: `2` = this.cast(2)
}

