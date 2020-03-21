package typingsJapgolly.cypress.cypressMod.Cypress

import typingsJapgolly.cypress.cypressStrings.linear
import typingsJapgolly.cypress.cypressStrings.swing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollToOptions
  extends Loggable
     with Timeoutable {
  /**
    * Scrolls over the duration (in ms)
    *
    * @default 0
    */
  var duration: Double
  /**
    * Will scroll with the easing animation
    *
    * @default 'swing'
    */
  var easing: swing | linear
}

object ScrollToOptions {
  @scala.inline
  def apply(duration: Double, easing: swing | linear, log: Boolean, timeout: Double): ScrollToOptions = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ScrollToOptions]
  }
}

