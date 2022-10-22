package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsSidebarUndockSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/SidebarUndockSmall", JSImport.Default)
  @js.native
  val default: FC[SidebarUndockSmallProps] = js.native
  
  trait SidebarUndockSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SidebarUndockSmallProps {
    
    inline def apply(): SidebarUndockSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SidebarUndockSmallProps]
    }
    
    extension [Self <: SidebarUndockSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SidebarUndockSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsSidebarUndockSmallMod.foo` */
  override def _to: FC[SidebarUndockSmallProps] = default
}
