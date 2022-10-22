package typingsJapgolly.rcMenu

import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esDividerMod {
  
  @JSImport("rc-menu/es/Divider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasClassNameStyle: DividerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasClassNameStyle.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Inlined std.Omit<rc-menu.rc-menu/es/interface.MenuDividerType, 'type'> */
  trait DividerProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object DividerProps {
    
    inline def apply(): DividerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DividerProps]
    }
    
    extension [Self <: DividerProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
