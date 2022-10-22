package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOnStageGeneralDistComponentsLikeHeartFillMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/general/dist/components/LikeHeartFill", JSImport.Default)
  @js.native
  val default: FC[LikeHeartFillProps] = js.native
  
  trait LikeHeartFillProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object LikeHeartFillProps {
    
    inline def apply(): LikeHeartFillProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LikeHeartFillProps]
    }
    
    extension [Self <: LikeHeartFillProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[LikeHeartFillProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesOnStageGeneralDistComponentsLikeHeartFillMod.foo` */
  override def _to: FC[LikeHeartFillProps] = default
}
