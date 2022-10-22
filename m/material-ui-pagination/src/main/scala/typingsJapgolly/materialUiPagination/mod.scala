package typingsJapgolly.materialUiPagination

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("material-ui-pagination", JSImport.Default)
  @js.native
  open class default ()
    extends Component[PaginationProps, js.Object, Any]
  
  type Pagination = japgolly.scalajs.react.facade.React.Component[PaginationProps & js.Object, js.Object]
  
  trait PaginationProps extends StObject {
    
    var current: Double
    
    var display: Double
    
    def onChange(value: Double): Unit
    
    var total: Double
  }
  object PaginationProps {
    
    inline def apply(current: Double, display: Double, onChange: Double => Callback, total: Double): PaginationProps = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], onChange = js.Any.fromFunction1((t0: Double) => onChange(t0).runNow()), total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationProps]
    }
    
    extension [Self <: PaginationProps](x: Self) {
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setDisplay(value: Double): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: Double => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
}
