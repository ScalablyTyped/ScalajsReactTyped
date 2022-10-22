package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientVerticalGrid.RowExpandedChanged event.
  */
@JSGlobal("ASPxClientVerticalGridRowExpandedEventArgs")
@js.native
open class ASPxClientVerticalGridRowExpandedEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientVerticalGridRowExpandedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientVerticalGridRowExpandedEventArgs class with specified settings.
    * @param row A ASPxClientVerticalGridRow object that uniquely identifies the expanded row. This value is assigned to the ASPxClientVerticalGridRowExpandedEventArgs.row property.
    */
  def this(row: typingsJapgolly.devexpressWeb.ASPxClientVerticalGridRow) = this()
  
  /**
    * Gets the expanded row.
    */
  /* CompleteClass */
  var row: typingsJapgolly.devexpressWeb.ASPxClientVerticalGridRow = js.native
}
