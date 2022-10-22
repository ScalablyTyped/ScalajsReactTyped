package typingsJapgolly.tablesorter

import typingsJapgolly.jquery.JQuery.TriggeredEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemTablesorterEventHandlerMod {
  
  type TablesorterEventHandler[TElement] = js.Function2[
    /* eventArgs */ TriggeredEvent[TElement, Null, TElement, TElement], 
    /* table */ TElement, 
    Unit
  ]
}
