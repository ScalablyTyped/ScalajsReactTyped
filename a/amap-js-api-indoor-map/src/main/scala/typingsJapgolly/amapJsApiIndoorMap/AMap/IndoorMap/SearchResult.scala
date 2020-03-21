package typingsJapgolly.amapJsApiIndoorMap.AMap.IndoorMap

import typingsJapgolly.amapJsApiIndoorMap.amapJsApiIndoorMapNumbers.`0`
import typingsJapgolly.amapJsApiIndoorMap.amapJsApiIndoorMapNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.amapJsApiIndoorMap.AMap.IndoorMap.SearchSuccessResult
  - typingsJapgolly.amapJsApiIndoorMap.AMap.IndoorMap.SearchErrorResult
*/
trait SearchResult extends js.Object

object SearchResult {
  @scala.inline
  def SearchSuccessResult(building: Building, id: String, status: `0`): SearchResult = {
    val __obj = js.Dynamic.literal(building = building.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchResult]
  }
  @scala.inline
  def SearchErrorResult(error: js.Error, id: String, status: `1`): SearchResult = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchResult]
  }
}

