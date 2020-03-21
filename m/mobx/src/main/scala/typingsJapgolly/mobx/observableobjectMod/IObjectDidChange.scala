package typingsJapgolly.mobx.observableobjectMod

import typingsJapgolly.mobx.mobxStrings.add
import typingsJapgolly.mobx.mobxStrings.remove
import typingsJapgolly.mobx.mobxStrings.update
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mobx.AnonType
  - typingsJapgolly.mobx.AnonOldValue
  - typingsJapgolly.mobx.AnonNameObject
*/
trait IObjectDidChange extends js.Object

object IObjectDidChange {
  @scala.inline
  def AnonType(name: PropertyKey, newValue: js.Any, `object`: js.Any, `type`: add): IObjectDidChange = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectDidChange]
  }
  @scala.inline
  def AnonOldValue(name: PropertyKey, newValue: js.Any, `object`: js.Any, oldValue: js.Any, `type`: update): IObjectDidChange = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectDidChange]
  }
  @scala.inline
  def AnonNameObject(name: PropertyKey, `object`: js.Any, oldValue: js.Any, `type`: remove): IObjectDidChange = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectDidChange]
  }
}

