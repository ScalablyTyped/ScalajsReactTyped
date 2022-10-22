package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOnStageGeneralDistComponentsForumsSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/general/dist/components/ForumsSmall", JSImport.Default)
  @js.native
  val default: FC[ForumsSmallProps] = js.native
  
  trait ForumsSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ForumsSmallProps {
    
    inline def apply(): ForumsSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ForumsSmallProps]
    }
    
    extension [Self <: ForumsSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ForumsSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesOnStageGeneralDistComponentsForumsSmallMod.foo` */
  override def _to: FC[ForumsSmallProps] = default
}
