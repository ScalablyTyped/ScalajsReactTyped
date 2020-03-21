package typingsJapgolly.winjs.mod.UI

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.winjs.AnonComplete
import typingsJapgolly.winjs.AnonContentTransition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a hub navigation pattern consisting of sections that can be navigated to. Each section is defined by a HubSection object.
  **/
@JSImport("winjs", "UI.Hub")
@js.native
//#region Constructors
/**
  * Creates a new Hub control.
  * @constructor
  * @param element The DOM element that will host the Hub control.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events. Event names must begin with "on". For example, to provide a handler for the contentanimating event, add a property named "oncontentanimating" to the options object and set its value to the event handler.
  **/
class Hub ()
  extends typingsJapgolly.winjs.WinJS.UI.Hub {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}

/* static members */
@JSImport("winjs", "UI.Hub")
@js.native
object Hub extends js.Object {
  /**
    * Specifies whether the Hub animation is an entrance animation or a transition animation.
    **/
  var AnimationType: AnonContentTransition = js.native
  /**
    * Gets the current loading state of the Hub.
    **/
  var LoadingState: AnonComplete = js.native
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
}

