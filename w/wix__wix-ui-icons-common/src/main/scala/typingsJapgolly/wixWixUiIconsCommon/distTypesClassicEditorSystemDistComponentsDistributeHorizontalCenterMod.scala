package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorSystemDistComponentsDistributeHorizontalCenterMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/system/dist/components/DistributeHorizontalCenter", JSImport.Default)
  @js.native
  val default: FC[DistributeHorizontalCenterProps] = js.native
  
  trait DistributeHorizontalCenterProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DistributeHorizontalCenterProps {
    
    inline def apply(): DistributeHorizontalCenterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DistributeHorizontalCenterProps]
    }
    
    extension [Self <: DistributeHorizontalCenterProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DistributeHorizontalCenterProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorSystemDistComponentsDistributeHorizontalCenterMod.foo` */
  override def _to: FC[DistributeHorizontalCenterProps] = default
}
