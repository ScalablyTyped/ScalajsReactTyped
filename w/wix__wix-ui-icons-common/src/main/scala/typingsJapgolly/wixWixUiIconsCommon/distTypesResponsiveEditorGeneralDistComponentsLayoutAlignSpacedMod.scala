package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsLayoutAlignSpacedMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/LayoutAlignSpaced", JSImport.Default)
  @js.native
  val default: FC[LayoutAlignSpacedProps] = js.native
  
  trait LayoutAlignSpacedProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object LayoutAlignSpacedProps {
    
    inline def apply(): LayoutAlignSpacedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutAlignSpacedProps]
    }
    
    extension [Self <: LayoutAlignSpacedProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[LayoutAlignSpacedProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsLayoutAlignSpacedMod.foo` */
  override def _to: FC[LayoutAlignSpacedProps] = default
}
