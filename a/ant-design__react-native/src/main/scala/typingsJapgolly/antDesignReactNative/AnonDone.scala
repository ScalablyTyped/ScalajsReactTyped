package typingsJapgolly.antDesignReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDone extends js.Object {
  /** 已加载完 */
  var done: String
  /** 加载中... */
  var loading: String
  /** 暂无数据 */
  var noData: String
  /** 下拉刷新 */
  var refreshableTitlePull: String
  /** 加载中... */
  var refreshableTitleRefreshing: String
  /** 释放加载 */
  var refreshableTitleRelease: String
}

object AnonDone {
  @scala.inline
  def apply(
    done: String,
    loading: String,
    noData: String,
    refreshableTitlePull: String,
    refreshableTitleRefreshing: String,
    refreshableTitleRelease: String
  ): AnonDone = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], noData = noData.asInstanceOf[js.Any], refreshableTitlePull = refreshableTitlePull.asInstanceOf[js.Any], refreshableTitleRefreshing = refreshableTitleRefreshing.asInstanceOf[js.Any], refreshableTitleRelease = refreshableTitleRelease.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDone]
  }
}

