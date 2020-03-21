package typingsJapgolly.reactJsonschemaForm.mod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.jsonSchema.mod.JSONSchema6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldTemplateProps extends js.Object {
  var children: Element
  var classNames: String
  var description: Element
  var disabled: Boolean
  var displayLabel: Boolean
  var errors: Element
  var fields: js.Array[Field]
  var formContext: js.Any
  var help: Element
  var hidden: Boolean
  var id: String
  var label: String
  var rawDescription: String
  var rawErrors: js.Array[String]
  var rawHelp: String
  var readonly: Boolean
  var required: Boolean
  var schema: JSONSchema6
  var uiSchema: UiSchema
}

object FieldTemplateProps {
  @scala.inline
  def apply(
    children: VdomElement,
    classNames: String,
    description: VdomElement,
    disabled: Boolean,
    displayLabel: Boolean,
    errors: VdomElement,
    fields: js.Array[Field],
    formContext: js.Any,
    help: VdomElement,
    hidden: Boolean,
    id: String,
    label: String,
    rawDescription: String,
    rawErrors: js.Array[String],
    rawHelp: String,
    readonly: Boolean,
    required: Boolean,
    schema: JSONSchema6,
    uiSchema: UiSchema
  ): FieldTemplateProps = {
    val __obj = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], displayLabel = displayLabel.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], formContext = formContext.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], rawDescription = rawDescription.asInstanceOf[js.Any], rawErrors = rawErrors.asInstanceOf[js.Any], rawHelp = rawHelp.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], uiSchema = uiSchema.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawElement.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.rawElement.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.rawElement.asInstanceOf[js.Any])
    if (help != null) __obj.updateDynamic("help")(help.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldTemplateProps]
  }
}

