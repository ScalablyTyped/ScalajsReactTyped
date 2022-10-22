package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSystemDistComponentsTextAreaRightToLeftMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/system/dist/components/TextAreaRightToLeft", JSImport.Default)
  @js.native
  val default: FC[TextAreaRightToLeftProps] = js.native
  
  trait TextAreaRightToLeftProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TextAreaRightToLeftProps {
    
    inline def apply(): TextAreaRightToLeftProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAreaRightToLeftProps]
    }
    
    extension [Self <: TextAreaRightToLeftProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TextAreaRightToLeftProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesSystemDistComponentsTextAreaRightToLeftMod.foo` */
  override def _to: FC[TextAreaRightToLeftProps] = default
}
