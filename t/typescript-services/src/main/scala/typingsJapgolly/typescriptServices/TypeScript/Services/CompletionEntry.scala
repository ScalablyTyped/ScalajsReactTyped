package typingsJapgolly.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletionEntry extends js.Object {
  var kind: String
  var kindModifiers: String
  var name: String
}

object CompletionEntry {
  @scala.inline
  def apply(kind: String, kindModifiers: String, name: String): CompletionEntry = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CompletionEntry]
  }
}

