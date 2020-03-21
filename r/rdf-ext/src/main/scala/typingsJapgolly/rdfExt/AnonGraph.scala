package typingsJapgolly.rdfExt

import typingsJapgolly.rdfExt.propTypeMod.PropType
import typingsJapgolly.rdfExt.quadMod.QuadExt
import typingsJapgolly.rdfExt.rdfExtStrings.`object`
import typingsJapgolly.rdfExt.rdfExtStrings.graph
import typingsJapgolly.rdfExt.rdfExtStrings.predicate
import typingsJapgolly.rdfExt.rdfExtStrings.subject
import typingsJapgolly.rdfExt.rdfExtStrings.toJSON
import typingsJapgolly.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGraph extends js.Object {
  var graph: ReturnType[PropType[PropType[QuadExt, typingsJapgolly.rdfExt.rdfExtStrings.graph], toJSON]]
  var `object`: ReturnType[
    PropType[PropType[QuadExt, typingsJapgolly.rdfExt.rdfExtStrings.`object`], toJSON]
  ]
  var predicate: ReturnType[
    PropType[PropType[QuadExt, typingsJapgolly.rdfExt.rdfExtStrings.predicate], toJSON]
  ]
  var subject: ReturnType[
    PropType[PropType[QuadExt, typingsJapgolly.rdfExt.rdfExtStrings.subject], toJSON]
  ]
}

object AnonGraph {
  @scala.inline
  def apply(
    graph: ReturnType[PropType[PropType[QuadExt, graph], toJSON]],
    `object`: ReturnType[PropType[PropType[QuadExt, `object`], toJSON]],
    predicate: ReturnType[PropType[PropType[QuadExt, predicate], toJSON]],
    subject: ReturnType[PropType[PropType[QuadExt, subject], toJSON]]
  ): AnonGraph = {
    val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], predicate = predicate.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGraph]
  }
}

