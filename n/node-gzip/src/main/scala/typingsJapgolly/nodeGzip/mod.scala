package typingsJapgolly.nodeGzip

import typingsJapgolly.node.Buffer
import typingsJapgolly.node.zlibMod.InputType
import typingsJapgolly.node.zlibMod.ZlibOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-gzip", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def gzip(input: InputType): js.Promise[Buffer] = js.native
  def gzip(input: InputType, options: ZlibOptions): js.Promise[Buffer] = js.native
  def ungzip(input: InputType): js.Promise[Buffer] = js.native
  def ungzip(input: InputType, options: ZlibOptions): js.Promise[Buffer] = js.native
}

