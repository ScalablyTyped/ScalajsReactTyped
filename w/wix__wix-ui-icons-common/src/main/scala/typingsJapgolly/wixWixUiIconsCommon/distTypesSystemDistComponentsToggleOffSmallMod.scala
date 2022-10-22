package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSystemDistComponentsToggleOffSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/system/dist/components/ToggleOffSmall", JSImport.Default)
  @js.native
  val default: FC[ToggleOffSmallProps] = js.native
  
  trait ToggleOffSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ToggleOffSmallProps {
    
    inline def apply(): ToggleOffSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToggleOffSmallProps]
    }
    
    extension [Self <: ToggleOffSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ToggleOffSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesSystemDistComponentsToggleOffSmallMod.foo` */
  override def _to: FC[ToggleOffSmallProps] = default
}
