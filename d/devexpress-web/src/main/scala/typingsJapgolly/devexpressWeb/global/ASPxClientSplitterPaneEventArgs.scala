package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A method that will handle the splitter's client events concerning manipulations with a pane.
  */
@JSGlobal("ASPxClientSplitterPaneEventArgs")
@js.native
open class ASPxClientSplitterPaneEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientSplitterPaneEventArgs {
  /**
    * Initializes a new instance of the ASPxClientSplitterPaneEventArgs class.
    * @param pane A ASPxClientSplitterPane object representing a splitter pane related to the generated event.
    */
  def this(pane: typingsJapgolly.devexpressWeb.ASPxClientSplitterPane) = this()
  
  /**
    * Gets the pane object related to the event.
    */
  /* CompleteClass */
  var pane: typingsJapgolly.devexpressWeb.ASPxClientSplitterPane = js.native
}
