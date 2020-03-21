package typingsJapgolly.grommet.formFieldMod

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.grommet.AnonMessage
import typingsJapgolly.grommet.utilsMod.MarginType
import typingsJapgolly.grommet.utilsMod.PlaceHolderType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormFieldProps extends js.Object {
  var component: js.UndefOr[js.Any] = js.undefined
  var error: js.UndefOr[String | Node] = js.undefined
  var help: js.UndefOr[String | Node] = js.undefined
  var htmlFor: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String | Node] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[js.Array[String]] = js.undefined
  var pad: js.UndefOr[Boolean] = js.undefined
  // Although Placeholder is not a prop within FormField we Omit the HTML placeholder attribute and replaced with following.
  var placeholder: js.UndefOr[PlaceHolderType] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var validate: js.UndefOr[AnonMessage | (js.Function1[/* repeated */ js.Any, _])] = js.undefined
}

object FormFieldProps {
  @scala.inline
  def apply(
    component: js.Any = null,
    error: String | Node = null,
    help: String | Node = null,
    htmlFor: String = null,
    label: String | Node = null,
    margin: MarginType = null,
    name: String = null,
    options: js.Array[String] = null,
    pad: js.UndefOr[Boolean] = js.undefined,
    placeholder: PlaceHolderType = null,
    required: js.UndefOr[Boolean] = js.undefined,
    validate: AnonMessage | (js.Function1[/* repeated */ js.Any, _]) = null
  ): FormFieldProps = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (help != null) __obj.updateDynamic("help")(help.asInstanceOf[js.Any])
    if (htmlFor != null) __obj.updateDynamic("htmlFor")(htmlFor.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (!js.isUndefined(pad)) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormFieldProps]
  }
}

