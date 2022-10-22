package typingsJapgolly.wixWixUiIconsCommon.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wixWixUiIconsCommon.distTypesStoriesComponentsSystemCategoryListBaseSizesMod.Props
import typingsJapgolly.wixWixUiIconsCommon.distTypesStoriesTypesMod.IconDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Sizes {
  
  inline def apply(sizes: js.Array[IconDescriptor]): Default[js.Object] = {
    val __props = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/stories/components/system-category-list-base/Sizes", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
