package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSystemDistComponentsFaceDisapointed30Mod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/system/dist/components/FaceDisapointed30", JSImport.Default)
  @js.native
  val default: FC[FaceDisapointed30Props] = js.native
  
  trait FaceDisapointed30Props
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FaceDisapointed30Props {
    
    inline def apply(): FaceDisapointed30Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FaceDisapointed30Props]
    }
    
    extension [Self <: FaceDisapointed30Props](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FaceDisapointed30Props]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesSystemDistComponentsFaceDisapointed30Mod.foo` */
  override def _to: FC[FaceDisapointed30Props] = default
}
