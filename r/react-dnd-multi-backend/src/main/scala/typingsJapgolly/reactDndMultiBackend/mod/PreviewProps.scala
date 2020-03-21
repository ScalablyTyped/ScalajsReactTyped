package typingsJapgolly.reactDndMultiBackend.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviewProps extends js.Object {
  /**
    * Callback function to generate a preview object when dragging. This preview will only be used
    * with backends that have the 'preview' flag set to true.
    * @param type: the type of the item (monitor.getItemType())
    * @param item: the item being dragged (monitor.getItem())
    * @param style: an object representing the style to use for the item, it should be passed to
    *               your component's style property and is used for positioning.
    * @returns The JSX element to display for the drag preview.
    */
  def generator(`type`: String, item: js.Any, style: CSSProperties): Element
}

object PreviewProps {
  @scala.inline
  def apply(generator: (String, js.Any, CSSProperties) => CallbackTo[Element]): PreviewProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("generator")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Any, t2: typingsJapgolly.react.mod.CSSProperties) => generator(t0, t1, t2).runNow()))
    __obj.asInstanceOf[PreviewProps]
  }
}

