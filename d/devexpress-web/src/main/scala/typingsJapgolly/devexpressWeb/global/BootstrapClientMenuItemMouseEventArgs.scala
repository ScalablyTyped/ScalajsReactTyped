package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for client events related to mouse hovering over menu items.
  */
@JSGlobal("BootstrapClientMenuItemMouseEventArgs")
@js.native
open class BootstrapClientMenuItemMouseEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.BootstrapClientMenuItemEventArgs {
  /**
    * Initializes a new BootstrapClientMenuItemMouseEventArgs object with the specified settings.
    * @param item An BootstrapClientMenuItem object that represents an item related to the event.
    * @param htmlElement An HTML object that contains the processed item.
    */
  def this(item: typingsJapgolly.devexpressWeb.BootstrapClientMenuItem, htmlElement: Any) = this()
  
  /**
    * Gets the menu item object related to the event.
    */
  /* CompleteClass */
  var item: typingsJapgolly.devexpressWeb.BootstrapClientMenuItem = js.native
}
