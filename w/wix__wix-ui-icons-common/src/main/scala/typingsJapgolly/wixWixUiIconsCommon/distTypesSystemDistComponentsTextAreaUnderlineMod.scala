package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSystemDistComponentsTextAreaUnderlineMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/system/dist/components/TextAreaUnderline", JSImport.Default)
  @js.native
  val default: FC[TextAreaUnderlineProps] = js.native
  
  trait TextAreaUnderlineProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TextAreaUnderlineProps {
    
    inline def apply(): TextAreaUnderlineProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAreaUnderlineProps]
    }
    
    extension [Self <: TextAreaUnderlineProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TextAreaUnderlineProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesSystemDistComponentsTextAreaUnderlineMod.foo` */
  override def _to: FC[TextAreaUnderlineProps] = default
}
