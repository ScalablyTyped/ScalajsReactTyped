package typingsJapgolly.rdfExt

import typingsJapgolly.rdfExt.propTypeMod.PropType
import typingsJapgolly.rdfExt.rdfExtStrings.termType
import typingsJapgolly.rdfExt.rdfExtStrings.value
import typingsJapgolly.rdfJs.mod.BlankNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTermType extends js.Object {
  var termType: PropType[BlankNode, typingsJapgolly.rdfExt.rdfExtStrings.termType]
  var value: PropType[BlankNode, typingsJapgolly.rdfExt.rdfExtStrings.value]
}

object AnonTermType {
  @scala.inline
  def apply(termType: PropType[BlankNode, termType], value: PropType[BlankNode, value]): AnonTermType = {
    val __obj = js.Dynamic.literal(termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTermType]
  }
}

