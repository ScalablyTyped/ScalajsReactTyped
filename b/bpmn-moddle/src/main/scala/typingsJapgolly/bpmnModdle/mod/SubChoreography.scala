package typingsJapgolly.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.bpmnModdle.mod.TypeDerived because Already inherited
- typingsJapgolly.bpmnModdle.mod.BaseElement because Already inherited
- typingsJapgolly.bpmnModdle.mod.FlowElementsContainer because var conflicts: $attrs, $parent, $type, documentation, extensionDefinitions, extensionElements, id. Inlined laneSets, flowElements */ @js.native
trait SubChoreography extends ChoreographyActivity {
  var artifacts: js.Array[Artifact] = js.native
  var flowElements: js.Array[FlowElement] = js.native
  var laneSets: js.Array[LaneSet] = js.native
}

