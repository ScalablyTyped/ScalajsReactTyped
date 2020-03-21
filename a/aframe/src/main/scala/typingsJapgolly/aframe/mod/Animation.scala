package typingsJapgolly.aframe.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.aframe.aframeStrings.alternate
import typingsJapgolly.aframe.aframeStrings.alternateReverse
import typingsJapgolly.aframe.aframeStrings.backwards
import typingsJapgolly.aframe.aframeStrings.both
import typingsJapgolly.aframe.aframeStrings.forwards
import typingsJapgolly.aframe.aframeStrings.indefinite
import typingsJapgolly.aframe.aframeStrings.none
import typingsJapgolly.aframe.aframeStrings.normal
import typingsJapgolly.aframe.aframeStrings.reverse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animation extends js.Object {
  var attribute: String
  var begin: String | Double
  var delay: Double
  var direction: alternate | alternateReverse | normal | reverse
  var dur: Double
  var end: String
  var fill: backwards | both | forwards | none
  var from: js.Any
   // TODO type
  var repeat: Double | indefinite
  var to: Double
  def easing(): Unit
}

object Animation {
  @scala.inline
  def apply(
    attribute: String,
    begin: String | Double,
    delay: Double,
    direction: alternate | alternateReverse | normal | reverse,
    dur: Double,
    easing: Callback,
    end: String,
    fill: backwards | both | forwards | none,
    from: js.Any,
    repeat: Double | indefinite,
    to: Double
  ): Animation = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], begin = begin.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], dur = dur.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], repeat = repeat.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.updateDynamic("easing")(easing.toJsFn)
    __obj.asInstanceOf[Animation]
  }
}

