package typingsJapgolly.tensorflowTfjsConverter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var defaultValue: AnonAnyOf
  var name: AnonType
  var notSupported: AnonType
  var tfDeprecatedName: AnonType
  var tfName: AnonType
  var `type`: AnonRef
}

object AnonName {
  @scala.inline
  def apply(
    defaultValue: AnonAnyOf,
    name: AnonType,
    notSupported: AnonType,
    tfDeprecatedName: AnonType,
    tfName: AnonType,
    `type`: AnonRef
  ): AnonName = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], notSupported = notSupported.asInstanceOf[js.Any], tfDeprecatedName = tfDeprecatedName.asInstanceOf[js.Any], tfName = tfName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
}

