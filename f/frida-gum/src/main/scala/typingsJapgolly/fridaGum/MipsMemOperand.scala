package typingsJapgolly.fridaGum

import typingsJapgolly.fridaGum.fridaGumStrings.mem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MipsMemOperand extends MipsOperand {
  var `type`: mem
  var value: AnonBaseDisp
}

object MipsMemOperand {
  @scala.inline
  def apply(`type`: mem, value: AnonBaseDisp): MipsMemOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MipsMemOperand]
  }
}

