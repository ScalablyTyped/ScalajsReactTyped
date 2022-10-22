package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ItemClick and ItemDblClick events.
  */
@JSGlobal("ASPxClientDiagramItemClickEventArgs")
@js.native
open class ASPxClientDiagramItemClickEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientDiagramItemClickEventArgs {
  /**
    * Initializes a new instance of the ASPxClientDiagramItemClickEventArgs class with specified settings.
    * @param item An item object related to the event.
    */
  def this(item: typingsJapgolly.devexpressWeb.DiagramItem) = this()
  
  /**
    * Gets an object that provides information about an item (DiagramShape or DiagramConnector) related to the event.
    */
  /* CompleteClass */
  var item: typingsJapgolly.devexpressWeb.DiagramItem = js.native
}
