package typingsJapgolly.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderResponse extends js.Object {
  var data: String | scala.scalajs.js.typedarray.ArrayBuffer
  var url: String
}

object LoaderResponse {
  @scala.inline
  def apply(data: String | scala.scalajs.js.typedarray.ArrayBuffer, url: String): LoaderResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LoaderResponse]
  }
}

