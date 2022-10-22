package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsArrowLeftBoldSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/ArrowLeftBoldSmall", JSImport.Default)
  @js.native
  val default: FC[ArrowLeftBoldSmallProps] = js.native
  
  trait ArrowLeftBoldSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ArrowLeftBoldSmallProps {
    
    inline def apply(): ArrowLeftBoldSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrowLeftBoldSmallProps]
    }
    
    extension [Self <: ArrowLeftBoldSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ArrowLeftBoldSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsArrowLeftBoldSmallMod.foo` */
  override def _to: FC[ArrowLeftBoldSmallProps] = default
}
