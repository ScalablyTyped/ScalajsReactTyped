package typingsJapgolly.reactMic.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Blob
import typingsJapgolly.reactMic.mod.ReactMicProps
import typingsJapgolly.reactMic.mod.ReactMicStopEvent
import typingsJapgolly.reactMic.reactMicStrings.frequencyBars
import typingsJapgolly.reactMic.reactMicStrings.sinewave
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactMic {
  def apply(
    backgroundColor: String = null,
    className: String = null,
    onData: /* recordedData */ Blob => Callback = null,
    onStop: /* recordedData */ ReactMicStopEvent => Callback = null,
    pause: js.UndefOr[Boolean] = js.undefined,
    record: js.UndefOr[Boolean] = js.undefined,
    strokeColor: String = null,
    visualSetting: sinewave | frequencyBars = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ReactMicProps, typingsJapgolly.reactMic.mod.ReactMic, Unit, ReactMicProps] = {
    val __obj = js.Dynamic.literal()
  
      if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onData != null) __obj.updateDynamic("onData")(js.Any.fromFunction1((t0: /* recordedData */ org.scalajs.dom.raw.Blob) => onData(t0).runNow()))
    if (onStop != null) __obj.updateDynamic("onStop")(js.Any.fromFunction1((t0: /* recordedData */ typingsJapgolly.reactMic.mod.ReactMicStopEvent) => onStop(t0).runNow()))
    if (!js.isUndefined(pause)) __obj.updateDynamic("pause")(pause.asInstanceOf[js.Any])
    if (!js.isUndefined(record)) __obj.updateDynamic("record")(record.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (visualSetting != null) __obj.updateDynamic("visualSetting")(visualSetting.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactMic.mod.ReactMicProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactMic.mod.ReactMic](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactMic.mod.ReactMicProps])(children: _*)
  }
  @JSImport("react-mic", "ReactMic")
  @js.native
  object componentImport extends js.Object
  
}

