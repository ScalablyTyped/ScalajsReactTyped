package typingsJapgolly.reactHeadroom.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactHeadroom.mod.ReactHeadroomProps
import typingsJapgolly.reactHeadroom.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactHeadroom {
  def apply(
    calcHeightOnResize: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    disable: js.UndefOr[Boolean] = js.undefined,
    disableInlineStyles: js.UndefOr[Boolean] = js.undefined,
    downTolerance: Int | Double = null,
    onPin: js.UndefOr[Callback] = js.undefined,
    onUnfix: js.UndefOr[Callback] = js.undefined,
    onUnpin: js.UndefOr[Callback] = js.undefined,
    parent: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    pinStart: Int | Double = null,
    style: CSSProperties = null,
    upTolerance: Int | Double = null,
    wrapperStyle: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ReactHeadroomProps, default, Unit, ReactHeadroomProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(calcHeightOnResize)) __obj.updateDynamic("calcHeightOnResize")(calcHeightOnResize.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable.asInstanceOf[js.Any])
    if (!js.isUndefined(disableInlineStyles)) __obj.updateDynamic("disableInlineStyles")(disableInlineStyles.asInstanceOf[js.Any])
    if (downTolerance != null) __obj.updateDynamic("downTolerance")(downTolerance.asInstanceOf[js.Any])
    onPin.foreach(p => __obj.updateDynamic("onPin")(p.toJsFn))
    onUnfix.foreach(p => __obj.updateDynamic("onUnfix")(p.toJsFn))
    onUnpin.foreach(p => __obj.updateDynamic("onUnpin")(p.toJsFn))
    parent.foreach(p => __obj.updateDynamic("parent")(p.toJsFn))
    if (pinStart != null) __obj.updateDynamic("pinStart")(pinStart.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (upTolerance != null) __obj.updateDynamic("upTolerance")(upTolerance.asInstanceOf[js.Any])
    if (wrapperStyle != null) __obj.updateDynamic("wrapperStyle")(wrapperStyle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactHeadroom.mod.ReactHeadroomProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactHeadroom.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactHeadroom.mod.ReactHeadroomProps])(children: _*)
  }
  @JSImport("react-headroom", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

