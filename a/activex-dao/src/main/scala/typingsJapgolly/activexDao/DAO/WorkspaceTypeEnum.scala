package typingsJapgolly.activexDao.DAO

import typingsJapgolly.activexDao.activexDaoNumbers.`1`
import typingsJapgolly.activexDao.activexDaoNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexDao.activexDaoNumbers.`2`
  - typingsJapgolly.activexDao.activexDaoNumbers.`1`
*/
trait WorkspaceTypeEnum extends js.Object

object WorkspaceTypeEnum {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dbUseJet: `2` = this.cast(2)
  @scala.inline
  def dbUseODBC: `1` = this.cast(1)
}

