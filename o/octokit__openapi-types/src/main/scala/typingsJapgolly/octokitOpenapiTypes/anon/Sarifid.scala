package typingsJapgolly.octokitOpenapiTypes.anon

import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.asc
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.created_
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sarifid extends StObject {
  
  /** The direction to sort the results by. */
  var direction: js.UndefOr[asc | desc] = js.undefined
  
  /** Page number of the results to fetch. */
  var page: js.UndefOr[Double] = js.undefined
  
  /** The number of results per page (max 100). */
  var per_page: js.UndefOr[Double] = js.undefined
  
  /** The Git reference for the analyses you want to list. The `ref` for a branch can be formatted either as `refs/heads/<branch name>` or simply `<branch name>`. To reference a pull request use `refs/pull/<number>/merge`. */
  var ref: js.UndefOr[String] = js.undefined
  
  /** Filter analyses belonging to the same SARIF upload. */
  var sarif_id: js.UndefOr[String] = js.undefined
  
  /** The property by which to sort the results. */
  var sort: js.UndefOr[created_] = js.undefined
  
  /** The GUID of a code scanning tool. Only results by this tool will be listed. Note that some code scanning tools may not include a GUID in their analysis data. You can specify the tool by using either `tool_guid` or `tool_name`, but not both. */
  var tool_guid: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-analysis-tool-guid'] */ js.Any
  ] = js.undefined
  
  /** The name of a code scanning tool. Only results by this tool will be listed. You can specify the tool by using either `tool_name` or `tool_guid`, but not both. */
  var tool_name: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-analysis-tool-name'] */ js.Any
  ] = js.undefined
}
object Sarifid {
  
  inline def apply(): Sarifid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sarifid]
  }
  
  extension [Self <: Sarifid](x: Self) {
    
    inline def setDirection(value: asc | desc): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setSarif_id(value: String): Self = StObject.set(x, "sarif_id", value.asInstanceOf[js.Any])
    
    inline def setSarif_idUndefined: Self = StObject.set(x, "sarif_id", js.undefined)
    
    inline def setSort(value: created_): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setTool_guid(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-analysis-tool-guid'] */ js.Any
    ): Self = StObject.set(x, "tool_guid", value.asInstanceOf[js.Any])
    
    inline def setTool_guidUndefined: Self = StObject.set(x, "tool_guid", js.undefined)
    
    inline def setTool_name(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-analysis-tool-name'] */ js.Any
    ): Self = StObject.set(x, "tool_name", value.asInstanceOf[js.Any])
    
    inline def setTool_nameUndefined: Self = StObject.set(x, "tool_name", js.undefined)
  }
}
