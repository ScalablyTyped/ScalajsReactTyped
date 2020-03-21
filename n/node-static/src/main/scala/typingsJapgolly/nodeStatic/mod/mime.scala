package typingsJapgolly.nodeStatic.mod

import typingsJapgolly.mime.mod.TypeMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-static", "mime")
@js.native
object mime extends js.Object {
  def define(mimes: TypeMap): Unit = js.native
  def define(mimes: TypeMap, force: Boolean): Unit = js.native
  def getExtension(mime: String): String | Null = js.native
  def getType(path: String): String | Null = js.native
}

