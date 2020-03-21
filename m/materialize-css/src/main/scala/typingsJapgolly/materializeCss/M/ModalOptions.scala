package typingsJapgolly.materializeCss.M

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for the Modal
  */
trait ModalOptions extends js.Object {
  /**
    * Allow modal to be dismissed by keyboard or overlay click.
    * @default true
    */
  var dismissible: Boolean
  /**
    * Ending top offset
    * @default '10%'
    */
  var endingTop: String
  /**
    * Transition in duration in milliseconds.
    * @default 250
    */
  var inDuration: Double
  /**
    * Opacity of the modal overlay.
    * @default 0.5
    */
  var opacity: Double
  /**
    * Transition out duration in milliseconds.
    * @default 250
    */
  var outDuration: Double
  /**
    * Prevent page from scrolling while modal is open
    * @default true
    */
  var preventScrolling: Boolean
  /**
    * Starting top offset
    * @default '4%'
    */
  var startingTop: String
  /**
    * Callback function called after modal is closed
    * @default null
    */
  def onCloseEnd(el: Element): Unit
  /**
    * Callback function called before modal is closed
    * @default null
    */
  def onCloseStart(el: Element): Unit
  /**
    * Callback function called after modal is opened
    * @default null
    */
  def onOpenEnd(el: Element): Unit
  /**
    * Callback function called before modal is opened
    * @default null
    */
  def onOpenStart(el: Element): Unit
}

object ModalOptions {
  @scala.inline
  def apply(
    dismissible: Boolean,
    endingTop: String,
    inDuration: Double,
    onCloseEnd: Element => Callback,
    onCloseStart: Element => Callback,
    onOpenEnd: Element => Callback,
    onOpenStart: Element => Callback,
    opacity: Double,
    outDuration: Double,
    preventScrolling: Boolean,
    startingTop: String
  ): ModalOptions = {
    val __obj = js.Dynamic.literal(dismissible = dismissible.asInstanceOf[js.Any], endingTop = endingTop.asInstanceOf[js.Any], inDuration = inDuration.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], outDuration = outDuration.asInstanceOf[js.Any], preventScrolling = preventScrolling.asInstanceOf[js.Any], startingTop = startingTop.asInstanceOf[js.Any])
    __obj.updateDynamic("onCloseEnd")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Element) => onCloseEnd(t0).runNow()))
    __obj.updateDynamic("onCloseStart")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Element) => onCloseStart(t0).runNow()))
    __obj.updateDynamic("onOpenEnd")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Element) => onOpenEnd(t0).runNow()))
    __obj.updateDynamic("onOpenStart")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Element) => onOpenStart(t0).runNow()))
    __obj.asInstanceOf[ModalOptions]
  }
}

