package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorGeneralDistComponentsProfileWidgetMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/ProfileWidget", JSImport.Default)
  @js.native
  val default: FC[ProfileWidgetProps] = js.native
  
  trait ProfileWidgetProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ProfileWidgetProps {
    
    inline def apply(): ProfileWidgetProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProfileWidgetProps]
    }
    
    extension [Self <: ProfileWidgetProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ProfileWidgetProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorGeneralDistComponentsProfileWidgetMod.foo` */
  override def _to: FC[ProfileWidgetProps] = default
}
