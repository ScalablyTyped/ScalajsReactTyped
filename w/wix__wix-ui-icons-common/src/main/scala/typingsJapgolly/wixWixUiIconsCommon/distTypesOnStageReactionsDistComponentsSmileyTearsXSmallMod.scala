package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOnStageReactionsDistComponentsSmileyTearsXSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/reactions/dist/components/SmileyTearsXSmall", JSImport.Default)
  @js.native
  val default: FC[SmileyTearsXSmallProps] = js.native
  
  trait SmileyTearsXSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SmileyTearsXSmallProps {
    
    inline def apply(): SmileyTearsXSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SmileyTearsXSmallProps]
    }
    
    extension [Self <: SmileyTearsXSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SmileyTearsXSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesOnStageReactionsDistComponentsSmileyTearsXSmallMod.foo` */
  override def _to: FC[SmileyTearsXSmallProps] = default
}
