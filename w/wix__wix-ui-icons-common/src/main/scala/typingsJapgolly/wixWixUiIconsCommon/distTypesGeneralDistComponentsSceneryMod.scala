package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsSceneryMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/Scenery", JSImport.Default)
  @js.native
  val default: FC[SceneryProps] = js.native
  
  trait SceneryProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SceneryProps {
    
    inline def apply(): SceneryProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SceneryProps]
    }
    
    extension [Self <: SceneryProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SceneryProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsSceneryMod.foo` */
  override def _to: FC[SceneryProps] = default
}
