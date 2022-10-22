package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDockPanel.AfterFloat event.
  */
@JSGlobal("ASPxClientDockPanelProcessingModeEventArgs")
@js.native
open class ASPxClientDockPanelProcessingModeEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientDockPanelProcessingModeEventArgs {
  /**
    * For internal use only.
    */
  def this(processOnServer: Boolean, zone: typingsJapgolly.devexpressWeb.ASPxClientDockZone) = this()
  
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
