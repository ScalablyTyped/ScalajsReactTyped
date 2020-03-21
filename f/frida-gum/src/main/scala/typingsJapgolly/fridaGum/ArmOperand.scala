package typingsJapgolly.fridaGum

import typingsJapgolly.fridaGum.fridaGumStrings.cimm
import typingsJapgolly.fridaGum.fridaGumStrings.fp
import typingsJapgolly.fridaGum.fridaGumStrings.imm
import typingsJapgolly.fridaGum.fridaGumStrings.mem
import typingsJapgolly.fridaGum.fridaGumStrings.pimm
import typingsJapgolly.fridaGum.fridaGumStrings.reg
import typingsJapgolly.fridaGum.fridaGumStrings.setend
import typingsJapgolly.fridaGum.fridaGumStrings.sysreg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.fridaGum.ArmRegOperand
  - typingsJapgolly.fridaGum.ArmImmOperand
  - typingsJapgolly.fridaGum.ArmMemOperand
  - typingsJapgolly.fridaGum.ArmFpOperand
  - typingsJapgolly.fridaGum.ArmCimmOperand
  - typingsJapgolly.fridaGum.ArmPimmOperand
  - typingsJapgolly.fridaGum.ArmSetendOperand
  - typingsJapgolly.fridaGum.ArmSysregOperand
*/
trait ArmOperand extends js.Object

object ArmOperand {
  @scala.inline
  def ArmSetendOperand(
    subtracted: Boolean,
    `type`: setend,
    value: Endian,
    shift: AnonType = null,
    vectorIndex: Int | Double = null
  ): ArmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmOperand]
  }
  @scala.inline
  def ArmImmOperand(
    subtracted: Boolean,
    `type`: imm,
    value: Double,
    shift: AnonType = null,
    vectorIndex: Int | Double = null
  ): ArmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmOperand]
  }
  @scala.inline
  def ArmSysregOperand(
    subtracted: Boolean,
    `type`: sysreg,
    value: ArmRegister,
    shift: AnonType = null,
    vectorIndex: Int | Double = null
  ): ArmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmOperand]
  }
  @scala.inline
  def ArmRegOperand(
    subtracted: Boolean,
    `type`: reg,
    value: ArmRegister,
    shift: AnonType = null,
    vectorIndex: Int | Double = null
  ): ArmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmOperand]
  }
  @scala.inline
  def ArmCimmOperand(
    subtracted: Boolean,
    `type`: cimm,
    value: Double,
    shift: AnonType = null,
    vectorIndex: Int | Double = null
  ): ArmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmOperand]
  }
  @scala.inline
  def ArmFpOperand(
    subtracted: Boolean,
    `type`: fp,
    value: Double,
    shift: AnonType = null,
    vectorIndex: Int | Double = null
  ): ArmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmOperand]
  }
  @scala.inline
  def ArmMemOperand(
    subtracted: Boolean,
    `type`: mem,
    value: AnonDisp,
    shift: AnonType = null,
    vectorIndex: Int | Double = null
  ): ArmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmOperand]
  }
  @scala.inline
  def ArmPimmOperand(
    subtracted: Boolean,
    `type`: pimm,
    value: Double,
    shift: AnonType = null,
    vectorIndex: Int | Double = null
  ): ArmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmOperand]
  }
}

