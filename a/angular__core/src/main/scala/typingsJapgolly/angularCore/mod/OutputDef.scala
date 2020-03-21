package typingsJapgolly.angularCore.mod

import typingsJapgolly.angularCore.angularCoreStrings.body
import typingsJapgolly.angularCore.angularCoreStrings.component
import typingsJapgolly.angularCore.angularCoreStrings.document_
import typingsJapgolly.angularCore.angularCoreStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputDef extends js.Object {
  var eventName: String
  var propName: String | Null
  var target: window | document_ | body | component | Null
  var `type`: OutputType
}

object OutputDef {
  @scala.inline
  def apply(
    eventName: String,
    `type`: OutputType,
    propName: String = null,
    target: window | document_ | body | component = null
  ): OutputDef = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (propName != null) __obj.updateDynamic("propName")(propName.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputDef]
  }
}

