package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsGridLayoutOneOnYMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/GridLayoutOneOnY", JSImport.Default)
  @js.native
  val default: FC[GridLayoutOneOnYProps] = js.native
  
  trait GridLayoutOneOnYProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object GridLayoutOneOnYProps {
    
    inline def apply(): GridLayoutOneOnYProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridLayoutOneOnYProps]
    }
    
    extension [Self <: GridLayoutOneOnYProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[GridLayoutOneOnYProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsGridLayoutOneOnYMod.foo` */
  override def _to: FC[GridLayoutOneOnYProps] = default
}
