package typingsJapgolly.atSemanticDashUiDashReactEventDashStack.libTypesLibEventSetMod

import org.scalajs.dom.raw.Event
import typingsJapgolly.atSemanticDashUiDashReactEventDashStack.libTypesTypesMod.EventListeners
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@semantic-ui-react/event-stack/lib/types/lib/EventSet", JSImport.Default)
@js.native
class default protected () extends EventSet {
  /**
    * @see https://jsperf.com/suir-eventset-constructor
    */
  def this(eventHandlers: EventListeners) = this()
  /* CompleteClass */
  override val handlers: js.Any = js.native
  /**
    * @see https://jsperf.com/suir-eventset-addhandlers
    */
  /* CompleteClass */
  override def addHandlers(additionalHandlers: EventListeners): EventSet = js.native
  /**
    * @see https://jsperf.com/suir-eventset-dispatchsingle
    * @see https://jsperf.com/suir-eventset-dispatchmultiple2
    */
  /* CompleteClass */
  override def dispatchEvent(event: Event, dispatchAll: Boolean): Unit = js.native
  /* CompleteClass */
  override def hasHandlers(): Boolean = js.native
  /**
    * @see https://jsperf.com/suir-eventset-removehandlers
    */
  /* CompleteClass */
  override def removeHandlers(removalHandlers: EventListeners): EventSet = js.native
}

