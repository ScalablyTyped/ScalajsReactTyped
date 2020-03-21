package typingsJapgolly.activexDao.DAO

import typingsJapgolly.activexDao.activexDaoNumbers.`0`
import typingsJapgolly.activexDao.activexDaoNumbers.`1`
import typingsJapgolly.activexDao.activexDaoNumbers.`2`
import typingsJapgolly.activexDao.activexDaoNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexDao.activexDaoNumbers.`0`
  - typingsJapgolly.activexDao.activexDaoNumbers.`3`
  - typingsJapgolly.activexDao.activexDaoNumbers.`1`
  - typingsJapgolly.activexDao.activexDaoNumbers.`2`
*/
trait DriverPromptEnum extends js.Object

object DriverPromptEnum {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dbDriverComplete: `0` = this.cast(0)
  @scala.inline
  def dbDriverCompleteRequired: `3` = this.cast(3)
  @scala.inline
  def dbDriverNoPrompt: `1` = this.cast(1)
  @scala.inline
  def dbDriverPrompt: `2` = this.cast(2)
}

