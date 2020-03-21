package typingsJapgolly.fridaGum

import typingsJapgolly.fridaGum.fridaGumStrings.imm
import typingsJapgolly.fridaGum.fridaGumStrings.mem
import typingsJapgolly.fridaGum.fridaGumStrings.reg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.fridaGum.MipsRegOperand
  - typingsJapgolly.fridaGum.MipsImmOperand
  - typingsJapgolly.fridaGum.MipsMemOperand
*/
trait MipsOperand extends js.Object

object MipsOperand {
  @scala.inline
  def MipsRegOperand(`type`: reg, value: MipsRegister): MipsOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MipsOperand]
  }
  @scala.inline
  def MipsImmOperand(`type`: imm, value: Double): MipsOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MipsOperand]
  }
  @scala.inline
  def MipsMemOperand(`type`: mem, value: AnonBaseDisp): MipsOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MipsOperand]
  }
}

