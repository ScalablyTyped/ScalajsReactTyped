package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDockManager.AfterDock event.
  */
@JSGlobal("ASPxClientDockManagerProcessingModeEventArgs")
@js.native
open class ASPxClientDockManagerProcessingModeEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientDockManagerProcessingModeEventArgs {
  /**
    * Initializes a new object of the ASPxClientDockManagerProcessingModeEventArgs type with the specified settings.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    * @param panel An ASPxClientDockPanel object that is a panel related to the event.
    * @param zone An ASPxClientDockZone object that is a zone related to the event.
    */
  def this(
    processOnServer: Boolean,
    panel: typingsJapgolly.devexpressWeb.ASPxClientDockPanel,
    zone: typingsJapgolly.devexpressWeb.ASPxClientDockZone
  ) = this()
  
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
