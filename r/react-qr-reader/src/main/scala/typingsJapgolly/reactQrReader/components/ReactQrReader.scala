package typingsJapgolly.reactQrReader.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLImageElement
import typingsJapgolly.reactQrReader.mod.^
import typingsJapgolly.reactQrReader.mod.props
import typingsJapgolly.reactQrReader.reactQrReaderBooleans.`false`
import typingsJapgolly.reactQrReader.reactQrReaderStrings.environment
import typingsJapgolly.reactQrReader.reactQrReaderStrings.user
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactQrReader {
  def apply(
    onError: js.Any => Callback,
    onScan: js.UndefOr[String] => Callback,
    className: String = null,
    delay: Double | `false` = null,
    facingMode: user | environment = null,
    legacyMode: js.UndefOr[Boolean] = js.undefined,
    onImageLoad: /* event */ ReactEventFrom[HTMLImageElement] => Callback = null,
    onLoad: js.UndefOr[Callback] = js.undefined,
    resolution: Int | Double = null,
    showViewFinder: js.UndefOr[Boolean] = js.undefined,
    style: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[props, ^, Unit, props] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: js.Any) => onError(t0).runNow()))
    __obj.updateDynamic("onScan")(js.Any.fromFunction1((t0: js.UndefOr[java.lang.String]) => onScan(t0).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (facingMode != null) __obj.updateDynamic("facingMode")(facingMode.asInstanceOf[js.Any])
    if (!js.isUndefined(legacyMode)) __obj.updateDynamic("legacyMode")(legacyMode.asInstanceOf[js.Any])
    if (onImageLoad != null) __obj.updateDynamic("onImageLoad")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onImageLoad(t0).runNow()))
    onLoad.foreach(p => __obj.updateDynamic("onLoad")(p.toJsFn))
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (!js.isUndefined(showViewFinder)) __obj.updateDynamic("showViewFinder")(showViewFinder.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactQrReader.mod.props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactQrReader.mod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactQrReader.mod.props])(children: _*)
  }
  @JSImport("react-qr-reader", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

