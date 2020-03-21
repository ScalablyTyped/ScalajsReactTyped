package typingsJapgolly.reduxForm.formSectionMod

import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormSectionProps[P] extends js.Object {
  var component: js.UndefOr[ComponentType[P]] = js.undefined
  var name: String
}

object FormSectionProps {
  @scala.inline
  def apply[P](name: String, component: ComponentType[P] = null): FormSectionProps[P] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormSectionProps[P]]
  }
}

