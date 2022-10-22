package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsTableReservationMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/TableReservation", JSImport.Default)
  @js.native
  val default: FC[TableReservationProps] = js.native
  
  trait TableReservationProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TableReservationProps {
    
    inline def apply(): TableReservationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableReservationProps]
    }
    
    extension [Self <: TableReservationProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TableReservationProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsTableReservationMod.foo` */
  override def _to: FC[TableReservationProps] = default
}
