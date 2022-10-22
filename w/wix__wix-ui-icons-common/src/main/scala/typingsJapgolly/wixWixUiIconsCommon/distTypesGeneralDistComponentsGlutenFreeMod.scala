package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsGlutenFreeMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/GlutenFree", JSImport.Default)
  @js.native
  val default: FC[GlutenFreeProps] = js.native
  
  trait GlutenFreeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object GlutenFreeProps {
    
    inline def apply(): GlutenFreeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlutenFreeProps]
    }
    
    extension [Self <: GlutenFreeProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[GlutenFreeProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsGlutenFreeMod.foo` */
  override def _to: FC[GlutenFreeProps] = default
}
