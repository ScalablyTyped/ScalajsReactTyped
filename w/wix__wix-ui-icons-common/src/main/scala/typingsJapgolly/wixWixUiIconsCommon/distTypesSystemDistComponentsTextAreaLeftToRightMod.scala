package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSystemDistComponentsTextAreaLeftToRightMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/system/dist/components/TextAreaLeftToRight", JSImport.Default)
  @js.native
  val default: FC[TextAreaLeftToRightProps] = js.native
  
  trait TextAreaLeftToRightProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TextAreaLeftToRightProps {
    
    inline def apply(): TextAreaLeftToRightProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAreaLeftToRightProps]
    }
    
    extension [Self <: TextAreaLeftToRightProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TextAreaLeftToRightProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesSystemDistComponentsTextAreaLeftToRightMod.foo` */
  override def _to: FC[TextAreaLeftToRightProps] = default
}
