package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.anon.DisablePointerEvents
import typingsJapgolly.materialUiCore.materialUiCoreStrings.div
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableComponent
import typingsJapgolly.materialUiCore.overridableComponentMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputAdornmentInputAdornmentMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Text Fields](https://mui.com/components/text-fields/)
    *
    * API:
    *
    * - [InputAdornment API](https://mui.com/api/input-adornment/)
    */
  @JSImport("@material-ui/core/InputAdornment/InputAdornment", JSImport.Default)
  @js.native
  val default: OverridableComponent[InputAdornmentTypeMap[js.Object, div]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.root
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.filled
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.positionStart
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.positionEnd
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.disablePointerEvents
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.hiddenLabel
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.marginDense
  */
  trait InputAdornmentClassKey extends StObject
  object InputAdornmentClassKey {
    
    inline def disablePointerEvents: typingsJapgolly.materialUiCore.materialUiCoreStrings.disablePointerEvents = "disablePointerEvents".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.disablePointerEvents]
    
    inline def filled: typingsJapgolly.materialUiCore.materialUiCoreStrings.filled = "filled".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.filled]
    
    inline def hiddenLabel: typingsJapgolly.materialUiCore.materialUiCoreStrings.hiddenLabel = "hiddenLabel".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.hiddenLabel]
    
    inline def marginDense: typingsJapgolly.materialUiCore.materialUiCoreStrings.marginDense = "marginDense".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.marginDense]
    
    inline def positionEnd: typingsJapgolly.materialUiCore.materialUiCoreStrings.positionEnd = "positionEnd".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.positionEnd]
    
    inline def positionStart: typingsJapgolly.materialUiCore.materialUiCoreStrings.positionStart = "positionStart".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.positionStart]
    
    inline def root: typingsJapgolly.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.root]
  }
  
  type InputAdornmentProps[D /* <: ElementType */, P] = OverrideProps[InputAdornmentTypeMap[P, D], D]
  
  trait InputAdornmentTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var classKey: InputAdornmentClassKey
    
    var defaultComponent: D
    
    var props: P & DisablePointerEvents
  }
  object InputAdornmentTypeMap {
    
    inline def apply[P, D /* <: ElementType */](classKey: InputAdornmentClassKey, defaultComponent: D, props: P & DisablePointerEvents): InputAdornmentTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputAdornmentTypeMap[P, D]]
    }
    
    extension [Self <: InputAdornmentTypeMap[?, ?], P, D /* <: ElementType */](x: Self & (InputAdornmentTypeMap[P, D])) {
      
      inline def setClassKey(value: InputAdornmentClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & DisablePointerEvents): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[InputAdornmentTypeMap[js.Object, div]]
  
  /* This means you don't have to write `default`, but can instead just say `inputAdornmentInputAdornmentMod.foo` */
  override def _to: OverridableComponent[InputAdornmentTypeMap[js.Object, div]] = default
}
