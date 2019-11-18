package typingsJapgolly.atAngularCore.atAngularCoreMod

import typingsJapgolly.atAngularCore.atAngularCoreStrings.body
import typingsJapgolly.atAngularCore.atAngularCoreStrings.component
import typingsJapgolly.atAngularCore.atAngularCoreStrings.document
import typingsJapgolly.atAngularCore.atAngularCoreStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputDef extends js.Object {
  var eventName: String
  var propName: String | Null
  var target: window | document | body | component | Null
  var `type`: OutputType
}

object OutputDef {
  @scala.inline
  def apply(
    eventName: String,
    `type`: OutputType,
    propName: String = null,
    target: window | document | body | component = null
  ): OutputDef = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (propName != null) __obj.updateDynamic("propName")(propName.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputDef]
  }
}

