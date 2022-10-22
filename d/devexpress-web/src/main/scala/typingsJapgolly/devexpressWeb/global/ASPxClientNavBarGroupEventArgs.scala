package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events which concern manipulations on groups.
  */
@JSGlobal("ASPxClientNavBarGroupEventArgs")
@js.native
open class ASPxClientNavBarGroupEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientNavBarGroupEventArgs {
  /**
    * Initializes a new object of the ASPxClientNavBarGroupEventArgs type with the specified value.
    * @param group An ASPxClientNavBarGroup object representing the group related to the event.
    */
  def this(group: typingsJapgolly.devexpressWeb.ASPxClientNavBarGroup) = this()
  
  /**
    * Gets the group object related to the event.
    */
  /* CompleteClass */
  var group: typingsJapgolly.devexpressWeb.ASPxClientNavBarGroup = js.native
}
