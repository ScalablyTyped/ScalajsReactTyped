package typingsJapgolly.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcGeneralDistComponentsArchiveMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/es/src/general/dist/components/Archive", JSImport.Default)
  @js.native
  val default: FC[ArchiveProps] = js.native
  
  trait ArchiveProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ArchiveProps {
    
    inline def apply(): ArchiveProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArchiveProps]
    }
    
    extension [Self <: ArchiveProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ArchiveProps]
  
  /* This means you don't have to write `default`, but can instead just say `distEsSrcGeneralDistComponentsArchiveMod.foo` */
  override def _to: FC[ArchiveProps] = default
}
