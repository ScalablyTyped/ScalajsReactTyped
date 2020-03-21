package typingsJapgolly.reactNative.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Component
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeMethodsMixinStatic extends js.Object {
  var refs: StringDictionary[Component[js.Object, js.Object]]
  /**
    * Removes focus from an input or view. This is the opposite of `focus()`.
    */
  def blur(): Unit
  /**
    * Requests focus for the given input or view. The exact behavior triggered
    * will depend on the platform and type of view.
    */
  def focus(): Unit
  /**
    * Determines the location on screen, width, and height of the given view and
    * returns the values via an async callback. If successful, the callback will
    * be called with the following arguments:
    *
    *  - x
    *  - y
    *  - width
    *  - height
    *  - pageX
    *  - pageY
    *
    * Note that these measurements are not available until after the rendering
    * has been completed in native. If you need the measurements as soon as
    * possible, consider using the [`onLayout`
    * prop](docs/view.html#onlayout) instead.
    */
  def measure(callback: MeasureOnSuccessCallback): Unit
  /**
    * Determines the location of the given view in the window and returns the
    * values via an async callback. If the React root view is embedded in
    * another native view, this will give you the absolute coordinates. If
    * successful, the callback will be called with the following
    * arguments:
    *
    *  - x
    *  - y
    *  - width
    *  - height
    *
    * Note that these measurements are not available until after the rendering
    * has been completed in native.
    */
  def measureInWindow(callback: MeasureInWindowOnSuccessCallback): Unit
  /**
    * Like [`measure()`](#measure), but measures the view relative an ancestor,
    * specified as `relativeToNativeNode`. This means that the returned x, y
    * are relative to the origin x, y of the ancestor view.
    *
    * As always, to obtain a native node handle for a component, you can use
    * `React.findNodeHandle(component)`.
    */
  def measureLayout(
    relativeToNativeNode: Double,
    onSuccess: MeasureLayoutOnSuccessCallback,
    onFail: js.Function0[Unit]
  ): Unit
  /**
    * This function sends props straight to native. They will not participate in
    * future diff process - this means that if you do not include them in the
    * next render, they will remain active (see [Direct
    * Manipulation](docs/direct-manipulation.html)).
    */
  def setNativeProps(nativeProps: js.Object): Unit
}

object NativeMethodsMixinStatic {
  @scala.inline
  def apply(
    blur: Callback,
    focus: Callback,
    measure: MeasureOnSuccessCallback => Callback,
    measureInWindow: MeasureInWindowOnSuccessCallback => Callback,
    measureLayout: (Double, MeasureLayoutOnSuccessCallback, js.Function0[Unit]) => Callback,
    refs: StringDictionary[Component[js.Object, js.Object]],
    setNativeProps: js.Object => Callback
  ): NativeMethodsMixinStatic = {
    val __obj = js.Dynamic.literal(refs = refs.asInstanceOf[js.Any])
    __obj.updateDynamic("blur")(blur.toJsFn)
    __obj.updateDynamic("focus")(focus.toJsFn)
    __obj.updateDynamic("measure")(js.Any.fromFunction1((t0: typingsJapgolly.reactNative.mod.MeasureOnSuccessCallback) => measure(t0).runNow()))
    __obj.updateDynamic("measureInWindow")(js.Any.fromFunction1((t0: typingsJapgolly.reactNative.mod.MeasureInWindowOnSuccessCallback) => measureInWindow(t0).runNow()))
    __obj.updateDynamic("measureLayout")(js.Any.fromFunction3((t0: scala.Double, t1: typingsJapgolly.reactNative.mod.MeasureLayoutOnSuccessCallback, t2: js.Function0[scala.Unit]) => measureLayout(t0, t1, t2).runNow()))
    __obj.updateDynamic("setNativeProps")(js.Any.fromFunction1((t0: js.Object) => setNativeProps(t0).runNow()))
    __obj.asInstanceOf[NativeMethodsMixinStatic]
  }
}

