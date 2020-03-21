package typingsJapgolly.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferencedSymbol extends js.Object {
  var definition: ReferencedSymbolDefinitionInfo
  var references: js.Array[ReferenceEntry]
}

object ReferencedSymbol {
  @scala.inline
  def apply(definition: ReferencedSymbolDefinitionInfo, references: js.Array[ReferenceEntry]): ReferencedSymbol = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReferencedSymbol]
  }
}

