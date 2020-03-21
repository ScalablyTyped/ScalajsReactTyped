package typingsJapgolly.activexOffice.Office

import typingsJapgolly.activexOffice.activexOfficeNumbers.`0`
import typingsJapgolly.activexOffice.activexOfficeNumbers.`1`
import typingsJapgolly.activexOffice.activexOfficeNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexOffice.activexOfficeNumbers.`1`
  - typingsJapgolly.activexOffice.activexOfficeNumbers.`0`
  - typingsJapgolly.activexOffice.activexOfficeNumbers.`2`
*/
trait MsoFileNewAction extends js.Object

object MsoFileNewAction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def msoCreateNewFile: `1` = this.cast(1)
  @scala.inline
  def msoEditFile: `0` = this.cast(0)
  @scala.inline
  def msoOpenFile: `2` = this.cast(2)
}

