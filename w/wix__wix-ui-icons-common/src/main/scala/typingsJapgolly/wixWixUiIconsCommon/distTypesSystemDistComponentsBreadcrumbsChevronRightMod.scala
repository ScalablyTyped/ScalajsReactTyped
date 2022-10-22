package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSystemDistComponentsBreadcrumbsChevronRightMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/system/dist/components/BreadcrumbsChevronRight", JSImport.Default)
  @js.native
  val default: FC[BreadcrumbsChevronRightProps] = js.native
  
  trait BreadcrumbsChevronRightProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object BreadcrumbsChevronRightProps {
    
    inline def apply(): BreadcrumbsChevronRightProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadcrumbsChevronRightProps]
    }
    
    extension [Self <: BreadcrumbsChevronRightProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[BreadcrumbsChevronRightProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesSystemDistComponentsBreadcrumbsChevronRightMod.foo` */
  override def _to: FC[BreadcrumbsChevronRightProps] = default
}
