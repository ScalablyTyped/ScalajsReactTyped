package typingsJapgolly.activexDao.DAO

import typingsJapgolly.activexDao.activexDaoNumbers.`1`
import typingsJapgolly.activexDao.activexDaoNumbers.`2`
import typingsJapgolly.activexDao.activexDaoNumbers.`3`
import typingsJapgolly.activexDao.activexDaoNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexDao.activexDaoNumbers.`1`
  - typingsJapgolly.activexDao.activexDaoNumbers.`3`
  - typingsJapgolly.activexDao.activexDaoNumbers.`2`
  - typingsJapgolly.activexDao.activexDaoNumbers.`4`
*/
trait ParameterDirectionEnum extends js.Object

object ParameterDirectionEnum {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dbParamInput: `1` = this.cast(1)
  @scala.inline
  def dbParamInputOutput: `3` = this.cast(3)
  @scala.inline
  def dbParamOutput: `2` = this.cast(2)
  @scala.inline
  def dbParamReturnValue: `4` = this.cast(4)
}

