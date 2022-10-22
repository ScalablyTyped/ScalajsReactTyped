package typingsJapgolly.wixStyleReact

import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRangeMod {
  
  @JSImport("wix-style-react/dist/types/Range", JSImport.Default)
  @js.native
  open class default ()
    extends Component[RangeProps, js.Object, Any]
  
  type Range = japgolly.scalajs.react.facade.React.Component[RangeProps & js.Object, js.Object]
  
  trait RangeProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
  }
  object RangeProps {
    
    inline def apply(): RangeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeProps]
    }
    
    extension [Self <: RangeProps](x: Self) {
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
    }
  }
}
