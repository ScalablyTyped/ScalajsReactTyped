package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events which concern clicking on the control's group headers.
  */
@JSGlobal("ASPxClientNavBarGroupClickEventArgs")
@js.native
open class ASPxClientNavBarGroupClickEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientNavBarGroupClickEventArgs {
  /**
    * Initializes a new object of the ASPxClientNavBarGroupClickEventArgs type with the specified settings.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    * @param group An ASPxClientNavBarGroup object that represents a group related to the event.
    * @param htmlElement An HTML object that contains the processed navbar group.
    * @param htmlEvent A DHTML event object that relates to the processed event.
    */
  def this(
    processOnServer: Boolean,
    group: typingsJapgolly.devexpressWeb.ASPxClientNavBarGroup,
    htmlElement: Any,
    htmlEvent: Any
  ) = this()
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets the group object related to the event.
    */
  /* CompleteClass */
  var group: typingsJapgolly.devexpressWeb.ASPxClientNavBarGroup = js.native
  
  /**
    * Gets the HTML object that contains the processed group.
    */
  /* CompleteClass */
  var htmlElement: Any = js.native
  
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  /* CompleteClass */
  var htmlEvent: Any = js.native
  
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  var processOnServer: Boolean = js.native
}
