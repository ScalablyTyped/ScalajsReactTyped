package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsTextAlignJustifyMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/TextAlignJustify", JSImport.Default)
  @js.native
  val default: FC[TextAlignJustifyProps] = js.native
  
  trait TextAlignJustifyProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TextAlignJustifyProps {
    
    inline def apply(): TextAlignJustifyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAlignJustifyProps]
    }
    
    extension [Self <: TextAlignJustifyProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TextAlignJustifyProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsTextAlignJustifyMod.foo` */
  override def _to: FC[TextAlignJustifyProps] = default
}
