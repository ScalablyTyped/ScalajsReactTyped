package typingsJapgolly.activexDao.DAO

import typingsJapgolly.activexDao.activexDaoNumbers.`1`
import typingsJapgolly.activexDao.activexDaoNumbers.`2`
import typingsJapgolly.activexDao.activexDaoNumbers.`3`
import typingsJapgolly.activexDao.activexDaoNumbers.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexDao.activexDaoNumbers.`3`
  - typingsJapgolly.activexDao.activexDaoNumbers.`5`
  - typingsJapgolly.activexDao.activexDaoNumbers.`1`
  - typingsJapgolly.activexDao.activexDaoNumbers.`2`
*/
trait LockTypeEnum extends js.Object

object LockTypeEnum {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dbOptimistic: `3` = this.cast(3)
  @scala.inline
  def dbOptimisticBatch: `5` = this.cast(5)
  @scala.inline
  def dbOptimisticValue: `1` = this.cast(1)
  @scala.inline
  def dbPessimistic: `2` = this.cast(2)
}

