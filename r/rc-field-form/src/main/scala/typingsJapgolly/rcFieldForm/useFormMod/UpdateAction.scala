package typingsJapgolly.rcFieldForm.useFormMod

import typingsJapgolly.rcFieldForm.interfaceMod.InternalNamePath
import typingsJapgolly.rcFieldForm.interfaceMod.StoreValue
import typingsJapgolly.rcFieldForm.rcFieldFormStrings.updateValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAction extends ReducerAction {
  var namePath: InternalNamePath
  var `type`: updateValue
  var value: StoreValue
}

object UpdateAction {
  @scala.inline
  def apply(namePath: InternalNamePath, `type`: updateValue, value: StoreValue): UpdateAction = {
    val __obj = js.Dynamic.literal(namePath = namePath.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAction]
  }
}

