package typingsJapgolly.storybookAddonKnobs.numberMod

import typingsJapgolly.storybookAddonKnobs.AnonKnobValidator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-knobs/dist/components/types/Number", JSImport.Default)
@js.native
class default () extends NumberType

/* static members */
@JSImport("@storybook/addon-knobs/dist/components/types/Number", JSImport.Default)
@js.native
object default extends js.Object {
  var defaultProps: NumberTypeProps = js.native
  var propTypes: AnonKnobValidator = js.native
  def deserialize(value: String): Double | Null = js.native
  def serialize(): String = js.native
  def serialize(value: Double): String = js.native
}

