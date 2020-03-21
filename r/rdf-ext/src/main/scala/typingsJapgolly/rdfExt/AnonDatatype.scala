package typingsJapgolly.rdfExt

import typingsJapgolly.rdfExt.propTypeMod.PropType
import typingsJapgolly.rdfExt.rdfExtStrings.language
import typingsJapgolly.rdfExt.rdfExtStrings.termType
import typingsJapgolly.rdfExt.rdfExtStrings.value
import typingsJapgolly.rdfJs.mod.Literal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDatatype extends js.Object {
  var datatype: AnonTermTypeValue
  var language: PropType[Literal, typingsJapgolly.rdfExt.rdfExtStrings.language]
  var termType: PropType[Literal, typingsJapgolly.rdfExt.rdfExtStrings.termType]
  var value: PropType[Literal, typingsJapgolly.rdfExt.rdfExtStrings.value]
}

object AnonDatatype {
  @scala.inline
  def apply(
    datatype: AnonTermTypeValue,
    language: PropType[Literal, language],
    termType: PropType[Literal, termType],
    value: PropType[Literal, value]
  ): AnonDatatype = {
    val __obj = js.Dynamic.literal(datatype = datatype.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDatatype]
  }
}

