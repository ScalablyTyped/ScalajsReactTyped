package typingsJapgolly.reactResizeDetector.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.reactResizeDetector.AnonLeading
import typingsJapgolly.reactResizeDetector.mod.ReactResizeDetectorDimensions
import typingsJapgolly.reactResizeDetector.mod.ReactResizeDetectorProps
import typingsJapgolly.reactResizeDetector.mod.default
import typingsJapgolly.reactResizeDetector.reactResizeDetectorStrings.debounce
import typingsJapgolly.reactResizeDetector.reactResizeDetectorStrings.throttle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactResizeDetector {
  def apply(
    handleHeight: js.UndefOr[Boolean] = js.undefined,
    handleWidth: js.UndefOr[Boolean] = js.undefined,
    nodeType: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any = null,
    onResize: (/* width */ Double, /* height */ Double) => Callback = null,
    querySelector: String = null,
    refreshMode: throttle | debounce = null,
    refreshOptions: AnonLeading = null,
    refreshRate: Int | Double = null,
    render: /* props */ ReactResizeDetectorDimensions => CallbackTo[Node] = null,
    skipOnMount: js.UndefOr[Boolean] = js.undefined,
    targetDomEl: HTMLElement = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ReactResizeDetectorProps, default, Unit, ReactResizeDetectorProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(handleHeight)) __obj.updateDynamic("handleHeight")(handleHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(handleWidth)) __obj.updateDynamic("handleWidth")(handleWidth.asInstanceOf[js.Any])
    if (nodeType != null) __obj.updateDynamic("nodeType")(nodeType.asInstanceOf[js.Any])
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction2((t0: /* width */ scala.Double, t1: /* height */ scala.Double) => onResize(t0, t1).runNow()))
    if (querySelector != null) __obj.updateDynamic("querySelector")(querySelector.asInstanceOf[js.Any])
    if (refreshMode != null) __obj.updateDynamic("refreshMode")(refreshMode.asInstanceOf[js.Any])
    if (refreshOptions != null) __obj.updateDynamic("refreshOptions")(refreshOptions.asInstanceOf[js.Any])
    if (refreshRate != null) __obj.updateDynamic("refreshRate")(refreshRate.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactResizeDetector.mod.ReactResizeDetectorDimensions) => render(t0).runNow()))
    if (!js.isUndefined(skipOnMount)) __obj.updateDynamic("skipOnMount")(skipOnMount.asInstanceOf[js.Any])
    if (targetDomEl != null) __obj.updateDynamic("targetDomEl")(targetDomEl.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactResizeDetector.mod.ReactResizeDetectorProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactResizeDetector.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactResizeDetector.mod.ReactResizeDetectorProps])(children: _*)
  }
  @JSImport("react-resize-detector", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

