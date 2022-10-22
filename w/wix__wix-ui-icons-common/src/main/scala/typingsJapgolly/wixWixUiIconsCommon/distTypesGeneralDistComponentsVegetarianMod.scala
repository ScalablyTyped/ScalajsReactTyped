package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsVegetarianMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/Vegetarian", JSImport.Default)
  @js.native
  val default: FC[VegetarianProps] = js.native
  
  trait VegetarianProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object VegetarianProps {
    
    inline def apply(): VegetarianProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VegetarianProps]
    }
    
    extension [Self <: VegetarianProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[VegetarianProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsVegetarianMod.foo` */
  override def _to: FC[VegetarianProps] = default
}
