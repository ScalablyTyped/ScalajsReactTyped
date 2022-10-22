package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientListEdit.SelectedIndexChanged event.
  */
@JSGlobal("ASPxClientListEditItemSelectedChangedEventArgs")
@js.native
open class ASPxClientListEditItemSelectedChangedEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientListEditItemSelectedChangedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientListEditItemSelectedChangedEventArgs class with the specified settings.
    * @param index An integer value that specifies the index of an item.
    * @param isSelected true if an item is selected; otherwise, false.
    */
  def this(index: Double, isSelected: Boolean) = this()
  
  /**
    * Gets the index of the item related to the event.
    */
  /* CompleteClass */
  var index: Double = js.native
  
  /**
    * Gets whether the item has been selected.
    */
  /* CompleteClass */
  var isSelected: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  var processOnServer: Boolean = js.native
}
