package typingsJapgolly.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcGeneralDistComponentsDistributeGlobeSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/es/src/general/dist/components/DistributeGlobeSmall", JSImport.Default)
  @js.native
  val default: FC[DistributeGlobeSmallProps] = js.native
  
  trait DistributeGlobeSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DistributeGlobeSmallProps {
    
    inline def apply(): DistributeGlobeSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DistributeGlobeSmallProps]
    }
    
    extension [Self <: DistributeGlobeSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DistributeGlobeSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distEsSrcGeneralDistComponentsDistributeGlobeSmallMod.foo` */
  override def _to: FC[DistributeGlobeSmallProps] = default
}
