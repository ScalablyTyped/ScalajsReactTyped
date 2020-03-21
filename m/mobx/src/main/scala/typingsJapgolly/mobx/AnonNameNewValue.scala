package typingsJapgolly.mobx

import typingsJapgolly.mobx.mobxStrings.add
import typingsJapgolly.mobx.mobxStrings.update
import typingsJapgolly.mobx.observableobjectMod.IObjectWillChange
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNameNewValue extends IObjectWillChange {
  var name: PropertyKey
  var newValue: js.Any
  var `object`: js.Any
  var `type`: update | add
}

object AnonNameNewValue {
  @scala.inline
  def apply(name: PropertyKey, newValue: js.Any, `object`: js.Any, `type`: update | add): AnonNameNewValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNameNewValue]
  }
}

