package typingsJapgolly.javascriptObfuscator

import org.scalajs.dom.raw.Node
import typingsJapgolly.estraverse.mod.VisitorOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("javascript-obfuscator/src/types/node-transformers/TVisitorResult", JSImport.Namespace)
@js.native
object tvisitorresultMod extends js.Object {
  type TVisitorResult = Node | VisitorOption | Unit
}

