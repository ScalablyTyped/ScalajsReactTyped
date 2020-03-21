package typingsJapgolly.wavesurferJs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.wavesurferJs.AnonXhr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaveSurferUtil extends js.Object {
  var Observer: typingsJapgolly.wavesurferJs.mod.Observer
  def ajax(options: AnonXhr): Observer
  def extend(dest: js.Object, sources: js.Object*): js.Object
  def frame(fn: js.Function1[/* repeated */ js.Any, Unit]): js.Function1[/* repeated */ js.Any, Double]
  def getId(): String
  def max(values: js.Array[Double]): Double
  def min(values: js.Array[Double]): Double
  def preventClick(): Unit
  def requestAnimationFrame(): js.Function1[/* fn */ js.Function1[/* t */ Double, Unit], Double]
  def style(el: HTMLElement, styles: StringDictionary[String]): HTMLElement
}

object WaveSurferUtil {
  @scala.inline
  def apply(
    Observer: Observer,
    ajax: AnonXhr => CallbackTo[Observer],
    extend: (js.Object, /* repeated */ js.Object) => CallbackTo[js.Object],
    frame: js.Function1[/* repeated */ js.Any, Unit] => CallbackTo[js.Function1[/* repeated */ js.Any, Double]],
    getId: CallbackTo[String],
    max: js.Array[Double] => CallbackTo[Double],
    min: js.Array[Double] => CallbackTo[Double],
    preventClick: Callback,
    requestAnimationFrame: CallbackTo[js.Function1[/* fn */ js.Function1[/* t */ Double, Unit], Double]],
    style: (HTMLElement, StringDictionary[String]) => CallbackTo[HTMLElement]
  ): WaveSurferUtil = {
    val __obj = js.Dynamic.literal(Observer = Observer.asInstanceOf[js.Any])
    __obj.updateDynamic("ajax")(js.Any.fromFunction1((t0: typingsJapgolly.wavesurferJs.AnonXhr) => ajax(t0).runNow()))
    __obj.updateDynamic("extend")(js.Any.fromFunction2((t0: js.Object, t1: /* repeated */ js.Object) => extend(t0, t1).runNow()))
    __obj.updateDynamic("frame")(js.Any.fromFunction1((t0: js.Function1[/* repeated */ js.Any, scala.Unit]) => frame(t0).runNow()))
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("max")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => max(t0).runNow()))
    __obj.updateDynamic("min")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => min(t0).runNow()))
    __obj.updateDynamic("preventClick")(preventClick.toJsFn)
    __obj.updateDynamic("requestAnimationFrame")(requestAnimationFrame.toJsFn)
    __obj.updateDynamic("style")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.HTMLElement, t1: org.scalablytyped.runtime.StringDictionary[java.lang.String]) => style(t0, t1).runNow()))
    __obj.asInstanceOf[WaveSurferUtil]
  }
}

