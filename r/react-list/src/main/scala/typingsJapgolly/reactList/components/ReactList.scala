package typingsJapgolly.reactList.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactList.mod.ReactListProps
import typingsJapgolly.reactList.mod.^
import typingsJapgolly.reactList.reactListStrings.x
import typingsJapgolly.reactList.reactListStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactList {
  def apply(
    axis: x | y = null,
    initialIndex: Int | Double = null,
    itemRenderer: (/* index */ Double, /* key */ Double | String) => CallbackTo[Element] = null,
    itemSizeEstimator: (/* index */ Double, /* cache */ js.Object) => CallbackTo[Double] = null,
    itemSizeGetter: /* index */ Double => CallbackTo[Double] = null,
    itemsRenderer: (/* items */ js.Array[Element], /* ref */ String) => CallbackTo[Element] = null,
    length: Int | Double = null,
    minSize: Int | Double = null,
    pageSize: Int | Double = null,
    scrollParentGetter: js.UndefOr[CallbackTo[Element]] = js.undefined,
    threshold: Int | Double = null,
    `type`: String = null,
    useStaticSize: js.UndefOr[Boolean] = js.undefined,
    useTranslate3d: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ReactListProps, ^, Unit, ReactListProps] = {
    val __obj = js.Dynamic.literal()
  
      if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (initialIndex != null) __obj.updateDynamic("initialIndex")(initialIndex.asInstanceOf[js.Any])
    if (itemRenderer != null) __obj.updateDynamic("itemRenderer")(js.Any.fromFunction2((t0: /* index */ scala.Double, t1: /* key */ scala.Double | java.lang.String) => itemRenderer(t0, t1).runNow()))
    if (itemSizeEstimator != null) __obj.updateDynamic("itemSizeEstimator")(js.Any.fromFunction2((t0: /* index */ scala.Double, t1: /* cache */ js.Object) => itemSizeEstimator(t0, t1).runNow()))
    if (itemSizeGetter != null) __obj.updateDynamic("itemSizeGetter")(js.Any.fromFunction1((t0: /* index */ scala.Double) => itemSizeGetter(t0).runNow()))
    if (itemsRenderer != null) __obj.updateDynamic("itemsRenderer")(js.Any.fromFunction2((t0: /* items */ js.Array[japgolly.scalajs.react.raw.React.Element], t1: /* ref */ java.lang.String) => itemsRenderer(t0, t1).runNow()))
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    scrollParentGetter.foreach(p => __obj.updateDynamic("scrollParentGetter")(p.toJsFn))
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(useStaticSize)) __obj.updateDynamic("useStaticSize")(useStaticSize.asInstanceOf[js.Any])
    if (!js.isUndefined(useTranslate3d)) __obj.updateDynamic("useTranslate3d")(useTranslate3d.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactList.mod.ReactListProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactList.mod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactList.mod.ReactListProps])(children: _*)
  }
  @JSImport("react-list", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

