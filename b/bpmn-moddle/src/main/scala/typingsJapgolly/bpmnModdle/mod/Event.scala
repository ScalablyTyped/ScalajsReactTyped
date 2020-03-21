package typingsJapgolly.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.bpmnModdle.mod.TypeDerived because Already inherited
- typingsJapgolly.bpmnModdle.mod.InteractionNode because var conflicts: $parent, $type. Inlined incomingConversationLinks, outgoingConversationLinks */ @js.native
trait Event extends FlowNode {
  var incomingConversationLinks: js.Array[ConversationLink] = js.native
  var outgoingConversationLinks: js.Array[ConversationLink] = js.native
  var properties: js.Array[Property] = js.native
}

