package typingsJapgolly.calidation.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationProps extends js.Object {
  var config: FieldsConfig
  var initialValues: js.UndefOr[Dictionary[_]] = js.undefined
  var transforms: js.UndefOr[Transforms] = js.undefined
  def children(context: ValidationContext): Node
}

object ValidationProps {
  @scala.inline
  def apply(
    children: ValidationContext => CallbackTo[Node],
    config: FieldsConfig,
    initialValues: Dictionary[_] = null,
    transforms: Transforms = null
  ): ValidationProps = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.calidation.mod.ValidationContext) => children(t0).runNow()))
    if (initialValues != null) __obj.updateDynamic("initialValues")(initialValues.asInstanceOf[js.Any])
    if (transforms != null) __obj.updateDynamic("transforms")(transforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationProps]
  }
}

