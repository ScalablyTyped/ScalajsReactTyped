package typingsJapgolly.tablesorter

import typingsJapgolly.jquery.JQuery_.TriggeredEvent
import typingsJapgolly.tablesorter.pagerConfigurationStoreMod.PagerConfigurationStore
import typingsJapgolly.tablesorter.tablesorterConfigurationStoreMod.TablesorterConfigurationStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tablesorter/Paging/PagerEventHandler", JSImport.Namespace)
@js.native
object pagerEventHandlerMod extends js.Object {
  type PagerEventHandler[TElement] = js.Function2[
    /* eventArgs */ TriggeredEvent[TElement, Null, TElement, TElement], 
    /* options */ TablesorterConfigurationStore[TElement] | PagerConfigurationStore[TElement], 
    Unit
  ]
}

