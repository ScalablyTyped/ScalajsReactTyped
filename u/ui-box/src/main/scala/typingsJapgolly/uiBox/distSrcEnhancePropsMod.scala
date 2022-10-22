package typingsJapgolly.uiBox

import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.ComponentPropsWithoutRef
import typingsJapgolly.uiBox.distSrcTypesBoxTypesMod.Without
import typingsJapgolly.uiBox.distSrcTypesEnhancersMod.EnhancerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcEnhancePropsMod {
  
  @JSImport("ui-box/dist/src/enhance-props", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(rawProps: EnhancerProps & ComponentPropsWithoutRef[Any]): EnhancedPropsResult = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(rawProps.asInstanceOf[js.Any]).asInstanceOf[EnhancedPropsResult]
  
  trait EnhancedPropsResult extends StObject {
    
    var className: String
    
    var enhancedProps: PreservedProps
  }
  object EnhancedPropsResult {
    
    inline def apply(className: String, enhancedProps: PreservedProps): EnhancedPropsResult = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], enhancedProps = enhancedProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnhancedPropsResult]
    }
    
    extension [Self <: EnhancedPropsResult](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setEnhancedProps(value: PreservedProps): Self = StObject.set(x, "enhancedProps", value.asInstanceOf[js.Any])
    }
  }
  
  type PreservedProps = Without[
    ComponentProps[Any], 
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 143, starting with typingsJapgolly.uiBox.uiBoxStrings.borderColor, typingsJapgolly.uiBox.uiBoxStrings.gridTemplate, typingsJapgolly.uiBox.uiBoxStrings.backgroundImage */ Any
  ]
}
