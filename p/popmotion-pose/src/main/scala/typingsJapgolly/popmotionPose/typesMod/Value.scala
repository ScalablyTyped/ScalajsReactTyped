package typingsJapgolly.popmotionPose.typesMod

import typingsJapgolly.popmotion.mod.ValueReaction
import typingsJapgolly.styleValueTypes.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  var raw: ValueReaction
  var `type`: js.UndefOr[ValueType] = js.undefined
}

object Value {
  @scala.inline
  def apply(raw: ValueReaction, `type`: ValueType = null): Value = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

