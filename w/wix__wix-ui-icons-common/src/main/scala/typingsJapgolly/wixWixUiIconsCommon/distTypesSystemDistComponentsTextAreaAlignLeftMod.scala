package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSystemDistComponentsTextAreaAlignLeftMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/system/dist/components/TextAreaAlignLeft", JSImport.Default)
  @js.native
  val default: FC[TextAreaAlignLeftProps] = js.native
  
  trait TextAreaAlignLeftProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TextAreaAlignLeftProps {
    
    inline def apply(): TextAreaAlignLeftProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAreaAlignLeftProps]
    }
    
    extension [Self <: TextAreaAlignLeftProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TextAreaAlignLeftProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesSystemDistComponentsTextAreaAlignLeftMod.foo` */
  override def _to: FC[TextAreaAlignLeftProps] = default
}
