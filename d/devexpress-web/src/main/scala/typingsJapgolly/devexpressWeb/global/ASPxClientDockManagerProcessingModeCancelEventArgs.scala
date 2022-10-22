package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDockManager.BeforeDock event.
  */
@JSGlobal("ASPxClientDockManagerProcessingModeCancelEventArgs")
@js.native
open class ASPxClientDockManagerProcessingModeCancelEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientDockManagerProcessingModeCancelEventArgs {
  /**
    * For internal use only.
    */
  def this(
    processOnServer: Boolean,
    panel: typingsJapgolly.devexpressWeb.ASPxClientDockPanel,
    zone: typingsJapgolly.devexpressWeb.ASPxClientDockZone
  ) = this()
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets the panel currently being processed.
    */
  /* CompleteClass */
  var panel: typingsJapgolly.devexpressWeb.ASPxClientDockPanel = js.native
  
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  var processOnServer: Boolean = js.native
  
  /**
    * Gets the zone currently being processed.
    */
  /* CompleteClass */
  var zone: typingsJapgolly.devexpressWeb.ASPxClientDockZone = js.native
}
