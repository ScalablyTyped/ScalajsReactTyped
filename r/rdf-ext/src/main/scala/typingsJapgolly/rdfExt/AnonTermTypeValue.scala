package typingsJapgolly.rdfExt

import typingsJapgolly.rdfExt.propTypeMod.PropType
import typingsJapgolly.rdfExt.rdfExtStrings.termType
import typingsJapgolly.rdfExt.rdfExtStrings.value
import typingsJapgolly.rdfJs.mod.NamedNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTermTypeValue extends js.Object {
  var termType: PropType[NamedNode, typingsJapgolly.rdfExt.rdfExtStrings.termType]
  var value: PropType[NamedNode, typingsJapgolly.rdfExt.rdfExtStrings.value]
}

object AnonTermTypeValue {
  @scala.inline
  def apply(termType: PropType[NamedNode, termType], value: PropType[NamedNode, value]): AnonTermTypeValue = {
    val __obj = js.Dynamic.literal(termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTermTypeValue]
  }
}

