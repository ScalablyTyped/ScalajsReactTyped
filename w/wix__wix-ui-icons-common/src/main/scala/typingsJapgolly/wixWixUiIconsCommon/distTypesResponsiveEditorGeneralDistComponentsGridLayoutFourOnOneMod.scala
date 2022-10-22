package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsGridLayoutFourOnOneMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/GridLayoutFourOnOne", JSImport.Default)
  @js.native
  val default: FC[GridLayoutFourOnOneProps] = js.native
  
  trait GridLayoutFourOnOneProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object GridLayoutFourOnOneProps {
    
    inline def apply(): GridLayoutFourOnOneProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridLayoutFourOnOneProps]
    }
    
    extension [Self <: GridLayoutFourOnOneProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[GridLayoutFourOnOneProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsGridLayoutFourOnOneMod.foo` */
  override def _to: FC[GridLayoutFourOnOneProps] = default
}
