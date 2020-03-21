package typingsJapgolly.snabbdom

import typingsJapgolly.snabbdom.moduleMod.Module
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snabbdom/modules/props", JSImport.Namespace)
@js.native
object propsMod extends js.Object {
  val default: Module = js.native
  val propsModule: Module = js.native
  type Props = Record[String, js.Any]
}

