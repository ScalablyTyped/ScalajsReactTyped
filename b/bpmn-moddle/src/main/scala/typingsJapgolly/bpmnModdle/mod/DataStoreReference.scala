package typingsJapgolly.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.bpmnModdle.mod.TypeDerived because Already inherited
- typingsJapgolly.bpmnModdle.mod.BaseElement because Already inherited
- typingsJapgolly.bpmnModdle.mod.ItemAwareElement because var conflicts: $attrs, $parent, $type, documentation, extensionDefinitions, extensionElements, id. Inlined itemSubjectRef, dataState */ @js.native
trait DataStoreReference extends FlowElement {
  var dataState: DataState = js.native
  var dataStoreRef: DataStore = js.native
  var itemSubjectRef: ItemDefinition = js.native
}

