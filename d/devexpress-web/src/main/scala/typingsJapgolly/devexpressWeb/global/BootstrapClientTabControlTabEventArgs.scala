package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events related to manipulations on tabs.
  */
@JSGlobal("BootstrapClientTabControlTabEventArgs")
@js.native
open class BootstrapClientTabControlTabEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.BootstrapClientTabControlTabEventArgs {
  /**
    * Initializes a new object of the BootstrapClientTabControlTabEventArgs type with the specified value.
    * @param tab An BootstrapClientTab object representing the tab related to the event.
    */
  def this(tab: typingsJapgolly.devexpressWeb.BootstrapClientTab) = this()
  
  /**
    * Gets the tab object related to the event.
    */
  /* CompleteClass */
  var tab: typingsJapgolly.devexpressWeb.BootstrapClientTab = js.native
}
