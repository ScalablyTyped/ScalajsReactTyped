package typingsJapgolly.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientHint.Showing event.
  */
@JSGlobal("ASPxClientHintShowingEventArgs")
@js.native
class ASPxClientHintShowingEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientHintShowingEventArgs class with specified settings.
    * @param targetElement An object that is the target element of the hint.
    * @param hintElement An object that is the hint element.
    * @param contentElement An object that is the hint's content element.
    * @param titleElement An object that is the hint's title element.
    * @param cancel true, if the action that raised the event should be canceled; otherwise, false.
    */
  def this(
    targetElement: js.Any,
    hintElement: js.Any,
    contentElement: js.Any,
    titleElement: js.Any,
    cancel: Boolean
  ) = this()
  /**
    * Gets or sets a value indicating whether the event should be canceled.
    */
  var cancel: Boolean = js.native
  /**
    * Gets the object that is the hint's content.
    */
  var contentElement: js.Any = js.native
  /**
    * Gets the object that is the hint.
    */
  var hintElement: js.Any = js.native
  /**
    * Gets the object that is the hint's target element.
    */
  var targetElement: js.Any = js.native
  /**
    * Gets the object that is the hint's title.
    */
  var titleElement: js.Any = js.native
}

