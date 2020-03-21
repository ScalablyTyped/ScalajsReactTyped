package typingsJapgolly.nteractTransformVdom.mod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.nteractTransformVdom.eventToObjectMod.SerializedEvent
import typingsJapgolly.nteractTransformVdom.objectToReactMod.VDOMEl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nteract/transform-vdom", "objectToReactElement")
@js.native
object objectToReactElement extends js.Object {
  def apply(
    obj: VDOMEl,
    onVDOMEvent: js.Function2[/* targetName */ String, /* event */ SerializedEvent[_], Unit]
  ): Element = js.native
}

