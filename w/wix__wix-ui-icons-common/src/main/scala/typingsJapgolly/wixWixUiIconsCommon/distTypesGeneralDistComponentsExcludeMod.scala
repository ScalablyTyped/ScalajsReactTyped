package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsExcludeMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/Exclude", JSImport.Default)
  @js.native
  val default: FC[ExcludeProps] = js.native
  
  trait ExcludeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ExcludeProps {
    
    inline def apply(): ExcludeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExcludeProps]
    }
    
    extension [Self <: ExcludeProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ExcludeProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsExcludeMod.foo` */
  override def _to: FC[ExcludeProps] = default
}
