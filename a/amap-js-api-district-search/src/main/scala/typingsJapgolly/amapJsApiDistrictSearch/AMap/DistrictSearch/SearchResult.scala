package typingsJapgolly.amapJsApiDistrictSearch.AMap.DistrictSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResult extends js.Object {
  /**
    * 行政区划列表
    */
  var districtList: js.Array[District]
  /**
    * 成功状态文字描述
    */
  var info: String
}

object SearchResult {
  @scala.inline
  def apply(districtList: js.Array[District], info: String): SearchResult = {
    val __obj = js.Dynamic.literal(districtList = districtList.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchResult]
  }
}

