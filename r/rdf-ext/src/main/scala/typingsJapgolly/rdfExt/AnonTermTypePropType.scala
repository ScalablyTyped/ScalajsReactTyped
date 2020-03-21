package typingsJapgolly.rdfExt

import typingsJapgolly.rdfExt.propTypeMod.PropType
import typingsJapgolly.rdfExt.rdfExtStrings.termType
import typingsJapgolly.rdfExt.rdfExtStrings.value
import typingsJapgolly.rdfJs.mod.Variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTermTypePropType extends js.Object {
  var termType: PropType[Variable, typingsJapgolly.rdfExt.rdfExtStrings.termType]
  var value: PropType[Variable, typingsJapgolly.rdfExt.rdfExtStrings.value]
}

object AnonTermTypePropType {
  @scala.inline
  def apply(termType: PropType[Variable, termType], value: PropType[Variable, value]): AnonTermTypePropType = {
    val __obj = js.Dynamic.literal(termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTermTypePropType]
  }
}

