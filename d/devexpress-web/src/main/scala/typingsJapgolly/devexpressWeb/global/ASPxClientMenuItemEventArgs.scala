package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events which concern manipulations on menu items.
  */
@JSGlobal("ASPxClientMenuItemEventArgs")
@js.native
open class ASPxClientMenuItemEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientMenuItemEventArgs {
  /**
    * Initializes a new object of the ASPxClientMenuItemEventArgs type with the specified value.
    * @param item An ASPxClientMenuItem object representing the group related to the event.
    */
  def this(item: typingsJapgolly.devexpressWeb.ASPxClientMenuItem) = this()
  
  /**
    * Gets the menu item object related to the event.
    */
  /* CompleteClass */
  var item: typingsJapgolly.devexpressWeb.ASPxClientMenuItem = js.native
}
