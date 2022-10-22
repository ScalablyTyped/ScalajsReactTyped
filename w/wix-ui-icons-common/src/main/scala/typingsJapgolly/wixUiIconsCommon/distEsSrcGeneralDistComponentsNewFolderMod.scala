package typingsJapgolly.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcGeneralDistComponentsNewFolderMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/es/src/general/dist/components/NewFolder", JSImport.Default)
  @js.native
  val default: FC[NewFolderProps] = js.native
  
  trait NewFolderProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object NewFolderProps {
    
    inline def apply(): NewFolderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NewFolderProps]
    }
    
    extension [Self <: NewFolderProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[NewFolderProps]
  
  /* This means you don't have to write `default`, but can instead just say `distEsSrcGeneralDistComponentsNewFolderMod.foo` */
  override def _to: FC[NewFolderProps] = default
}
