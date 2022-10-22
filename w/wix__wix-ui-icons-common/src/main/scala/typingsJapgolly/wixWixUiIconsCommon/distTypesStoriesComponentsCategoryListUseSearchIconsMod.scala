package typingsJapgolly.wixWixUiIconsCommon

import typingsJapgolly.wixWixUiIconsCommon.anon.DebouncedSearch
import typingsJapgolly.wixWixUiIconsCommon.distTypesTypesMod.IconMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesStoriesComponentsCategoryListUseSearchIconsMod {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/stories/components/category-list/useSearchIcons", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** Searches icons
    * and sets the results to state
    * returns filtered and a debounced `searchCategoryIcons`
    */
  inline def default(iconsMetadata: js.Array[IconMetadata], keys: js.Array[String]): DebouncedSearch = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(iconsMetadata.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[DebouncedSearch]
}
