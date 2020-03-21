package typingsJapgolly.rdfExt

import typingsJapgolly.rdfExt.propTypeMod.PropType
import typingsJapgolly.rdfExt.rdfExtStrings.termType
import typingsJapgolly.rdfExt.rdfExtStrings.value
import typingsJapgolly.rdfJs.mod.DefaultGraph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValue extends js.Object {
  var termType: PropType[DefaultGraph, typingsJapgolly.rdfExt.rdfExtStrings.termType]
  var value: PropType[DefaultGraph, typingsJapgolly.rdfExt.rdfExtStrings.value]
}

object AnonValue {
  @scala.inline
  def apply(termType: PropType[DefaultGraph, termType], value: PropType[DefaultGraph, value]): AnonValue = {
    val __obj = js.Dynamic.literal(termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonValue]
  }
}

