package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the RequestEditOperation event.
  */
@JSGlobal("ASPxClientDiagramRequestEditOperationEventArgs")
@js.native
open class ASPxClientDiagramRequestEditOperationEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientDiagramRequestEditOperationEventArgs {
  /**
    * Initializes a new instance of the ASPxClientDiagramRequestEditOperationEventArgs class with specified settings.
    * @param operation Identifies the operation currently being processed.
    * @param allowed Specifies whether the edit operation is allowed.
    * @param reason Identifies the reason why the event is raised.
    * @param args Contains information about the processed shape or connector.
    */
  def this(
    operation: typingsJapgolly.devexpressWeb.DiagramEditOperation,
    allowed: Boolean,
    reason: typingsJapgolly.devexpressWeb.DiagramRequestEditOperationReason,
    args: Any
  ) = this()
  
  /**
    * Specifies whether the edit operation is allowed.
    */
  /* CompleteClass */
  var allowed: Boolean = js.native
  
  /**
    * Contains information about the processed shape or connector.
    */
  /* CompleteClass */
  var args: Any = js.native
  
  /**
    * Identifies the operation currently being processed.
    */
  /* CompleteClass */
  var operation: typingsJapgolly.devexpressWeb.DiagramEditOperation = js.native
  
  /**
    * Identifies the reason why the event is raised.
    */
  /* CompleteClass */
  var reason: typingsJapgolly.devexpressWeb.DiagramRequestEditOperationReason = js.native
}
