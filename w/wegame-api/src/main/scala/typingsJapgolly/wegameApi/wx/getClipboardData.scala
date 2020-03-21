package typingsJapgolly.wegameApi.wx

import typingsJapgolly.wegameApi.wx.types.CallbacksWithType
import typingsJapgolly.wegameApi.wx.types.ClipboardData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.getClipboardData")
@js.native
object getClipboardData extends js.Object {
  // --剪贴板
  /**
    * 取得系统剪贴板的内容
    */
  def apply(cb: CallbacksWithType[ClipboardData]): Unit = js.native
}

