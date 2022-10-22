package typingsJapgolly.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcGeneralDistComponentsSelectionToolSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/es/src/general/dist/components/SelectionToolSmall", JSImport.Default)
  @js.native
  val default: FC[SelectionToolSmallProps] = js.native
  
  trait SelectionToolSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SelectionToolSmallProps {
    
    inline def apply(): SelectionToolSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectionToolSmallProps]
    }
    
    extension [Self <: SelectionToolSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SelectionToolSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distEsSrcGeneralDistComponentsSelectionToolSmallMod.foo` */
  override def _to: FC[SelectionToolSmallProps] = default
}
