package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsGridLayoutThreeOnTwoMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/GridLayoutThreeOnTwo", JSImport.Default)
  @js.native
  val default: FC[GridLayoutThreeOnTwoProps] = js.native
  
  trait GridLayoutThreeOnTwoProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object GridLayoutThreeOnTwoProps {
    
    inline def apply(): GridLayoutThreeOnTwoProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridLayoutThreeOnTwoProps]
    }
    
    extension [Self <: GridLayoutThreeOnTwoProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[GridLayoutThreeOnTwoProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsGridLayoutThreeOnTwoMod.foo` */
  override def _to: FC[GridLayoutThreeOnTwoProps] = default
}
