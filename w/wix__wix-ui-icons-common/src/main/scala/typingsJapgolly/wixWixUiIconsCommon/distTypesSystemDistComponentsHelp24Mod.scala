package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSystemDistComponentsHelp24Mod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/system/dist/components/Help24", JSImport.Default)
  @js.native
  val default: FC[Help24Props] = js.native
  
  trait Help24Props
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object Help24Props {
    
    inline def apply(): Help24Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Help24Props]
    }
    
    extension [Self <: Help24Props](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[Help24Props]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesSystemDistComponentsHelp24Mod.foo` */
  override def _to: FC[Help24Props] = default
}
