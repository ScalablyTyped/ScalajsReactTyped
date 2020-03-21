package typingsJapgolly.fullpageJs

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonToSections extends js.Object {
  /**
    * Extension of fullpage.js. Requires fullpage.js >= 2.8.5.
    * Turns horizontal slides into vertical sections.
    */
  def toSections(): Unit
  /**
    * Extension of fullpage.js. Requires fullpage.js >= 2.8.5.
    * Turns back the original slides (now converted into
    * vertical sections) into horizontal slides again.
    */
  def toSlides(): Unit
}

object AnonToSections {
  @scala.inline
  def apply(toSections: Callback, toSlides: Callback): AnonToSections = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toSections")(toSections.toJsFn)
    __obj.updateDynamic("toSlides")(toSlides.toJsFn)
    __obj.asInstanceOf[AnonToSections]
  }
}

