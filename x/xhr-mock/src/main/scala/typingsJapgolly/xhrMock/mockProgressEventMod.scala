package typingsJapgolly.xhrMock

import org.scalajs.dom.raw.EventTarget
import typingsJapgolly.std.ProgressEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xhr-mock/lib/MockProgressEvent", JSImport.Namespace)
@js.native
object mockProgressEventMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsJapgolly.std.Event_ because Already inherited
  - typingsJapgolly.std.ProgressEvent because var conflicts: cancelBubble, returnValue. Inlined lengthComputable, loaded, target_ProgressEvent, total */ @js.native
  trait MockProgressEvent
    extends typingsJapgolly.xhrMock.mockEventMod.default {
    val lengthComputable: Boolean = js.native
    val loaded: Double = js.native
    @JSName("target")
    val target_ProgressEvent: EventTarget | Null = js.native
    val total: Double = js.native
    def initProgressEvent(
      typeArg: String,
      canBubbleArg: Boolean,
      cancelableArg: Boolean,
      lengthComputableArg: Boolean,
      loadedArg: Double,
      totalArg: Double
    ): Unit = js.native
  }
  
  @js.native
  class default protected () extends MockProgressEvent {
    def this(`type`: String) = this()
    def this(`type`: String, eventInitDict: ProgressEventInit) = this()
  }
  
}

