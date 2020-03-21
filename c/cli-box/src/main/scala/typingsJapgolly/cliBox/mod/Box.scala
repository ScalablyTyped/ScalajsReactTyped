package typingsJapgolly.cliBox.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cliBox.AnonFullscreen
import typingsJapgolly.cliBox.AnonHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Box extends js.Object {
  var options: AnonFullscreen
  var settings: AnonHeight
  def stringify(): String
}

object Box {
  @scala.inline
  def apply(options: AnonFullscreen, settings: AnonHeight, stringify: CallbackTo[String]): Box = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.updateDynamic("stringify")(stringify.toJsFn)
    __obj.asInstanceOf[Box]
  }
}

