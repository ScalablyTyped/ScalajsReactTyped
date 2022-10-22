package typingsJapgolly.winjs.mod.UI

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enables you to include an HTML page dynamically. As part of the constructor, you must include an option indicating the URI of the page.
  **/
@JSImport("winjs", "UI.HtmlControl")
@js.native
//#region Constructors
/**
  * Initializes a new instance of HtmlControl to define a new page control.
  * @constructor
  * @param element The element that hosts the HtmlControl.
  * @param options The options for configuring the page. The uri option is required in order to specify the source document for the content of the page. Other options are the ones used by the WinJS.Pages.render method.
  **/
open class HtmlControl ()
  extends StObject
     with typingsJapgolly.winjs.WinJS.UI.HtmlControl {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: Any) = this()
  def this(element: Unit, options: Any) = this()
}
object HtmlControl {
  
  @JSImport("winjs", "UI.HtmlControl")
  @js.native
  val ^ : js.Any = js.native
  
  //#endregion Constructors
  //#region Properties
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSImport("winjs", "UI.HtmlControl.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  inline def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
}
