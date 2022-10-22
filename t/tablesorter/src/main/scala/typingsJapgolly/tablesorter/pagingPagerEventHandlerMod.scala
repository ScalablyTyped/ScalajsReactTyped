package typingsJapgolly.tablesorter

import typingsJapgolly.jquery.JQuery.TriggeredEvent
import typingsJapgolly.tablesorter.pagingPagerConfigurationStoreMod.PagerConfigurationStore
import typingsJapgolly.tablesorter.systemTablesorterConfigurationStoreMod.TablesorterConfigurationStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pagingPagerEventHandlerMod {
  
  type PagerEventHandler[TElement] = js.Function2[
    /* eventArgs */ TriggeredEvent[TElement, Null, TElement, TElement], 
    /* options */ TablesorterConfigurationStore[TElement] | PagerConfigurationStore[TElement], 
    Unit
  ]
}
