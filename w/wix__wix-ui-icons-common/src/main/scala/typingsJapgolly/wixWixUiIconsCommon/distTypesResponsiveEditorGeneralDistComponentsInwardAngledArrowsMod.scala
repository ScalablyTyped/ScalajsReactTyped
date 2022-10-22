package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsInwardAngledArrowsMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/InwardAngledArrows", JSImport.Default)
  @js.native
  val default: FC[InwardAngledArrowsProps] = js.native
  
  trait InwardAngledArrowsProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object InwardAngledArrowsProps {
    
    inline def apply(): InwardAngledArrowsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InwardAngledArrowsProps]
    }
    
    extension [Self <: InwardAngledArrowsProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[InwardAngledArrowsProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsInwardAngledArrowsMod.foo` */
  override def _to: FC[InwardAngledArrowsProps] = default
}
