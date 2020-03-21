package typingsJapgolly.materializeCss.M

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for the Tabs
  */
trait TabsOptions extends js.Object {
  /**
    * Transition duration in milliseconds.
    * @default 300
    */
  var duration: Double
  /**
    * The maximum width of the screen, in pixels, where the swipeable functionality initializes.
    * @default infinity
    */
  var responsiveThreshold: Double
  /**
    * Set to true to enable swipeable tabs. This also uses the responsiveThreshold option
    * @default false
    */
  var swipeable: Boolean
  /**
    * Callback for when a new tab content is shown
    */
  def onShow(newContent: Element): Unit
}

object TabsOptions {
  @scala.inline
  def apply(duration: Double, onShow: Element => Callback, responsiveThreshold: Double, swipeable: Boolean): TabsOptions = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], responsiveThreshold = responsiveThreshold.asInstanceOf[js.Any], swipeable = swipeable.asInstanceOf[js.Any])
    __obj.updateDynamic("onShow")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Element) => onShow(t0).runNow()))
    __obj.asInstanceOf[TabsOptions]
  }
}

