package typingsJapgolly.activexDao.DAO

import typingsJapgolly.activexDao.activexDaoNumbers.`0`
import typingsJapgolly.activexDao.activexDaoNumbers.`1048575`
import typingsJapgolly.activexDao.activexDaoNumbers.`128`
import typingsJapgolly.activexDao.activexDaoNumbers.`131072`
import typingsJapgolly.activexDao.activexDaoNumbers.`1`
import typingsJapgolly.activexDao.activexDaoNumbers.`20`
import typingsJapgolly.activexDao.activexDaoNumbers.`262144`
import typingsJapgolly.activexDao.activexDaoNumbers.`2`
import typingsJapgolly.activexDao.activexDaoNumbers.`32`
import typingsJapgolly.activexDao.activexDaoNumbers.`4`
import typingsJapgolly.activexDao.activexDaoNumbers.`524288`
import typingsJapgolly.activexDao.activexDaoNumbers.`64`
import typingsJapgolly.activexDao.activexDaoNumbers.`65536`
import typingsJapgolly.activexDao.activexDaoNumbers.`65548`
import typingsJapgolly.activexDao.activexDaoNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexDao.activexDaoNumbers.`1`
  - typingsJapgolly.activexDao.activexDaoNumbers.`8`
  - typingsJapgolly.activexDao.activexDaoNumbers.`4`
  - typingsJapgolly.activexDao.activexDaoNumbers.`2`
  - typingsJapgolly.activexDao.activexDaoNumbers.`65536`
  - typingsJapgolly.activexDao.activexDaoNumbers.`128`
  - typingsJapgolly.activexDao.activexDaoNumbers.`1048575`
  - typingsJapgolly.activexDao.activexDaoNumbers.`32`
  - typingsJapgolly.activexDao.activexDaoNumbers.`0`
  - typingsJapgolly.activexDao.activexDaoNumbers.`131072`
  - typingsJapgolly.activexDao.activexDaoNumbers.`64`
  - typingsJapgolly.activexDao.activexDaoNumbers.`20`
  - typingsJapgolly.activexDao.activexDaoNumbers.`65548`
  - typingsJapgolly.activexDao.activexDaoNumbers.`524288`
  - typingsJapgolly.activexDao.activexDaoNumbers.`262144`
*/
trait PermissionEnum extends js.Object

object PermissionEnum {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dbSecCreate: `1` = this.cast(1)
  @scala.inline
  def dbSecDBAdmin: `8` = this.cast(8)
  @scala.inline
  def dbSecDBCreate: `1` = this.cast(1)
  @scala.inline
  def dbSecDBExclusive: `4` = this.cast(4)
  @scala.inline
  def dbSecDBOpen: `2` = this.cast(2)
  @scala.inline
  def dbSecDelete: `65536` = this.cast(65536)
  @scala.inline
  def dbSecDeleteData: `128` = this.cast(128)
  @scala.inline
  def dbSecFullAccess: `1048575` = this.cast(1048575)
  @scala.inline
  def dbSecInsertData: `32` = this.cast(32)
  @scala.inline
  def dbSecNoAccess: `0` = this.cast(0)
  @scala.inline
  def dbSecReadDef: `4` = this.cast(4)
  @scala.inline
  def dbSecReadSec: `131072` = this.cast(131072)
  @scala.inline
  def dbSecReplaceData: `64` = this.cast(64)
  @scala.inline
  def dbSecRetrieveData: `20` = this.cast(20)
  @scala.inline
  def dbSecWriteDef: `65548` = this.cast(65548)
  @scala.inline
  def dbSecWriteOwner: `524288` = this.cast(524288)
  @scala.inline
  def dbSecWriteSec: `262144` = this.cast(262144)
}

