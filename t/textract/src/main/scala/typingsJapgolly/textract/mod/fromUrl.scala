package typingsJapgolly.textract.mod

import typingsJapgolly.node.urlMod.URL_
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("textract", "fromUrl")
@js.native
object fromUrl extends js.Object {
  def apply(url: String, callback: js.Function2[/* error */ Error, /* text */ String, Unit]): Unit = js.native
  def apply(
    url: String,
    config: URLConfig,
    callback: js.Function2[/* error */ js.Error, /* text */ String, Unit]
  ): Unit = js.native
  def apply(url: URL_, callback: js.Function2[/* error */ Error, /* text */ String, Unit]): Unit = js.native
  def apply(
    url: URL_,
    config: URLConfig,
    callback: js.Function2[/* error */ js.Error, /* text */ String, Unit]
  ): Unit = js.native
}

