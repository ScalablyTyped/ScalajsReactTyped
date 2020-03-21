package typingsJapgolly.reactJsonschemaForm.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.jsonSchema.mod.JSONSchema6
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.reactJsonschemaForm.mod.AjvError
import typingsJapgolly.reactJsonschemaForm.mod.ArrayFieldTemplateProps
import typingsJapgolly.reactJsonschemaForm.mod.ErrorListProps
import typingsJapgolly.reactJsonschemaForm.mod.ErrorSchema
import typingsJapgolly.reactJsonschemaForm.mod.Field
import typingsJapgolly.reactJsonschemaForm.mod.FieldTemplateProps
import typingsJapgolly.reactJsonschemaForm.mod.FormProps
import typingsJapgolly.reactJsonschemaForm.mod.FormValidation
import typingsJapgolly.reactJsonschemaForm.mod.IChangeEvent
import typingsJapgolly.reactJsonschemaForm.mod.ISubmitEvent
import typingsJapgolly.reactJsonschemaForm.mod.ObjectFieldTemplateProps
import typingsJapgolly.reactJsonschemaForm.mod.UiSchema
import typingsJapgolly.reactJsonschemaForm.mod.Widget
import typingsJapgolly.reactJsonschemaForm.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactJsonschemaForm {
  def apply[T](
    schema: JSONSchema6,
    ArrayFieldTemplate: StatelessComponent[ArrayFieldTemplateProps[_]] = null,
    ErrorList: StatelessComponent[ErrorListProps] = null,
    FieldTemplate: StatelessComponent[FieldTemplateProps] = null,
    ObjectFieldTemplate: StatelessComponent[ObjectFieldTemplateProps[_]] = null,
    acceptcharset: String = null,
    action: String = null,
    additionalMetaSchemas: js.Array[js.Object] = null,
    autocomplete: String = null,
    className: String = null,
    customFormats: StringDictionary[String | js.RegExp | (js.Function1[/* data */ String, Boolean])] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    enctype: String = null,
    fields: StringDictionary[Field] = null,
    formContext: js.Any = null,
    formData: T = null,
    id: String = null,
    idPrefix: String = null,
    liveOmit: js.UndefOr[Boolean] = js.undefined,
    liveValidate: js.UndefOr[Boolean] = js.undefined,
    method: String = null,
    name: String = null,
    noHtml5Validate: js.UndefOr[Boolean] = js.undefined,
    noValidate: js.UndefOr[Boolean] = js.undefined,
    omitExtraData: js.UndefOr[Boolean] = js.undefined,
    onBlur: (/* id */ String, /* value */ Boolean | Double | String | Null) => Callback = null,
    onChange: (/* e */ IChangeEvent[T], /* es */ js.UndefOr[ErrorSchema]) => CallbackTo[js.Any] = null,
    onError: /* e */ js.Any => CallbackTo[js.Any] = null,
    onSubmit: /* e */ ISubmitEvent[T] => CallbackTo[js.Any] = null,
    safeRenderCompletion: js.UndefOr[Boolean] = js.undefined,
    showErrorList: js.UndefOr[Boolean] = js.undefined,
    tagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any = null,
    target: String = null,
    transformErrors: /* errors */ js.Array[AjvError] => CallbackTo[js.Array[AjvError]] = null,
    uiSchema: UiSchema = null,
    validate: (T, /* errors */ FormValidation) => CallbackTo[FormValidation] = null,
    widgets: StringDictionary[Widget] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[FormProps[T], default[T], Unit, FormProps[T]] = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
  
      if (ArrayFieldTemplate != null) __obj.updateDynamic("ArrayFieldTemplate")(ArrayFieldTemplate.asInstanceOf[js.Any])
    if (ErrorList != null) __obj.updateDynamic("ErrorList")(ErrorList.asInstanceOf[js.Any])
    if (FieldTemplate != null) __obj.updateDynamic("FieldTemplate")(FieldTemplate.asInstanceOf[js.Any])
    if (ObjectFieldTemplate != null) __obj.updateDynamic("ObjectFieldTemplate")(ObjectFieldTemplate.asInstanceOf[js.Any])
    if (acceptcharset != null) __obj.updateDynamic("acceptcharset")(acceptcharset.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (additionalMetaSchemas != null) __obj.updateDynamic("additionalMetaSchemas")(additionalMetaSchemas.asInstanceOf[js.Any])
    if (autocomplete != null) __obj.updateDynamic("autocomplete")(autocomplete.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (customFormats != null) __obj.updateDynamic("customFormats")(customFormats.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (enctype != null) __obj.updateDynamic("enctype")(enctype.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (formContext != null) __obj.updateDynamic("formContext")(formContext.asInstanceOf[js.Any])
    if (formData != null) __obj.updateDynamic("formData")(formData.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (idPrefix != null) __obj.updateDynamic("idPrefix")(idPrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(liveOmit)) __obj.updateDynamic("liveOmit")(liveOmit.asInstanceOf[js.Any])
    if (!js.isUndefined(liveValidate)) __obj.updateDynamic("liveValidate")(liveValidate.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(noHtml5Validate)) __obj.updateDynamic("noHtml5Validate")(noHtml5Validate.asInstanceOf[js.Any])
    if (!js.isUndefined(noValidate)) __obj.updateDynamic("noValidate")(noValidate.asInstanceOf[js.Any])
    if (!js.isUndefined(omitExtraData)) __obj.updateDynamic("omitExtraData")(omitExtraData.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction2((t0: /* id */ java.lang.String, t1: /* value */ scala.Boolean | scala.Double | java.lang.String | scala.Null) => onBlur(t0, t1).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* e */ typingsJapgolly.reactJsonschemaForm.mod.IChangeEvent[T], t1: /* es */ js.UndefOr[typingsJapgolly.reactJsonschemaForm.mod.ErrorSchema]) => onChange(t0, t1).runNow()))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* e */ js.Any) => onError(t0).runNow()))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.reactJsonschemaForm.mod.ISubmitEvent[T]) => onSubmit(t0).runNow()))
    if (!js.isUndefined(safeRenderCompletion)) __obj.updateDynamic("safeRenderCompletion")(safeRenderCompletion.asInstanceOf[js.Any])
    if (!js.isUndefined(showErrorList)) __obj.updateDynamic("showErrorList")(showErrorList.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (transformErrors != null) __obj.updateDynamic("transformErrors")(js.Any.fromFunction1((t0: /* errors */ js.Array[typingsJapgolly.reactJsonschemaForm.mod.AjvError]) => transformErrors(t0).runNow()))
    if (uiSchema != null) __obj.updateDynamic("uiSchema")(uiSchema.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction2((t0: T, t1: /* errors */ typingsJapgolly.reactJsonschemaForm.mod.FormValidation) => validate(t0, t1).runNow()))
    if (widgets != null) __obj.updateDynamic("widgets")(widgets.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactJsonschemaForm.mod.FormProps[T], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactJsonschemaForm.mod.default[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactJsonschemaForm.mod.FormProps[T]])(children: _*)
  }
  @JSImport("react-jsonschema-form", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

