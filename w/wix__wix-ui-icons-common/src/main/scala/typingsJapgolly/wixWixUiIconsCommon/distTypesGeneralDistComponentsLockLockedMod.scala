package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsLockLockedMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/LockLocked", JSImport.Default)
  @js.native
  val default: FC[LockLockedProps] = js.native
  
  trait LockLockedProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object LockLockedProps {
    
    inline def apply(): LockLockedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LockLockedProps]
    }
    
    extension [Self <: LockLockedProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[LockLockedProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsLockLockedMod.foo` */
  override def _to: FC[LockLockedProps] = default
}
