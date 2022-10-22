package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOnStageReactionsDistComponentsHeartXSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/reactions/dist/components/HeartXSmall", JSImport.Default)
  @js.native
  val default: FC[HeartXSmallProps] = js.native
  
  trait HeartXSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object HeartXSmallProps {
    
    inline def apply(): HeartXSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeartXSmallProps]
    }
    
    extension [Self <: HeartXSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[HeartXSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesOnStageReactionsDistComponentsHeartXSmallMod.foo` */
  override def _to: FC[HeartXSmallProps] = default
}
