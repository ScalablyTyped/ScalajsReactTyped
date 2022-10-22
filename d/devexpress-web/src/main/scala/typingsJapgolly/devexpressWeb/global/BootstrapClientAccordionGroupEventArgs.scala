package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events related to manipulations on groups.
  */
@JSGlobal("BootstrapClientAccordionGroupEventArgs")
@js.native
open class BootstrapClientAccordionGroupEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.BootstrapClientAccordionGroupEventArgs {
  /**
    * Initializes a new object of the BootstrapClientAccordionGroupEventArgs type with the specified value.
    * @param group An BootstrapAccordionGroup object representing the group related to the event.
    */
  def this(group: typingsJapgolly.devexpressWeb.BootstrapClientAccordionGroup) = this()
  
  /**
    * Gets the group object related to the event.
    */
  /* CompleteClass */
  var group: typingsJapgolly.devexpressWeb.BootstrapClientAccordionGroup = js.native
}
