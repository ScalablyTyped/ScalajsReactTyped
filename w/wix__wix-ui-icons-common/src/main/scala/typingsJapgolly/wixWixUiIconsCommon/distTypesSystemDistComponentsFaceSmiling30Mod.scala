package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSystemDistComponentsFaceSmiling30Mod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/system/dist/components/FaceSmiling30", JSImport.Default)
  @js.native
  val default: FC[FaceSmiling30Props] = js.native
  
  trait FaceSmiling30Props
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FaceSmiling30Props {
    
    inline def apply(): FaceSmiling30Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FaceSmiling30Props]
    }
    
    extension [Self <: FaceSmiling30Props](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FaceSmiling30Props]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesSystemDistComponentsFaceSmiling30Mod.foo` */
  override def _to: FC[FaceSmiling30Props] = default
}
