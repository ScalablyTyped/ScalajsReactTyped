package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOnStageGeneralDistComponentsDoubleChevronLeftMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/general/dist/components/DoubleChevronLeft", JSImport.Default)
  @js.native
  val default: FC[DoubleChevronLeftProps] = js.native
  
  trait DoubleChevronLeftProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DoubleChevronLeftProps {
    
    inline def apply(): DoubleChevronLeftProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DoubleChevronLeftProps]
    }
    
    extension [Self <: DoubleChevronLeftProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DoubleChevronLeftProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesOnStageGeneralDistComponentsDoubleChevronLeftMod.foo` */
  override def _to: FC[DoubleChevronLeftProps] = default
}
