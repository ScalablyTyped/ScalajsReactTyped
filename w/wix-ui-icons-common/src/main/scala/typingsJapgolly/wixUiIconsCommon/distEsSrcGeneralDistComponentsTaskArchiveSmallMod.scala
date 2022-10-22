package typingsJapgolly.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcGeneralDistComponentsTaskArchiveSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/es/src/general/dist/components/TaskArchiveSmall", JSImport.Default)
  @js.native
  val default: FC[TaskArchiveSmallProps] = js.native
  
  trait TaskArchiveSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TaskArchiveSmallProps {
    
    inline def apply(): TaskArchiveSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskArchiveSmallProps]
    }
    
    extension [Self <: TaskArchiveSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TaskArchiveSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distEsSrcGeneralDistComponentsTaskArchiveSmallMod.foo` */
  override def _to: FC[TaskArchiveSmallProps] = default
}
