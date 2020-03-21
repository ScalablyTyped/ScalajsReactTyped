package typingsJapgolly.tablesorter

import typingsJapgolly.jquery.JQuery_.TriggeredEvent
import typingsJapgolly.tablesorter.tablesorterConfigurationStoreMod.TablesorterConfigurationStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tablesorter/System/ConfigEventHandler", JSImport.Namespace)
@js.native
object configEventHandlerMod extends js.Object {
  type ConfigEventHandler[TElement] = js.Function2[
    /* eventArgs */ TriggeredEvent[TElement, Null, TElement, TElement], 
    /* config */ TablesorterConfigurationStore[TElement], 
    Unit
  ]
}

