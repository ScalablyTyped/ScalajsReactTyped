package typingsJapgolly.activexOffice.Office

import typingsJapgolly.activexOffice.activexOfficeNumbers.`-1`
import typingsJapgolly.activexOffice.activexOfficeNumbers.`-2`
import typingsJapgolly.activexOffice.activexOfficeNumbers.`-3`
import typingsJapgolly.activexOffice.activexOfficeNumbers.`0`
import typingsJapgolly.activexOffice.activexOfficeNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexOffice.activexOfficeNumbers.`1`
  - typingsJapgolly.activexOffice.activexOfficeNumbers.`0`
  - typingsJapgolly.activexOffice.activexOfficeNumbers.`-2`
  - typingsJapgolly.activexOffice.activexOfficeNumbers.`-3`
  - typingsJapgolly.activexOffice.activexOfficeNumbers.`-1`
*/
trait MsoTriState extends js.Object

object MsoTriState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def msoCTrue: `1` = this.cast(1)
  @scala.inline
  def msoFalse: `0` = this.cast(0)
  @scala.inline
  def msoTriStateMixed: `-2` = this.cast(-2)
  @scala.inline
  def msoTriStateToggle: `-3` = this.cast(-3)
  @scala.inline
  def msoTrue: `-1` = this.cast(-1)
}

