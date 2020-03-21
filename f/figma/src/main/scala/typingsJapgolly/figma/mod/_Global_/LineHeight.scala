package typingsJapgolly.figma.mod._Global_

import typingsJapgolly.figma.figmaStrings.AUTO
import typingsJapgolly.figma.figmaStrings.PERCENT
import typingsJapgolly.figma.figmaStrings.PIXELS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.figma.AnonUnit
  - typingsJapgolly.figma.Anon0
*/
trait LineHeight extends js.Object

object LineHeight {
  @scala.inline
  def AnonUnit(unit: PIXELS | PERCENT, value: Double): LineHeight = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LineHeight]
  }
  @scala.inline
  def Anon0(unit: AUTO): LineHeight = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LineHeight]
  }
}

