package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events related to manipulations on accordion groups.
  */
@JSGlobal("BootstrapClientAccordionGroupCancelEventArgs")
@js.native
open class BootstrapClientAccordionGroupCancelEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.BootstrapClientAccordionGroupCancelEventArgs {
  def this(processOnServer: Boolean, group: typingsJapgolly.devexpressWeb.BootstrapClientAccordionGroup) = this()
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets the group object related to the event.
    */
  /* CompleteClass */
  var group: typingsJapgolly.devexpressWeb.BootstrapClientAccordionGroup = js.native
  
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  var processOnServer: Boolean = js.native
}
