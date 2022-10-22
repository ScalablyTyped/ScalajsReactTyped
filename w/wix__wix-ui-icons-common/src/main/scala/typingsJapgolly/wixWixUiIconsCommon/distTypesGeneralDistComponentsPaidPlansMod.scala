package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsPaidPlansMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/PaidPlans", JSImport.Default)
  @js.native
  val default: FC[PaidPlansProps] = js.native
  
  trait PaidPlansProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PaidPlansProps {
    
    inline def apply(): PaidPlansProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaidPlansProps]
    }
    
    extension [Self <: PaidPlansProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PaidPlansProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsPaidPlansMod.foo` */
  override def _to: FC[PaidPlansProps] = default
}
