package typingsJapgolly.wixUiCore

import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsDeprecatedDividerDividerMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/deprecated/divider/Divider", "Divider")
  @js.native
  val Divider: FunctionComponent[DividerProps] = js.native
  
  trait DividerProps extends StObject {
    
    var children: js.UndefOr[Any] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /** hook for testing purposes */
    var `data-hook`: js.UndefOr[String] = js.undefined
    
    var vertical: js.UndefOr[Boolean] = js.undefined
  }
  object DividerProps {
    
    inline def apply(): DividerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DividerProps]
    }
    
    extension [Self <: DividerProps](x: Self) {
      
      inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
      
      inline def `setData-hookUndefined`: Self = StObject.set(x, "data-hook", js.undefined)
      
      inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
}
