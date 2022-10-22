package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOnStageReactionsDistComponentsThumbUpSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/reactions/dist/components/ThumbUpSmall", JSImport.Default)
  @js.native
  val default: FC[ThumbUpSmallProps] = js.native
  
  trait ThumbUpSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ThumbUpSmallProps {
    
    inline def apply(): ThumbUpSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThumbUpSmallProps]
    }
    
    extension [Self <: ThumbUpSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ThumbUpSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesOnStageReactionsDistComponentsThumbUpSmallMod.foo` */
  override def _to: FC[ThumbUpSmallProps] = default
}
