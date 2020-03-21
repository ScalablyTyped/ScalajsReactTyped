package typingsJapgolly.activexOffice.Office

import typingsJapgolly.activexOffice.activexOfficeNumbers.`0`
import typingsJapgolly.activexOffice.activexOfficeNumbers.`1`
import typingsJapgolly.activexOffice.activexOfficeNumbers.`2`
import typingsJapgolly.activexOffice.activexOfficeNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexOffice.activexOfficeNumbers.`1`
  - typingsJapgolly.activexOffice.activexOfficeNumbers.`0`
  - typingsJapgolly.activexOffice.activexOfficeNumbers.`3`
  - typingsJapgolly.activexOffice.activexOfficeNumbers.`2`
*/
trait MsoWizardActType extends js.Object

object MsoWizardActType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def msoWizardActActive: `1` = this.cast(1)
  @scala.inline
  def msoWizardActInactive: `0` = this.cast(0)
  @scala.inline
  def msoWizardActResume: `3` = this.cast(3)
  @scala.inline
  def msoWizardActSuspend: `2` = this.cast(2)
}

