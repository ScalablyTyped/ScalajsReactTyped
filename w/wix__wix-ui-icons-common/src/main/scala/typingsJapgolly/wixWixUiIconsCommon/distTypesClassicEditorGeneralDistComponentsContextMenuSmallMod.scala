package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorGeneralDistComponentsContextMenuSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/ContextMenuSmall", JSImport.Default)
  @js.native
  val default: FC[ContextMenuSmallProps] = js.native
  
  trait ContextMenuSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ContextMenuSmallProps {
    
    inline def apply(): ContextMenuSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextMenuSmallProps]
    }
    
    extension [Self <: ContextMenuSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ContextMenuSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorGeneralDistComponentsContextMenuSmallMod.foo` */
  override def _to: FC[ContextMenuSmallProps] = default
}
