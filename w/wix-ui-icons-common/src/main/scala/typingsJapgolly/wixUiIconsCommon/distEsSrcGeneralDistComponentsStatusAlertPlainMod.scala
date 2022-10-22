package typingsJapgolly.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcGeneralDistComponentsStatusAlertPlainMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/es/src/general/dist/components/StatusAlertPlain", JSImport.Default)
  @js.native
  val default: FC[StatusAlertPlainProps] = js.native
  
  trait StatusAlertPlainProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object StatusAlertPlainProps {
    
    inline def apply(): StatusAlertPlainProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatusAlertPlainProps]
    }
    
    extension [Self <: StatusAlertPlainProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[StatusAlertPlainProps]
  
  /* This means you don't have to write `default`, but can instead just say `distEsSrcGeneralDistComponentsStatusAlertPlainMod.foo` */
  override def _to: FC[StatusAlertPlainProps] = default
}
