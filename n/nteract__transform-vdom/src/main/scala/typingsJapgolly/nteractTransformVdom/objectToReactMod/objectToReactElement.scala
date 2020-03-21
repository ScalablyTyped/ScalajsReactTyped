package typingsJapgolly.nteractTransformVdom.objectToReactMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.nteractTransformVdom.eventToObjectMod.SerializedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nteract/transform-vdom/lib/object-to-react", "objectToReactElement")
@js.native
object objectToReactElement extends js.Object {
  def apply(
    obj: VDOMEl,
    onVDOMEvent: js.Function2[/* targetName */ String, /* event */ SerializedEvent[_], Unit]
  ): Element = js.native
}

