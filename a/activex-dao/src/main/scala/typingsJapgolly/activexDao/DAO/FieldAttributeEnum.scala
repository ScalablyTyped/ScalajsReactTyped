package typingsJapgolly.activexDao.DAO

import typingsJapgolly.activexDao.activexDaoNumbers.`16`
import typingsJapgolly.activexDao.activexDaoNumbers.`1`
import typingsJapgolly.activexDao.activexDaoNumbers.`2`
import typingsJapgolly.activexDao.activexDaoNumbers.`32768`
import typingsJapgolly.activexDao.activexDaoNumbers.`32`
import typingsJapgolly.activexDao.activexDaoNumbers.`8192`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexDao.activexDaoNumbers.`16`
  - typingsJapgolly.activexDao.activexDaoNumbers.`1`
  - typingsJapgolly.activexDao.activexDaoNumbers.`32768`
  - typingsJapgolly.activexDao.activexDaoNumbers.`8192`
  - typingsJapgolly.activexDao.activexDaoNumbers.`32`
  - typingsJapgolly.activexDao.activexDaoNumbers.`2`
*/
trait FieldAttributeEnum extends js.Object

object FieldAttributeEnum {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dbAutoIncrField: `16` = this.cast(16)
  @scala.inline
  def dbDescending: `1` = this.cast(1)
  @scala.inline
  def dbFixedField: `1` = this.cast(1)
  @scala.inline
  def dbHyperlinkField: `32768` = this.cast(32768)
  @scala.inline
  def dbSystemField: `8192` = this.cast(8192)
  @scala.inline
  def dbUpdatableField: `32` = this.cast(32)
  @scala.inline
  def dbVariableField: `2` = this.cast(2)
}

