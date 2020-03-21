package typingsJapgolly.javascriptObfuscator

import org.scalajs.dom.raw.Node
import typingsJapgolly.javascriptObfuscator.estreeMod.Identifier
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("javascript-obfuscator/src/types/node-transformers/TReplaceableIdentifiers", JSImport.Namespace)
@js.native
object treplaceableidentifiersMod extends js.Object {
  type TReplaceableIdentifiers = Map[Node, Map[String, js.Array[Identifier]]]
}

