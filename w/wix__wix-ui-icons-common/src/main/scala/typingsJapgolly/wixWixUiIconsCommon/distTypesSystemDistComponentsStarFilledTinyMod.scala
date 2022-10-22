package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSystemDistComponentsStarFilledTinyMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/system/dist/components/StarFilledTiny", JSImport.Default)
  @js.native
  val default: FC[StarFilledTinyProps] = js.native
  
  trait StarFilledTinyProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object StarFilledTinyProps {
    
    inline def apply(): StarFilledTinyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StarFilledTinyProps]
    }
    
    extension [Self <: StarFilledTinyProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[StarFilledTinyProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesSystemDistComponentsStarFilledTinyMod.foo` */
  override def _to: FC[StarFilledTinyProps] = default
}
