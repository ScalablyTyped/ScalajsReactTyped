package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDockManager.BeforeDock event.
  */
@JSGlobal("ASPxClientDockManagerCancelEventArgs")
@js.native
open class ASPxClientDockManagerCancelEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientDockManagerCancelEventArgs {
  /**
    * For internal use only.
    */
  def this(panel: typingsJapgolly.devexpressWeb.ASPxClientDockPanel) = this()
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets the panel currently being processed.
    */
  /* CompleteClass */
  var panel: typingsJapgolly.devexpressWeb.ASPxClientDockPanel = js.native
}
