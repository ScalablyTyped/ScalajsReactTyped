package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorGeneralDistComponentsFullWidthStripBoldMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/FullWidthStripBold", JSImport.Default)
  @js.native
  val default: FC[FullWidthStripBoldProps] = js.native
  
  trait FullWidthStripBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FullWidthStripBoldProps {
    
    inline def apply(): FullWidthStripBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FullWidthStripBoldProps]
    }
    
    extension [Self <: FullWidthStripBoldProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FullWidthStripBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorGeneralDistComponentsFullWidthStripBoldMod.foo` */
  override def _to: FC[FullWidthStripBoldProps] = default
}
