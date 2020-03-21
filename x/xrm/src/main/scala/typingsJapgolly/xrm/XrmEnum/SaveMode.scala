package typingsJapgolly.xrm.XrmEnum

import typingsJapgolly.xrm.xrmNumbers.`15`
import typingsJapgolly.xrm.xrmNumbers.`16`
import typingsJapgolly.xrm.xrmNumbers.`1`
import typingsJapgolly.xrm.xrmNumbers.`2`
import typingsJapgolly.xrm.xrmNumbers.`47`
import typingsJapgolly.xrm.xrmNumbers.`58`
import typingsJapgolly.xrm.xrmNumbers.`59`
import typingsJapgolly.xrm.xrmNumbers.`5`
import typingsJapgolly.xrm.xrmNumbers.`6`
import typingsJapgolly.xrm.xrmNumbers.`70`
import typingsJapgolly.xrm.xrmNumbers.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enumeration of entity form save modes.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.xrm.xrmNumbers.`1`
  - typingsJapgolly.xrm.xrmNumbers.`2`
  - typingsJapgolly.xrm.xrmNumbers.`59`
  - typingsJapgolly.xrm.xrmNumbers.`70`
  - typingsJapgolly.xrm.xrmNumbers.`58`
  - typingsJapgolly.xrm.xrmNumbers.`5`
  - typingsJapgolly.xrm.xrmNumbers.`6`
  - typingsJapgolly.xrm.xrmNumbers.`47`
  - typingsJapgolly.xrm.xrmNumbers.`7`
  - typingsJapgolly.xrm.xrmNumbers.`16`
  - typingsJapgolly.xrm.xrmNumbers.`15`
*/
trait SaveMode extends js.Object

object SaveMode {
  @scala.inline
  def Assign: `47` = this.cast(47)
  @scala.inline
  def AutoSave: `70` = this.cast(70)
  @scala.inline
  def Deactivate: `5` = this.cast(5)
  @scala.inline
  def Disqualify: `15` = this.cast(15)
  @scala.inline
  def Qualify: `16` = this.cast(16)
  @scala.inline
  def Reactivate: `6` = this.cast(6)
  @scala.inline
  def Save: `1` = this.cast(1)
  @scala.inline
  def SaveAndClose: `2` = this.cast(2)
  @scala.inline
  def SaveAndNew: `59` = this.cast(59)
  @scala.inline
  def SaveAsCompleted: `58` = this.cast(58)
  @scala.inline
  def Send: `7` = this.cast(7)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

