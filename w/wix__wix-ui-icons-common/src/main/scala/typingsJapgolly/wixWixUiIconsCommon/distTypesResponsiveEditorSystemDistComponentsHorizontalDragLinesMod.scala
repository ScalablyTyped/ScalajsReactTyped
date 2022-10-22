package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorSystemDistComponentsHorizontalDragLinesMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/system/dist/components/HorizontalDragLines", JSImport.Default)
  @js.native
  val default: FC[HorizontalDragLinesProps] = js.native
  
  trait HorizontalDragLinesProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object HorizontalDragLinesProps {
    
    inline def apply(): HorizontalDragLinesProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HorizontalDragLinesProps]
    }
    
    extension [Self <: HorizontalDragLinesProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[HorizontalDragLinesProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorSystemDistComponentsHorizontalDragLinesMod.foo` */
  override def _to: FC[HorizontalDragLinesProps] = default
}
