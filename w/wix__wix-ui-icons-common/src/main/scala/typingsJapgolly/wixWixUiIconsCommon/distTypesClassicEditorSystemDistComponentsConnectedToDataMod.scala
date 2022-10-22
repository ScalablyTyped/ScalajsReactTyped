package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorSystemDistComponentsConnectedToDataMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/system/dist/components/ConnectedToData", JSImport.Default)
  @js.native
  val default: FC[ConnectedToDataProps] = js.native
  
  trait ConnectedToDataProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ConnectedToDataProps {
    
    inline def apply(): ConnectedToDataProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectedToDataProps]
    }
    
    extension [Self <: ConnectedToDataProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ConnectedToDataProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorSystemDistComponentsConnectedToDataMod.foo` */
  override def _to: FC[ConnectedToDataProps] = default
}
