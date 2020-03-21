package typingsJapgolly.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:no-empty-interface
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.bpmnModdle.mod.TypeDerived because Already inherited
- typingsJapgolly.bpmnModdle.mod.InteractionNode because var conflicts: $parent, $type. Inlined incomingConversationLinks, outgoingConversationLinks */ @js.native
trait ManualTask extends Activity {
  var incomingConversationLinks: js.Array[ConversationLink] = js.native
  var outgoingConversationLinks: js.Array[ConversationLink] = js.native
}

