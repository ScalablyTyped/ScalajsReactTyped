package typingsJapgolly.rcCascader

import typingsJapgolly.rcCascader.esCascaderMod.DefaultOptionType
import typingsJapgolly.rcCascader.esCascaderMod.InternalFieldNames
import typingsJapgolly.rcCascader.esCascaderMod.ShowSearchType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseSearchOptionsMod {
  
  @JSImport("rc-cascader/es/hooks/useSearchOptions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    search: String,
    options: js.Array[DefaultOptionType],
    fieldNames: InternalFieldNames,
    prefixCls: String,
    config: ShowSearchType[DefaultOptionType],
    changeOnSelect: Boolean
  ): js.Array[DefaultOptionType] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(search.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fieldNames.asInstanceOf[js.Any], prefixCls.asInstanceOf[js.Any], config.asInstanceOf[js.Any], changeOnSelect.asInstanceOf[js.Any])).asInstanceOf[js.Array[DefaultOptionType]]
  
  @JSImport("rc-cascader/es/hooks/useSearchOptions", "SEARCH_MARK")
  @js.native
  val SEARCH_MARK: /* "__rc_cascader_search_mark__" */ String = js.native
}
