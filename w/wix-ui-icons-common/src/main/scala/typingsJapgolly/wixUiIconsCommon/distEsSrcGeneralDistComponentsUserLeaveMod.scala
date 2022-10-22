package typingsJapgolly.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcGeneralDistComponentsUserLeaveMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/es/src/general/dist/components/UserLeave", JSImport.Default)
  @js.native
  val default: FC[UserLeaveProps] = js.native
  
  trait UserLeaveProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object UserLeaveProps {
    
    inline def apply(): UserLeaveProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserLeaveProps]
    }
    
    extension [Self <: UserLeaveProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[UserLeaveProps]
  
  /* This means you don't have to write `default`, but can instead just say `distEsSrcGeneralDistComponentsUserLeaveMod.foo` */
  override def _to: FC[UserLeaveProps] = default
}
