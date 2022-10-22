package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsTableChartColRowSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/TableChartColRowSmall", JSImport.Default)
  @js.native
  val default: FC[TableChartColRowSmallProps] = js.native
  
  trait TableChartColRowSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TableChartColRowSmallProps {
    
    inline def apply(): TableChartColRowSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableChartColRowSmallProps]
    }
    
    extension [Self <: TableChartColRowSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TableChartColRowSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsTableChartColRowSmallMod.foo` */
  override def _to: FC[TableChartColRowSmallProps] = default
}
