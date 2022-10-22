package typingsJapgolly.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcGeneralDistComponentsMediaProofingSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/es/src/general/dist/components/MediaProofingSmall", JSImport.Default)
  @js.native
  val default: FC[MediaProofingSmallProps] = js.native
  
  trait MediaProofingSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object MediaProofingSmallProps {
    
    inline def apply(): MediaProofingSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaProofingSmallProps]
    }
    
    extension [Self <: MediaProofingSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[MediaProofingSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distEsSrcGeneralDistComponentsMediaProofingSmallMod.foo` */
  override def _to: FC[MediaProofingSmallProps] = default
}
