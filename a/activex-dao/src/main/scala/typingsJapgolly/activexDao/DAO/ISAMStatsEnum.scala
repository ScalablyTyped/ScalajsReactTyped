package typingsJapgolly.activexDao.DAO

import typingsJapgolly.activexDao.activexDaoNumbers.`0`
import typingsJapgolly.activexDao.activexDaoNumbers.`1`
import typingsJapgolly.activexDao.activexDaoNumbers.`2`
import typingsJapgolly.activexDao.activexDaoNumbers.`3`
import typingsJapgolly.activexDao.activexDaoNumbers.`4`
import typingsJapgolly.activexDao.activexDaoNumbers.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexDao.activexDaoNumbers.`0`
  - typingsJapgolly.activexDao.activexDaoNumbers.`1`
  - typingsJapgolly.activexDao.activexDaoNumbers.`4`
  - typingsJapgolly.activexDao.activexDaoNumbers.`5`
  - typingsJapgolly.activexDao.activexDaoNumbers.`2`
  - typingsJapgolly.activexDao.activexDaoNumbers.`3`
*/
trait ISAMStatsEnum extends js.Object

object ISAMStatsEnum {
  @scala.inline
  def DiskReads: `0` = this.cast(0)
  @scala.inline
  def DiskWrites: `1` = this.cast(1)
  @scala.inline
  def LocksPlaced: `4` = this.cast(4)
  @scala.inline
  def LocksReleased: `5` = this.cast(5)
  @scala.inline
  def ReadsFromCache: `2` = this.cast(2)
  @scala.inline
  def ReadsFromReadAheadCache: `3` = this.cast(3)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

