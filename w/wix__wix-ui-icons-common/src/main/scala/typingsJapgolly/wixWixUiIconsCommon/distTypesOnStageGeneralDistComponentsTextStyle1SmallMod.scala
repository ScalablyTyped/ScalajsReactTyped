package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOnStageGeneralDistComponentsTextStyle1SmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/general/dist/components/TextStyle1Small", JSImport.Default)
  @js.native
  val default: FC[TextStyle1SmallProps] = js.native
  
  trait TextStyle1SmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TextStyle1SmallProps {
    
    inline def apply(): TextStyle1SmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextStyle1SmallProps]
    }
    
    extension [Self <: TextStyle1SmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TextStyle1SmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesOnStageGeneralDistComponentsTextStyle1SmallMod.foo` */
  override def _to: FC[TextStyle1SmallProps] = default
}
