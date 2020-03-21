package typingsJapgolly.wegameApi.wx

import typingsJapgolly.wegameApi.DownloadTask
import typingsJapgolly.wegameApi.wx.types.DownfileParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.downloadFile")
@js.native
object downloadFile extends js.Object {
  // --网络
  /**
    * 下载文件
    */
  def apply(param: DownfileParams): DownloadTask = js.native
}

