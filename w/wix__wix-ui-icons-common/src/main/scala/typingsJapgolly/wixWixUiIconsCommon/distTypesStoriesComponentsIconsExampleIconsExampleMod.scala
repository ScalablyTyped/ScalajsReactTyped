package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.FC
import typingsJapgolly.std.Record
import typingsJapgolly.wixWixUiIconsCommon.distTypesStoriesTypesMod.IconProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesStoriesComponentsIconsExampleIconsExampleMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/stories/components/icons-example/IconsExample", JSImport.Default)
  @js.native
  val default: FC[IconsExampleProps] = js.native
  
  trait IconsExampleProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var iconComponents: Record[String, FC[IconProps]]
  }
  object IconsExampleProps {
    
    inline def apply(iconComponents: Record[String, FC[IconProps]]): IconsExampleProps = {
      val __obj = js.Dynamic.literal(iconComponents = iconComponents.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconsExampleProps]
    }
    
    extension [Self <: IconsExampleProps](x: Self) {
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setIconComponents(value: Record[String, FC[IconProps]]): Self = StObject.set(x, "iconComponents", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[IconsExampleProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesStoriesComponentsIconsExampleIconsExampleMod.foo` */
  override def _to: FC[IconsExampleProps] = default
}
