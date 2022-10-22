package typingsJapgolly.wixWixUiIconsCommon.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.FC
import typingsJapgolly.std.Record
import typingsJapgolly.wixWixUiIconsCommon.distTypesStoriesTypesMod.GeneralCategoryListProps
import typingsJapgolly.wixWixUiIconsCommon.distTypesStoriesTypesMod.IconProps
import typingsJapgolly.wixWixUiIconsCommon.distTypesTypesMod.IconMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GeneralCategoryListBase {
  
  inline def apply(iconComponents: Record[String, FC[IconProps]], iconsMetadata: js.Array[IconMetadata]): Builder = {
    val __props = js.Dynamic.literal(iconComponents = iconComponents.asInstanceOf[js.Any], iconsMetadata = iconsMetadata.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[GeneralCategoryListProps]))
  }
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/stories/components/general-category-list-base/GeneralCategoryListBase", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def iconSizes(value: js.Array[Double]): this.type = set("iconSizes", value.asInstanceOf[js.Any])
    
    inline def iconSizesVarargs(value: Double*): this.type = set("iconSizes", js.Array(value*))
  }
  
  def withProps(p: GeneralCategoryListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
