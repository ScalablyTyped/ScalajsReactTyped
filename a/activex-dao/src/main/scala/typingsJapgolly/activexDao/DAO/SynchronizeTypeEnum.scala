package typingsJapgolly.activexDao.DAO

import typingsJapgolly.activexDao.activexDaoNumbers.`16`
import typingsJapgolly.activexDao.activexDaoNumbers.`1`
import typingsJapgolly.activexDao.activexDaoNumbers.`2`
import typingsJapgolly.activexDao.activexDaoNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexDao.activexDaoNumbers.`1`
  - typingsJapgolly.activexDao.activexDaoNumbers.`4`
  - typingsJapgolly.activexDao.activexDaoNumbers.`2`
  - typingsJapgolly.activexDao.activexDaoNumbers.`16`
*/
trait SynchronizeTypeEnum extends js.Object

object SynchronizeTypeEnum {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dbRepExportChanges: `1` = this.cast(1)
  @scala.inline
  def dbRepImpExpChanges: `4` = this.cast(4)
  @scala.inline
  def dbRepImportChanges: `2` = this.cast(2)
  @scala.inline
  def dbRepSyncInternet: `16` = this.cast(16)
}

