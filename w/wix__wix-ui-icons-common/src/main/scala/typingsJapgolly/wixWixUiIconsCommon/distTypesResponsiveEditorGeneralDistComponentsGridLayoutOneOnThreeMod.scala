package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsGridLayoutOneOnThreeMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/GridLayoutOneOnThree", JSImport.Default)
  @js.native
  val default: FC[GridLayoutOneOnThreeProps] = js.native
  
  trait GridLayoutOneOnThreeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object GridLayoutOneOnThreeProps {
    
    inline def apply(): GridLayoutOneOnThreeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridLayoutOneOnThreeProps]
    }
    
    extension [Self <: GridLayoutOneOnThreeProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[GridLayoutOneOnThreeProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsGridLayoutOneOnThreeMod.foo` */
  override def _to: FC[GridLayoutOneOnThreeProps] = default
}
