package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events which concern manipulations on items.
  */
@JSGlobal("ASPxClientNavBarItemEventArgs")
@js.native
open class ASPxClientNavBarItemEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientNavBarItemEventArgs {
  /**
    * Initializes a new object of the ASPxClientNavBarItemEventArgs type with the specified settings.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    * @param item An ASPxClientNavBarItem object that represents an item related to the event.
    * @param htmlElement An HTML object that contains the processed navbar item.
    * @param htmlEvent A DHTML event object that relates to the processed event.
    */
  def this(
    processOnServer: Boolean,
    item: typingsJapgolly.devexpressWeb.ASPxClientNavBarItem,
    htmlElement: Any,
    htmlEvent: Any
  ) = this()
  
  /**
    * Gets the HTML object that contains the processed navbar item.
    */
  /* CompleteClass */
  var htmlElement: Any = js.native
  
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  /* CompleteClass */
  var htmlEvent: Any = js.native
  
  /**
    * Gets the item object related to the event.
    */
  /* CompleteClass */
  var item: typingsJapgolly.devexpressWeb.ASPxClientNavBarItem = js.native
  
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  var processOnServer: Boolean = js.native
}
