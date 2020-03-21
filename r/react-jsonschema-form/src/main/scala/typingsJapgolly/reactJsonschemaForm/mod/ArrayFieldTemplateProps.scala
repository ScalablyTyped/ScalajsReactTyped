package typingsJapgolly.reactJsonschemaForm.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jsonSchema.mod.JSONSchema6
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.reactJsonschemaForm.AnonChildren
import typingsJapgolly.reactJsonschemaForm.AnonDefinitions
import typingsJapgolly.reactJsonschemaForm.AnonDescription
import typingsJapgolly.reactJsonschemaForm.AnonId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayFieldTemplateProps[T] extends js.Object {
  var DescriptionField: StatelessComponent[AnonDescription]
  var TitleField: StatelessComponent[AnonId]
  var canAdd: Boolean
  var className: String
  var disabled: Boolean
  var formContext: js.Any
  var formData: T
  var idSchema: IdSchema[_]
  var items: js.Array[AnonChildren]
  var readonly: Boolean
  var registry: AnonDefinitions
  var required: Boolean
  var schema: JSONSchema6
  var title: String
  var uiSchema: UiSchema
  def onAddClick(event: js.Any): js.Function1[/* event */ js.Any, Unit]
}

object ArrayFieldTemplateProps {
  @scala.inline
  def apply[T](
    DescriptionField: StatelessComponent[AnonDescription],
    TitleField: StatelessComponent[AnonId],
    canAdd: Boolean,
    className: String,
    disabled: Boolean,
    formContext: js.Any,
    formData: T,
    idSchema: IdSchema[_],
    items: js.Array[AnonChildren],
    onAddClick: js.Any => CallbackTo[js.Function1[/* event */ js.Any, Unit]],
    readonly: Boolean,
    registry: AnonDefinitions,
    required: Boolean,
    schema: JSONSchema6,
    title: String,
    uiSchema: UiSchema
  ): ArrayFieldTemplateProps[T] = {
    val __obj = js.Dynamic.literal(DescriptionField = DescriptionField.asInstanceOf[js.Any], TitleField = TitleField.asInstanceOf[js.Any], canAdd = canAdd.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], formContext = formContext.asInstanceOf[js.Any], formData = formData.asInstanceOf[js.Any], idSchema = idSchema.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], uiSchema = uiSchema.asInstanceOf[js.Any])
    __obj.updateDynamic("onAddClick")(js.Any.fromFunction1((t0: js.Any) => onAddClick(t0).runNow()))
    __obj.asInstanceOf[ArrayFieldTemplateProps[T]]
  }
}

