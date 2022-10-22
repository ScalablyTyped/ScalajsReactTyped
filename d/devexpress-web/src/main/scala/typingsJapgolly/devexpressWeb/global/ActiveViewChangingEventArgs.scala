package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the client-side ASPxClientScheduler.ActiveViewChanging event.
  */
@JSGlobal("ActiveViewChangingEventArgs")
@js.native
open class ActiveViewChangingEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ActiveViewChangingEventArgs {
  /**
    * Provides data for the client-side ActiveViewChanging event.
    * @param oldView Represents the new View used by the Scheduler to show its data.
    * @param newView Represents the previous View used by the Scheduler to show its data.
    */
  def this(
    oldView: typingsJapgolly.devexpressWeb.ASPxSchedulerViewType,
    newView: typingsJapgolly.devexpressWeb.ASPxSchedulerViewType
  ) = this()
  
  /**
    * Gets or sets whether the change of active view should be canceled.
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets the new value of the ASPxScheduler.ActiveView property.
    */
  /* CompleteClass */
  var newView: typingsJapgolly.devexpressWeb.ASPxSchedulerViewType = js.native
  
  /**
    * Gets the value of the ASPxScheduler.ActiveView property before modification.
    */
  /* CompleteClass */
  var oldView: typingsJapgolly.devexpressWeb.ASPxSchedulerViewType = js.native
}
