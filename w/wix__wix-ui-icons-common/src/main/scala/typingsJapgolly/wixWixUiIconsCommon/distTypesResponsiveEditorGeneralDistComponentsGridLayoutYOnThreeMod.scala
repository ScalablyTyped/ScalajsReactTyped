package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsGridLayoutYOnThreeMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/GridLayoutYOnThree", JSImport.Default)
  @js.native
  val default: FC[GridLayoutYOnThreeProps] = js.native
  
  trait GridLayoutYOnThreeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object GridLayoutYOnThreeProps {
    
    inline def apply(): GridLayoutYOnThreeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridLayoutYOnThreeProps]
    }
    
    extension [Self <: GridLayoutYOnThreeProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[GridLayoutYOnThreeProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsGridLayoutYOnThreeMod.foo` */
  override def _to: FC[GridLayoutYOnThreeProps] = default
}
