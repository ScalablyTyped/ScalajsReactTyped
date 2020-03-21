package typingsJapgolly.reactCustomScrollbars.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactUIEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.reactCustomScrollbars.mod.ScrollbarProps
import typingsJapgolly.reactCustomScrollbars.mod.positionValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_ScrollbarProps_930384149[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[typingsJapgolly.reactCustomScrollbars.mod.Scrollbars] = null,
    ClassAttributes: ClassAttributes[typingsJapgolly.reactCustomScrollbars.mod.Scrollbars] = null,
    autoHeight: js.UndefOr[Boolean] = js.undefined,
    autoHeightMax: Double | String = null,
    autoHeightMin: Double | String = null,
    autoHide: js.UndefOr[Boolean] = js.undefined,
    autoHideDuration: Int | Double = null,
    autoHideTimeout: Int | Double = null,
    hideTracksWhenNotNeeded: js.UndefOr[Boolean] = js.undefined,
    onScroll: ReactUIEventFrom[Element] => Callback = null,
    onScrollFrame: /* values */ positionValues => Callback = null,
    onScrollStart: js.UndefOr[Callback] = js.undefined,
    onScrollStop: js.UndefOr[Callback] = js.undefined,
    onUpdate: /* values */ positionValues => Callback = null,
    renderThumbHorizontal: StatelessComponent[_] = null,
    renderThumbVertical: StatelessComponent[_] = null,
    renderTrackHorizontal: StatelessComponent[_] = null,
    renderTrackVertical: StatelessComponent[_] = null,
    renderView: StatelessComponent[_] = null,
    tagName: String = null,
    thumbMinSize: Int | Double = null,
    thumbSize: Int | Double = null,
    universal: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ScrollbarProps, ComponentRef, Unit, ScrollbarProps] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight.asInstanceOf[js.Any])
    if (autoHeightMax != null) __obj.updateDynamic("autoHeightMax")(autoHeightMax.asInstanceOf[js.Any])
    if (autoHeightMin != null) __obj.updateDynamic("autoHeightMin")(autoHeightMin.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHide)) __obj.updateDynamic("autoHide")(autoHide.asInstanceOf[js.Any])
    if (autoHideDuration != null) __obj.updateDynamic("autoHideDuration")(autoHideDuration.asInstanceOf[js.Any])
    if (autoHideTimeout != null) __obj.updateDynamic("autoHideTimeout")(autoHideTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(hideTracksWhenNotNeeded)) __obj.updateDynamic("hideTracksWhenNotNeeded")(hideTracksWhenNotNeeded.asInstanceOf[js.Any])
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactUIEventFrom[org.scalajs.dom.raw.Element]) => onScroll(t0).runNow()))
    if (onScrollFrame != null) __obj.updateDynamic("onScrollFrame")(js.Any.fromFunction1((t0: /* values */ typingsJapgolly.reactCustomScrollbars.mod.positionValues) => onScrollFrame(t0).runNow()))
    onScrollStart.foreach(p => __obj.updateDynamic("onScrollStart")(p.toJsFn))
    onScrollStop.foreach(p => __obj.updateDynamic("onScrollStop")(p.toJsFn))
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction1((t0: /* values */ typingsJapgolly.reactCustomScrollbars.mod.positionValues) => onUpdate(t0).runNow()))
    if (renderThumbHorizontal != null) __obj.updateDynamic("renderThumbHorizontal")(renderThumbHorizontal.asInstanceOf[js.Any])
    if (renderThumbVertical != null) __obj.updateDynamic("renderThumbVertical")(renderThumbVertical.asInstanceOf[js.Any])
    if (renderTrackHorizontal != null) __obj.updateDynamic("renderTrackHorizontal")(renderTrackHorizontal.asInstanceOf[js.Any])
    if (renderTrackVertical != null) __obj.updateDynamic("renderTrackVertical")(renderTrackVertical.asInstanceOf[js.Any])
    if (renderView != null) __obj.updateDynamic("renderView")(renderView.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    if (thumbMinSize != null) __obj.updateDynamic("thumbMinSize")(thumbMinSize.asInstanceOf[js.Any])
    if (thumbSize != null) __obj.updateDynamic("thumbSize")(thumbSize.asInstanceOf[js.Any])
    if (!js.isUndefined(universal)) __obj.updateDynamic("universal")(universal.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactCustomScrollbars.mod.ScrollbarProps, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactCustomScrollbars.mod.ScrollbarProps])(children: _*)
  }
}

