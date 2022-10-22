package typingsJapgolly.wixWixUiIconsCommon.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixWixUiIconsCommon.distTypesStoriesComponentsCategoryListCategoryListMod.CategoryListProps
import typingsJapgolly.wixWixUiIconsCommon.distTypesStoriesTypesMod.CategoryTableRow
import typingsJapgolly.wixWixUiIconsCommon.distTypesTypesMod.IconMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CategoryList {
  
  inline def apply(
    iconsMetadata: js.Array[IconMetadata],
    mapIconToRow: IconMetadata => CategoryTableRow,
    searchKeys: js.Array[String],
    tableHeaderTitles: js.Array[String]
  ): Builder = {
    val __props = js.Dynamic.literal(iconsMetadata = iconsMetadata.asInstanceOf[js.Any], mapIconToRow = js.Any.fromFunction1(mapIconToRow), searchKeys = searchKeys.asInstanceOf[js.Any], tableHeaderTitles = tableHeaderTitles.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CategoryListProps]))
  }
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/stories/components/category-list", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CategoryListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
