package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.anon.Filled
import typingsJapgolly.materialUiCore.materialUiCoreStrings.p
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableComponent
import typingsJapgolly.materialUiCore.overridableComponentMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formHelperTextFormHelperTextMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Text Fields](https://mui.com/components/text-fields/)
    *
    * API:
    *
    * - [FormHelperText API](https://mui.com/api/form-helper-text/)
    */
  @JSImport("@material-ui/core/FormHelperText/FormHelperText", JSImport.Default)
  @js.native
  val default: OverridableComponent[FormHelperTextTypeMap[js.Object, p]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.root
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.error
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.disabled
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.marginDense
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.focused
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.filled
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.contained
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.required
  */
  trait FormHelperTextClassKey extends StObject
  object FormHelperTextClassKey {
    
    inline def contained: typingsJapgolly.materialUiCore.materialUiCoreStrings.contained = "contained".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.contained]
    
    inline def disabled: typingsJapgolly.materialUiCore.materialUiCoreStrings.disabled = "disabled".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.disabled]
    
    inline def error: typingsJapgolly.materialUiCore.materialUiCoreStrings.error = "error".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.error]
    
    inline def filled: typingsJapgolly.materialUiCore.materialUiCoreStrings.filled = "filled".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.filled]
    
    inline def focused: typingsJapgolly.materialUiCore.materialUiCoreStrings.focused = "focused".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.focused]
    
    inline def marginDense: typingsJapgolly.materialUiCore.materialUiCoreStrings.marginDense = "marginDense".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.marginDense]
    
    inline def required: typingsJapgolly.materialUiCore.materialUiCoreStrings.required = "required".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.required]
    
    inline def root: typingsJapgolly.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.root]
  }
  
  type FormHelperTextProps[D /* <: ElementType */, P] = OverrideProps[FormHelperTextTypeMap[P, D], D]
  
  trait FormHelperTextTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var classKey: FormHelperTextClassKey
    
    var defaultComponent: D
    
    var props: P & Filled
  }
  object FormHelperTextTypeMap {
    
    inline def apply[P, D /* <: ElementType */](classKey: FormHelperTextClassKey, defaultComponent: D, props: P & Filled): FormHelperTextTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormHelperTextTypeMap[P, D]]
    }
    
    extension [Self <: FormHelperTextTypeMap[?, ?], P, D /* <: ElementType */](x: Self & (FormHelperTextTypeMap[P, D])) {
      
      inline def setClassKey(value: FormHelperTextClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Filled): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[FormHelperTextTypeMap[js.Object, p]]
  
  /* This means you don't have to write `default`, but can instead just say `formHelperTextFormHelperTextMod.foo` */
  override def _to: OverridableComponent[FormHelperTextTypeMap[js.Object, p]] = default
}
