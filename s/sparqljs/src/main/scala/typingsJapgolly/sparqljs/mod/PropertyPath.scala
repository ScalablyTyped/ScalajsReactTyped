package typingsJapgolly.sparqljs.mod

import typingsJapgolly.sparqljs.sparqljsStrings.Asterisk
import typingsJapgolly.sparqljs.sparqljsStrings.Exclamationmark
import typingsJapgolly.sparqljs.sparqljsStrings.Plussign
import typingsJapgolly.sparqljs.sparqljsStrings.Slash
import typingsJapgolly.sparqljs.sparqljsStrings.Verticalline
import typingsJapgolly.sparqljs.sparqljsStrings.^
import typingsJapgolly.sparqljs.sparqljsStrings.path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyPath extends js.Object {
  var items: js.Array[PropertyPath | Term]
  var pathType: Verticalline | Slash | ^  | Plussign | Asterisk | Exclamationmark
  var `type`: path
}

object PropertyPath {
  @scala.inline
  def apply(
    items: js.Array[PropertyPath | Term],
    pathType: Verticalline | Slash | ^  | Plussign | Asterisk | Exclamationmark,
    `type`: path
  ): PropertyPath = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], pathType = pathType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyPath]
  }
}

