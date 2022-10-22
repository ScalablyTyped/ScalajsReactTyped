package typingsJapgolly.wixWixUiIconsCommon.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.FC
import typingsJapgolly.std.Record
import typingsJapgolly.wixWixUiIconsCommon.distTypesStoriesTypesMod.IconProps
import typingsJapgolly.wixWixUiIconsCommon.distTypesStoriesTypesMod.SystemCategoryListProps
import typingsJapgolly.wixWixUiIconsCommon.distTypesTypesMod.IconMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SystemCategoryListBase {
  
  inline def apply(iconComponents: Record[String, FC[IconProps]], iconsMetadata: js.Array[IconMetadata]): Default[js.Object] = {
    val __props = js.Dynamic.literal(iconComponents = iconComponents.asInstanceOf[js.Any], iconsMetadata = iconsMetadata.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[SystemCategoryListProps]))
  }
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/stories/components/system-category-list-base/SystemCategoryListBase", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: SystemCategoryListProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
