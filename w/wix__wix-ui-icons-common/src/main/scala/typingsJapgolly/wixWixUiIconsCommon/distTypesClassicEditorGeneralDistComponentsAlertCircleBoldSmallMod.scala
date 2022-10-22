package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorGeneralDistComponentsAlertCircleBoldSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/AlertCircleBoldSmall", JSImport.Default)
  @js.native
  val default: FC[AlertCircleBoldSmallProps] = js.native
  
  trait AlertCircleBoldSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object AlertCircleBoldSmallProps {
    
    inline def apply(): AlertCircleBoldSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlertCircleBoldSmallProps]
    }
    
    extension [Self <: AlertCircleBoldSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[AlertCircleBoldSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorGeneralDistComponentsAlertCircleBoldSmallMod.foo` */
  override def _to: FC[AlertCircleBoldSmallProps] = default
}
