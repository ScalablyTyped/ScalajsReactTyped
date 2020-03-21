package typingsJapgolly.reactRange.typesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.raw.React.RefHandle
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITrackProps extends js.Object {
  var ref: RefHandle[_]
  var style: CSSProperties
  def onMouseDown(e: ReactMouseEventFrom[Element]): Unit
  def onTouchStart(e: ReactTouchEventFrom[Element]): Unit
}

object ITrackProps {
  @scala.inline
  def apply(
    onMouseDown: ReactMouseEventFrom[Element] => Callback,
    onTouchStart: ReactTouchEventFrom[Element] => Callback,
    ref: RefHandle[_],
    style: CSSProperties
  ): ITrackProps = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onMouseDown(t0).runNow()))
    __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.Element]) => onTouchStart(t0).runNow()))
    __obj.asInstanceOf[ITrackProps]
  }
}

