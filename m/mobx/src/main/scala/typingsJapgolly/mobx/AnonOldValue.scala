package typingsJapgolly.mobx

import typingsJapgolly.mobx.mobxStrings.update
import typingsJapgolly.mobx.observableobjectMod.IObjectDidChange
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOldValue extends IObjectDidChange {
  var name: PropertyKey
  var newValue: js.Any
  var `object`: js.Any
  var oldValue: js.Any
  var `type`: update
}

object AnonOldValue {
  @scala.inline
  def apply(name: PropertyKey, newValue: js.Any, `object`: js.Any, oldValue: js.Any, `type`: update): AnonOldValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOldValue]
  }
}

