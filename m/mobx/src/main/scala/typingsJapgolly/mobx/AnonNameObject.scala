package typingsJapgolly.mobx

import typingsJapgolly.mobx.mobxStrings.remove
import typingsJapgolly.mobx.observableobjectMod.IObjectDidChange
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNameObject extends IObjectDidChange {
  var name: PropertyKey
  var `object`: js.Any
  var oldValue: js.Any
  var `type`: remove
}

object AnonNameObject {
  @scala.inline
  def apply(name: PropertyKey, `object`: js.Any, oldValue: js.Any, `type`: remove): AnonNameObject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNameObject]
  }
}

