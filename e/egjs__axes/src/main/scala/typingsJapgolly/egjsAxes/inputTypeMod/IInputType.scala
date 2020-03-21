package typingsJapgolly.egjsAxes.inputTypeMod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInputType extends js.Object {
  var axes: js.Array[String]
  var disable: js.UndefOr[js.Function0[_]] = js.undefined
  var element: HTMLElement
  var enable: js.UndefOr[js.Function0[_]] = js.undefined
  var hammer: js.UndefOr[js.Any] = js.undefined
  var isEnable: js.UndefOr[js.Function0[Boolean]] = js.undefined
  def connect(observer: IInputTypeObserver): IInputType
  def destroy(): js.Any
  def disconnect(): js.Any
  def mapAxes(axes: js.Array[String]): js.Any
}

object IInputType {
  @scala.inline
  def apply(
    axes: js.Array[String],
    connect: IInputTypeObserver => CallbackTo[IInputType],
    destroy: CallbackTo[js.Any],
    disconnect: CallbackTo[js.Any],
    element: HTMLElement,
    mapAxes: js.Array[String] => CallbackTo[js.Any],
    disable: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    enable: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    hammer: js.Any = null,
    isEnable: js.UndefOr[CallbackTo[Boolean]] = js.undefined
  ): IInputType = {
    val __obj = js.Dynamic.literal(axes = axes.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    __obj.updateDynamic("connect")(js.Any.fromFunction1((t0: typingsJapgolly.egjsAxes.inputTypeMod.IInputTypeObserver) => connect(t0).runNow()))
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("disconnect")(disconnect.toJsFn)
    __obj.updateDynamic("mapAxes")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => mapAxes(t0).runNow()))
    disable.foreach(p => __obj.updateDynamic("disable")(p.toJsFn))
    enable.foreach(p => __obj.updateDynamic("enable")(p.toJsFn))
    if (hammer != null) __obj.updateDynamic("hammer")(hammer.asInstanceOf[js.Any])
    isEnable.foreach(p => __obj.updateDynamic("isEnable")(p.toJsFn))
    __obj.asInstanceOf[IInputType]
  }
}

