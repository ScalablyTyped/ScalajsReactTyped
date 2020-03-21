package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.a
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.b
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.g
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.hex
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.r
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComponent extends js.Object {
  var component: a | hex | b | g | r
  var value: String
}

object AnonComponent {
  @scala.inline
  def apply(component: a | hex | b | g | r, value: String): AnonComponent = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonComponent]
  }
}

