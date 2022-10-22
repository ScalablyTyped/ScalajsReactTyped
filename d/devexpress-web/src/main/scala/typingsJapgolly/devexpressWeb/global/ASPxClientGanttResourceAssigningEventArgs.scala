package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains data for the ResourceAssigning event.
  */
@JSGlobal("ASPxClientGanttResourceAssigningEventArgs")
@js.native
open class ASPxClientGanttResourceAssigningEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientGanttResourceAssigningEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGanttResourceAssigningEventArgs class with specified settings.
    * @param values The resource values.
    */
  def this(values: Any) = this()
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Specifies resource values.
    */
  /* CompleteClass */
  var values: Any = js.native
}
