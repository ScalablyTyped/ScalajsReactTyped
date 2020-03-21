package typingsJapgolly.activexDao.DAO

import typingsJapgolly.activexDao.activexDaoNumbers.`1024`
import typingsJapgolly.activexDao.activexDaoNumbers.`128`
import typingsJapgolly.activexDao.activexDaoNumbers.`16`
import typingsJapgolly.activexDao.activexDaoNumbers.`1`
import typingsJapgolly.activexDao.activexDaoNumbers.`2048`
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
  - typingsJapgolly.activexDao.activexDaoNumbers.`8`
  - typingsJapgolly.activexDao.activexDaoNumbers.`32`
  - typingsJapgolly.activexDao.activexDaoNumbers.`2`
  - typingsJapgolly.activexDao.activexDaoNumbers.`1`
  - typingsJapgolly.activexDao.activexDaoNumbers.`2048`
  - typingsJapgolly.activexDao.activexDaoNumbers.`128`
  - typingsJapgolly.activexDao.activexDaoNumbers.`256`
  - typingsJapgolly.activexDao.activexDaoNumbers.`16`
  - typingsJapgolly.activexDao.activexDaoNumbers.`4`
  - typingsJapgolly.activexDao.activexDaoNumbers.`1024`
  - typingsJapgolly.activexDao.activexDaoNumbers.`512`
  - typingsJapgolly.activexDao.activexDaoNumbers.`64`
*/
trait RecordsetOptionEnum extends js.Object

object RecordsetOptionEnum {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dbAppendOnly: `8` = this.cast(8)
  @scala.inline
  def dbConsistent: `32` = this.cast(32)
  @scala.inline
  def dbDenyRead: `2` = this.cast(2)
  @scala.inline
  def dbDenyWrite: `1` = this.cast(1)
  @scala.inline
  def dbExecDirect: `2048` = this.cast(2048)
  @scala.inline
  def dbFailOnError: `128` = this.cast(128)
  @scala.inline
  def dbForwardOnly: `256` = this.cast(256)
  @scala.inline
  def dbInconsistent: `16` = this.cast(16)
  @scala.inline
  def dbReadOnly: `4` = this.cast(4)
  @scala.inline
  def dbRunAsync: `1024` = this.cast(1024)
  @scala.inline
  def dbSQLPassThrough: `64` = this.cast(64)
  @scala.inline
  def dbSeeChanges: `512` = this.cast(512)
}

