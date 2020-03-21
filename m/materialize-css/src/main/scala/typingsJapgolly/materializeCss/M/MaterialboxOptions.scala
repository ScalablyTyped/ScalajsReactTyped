package typingsJapgolly.materializeCss.M

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaterialboxOptions extends js.Object {
  /**
    * Transition in duration in milliseconds
    * @default 275
    */
  var inDuration: Double
  /**
    * Transition out duration in milliseconds
    * @default 200
    */
  var outDuration: Double
  /**
    * Callback function called after materialbox is closed
    * @default null
    */
  def onCloseEnd(el: Element): Unit
  /**
    * Callback function called before materialbox is closed
    * @default null
    */
  def onCloseStart(el: Element): Unit
  /**
    * Callback function called after materialbox is opened
    * @default null
    */
  def onOpenEnd(el: Element): Unit
  /**
    * Callback function called before materialbox is opened
    * @default null
    */
  def onOpenStart(el: Element): Unit
}

object MaterialboxOptions {
  @scala.inline
  def apply(
    inDuration: Double,
    onCloseEnd: Element => Callback,
    onCloseStart: Element => Callback,
    onOpenEnd: Element => Callback,
    onOpenStart: Element => Callback,
    outDuration: Double
  ): MaterialboxOptions = {
    val __obj = js.Dynamic.literal(inDuration = inDuration.asInstanceOf[js.Any], outDuration = outDuration.asInstanceOf[js.Any])
    __obj.updateDynamic("onCloseEnd")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Element) => onCloseEnd(t0).runNow()))
    __obj.updateDynamic("onCloseStart")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Element) => onCloseStart(t0).runNow()))
    __obj.updateDynamic("onOpenEnd")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Element) => onOpenEnd(t0).runNow()))
    __obj.updateDynamic("onOpenStart")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Element) => onOpenStart(t0).runNow()))
    __obj.asInstanceOf[MaterialboxOptions]
  }
}

