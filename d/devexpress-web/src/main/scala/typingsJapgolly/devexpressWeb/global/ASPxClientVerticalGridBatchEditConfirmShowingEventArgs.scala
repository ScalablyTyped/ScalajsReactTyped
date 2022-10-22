package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientVerticalGrid.BatchEditConfirmShowing event.
  */
@JSGlobal("ASPxClientVerticalGridBatchEditConfirmShowingEventArgs")
@js.native
open class ASPxClientVerticalGridBatchEditConfirmShowingEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientVerticalGridBatchEditConfirmShowingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientVerticalGridBatchEditConfirmShowingEventArgs class.
    * @param requestTriggerID A string value specifying the client identifier of an object that initiates a request.
    */
  def this(requestTriggerID: String) = this()
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets the client identifier of an object that initiates a send request.
    */
  /* CompleteClass */
  var requestTriggerID: String = js.native
}
