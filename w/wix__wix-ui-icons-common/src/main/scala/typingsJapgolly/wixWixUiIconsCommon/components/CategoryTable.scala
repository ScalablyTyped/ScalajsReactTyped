package typingsJapgolly.wixWixUiIconsCommon.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wixWixUiIconsCommon.distTypesStoriesComponentsCategoryTableCategoryTableMod.CategoryTableProps
import typingsJapgolly.wixWixUiIconsCommon.distTypesStoriesTypesMod.CategoryTableRow
import typingsJapgolly.wixWixUiIconsCommon.distTypesTypesMod.IconMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CategoryTable {
  
  inline def apply(
    iconsMetadata: js.Array[IconMetadata],
    mapIconToRow: IconMetadata => CategoryTableRow,
    tableHeaderTitles: js.Array[String],
    title: String
  ): Default[js.Object] = {
    val __props = js.Dynamic.literal(iconsMetadata = iconsMetadata.asInstanceOf[js.Any], mapIconToRow = js.Any.fromFunction1(mapIconToRow), tableHeaderTitles = tableHeaderTitles.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[CategoryTableProps]))
  }
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/stories/components/category-table", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: CategoryTableProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
