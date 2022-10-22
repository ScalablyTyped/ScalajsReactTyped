package typingsJapgolly.rjsfCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.ElementType
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rjsfCore.mod.FormProps
import typingsJapgolly.rjsfCore.mod.IChangeEvent
import typingsJapgolly.rjsfCore.mod.default
import typingsJapgolly.rjsfCore.rjsfCoreStrings.ButtonTemplates
import typingsJapgolly.rjsfUtils.mod.ErrorSchema
import typingsJapgolly.rjsfUtils.mod.FormValidation
import typingsJapgolly.rjsfUtils.mod.RJSFSchema
import typingsJapgolly.rjsfUtils.mod.RJSFValidationError
import typingsJapgolly.rjsfUtils.mod.RegistryFieldsType
import typingsJapgolly.rjsfUtils.mod.RegistryWidgetsType
import typingsJapgolly.rjsfUtils.mod.TemplatesType
import typingsJapgolly.rjsfUtils.mod.UiSchema
import typingsJapgolly.rjsfUtils.mod.ValidatorType
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Core {
  
  inline def apply[T, F](schema: RJSFSchema, validator: ValidatorType[T]): Builder[T, F] = {
    val __props = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any], validator = validator.asInstanceOf[js.Any])
    new Builder[T, F](js.Array(this.component, __props.asInstanceOf[FormProps[T, F]]))
  }
  
  @JSImport("@rjsf/core", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T, F] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default[T, F]] {
    
    inline def _internalFormWrapper(value: ElementType): this.type = set("_internalFormWrapper", value.asInstanceOf[js.Any])
    
    inline def acceptcharset(value: String): this.type = set("acceptcharset", value.asInstanceOf[js.Any])
    
    inline def action(value: String): this.type = set("action", value.asInstanceOf[js.Any])
    
    inline def autoComplete(value: String): this.type = set("autoComplete", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def customValidate(value: (T, /* errors */ FormValidation[T]) => FormValidation[T]): this.type = set("customValidate", js.Any.fromFunction2(value))
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def enctype(value: String): this.type = set("enctype", value.asInstanceOf[js.Any])
    
    inline def extraErrors(value: ErrorSchema[T]): this.type = set("extraErrors", value.asInstanceOf[js.Any])
    
    inline def fields(value: RegistryFieldsType[T, F]): this.type = set("fields", value.asInstanceOf[js.Any])
    
    inline def formContext(value: F): this.type = set("formContext", value.asInstanceOf[js.Any])
    
    inline def formData(value: T): this.type = set("formData", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def idPrefix(value: String): this.type = set("idPrefix", value.asInstanceOf[js.Any])
    
    inline def idSeparator(value: String): this.type = set("idSeparator", value.asInstanceOf[js.Any])
    
    inline def liveOmit(value: Boolean): this.type = set("liveOmit", value.asInstanceOf[js.Any])
    
    inline def liveValidate(value: Boolean): this.type = set("liveValidate", value.asInstanceOf[js.Any])
    
    inline def method(value: String): this.type = set("method", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def noHtml5Validate(value: Boolean): this.type = set("noHtml5Validate", value.asInstanceOf[js.Any])
    
    inline def noValidate(value: Boolean): this.type = set("noValidate", value.asInstanceOf[js.Any])
    
    inline def omitExtraData(value: Boolean): this.type = set("omitExtraData", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: (/* id */ String, /* data */ Any) => Callback): this.type = set("onBlur", js.Any.fromFunction2((t0: /* id */ String, t1: /* data */ Any) => (value(t0, t1)).runNow()))
    
    inline def onChange(value: (/* data */ IChangeEvent[T, F], /* id */ js.UndefOr[String]) => Callback): this.type = set("onChange", js.Any.fromFunction2((t0: /* data */ IChangeEvent[T, F], t1: /* id */ js.UndefOr[String]) => (value(t0, t1)).runNow()))
    
    inline def onError(value: /* errors */ js.Array[RJSFValidationError] => Callback): this.type = set("onError", js.Any.fromFunction1((t0: /* errors */ js.Array[RJSFValidationError]) => value(t0).runNow()))
    
    inline def onFocus(value: (/* id */ String, /* data */ Any) => Callback): this.type = set("onFocus", js.Any.fromFunction2((t0: /* id */ String, t1: /* data */ Any) => (value(t0, t1)).runNow()))
    
    inline def onSubmit(value: (/* data */ IChangeEvent[T, F], /* event */ ReactEventFrom[Any & Element]) => Callback): this.type = set("onSubmit", js.Any.fromFunction2((t0: /* data */ IChangeEvent[T, F], t1: /* event */ ReactEventFrom[Any & Element]) => (value(t0, t1)).runNow()))
    
    inline def readonly(value: Boolean): this.type = set("readonly", value.asInstanceOf[js.Any])
    
    inline def showErrorList(value: Boolean): this.type = set("showErrorList", value.asInstanceOf[js.Any])
    
    inline def tagName(value: ElementType): this.type = set("tagName", value.asInstanceOf[js.Any])
    
    inline def target(value: String): this.type = set("target", value.asInstanceOf[js.Any])
    
    inline def templates(
      value: (Partial[Omit[TemplatesType[T, F], ButtonTemplates]]) & (typingsJapgolly.rjsfCore.anon.ButtonTemplates[T, F])
    ): this.type = set("templates", value.asInstanceOf[js.Any])
    
    inline def transformErrors(value: /* errors */ js.Array[RJSFValidationError] => js.Array[RJSFValidationError]): this.type = set("transformErrors", js.Any.fromFunction1(value))
    
    inline def uiSchema(value: UiSchema[T, F]): this.type = set("uiSchema", value.asInstanceOf[js.Any])
    
    inline def widgets(value: RegistryWidgetsType[T, F]): this.type = set("widgets", value.asInstanceOf[js.Any])
  }
  
  def withProps[T, F](p: FormProps[T, F]): Builder[T, F] = new Builder[T, F](js.Array(this.component, p.asInstanceOf[js.Any]))
}
