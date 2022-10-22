package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsMoveToMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/MoveTo", JSImport.Default)
  @js.native
  val default: FC[MoveToProps] = js.native
  
  trait MoveToProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object MoveToProps {
    
    inline def apply(): MoveToProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MoveToProps]
    }
    
    extension [Self <: MoveToProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[MoveToProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsMoveToMod.foo` */
  override def _to: FC[MoveToProps] = default
}
