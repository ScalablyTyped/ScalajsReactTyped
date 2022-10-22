package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLLabelElement
import typingsJapgolly.materialUiCore.anon.Focused
import typingsJapgolly.materialUiCore.materialUiCoreStrings.label
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableComponent
import typingsJapgolly.materialUiCore.overridableComponentMod.OverrideProps
import typingsJapgolly.react.mod.LabelHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formLabelFormLabelMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Checkboxes](https://mui.com/components/checkboxes/)
    * - [Radio Buttons](https://mui.com/components/radio-buttons/)
    * - [Switches](https://mui.com/components/switches/)
    *
    * API:
    *
    * - [FormLabel API](https://mui.com/api/form-label/)
    */
  @JSImport("@material-ui/core/FormLabel/FormLabel", JSImport.Default)
  @js.native
  val default: OverridableComponent[FormLabelTypeMap[js.Object, label]] = js.native
  
  type FormLabelBaseProps = LabelHTMLAttributes[HTMLLabelElement]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.root
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.colorSecondary
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.focused
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.disabled
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.error
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.filled
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.required
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.asterisk
  */
  trait FormLabelClassKey extends StObject
  object FormLabelClassKey {
    
    inline def asterisk: typingsJapgolly.materialUiCore.materialUiCoreStrings.asterisk = "asterisk".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.asterisk]
    
    inline def colorSecondary: typingsJapgolly.materialUiCore.materialUiCoreStrings.colorSecondary = "colorSecondary".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.colorSecondary]
    
    inline def disabled: typingsJapgolly.materialUiCore.materialUiCoreStrings.disabled = "disabled".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.disabled]
    
    inline def error: typingsJapgolly.materialUiCore.materialUiCoreStrings.error = "error".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.error]
    
    inline def filled: typingsJapgolly.materialUiCore.materialUiCoreStrings.filled = "filled".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.filled]
    
    inline def focused: typingsJapgolly.materialUiCore.materialUiCoreStrings.focused = "focused".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.focused]
    
    inline def required: typingsJapgolly.materialUiCore.materialUiCoreStrings.required = "required".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.required]
    
    inline def root: typingsJapgolly.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.root]
  }
  
  type FormLabelProps[D /* <: ElementType */, P] = OverrideProps[FormLabelTypeMap[P, D], D]
  
  trait FormLabelTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var classKey: FormLabelClassKey
    
    var defaultComponent: D
    
    var props: P & FormLabelBaseProps & Focused
  }
  object FormLabelTypeMap {
    
    inline def apply[P, D /* <: ElementType */](classKey: FormLabelClassKey, defaultComponent: D, props: P & FormLabelBaseProps & Focused): FormLabelTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormLabelTypeMap[P, D]]
    }
    
    extension [Self <: FormLabelTypeMap[?, ?], P, D /* <: ElementType */](x: Self & (FormLabelTypeMap[P, D])) {
      
      inline def setClassKey(value: FormLabelClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & FormLabelBaseProps & Focused): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[FormLabelTypeMap[js.Object, label]]
  
  /* This means you don't have to write `default`, but can instead just say `formLabelFormLabelMod.foo` */
  override def _to: OverridableComponent[FormLabelTypeMap[js.Object, label]] = default
}
