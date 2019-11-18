package typingsJapgolly.mobx.libTypesObservableobjectMod

import typingsJapgolly.mobx.mobxStrings.add
import typingsJapgolly.mobx.mobxStrings.remove
import typingsJapgolly.mobx.mobxStrings.update
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectWillChange extends js.Object {
  var name: js.UndefOr[PropertyKey] = js.undefined
  var newValue: js.UndefOr[js.Any] = js.undefined
  var `object`: js.UndefOr[js.Any] = js.undefined
  var `type`: js.UndefOr[add | remove | update] = js.undefined
}

object IObjectWillChange {
  @scala.inline
  def apply(
    name: PropertyKey = null,
    newValue: js.Any = null,
    `object`: js.Any = null,
    `type`: add | remove | update = null
  ): IObjectWillChange = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (newValue != null) __obj.updateDynamic("newValue")(newValue.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectWillChange]
  }
}

