package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.anon.Error
import typingsJapgolly.materialUiCore.materialUiCoreStrings.div
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableComponent
import typingsJapgolly.materialUiCore.overridableComponentMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formControlFormControlMod extends Shortcut {
  
  /**
    * Provides context such as filled/focused/error/required for form inputs.
    * Relying on the context provides high flexibility and ensures that the state always stays
    * consistent across the children of the `FormControl`.
    * This context is used by the following components:
    *
    * -   FormLabel
    * -   FormHelperText
    * -   Input
    * -   InputLabel
    *
    * You can find one composition example below and more going to [the demos](https://mui.com/components/text-fields/#components).
    *
    * ```jsx
    * <FormControl>
    *   <InputLabel htmlFor="my-input">Email address</InputLabel>
    *   <Input id="my-input" aria-describedby="my-helper-text" />
    *   <FormHelperText id="my-helper-text">We'll never share your email.</FormHelperText>
    * </FormControl>
    * ```
    *
    * ⚠️Only one input can be used within a FormControl.
    * Demos:
    *
    * - [Checkboxes](https://mui.com/components/checkboxes/)
    * - [Radio Buttons](https://mui.com/components/radio-buttons/)
    * - [Switches](https://mui.com/components/switches/)
    * - [Text Fields](https://mui.com/components/text-fields/)
    *
    * API:
    *
    * - [FormControl API](https://mui.com/api/form-control/)
    */
  @JSImport("@material-ui/core/FormControl/FormControl", JSImport.Default)
  @js.native
  val default: OverridableComponent[FormControlTypeMap[js.Object, div]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.root
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.marginNormal
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.marginDense
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.fullWidth
  */
  trait FormControlClassKey extends StObject
  object FormControlClassKey {
    
    inline def fullWidth: typingsJapgolly.materialUiCore.materialUiCoreStrings.fullWidth = "fullWidth".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.fullWidth]
    
    inline def marginDense: typingsJapgolly.materialUiCore.materialUiCoreStrings.marginDense = "marginDense".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.marginDense]
    
    inline def marginNormal: typingsJapgolly.materialUiCore.materialUiCoreStrings.marginNormal = "marginNormal".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.marginNormal]
    
    inline def root: typingsJapgolly.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.root]
  }
  
  type FormControlProps[D /* <: ElementType */, P] = OverrideProps[FormControlTypeMap[P, D], D]
  
  trait FormControlTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var classKey: FormControlClassKey
    
    var defaultComponent: D
    
    var props: P & Error
  }
  object FormControlTypeMap {
    
    inline def apply[P, D /* <: ElementType */](classKey: FormControlClassKey, defaultComponent: D, props: P & Error): FormControlTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormControlTypeMap[P, D]]
    }
    
    extension [Self <: FormControlTypeMap[?, ?], P, D /* <: ElementType */](x: Self & (FormControlTypeMap[P, D])) {
      
      inline def setClassKey(value: FormControlClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Error): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[FormControlTypeMap[js.Object, div]]
  
  /* This means you don't have to write `default`, but can instead just say `formControlFormControlMod.foo` */
  override def _to: OverridableComponent[FormControlTypeMap[js.Object, div]] = default
}
