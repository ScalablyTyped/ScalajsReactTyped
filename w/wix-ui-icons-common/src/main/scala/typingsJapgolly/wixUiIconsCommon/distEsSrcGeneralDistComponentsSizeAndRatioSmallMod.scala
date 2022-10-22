package typingsJapgolly.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcGeneralDistComponentsSizeAndRatioSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/es/src/general/dist/components/SizeAndRatioSmall", JSImport.Default)
  @js.native
  val default: FC[SizeAndRatioSmallProps] = js.native
  
  trait SizeAndRatioSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SizeAndRatioSmallProps {
    
    inline def apply(): SizeAndRatioSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SizeAndRatioSmallProps]
    }
    
    extension [Self <: SizeAndRatioSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SizeAndRatioSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distEsSrcGeneralDistComponentsSizeAndRatioSmallMod.foo` */
  override def _to: FC[SizeAndRatioSmallProps] = default
}
