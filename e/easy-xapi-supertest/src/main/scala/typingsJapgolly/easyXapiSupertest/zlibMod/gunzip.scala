package typingsJapgolly.easyXapiSupertest.zlibMod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zlib", "gunzip")
@js.native
object gunzip extends js.Object {
  def apply(buf: Buffer, callback: js.Function2[/* error */ js.Error, /* result */ js.Any, Unit]): Unit = js.native
}

