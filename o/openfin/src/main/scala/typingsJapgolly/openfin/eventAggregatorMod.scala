package typingsJapgolly.openfin

import typingsJapgolly.openfin.emitterMapMod.EmitterMap
import typingsJapgolly.openfin.transportMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/api/events/eventAggregator", JSImport.Namespace)
@js.native
object eventAggregatorMod extends js.Object {
  @js.native
  class EventAggregator () extends EmitterMap {
    def dispatchEvent(message: Message[_]): Boolean = js.native
  }
  
}

