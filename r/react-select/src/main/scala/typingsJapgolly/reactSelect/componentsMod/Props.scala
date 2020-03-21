package typingsJapgolly.reactSelect.componentsMod

import typingsJapgolly.reactSelect.typesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props[OptionType /* <: OptionTypeBase */] extends js.Object {
  var components: SelectComponentsConfig[OptionType]
}

object Props {
  @scala.inline
  def apply[OptionType /* <: OptionTypeBase */](components: SelectComponentsConfig[OptionType]): Props[OptionType] = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Props[OptionType]]
  }
}

