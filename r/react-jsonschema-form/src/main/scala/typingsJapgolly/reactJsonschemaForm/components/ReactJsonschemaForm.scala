package typingsJapgolly.reactJsonschemaForm.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.jsonSchema.mod.JSONSchema6
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.reactJsonschemaForm.mod.AjvError
import typingsJapgolly.reactJsonschemaForm.mod.ArrayFieldTemplateProps
import typingsJapgolly.reactJsonschemaForm.mod.ErrorListProps
import typingsJapgolly.reactJsonschemaForm.mod.ErrorSchema
import typingsJapgolly.reactJsonschemaForm.mod.FieldTemplateProps
import typingsJapgolly.reactJsonschemaForm.mod.FormProps
import typingsJapgolly.reactJsonschemaForm.mod.FormValidation
import typingsJapgolly.reactJsonschemaForm.mod.IChangeEvent
import typingsJapgolly.reactJsonschemaForm.mod.ISubmitEvent
import typingsJapgolly.reactJsonschemaForm.mod.ObjectFieldTemplateProps
import typingsJapgolly.reactJsonschemaForm.mod.UiSchema
import typingsJapgolly.reactJsonschemaForm.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactJsonschemaForm {
  
  inline def apply[T](schema: JSONSchema6): Builder[T] = {
    val __props = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[FormProps[T]]))
  }
  
  @JSImport("react-jsonschema-form", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default[T]] {
    
    inline def ArrayFieldTemplate(value: FunctionComponent[ArrayFieldTemplateProps[Any]]): this.type = set("ArrayFieldTemplate", value.asInstanceOf[js.Any])
    
    inline def ErrorList(value: FunctionComponent[ErrorListProps]): this.type = set("ErrorList", value.asInstanceOf[js.Any])
    
    inline def FieldTemplate(value: FunctionComponent[FieldTemplateProps]): this.type = set("FieldTemplate", value.asInstanceOf[js.Any])
    
    inline def ObjectFieldTemplate(value: FunctionComponent[ObjectFieldTemplateProps[Any]]): this.type = set("ObjectFieldTemplate", value.asInstanceOf[js.Any])
    
    inline def acceptcharset(value: String): this.type = set("acceptcharset", value.asInstanceOf[js.Any])
    
    inline def action(value: String): this.type = set("action", value.asInstanceOf[js.Any])
    
    inline def additionalMetaSchemas(value: js.Array[js.Object]): this.type = set("additionalMetaSchemas", value.asInstanceOf[js.Any])
    
    inline def additionalMetaSchemasVarargs(value: js.Object*): this.type = set("additionalMetaSchemas", js.Array(value*))
    
    inline def autoComplete(value: String): this.type = set("autoComplete", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def enctype(value: String): this.type = set("enctype", value.asInstanceOf[js.Any])
    
    inline def formContext(value: Any): this.type = set("formContext", value.asInstanceOf[js.Any])
    
    inline def formData(value: T): this.type = set("formData", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def idPrefix(value: String): this.type = set("idPrefix", value.asInstanceOf[js.Any])
    
    inline def liveOmit(value: Boolean): this.type = set("liveOmit", value.asInstanceOf[js.Any])
    
    inline def liveValidate(value: Boolean): this.type = set("liveValidate", value.asInstanceOf[js.Any])
    
    inline def method(value: String): this.type = set("method", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def noHtml5Validate(value: Boolean): this.type = set("noHtml5Validate", value.asInstanceOf[js.Any])
    
    inline def noValidate(value: Boolean): this.type = set("noValidate", value.asInstanceOf[js.Any])
    
    inline def omitExtraData(value: Boolean): this.type = set("omitExtraData", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: (/* id */ String, /* value */ Boolean | Double | String | Null) => Callback): this.type = set("onBlur", js.Any.fromFunction2((t0: /* id */ String, t1: /* value */ Boolean | Double | String | Null) => (value(t0, t1)).runNow()))
    
    inline def onChange(value: (/* e */ IChangeEvent[T], /* es */ js.UndefOr[ErrorSchema]) => Any): this.type = set("onChange", js.Any.fromFunction2(value))
    
    inline def onError(value: /* e */ Any => Any): this.type = set("onError", js.Any.fromFunction1(value))
    
    inline def onFocus(value: (/* id */ String, /* value */ Boolean | Double | String | Null) => Callback): this.type = set("onFocus", js.Any.fromFunction2((t0: /* id */ String, t1: /* value */ Boolean | Double | String | Null) => (value(t0, t1)).runNow()))
    
    inline def onSubmit(value: /* e */ ISubmitEvent[T] => Any): this.type = set("onSubmit", js.Any.fromFunction1(value))
    
    inline def safeRenderCompletion(value: Boolean): this.type = set("safeRenderCompletion", value.asInstanceOf[js.Any])
    
    inline def showErrorList(value: Boolean): this.type = set("showErrorList", value.asInstanceOf[js.Any])
    
    inline def tagName(
      value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177, starting with typingsJapgolly.reactJsonschemaForm.reactJsonschemaFormStrings.a, typingsJapgolly.reactJsonschemaForm.reactJsonschemaFormStrings.abbr, typingsJapgolly.reactJsonschemaForm.reactJsonschemaFormStrings.address */ Any
    ): this.type = set("tagName", value.asInstanceOf[js.Any])
    
    inline def target(value: String): this.type = set("target", value.asInstanceOf[js.Any])
    
    inline def transformErrors(value: /* errors */ js.Array[AjvError] => js.Array[AjvError]): this.type = set("transformErrors", js.Any.fromFunction1(value))
    
    inline def uiSchema(value: UiSchema): this.type = set("uiSchema", value.asInstanceOf[js.Any])
    
    inline def validate(value: (T, /* errors */ FormValidation) => FormValidation): this.type = set("validate", js.Any.fromFunction2(value))
  }
  
  def withProps[T](p: FormProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
