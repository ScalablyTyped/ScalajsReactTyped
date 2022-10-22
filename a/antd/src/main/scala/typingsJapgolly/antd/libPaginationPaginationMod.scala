package typingsJapgolly.antd

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.antd.antdStrings.small
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPaginationPaginationMod extends Shortcut {
  
  @JSImport("antd/lib/pagination/Pagination", JSImport.Default)
  @js.native
  val default: FC[PaginationProps] = js.native
  
  trait PaginationConfig
    extends StObject
       with PaginationProps {
    
    var position: js.UndefOr[PaginationPosition] = js.undefined
  }
  object PaginationConfig {
    
    inline def apply(): PaginationConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationConfig]
    }
    
    extension [Self <: PaginationConfig](x: Self) {
      
      inline def setPosition(value: PaginationPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antd.antdStrings.top
    - typingsJapgolly.antd.antdStrings.bottom
    - typingsJapgolly.antd.antdStrings.both
  */
  trait PaginationPosition extends StObject
  object PaginationPosition {
    
    inline def both: typingsJapgolly.antd.antdStrings.both = "both".asInstanceOf[typingsJapgolly.antd.antdStrings.both]
    
    inline def bottom: typingsJapgolly.antd.antdStrings.bottom = "bottom".asInstanceOf[typingsJapgolly.antd.antdStrings.bottom]
    
    inline def top: typingsJapgolly.antd.antdStrings.top = "top".asInstanceOf[typingsJapgolly.antd.antdStrings.top]
  }
  
  trait PaginationProps
    extends StObject
       with typingsJapgolly.rcPagination.mod.PaginationProps {
    
    var responsive: js.UndefOr[Boolean] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[typingsJapgolly.antd.antdStrings.default | small] = js.undefined
    
    var totalBoundaryShowSizeChanger: js.UndefOr[Double] = js.undefined
  }
  object PaginationProps {
    
    inline def apply(): PaginationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationProps]
    }
    
    extension [Self <: PaginationProps](x: Self) {
      
      inline def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      inline def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setSize(value: typingsJapgolly.antd.antdStrings.default | small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTotalBoundaryShowSizeChanger(value: Double): Self = StObject.set(x, "totalBoundaryShowSizeChanger", value.asInstanceOf[js.Any])
      
      inline def setTotalBoundaryShowSizeChangerUndefined: Self = StObject.set(x, "totalBoundaryShowSizeChanger", js.undefined)
    }
  }
  
  type _To = FC[PaginationProps]
  
  /* This means you don't have to write `default`, but can instead just say `libPaginationPaginationMod.foo` */
  override def _to: FC[PaginationProps] = default
}
