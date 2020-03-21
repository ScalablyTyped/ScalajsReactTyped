package typingsJapgolly.activexWia.WIA

import typingsJapgolly.activexWia.activexWiaNumbers.`0`
import typingsJapgolly.activexWia.activexWiaNumbers.`1`
import typingsJapgolly.activexWia.activexWiaNumbers.`2`
import typingsJapgolly.activexWia.activexWiaNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The WiaSubType enumeration specifies more detail about the property value. Use the SubType property on the Property object to obtain these values for
  * the property.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexWia.activexWiaNumbers.`3`
  - typingsJapgolly.activexWia.activexWiaNumbers.`2`
  - typingsJapgolly.activexWia.activexWiaNumbers.`1`
  - typingsJapgolly.activexWia.activexWiaNumbers.`0`
*/
trait WiaSubType extends js.Object

object WiaSubType {
  @scala.inline
  def FlagSubType: `3` = this.cast(3)
  @scala.inline
  def ListSubType: `2` = this.cast(2)
  @scala.inline
  def RangeSubType: `1` = this.cast(1)
  @scala.inline
  def UnspecifiedSubType: `0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

