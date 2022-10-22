package typingsJapgolly.winjs.global.WinJS.UI

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enables the user to perform search queries and select suggestions.
  **/
@JSGlobal("WinJS.UI.SearchBox")
@js.native
//#region Constructors
/**
  * Creates a new SearchBox.
  * @constructor
  * @param element The DOM element hosts the new SearchBox.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events.
  **/
open class SearchBox ()
  extends StObject
     with typingsJapgolly.winjs.WinJS.UI.SearchBox {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: Any) = this()
  def this(element: Unit, options: Any) = this()
}
object SearchBox {
  
  @JSGlobal("WinJS.UI.SearchBox")
  @js.native
  val ^ : js.Any = js.native
  
  //#endregion Properties
  /* static member */
  inline def createResultSuggestionImage(url: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createResultSuggestionImage")(url.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSGlobal("WinJS.UI.SearchBox.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  inline def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
}
