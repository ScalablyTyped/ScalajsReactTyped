package typingsJapgolly.wepy.wxEnhancedMod

import typingsJapgolly.wepy.wepyStrings.CONNECT
import typingsJapgolly.wepy.wepyStrings.DELETE
import typingsJapgolly.wepy.wepyStrings.GET
import typingsJapgolly.wepy.wepyStrings.HEAD
import typingsJapgolly.wepy.wepyStrings.OPTIONS
import typingsJapgolly.wepy.wepyStrings.POST
import typingsJapgolly.wepy.wepyStrings.PUT
import typingsJapgolly.wepy.wepyStrings.TRACE
import typingsJapgolly.wepy.wepyStrings.arraybuffer
import typingsJapgolly.wepy.wepyStrings.json
import typingsJapgolly.wepy.wepyStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestParam extends UrlParam {
  var data: js.UndefOr[js.Object | String | scala.scalajs.js.typedarray.ArrayBuffer] = js.undefined
  var dataType: js.UndefOr[json | text] = js.undefined
  var header: js.UndefOr[js.Object] = js.undefined
  var method: js.UndefOr[GET | OPTIONS | HEAD | POST | PUT | DELETE | TRACE | CONNECT] = js.undefined
  var responseType: js.UndefOr[text | arraybuffer] = js.undefined
}

object RequestParam {
  @scala.inline
  def apply(
    url: String,
    data: js.Object | String | scala.scalajs.js.typedarray.ArrayBuffer = null,
    dataType: json | text = null,
    header: js.Object = null,
    method: GET | OPTIONS | HEAD | POST | PUT | DELETE | TRACE | CONNECT = null,
    responseType: text | arraybuffer = null
  ): RequestParam = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestParam]
  }
}

