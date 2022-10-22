package typingsJapgolly.devexpressWeb.global

import typingsJapgolly.jquery.JQueryDeferred
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientReportDesigner.ReportTabClosing event.
  */
@JSGlobal("ASPxClientReportDesignerTabClosingEventArgs")
@js.native
open class ASPxClientReportDesignerTabClosingEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientReportDesignerTabClosingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientReportDesignerTabClosingEventArgs class with the specified settings.
    * @param tab An object that specifies the report tab. This value is assigned to the ASPxClientReportDesignerTabEventArgs.Tab property.
    * @param readyToClose A JQuery Deferred object, which when resolved, forces the report tab to be closed. This value is assigned to the ASPxClientReportDesignerTabClosingEventArgs.ReadyToClose property.
    */
  def this(tab: typingsJapgolly.devexpressWeb.ASPxDesignerNavigateTab, readyToClose: JQueryDeferred[Any]) = this()
  
  /**
    * Specifies whether or not the event was handled.
    */
  /* CompleteClass */
  var Handled: Boolean = js.native
  
  /**
    * Specifies the JQuery Deferred object, which when resolved, forces the report tab to be closed.
    */
  /* CompleteClass */
  var ReadyToClose: JQueryDeferred[Any] = js.native
  
  /**
    * Specifies the report tab currently being processed.
    */
  /* CompleteClass */
  var Tab: typingsJapgolly.devexpressWeb.ASPxDesignerNavigateTab = js.native
}
