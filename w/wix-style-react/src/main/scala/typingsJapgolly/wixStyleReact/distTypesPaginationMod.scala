package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.wixStyleReact.anon.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPaginationMod {
  
  @JSImport("wix-style-react/dist/types/Pagination", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[PaginationProps, js.Object, Any]
  
  type Pagination = PureComponent[PaginationProps, js.Object, Any]
  
  trait PaginationProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var currentPage: js.UndefOr[Double] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    var pageUrl: js.UndefOr[js.Function1[/* pageNumber */ Double, String]] = js.undefined
    
    var totalPages: js.UndefOr[Double] = js.undefined
  }
  object PaginationProps {
    
    inline def apply(): PaginationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationProps]
    }
    
    extension [Self <: PaginationProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
      
      inline def setCurrentPageUndefined: Self = StObject.set(x, "currentPage", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setOnChange(value: /* event */ Event => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* event */ Event) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setPageUrl(value: /* pageNumber */ Double => String): Self = StObject.set(x, "pageUrl", js.Any.fromFunction1(value))
      
      inline def setPageUrlUndefined: Self = StObject.set(x, "pageUrl", js.undefined)
      
      inline def setTotalPages(value: Double): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
      
      inline def setTotalPagesUndefined: Self = StObject.set(x, "totalPages", js.undefined)
    }
  }
}
