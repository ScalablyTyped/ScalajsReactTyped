package typingsJapgolly.angularFormly.AngularFormly

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.angular.JQLite
import typingsJapgolly.angular.mod.IAttributes
import typingsJapgolly.angular.mod.IController
import typingsJapgolly.angular.mod.IFormController
import typingsJapgolly.angular.mod.IPromise
import typingsJapgolly.angular.mod.IScope
import typingsJapgolly.angular.mod.ITranscludeFunction
import typingsJapgolly.angularFormly.AnonDictkey
import typingsJapgolly.angularFormly.AnonErrorExistsAndShouldBeVisible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFieldConfigurationObject extends IFieldObject {
  /**
  		 * By default, the model passed to the formly-field directive is the same as the model passed to the
  		 * formly-form. However, if the field has a model specified, then it is used for that field (and that
  		 * field only). In addition, a deep watch is added to the formly-field directive's scope to run the
  		 * expressionProperties when the specified model changes.
  		 *
  		 * Note, the formly-form directive will allow you to specify a string which is an (almost) formly
  		 * expression which allows you to define the model as relative to the scope of the form.
  		 *
  		 * see http://docs.angular-formly.com/docs/field-configuration-object#model-object--string
  		 */
  var model: js.UndefOr[String | StringDictionary[js.Any]] = js.undefined
}

object IFieldConfigurationObject {
  @scala.inline
  def apply(
    asyncValidators: StringDictionary[String | IExpressionFunction | IValidator] = null,
    className: String = null,
    controller: String | js.Function = null,
    data: StringDictionary[js.Any] = null,
    defaultValue: js.Any = null,
    elementAttributes: StringDictionary[String] = null,
    expressionProperties: StringDictionary[String | IExpressionFunction | IValidator] = null,
    formControl: IFormController | js.Array[IFormController] = null,
    hide: js.UndefOr[Boolean] = js.undefined,
    hideExpression: String | IExpressionFunction = null,
    id: String = null,
    initialValue: js.Any = null,
    key: String | Double = null,
    link: (IScope, JQLite, IAttributes, /* controller */ js.UndefOr[IController], /* transclude */ js.UndefOr[ITranscludeFunction]) => Callback = null,
    model: String | StringDictionary[js.Any] = null,
    modelOptions: IModelOptions = null,
    name: String = null,
    ngModelAttrs: AnonDictkey = null,
    ngModelElAttrs: StringDictionary[String] = null,
    noFormControl: js.UndefOr[Boolean] = js.undefined,
    optionsTypes: String | js.Array[String] = null,
    resetModel: js.UndefOr[Callback] = js.undefined,
    runExpressions: js.UndefOr[Callback] = js.undefined,
    template: String | (js.Function1[/* fieldConfiguration */ IFieldConfigurationObject, String | IPromise[String]]) = null,
    templateManipulators: ITemplateManipulators = null,
    templateOptions: ITemplateOptions = null,
    templateUrl: String | (js.Function1[/* fieldConfiguration */ IFieldConfigurationObject, String | IPromise[String]]) = null,
    `type`: String = null,
    updateInitialValue: js.UndefOr[Callback] = js.undefined,
    validation: AnonErrorExistsAndShouldBeVisible = null,
    validators: StringDictionary[String | IExpressionFunction | IValidator] = null,
    value: js.Function0[_] with (js.Function1[/* val */ js.Any, Unit]) = null,
    watcher: IWatcher | js.Array[IWatcher] = null,
    wrapper: String | js.Array[String] = null
  ): IFieldConfigurationObject = {
    val __obj = js.Dynamic.literal()
    if (asyncValidators != null) __obj.updateDynamic("asyncValidators")(asyncValidators.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (elementAttributes != null) __obj.updateDynamic("elementAttributes")(elementAttributes.asInstanceOf[js.Any])
    if (expressionProperties != null) __obj.updateDynamic("expressionProperties")(expressionProperties.asInstanceOf[js.Any])
    if (formControl != null) __obj.updateDynamic("formControl")(formControl.asInstanceOf[js.Any])
    if (!js.isUndefined(hide)) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (hideExpression != null) __obj.updateDynamic("hideExpression")(hideExpression.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (initialValue != null) __obj.updateDynamic("initialValue")(initialValue.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(js.Any.fromFunction5((t0: typingsJapgolly.angular.mod.IScope, t1: typingsJapgolly.angular.JQLite, t2: typingsJapgolly.angular.mod.IAttributes, t3: /* controller */ js.UndefOr[typingsJapgolly.angular.mod.IController], t4: /* transclude */ js.UndefOr[typingsJapgolly.angular.mod.ITranscludeFunction]) => link(t0, t1, t2, t3, t4).runNow()))
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (modelOptions != null) __obj.updateDynamic("modelOptions")(modelOptions.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (ngModelAttrs != null) __obj.updateDynamic("ngModelAttrs")(ngModelAttrs.asInstanceOf[js.Any])
    if (ngModelElAttrs != null) __obj.updateDynamic("ngModelElAttrs")(ngModelElAttrs.asInstanceOf[js.Any])
    if (!js.isUndefined(noFormControl)) __obj.updateDynamic("noFormControl")(noFormControl.asInstanceOf[js.Any])
    if (optionsTypes != null) __obj.updateDynamic("optionsTypes")(optionsTypes.asInstanceOf[js.Any])
    resetModel.foreach(p => __obj.updateDynamic("resetModel")(p.toJsFn))
    runExpressions.foreach(p => __obj.updateDynamic("runExpressions")(p.toJsFn))
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (templateManipulators != null) __obj.updateDynamic("templateManipulators")(templateManipulators.asInstanceOf[js.Any])
    if (templateOptions != null) __obj.updateDynamic("templateOptions")(templateOptions.asInstanceOf[js.Any])
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    updateInitialValue.foreach(p => __obj.updateDynamic("updateInitialValue")(p.toJsFn))
    if (validation != null) __obj.updateDynamic("validation")(validation.asInstanceOf[js.Any])
    if (validators != null) __obj.updateDynamic("validators")(validators.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (watcher != null) __obj.updateDynamic("watcher")(watcher.asInstanceOf[js.Any])
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldConfigurationObject]
  }
}

