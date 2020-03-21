package typingsJapgolly.snabbdom

import typingsJapgolly.snabbdom.moduleMod.Module
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snabbdom/modules/style", JSImport.Namespace)
@js.native
object styleMod extends js.Object {
  val default: Module = js.native
  val styleModule: Module = js.native
  type VNodeStyle = (Record[String, String]) with AnonDelayed
}

