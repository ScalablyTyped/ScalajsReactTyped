package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the SelectionChanged event.
  */
@JSGlobal("ASPxClientDiagramSelectionChangedEventArgs")
@js.native
open class ASPxClientDiagramSelectionChangedEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientDiagramSelectionChangedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientDiagramSelectionChangedEventArgs class with specified settings.
    * @param items An array of item objects.
    */
  def this(items: js.Array[typingsJapgolly.devexpressWeb.DiagramItem]) = this()
  
  /**
    * Gets an array of the selected items (DiagramShape or DiagramConnector objects).
    */
  /* CompleteClass */
  var items: js.Array[typingsJapgolly.devexpressWeb.DiagramItem] = js.native
}
