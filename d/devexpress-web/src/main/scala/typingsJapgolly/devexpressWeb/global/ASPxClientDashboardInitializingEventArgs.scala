package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDashboard.DashboardInitializing event.
  */
@JSGlobal("ASPxClientDashboardInitializingEventArgs")
@js.native
open class ASPxClientDashboardInitializingEventArgs ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientDashboardInitializingEventArgs {
  
  /**
    * Gets a model of the dashboard displayed in the control.
    */
  /* CompleteClass */
  var Dashboard: Any = js.native
  
  /**
    * Gets a string value that is the dashboard identifier.
    */
  /* CompleteClass */
  var DashboardId: String = js.native
  
  /**
    * Specifies a Promise object to observe when all actions of a certain type bound to the collection, queued or not, have finished.
    */
  /* CompleteClass */
  var Ready: Any = js.native
}
