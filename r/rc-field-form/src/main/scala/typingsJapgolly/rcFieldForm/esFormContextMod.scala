package typingsJapgolly.rcFieldForm

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.rcFieldForm.esInterfaceMod.FieldData
import typingsJapgolly.rcFieldForm.esInterfaceMod.FormInstance
import typingsJapgolly.rcFieldForm.esInterfaceMod.Store
import typingsJapgolly.rcFieldForm.esInterfaceMod.ValidateMessages
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esFormContextMod extends Shortcut {
  
  @JSImport("rc-field-form/es/FormContext", JSImport.Default)
  @js.native
  val default: Context[FormContextProps] = js.native
  
  @JSImport("rc-field-form/es/FormContext", "FormProvider")
  @js.native
  val FormProvider: FunctionComponent[FormProviderProps] = js.native
  
  trait FormChangeInfo extends StObject {
    
    var changedFields: js.Array[FieldData]
    
    var forms: Forms
  }
  object FormChangeInfo {
    
    inline def apply(changedFields: js.Array[FieldData], forms: Forms): FormChangeInfo = {
      val __obj = js.Dynamic.literal(changedFields = changedFields.asInstanceOf[js.Any], forms = forms.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormChangeInfo]
    }
    
    extension [Self <: FormChangeInfo](x: Self) {
      
      inline def setChangedFields(value: js.Array[FieldData]): Self = StObject.set(x, "changedFields", value.asInstanceOf[js.Any])
      
      inline def setChangedFieldsVarargs(value: FieldData*): Self = StObject.set(x, "changedFields", js.Array(value*))
      
      inline def setForms(value: Forms): Self = StObject.set(x, "forms", value.asInstanceOf[js.Any])
    }
  }
  
  trait FormContextProps
    extends StObject
       with FormProviderProps {
    
    def registerForm(name: String, form: FormInstance[Any]): Unit
    
    def triggerFormChange(name: String, changedFields: js.Array[FieldData]): Unit
    
    def triggerFormFinish(name: String, values: Store): Unit
    
    def unregisterForm(name: String): Unit
  }
  object FormContextProps {
    
    inline def apply(
      registerForm: (String, FormInstance[Any]) => Callback,
      triggerFormChange: (String, js.Array[FieldData]) => Callback,
      triggerFormFinish: (String, Store) => Callback,
      unregisterForm: String => Callback
    ): FormContextProps = {
      val __obj = js.Dynamic.literal(registerForm = js.Any.fromFunction2((t0: String, t1: FormInstance[Any]) => (registerForm(t0, t1)).runNow()), triggerFormChange = js.Any.fromFunction2((t0: String, t1: js.Array[FieldData]) => (triggerFormChange(t0, t1)).runNow()), triggerFormFinish = js.Any.fromFunction2((t0: String, t1: Store) => (triggerFormFinish(t0, t1)).runNow()), unregisterForm = js.Any.fromFunction1((t0: String) => unregisterForm(t0).runNow()))
      __obj.asInstanceOf[FormContextProps]
    }
    
    extension [Self <: FormContextProps](x: Self) {
      
      inline def setRegisterForm(value: (String, FormInstance[Any]) => Callback): Self = StObject.set(x, "registerForm", js.Any.fromFunction2((t0: String, t1: FormInstance[Any]) => (value(t0, t1)).runNow()))
      
      inline def setTriggerFormChange(value: (String, js.Array[FieldData]) => Callback): Self = StObject.set(x, "triggerFormChange", js.Any.fromFunction2((t0: String, t1: js.Array[FieldData]) => (value(t0, t1)).runNow()))
      
      inline def setTriggerFormFinish(value: (String, Store) => Callback): Self = StObject.set(x, "triggerFormFinish", js.Any.fromFunction2((t0: String, t1: Store) => (value(t0, t1)).runNow()))
      
      inline def setUnregisterForm(value: String => Callback): Self = StObject.set(x, "unregisterForm", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
  
  trait FormFinishInfo extends StObject {
    
    var forms: Forms
    
    var values: Store
  }
  object FormFinishInfo {
    
    inline def apply(forms: Forms, values: Store): FormFinishInfo = {
      val __obj = js.Dynamic.literal(forms = forms.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormFinishInfo]
    }
    
    extension [Self <: FormFinishInfo](x: Self) {
      
      inline def setForms(value: Forms): Self = StObject.set(x, "forms", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Store): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait FormProviderProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var onFormChange: js.UndefOr[js.Function2[/* name */ String, /* info */ FormChangeInfo, Unit]] = js.undefined
    
    var onFormFinish: js.UndefOr[js.Function2[/* name */ String, /* info */ FormFinishInfo, Unit]] = js.undefined
    
    var validateMessages: js.UndefOr[ValidateMessages] = js.undefined
  }
  object FormProviderProps {
    
    inline def apply(): FormProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormProviderProps]
    }
    
    extension [Self <: FormProviderProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnFormChange(value: (/* name */ String, /* info */ FormChangeInfo) => Callback): Self = StObject.set(x, "onFormChange", js.Any.fromFunction2((t0: /* name */ String, t1: /* info */ FormChangeInfo) => (value(t0, t1)).runNow()))
      
      inline def setOnFormChangeUndefined: Self = StObject.set(x, "onFormChange", js.undefined)
      
      inline def setOnFormFinish(value: (/* name */ String, /* info */ FormFinishInfo) => Callback): Self = StObject.set(x, "onFormFinish", js.Any.fromFunction2((t0: /* name */ String, t1: /* info */ FormFinishInfo) => (value(t0, t1)).runNow()))
      
      inline def setOnFormFinishUndefined: Self = StObject.set(x, "onFormFinish", js.undefined)
      
      inline def setValidateMessages(value: ValidateMessages): Self = StObject.set(x, "validateMessages", value.asInstanceOf[js.Any])
      
      inline def setValidateMessagesUndefined: Self = StObject.set(x, "validateMessages", js.undefined)
    }
  }
  
  type Forms = Record[String, FormInstance[Any]]
  
  type _To = Context[FormContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `esFormContextMod.foo` */
  override def _to: Context[FormContextProps] = default
}
