package typingsJapgolly.wegameApi.wx

import typingsJapgolly.wegameApi.RequestTask
import typingsJapgolly.wegameApi.wx.types.RequestParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.request")
@js.native
object request extends js.Object {
  // --发起请求
  def apply(param: RequestParams): RequestTask = js.native
}

