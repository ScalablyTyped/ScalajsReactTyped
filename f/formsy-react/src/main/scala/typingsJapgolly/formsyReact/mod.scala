package typingsJapgolly.formsyReact

import typingsJapgolly.formsyReact.anon.Disabled
import typingsJapgolly.formsyReact.anon.PartialFormsyProps
import typingsJapgolly.formsyReact.distFormsyMod.Formsy
import typingsJapgolly.formsyReact.distFormsyMod.FormsyProps
import typingsJapgolly.formsyReact.distInterfacesMod.ValidationFunction
import typingsJapgolly.formsyReact.distValidationRulesMod.Validations
import typingsJapgolly.formsyReact.distWithFormsyMod.PassDownProps
import typingsJapgolly.formsyReact.distWithFormsyMod.WrapperProps
import typingsJapgolly.formsyReact.formsyReactStrings.errorMessage
import typingsJapgolly.formsyReact.formsyReactStrings.errorMessages
import typingsJapgolly.formsyReact.formsyReactStrings.hasValue
import typingsJapgolly.formsyReact.formsyReactStrings.isFormDisabled
import typingsJapgolly.formsyReact.formsyReactStrings.isFormSubmitted
import typingsJapgolly.formsyReact.formsyReactStrings.isPristine
import typingsJapgolly.formsyReact.formsyReactStrings.isRequired
import typingsJapgolly.formsyReact.formsyReactStrings.isValid
import typingsJapgolly.formsyReact.formsyReactStrings.isValidValue
import typingsJapgolly.formsyReact.formsyReactStrings.ref
import typingsJapgolly.formsyReact.formsyReactStrings.resetValue
import typingsJapgolly.formsyReact.formsyReactStrings.setValidations
import typingsJapgolly.formsyReact.formsyReactStrings.setValue
import typingsJapgolly.formsyReact.formsyReactStrings.showError
import typingsJapgolly.formsyReact.formsyReactStrings.showRequired
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.propTypes.mod.Validator
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("formsy-react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("formsy-react", JSImport.Default)
  @js.native
  open class default protected () extends Formsy {
    def this(props: FormsyProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("formsy-react", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("formsy-react", "default.defaultProps")
    @js.native
    def defaultProps: PartialFormsyProps = js.native
    inline def defaultProps_=(x: PartialFormsyProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("formsy-react", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("formsy-react", "default.propTypes")
    @js.native
    def propTypes: Disabled = js.native
    inline def propTypes_=(x: Disabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  inline def addValidationRule[V](name: String, func: ValidationFunction[V]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addValidationRule")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object propTypes {
    
    @JSImport("formsy-react", "propTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("formsy-react", "propTypes.innerRef")
    @js.native
    def innerRef: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    inline def innerRef_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(x.asInstanceOf[js.Any])
    
    @JSImport("formsy-react", "propTypes.name")
    @js.native
    def name: Validator[String] = js.native
    inline def name_=(x: Validator[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    @JSImport("formsy-react", "propTypes.required")
    @js.native
    def required: Requireable[String | Boolean | js.Object] = js.native
    inline def required_=(x: Requireable[String | Boolean | js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("required")(x.asInstanceOf[js.Any])
    
    @JSImport("formsy-react", "propTypes.validations")
    @js.native
    def validations: Requireable[String | js.Object] = js.native
    inline def validations_=(x: Requireable[String | js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validations")(x.asInstanceOf[js.Any])
    
    @JSImport("formsy-react", "propTypes.value")
    @js.native
    def value: Requireable[Any] = js.native
    inline def value_=(x: Requireable[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("formsy-react", "validationRules")
  @js.native
  val validationRules: Validations[Any] = js.native
  
  inline def withFormsy[T, V](WrappedComponent: ComponentType[T & PassDownProps[V]]): ComponentType[
    Omit[
      T & WrapperProps[V], 
      /* keyof formsy-react.formsy-react/dist/withFormsy.InjectedProps<V> */ errorMessage | errorMessages | hasValue | isFormDisabled | isFormSubmitted | isPristine | isRequired | isValid | isValidValue | ref | resetValue | setValidations | setValue | showError | showRequired
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withFormsy")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[ComponentType[
    Omit[
      T & WrapperProps[V], 
      /* keyof formsy-react.formsy-react/dist/withFormsy.InjectedProps<V> */ errorMessage | errorMessages | hasValue | isFormDisabled | isFormSubmitted | isPristine | isRequired | isValid | isValidValue | ref | resetValue | setValidations | setValue | showError | showRequired
    ]
  ]]
}
