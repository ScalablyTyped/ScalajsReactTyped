package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events related to manipulations on menu items.
  */
@JSGlobal("BootstrapClientMenuItemEventArgs")
@js.native
open class BootstrapClientMenuItemEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.BootstrapClientMenuItemEventArgs {
  /**
    * Initializes a new object of the BootstrapClientMenuItemEventArgs type with the specified value.
    * @param item An BootstrapClientMenuItem object representing the group related to the event.
    */
  def this(item: typingsJapgolly.devexpressWeb.BootstrapClientMenuItem) = this()
  
  /**
    * Gets the menu item object related to the event.
    */
  /* CompleteClass */
  var item: typingsJapgolly.devexpressWeb.BootstrapClientMenuItem = js.native
}
