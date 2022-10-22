package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events which concern manipulations on tabs.
  */
@JSGlobal("ASPxClientTabControlTabEventArgs")
@js.native
open class ASPxClientTabControlTabEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientTabControlTabEventArgs {
  /**
    * Initializes a new object of the ASPxClientTabControlTabEventArgs type with the specified value.
    * @param tab An ASPxClientTab object representing the tab related to the event.
    */
  def this(tab: typingsJapgolly.devexpressWeb.ASPxClientTab) = this()
  
  /**
    * Gets the tab object related to the event.
    */
  /* CompleteClass */
  var tab: typingsJapgolly.devexpressWeb.ASPxClientTab = js.native
}
