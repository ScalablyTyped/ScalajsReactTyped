package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorSystemDistComponentsFlipHorizontalBoldMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/system/dist/components/FlipHorizontalBold", JSImport.Default)
  @js.native
  val default: FC[FlipHorizontalBoldProps] = js.native
  
  trait FlipHorizontalBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FlipHorizontalBoldProps {
    
    inline def apply(): FlipHorizontalBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlipHorizontalBoldProps]
    }
    
    extension [Self <: FlipHorizontalBoldProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FlipHorizontalBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorSystemDistComponentsFlipHorizontalBoldMod.foo` */
  override def _to: FC[FlipHorizontalBoldProps] = default
}
