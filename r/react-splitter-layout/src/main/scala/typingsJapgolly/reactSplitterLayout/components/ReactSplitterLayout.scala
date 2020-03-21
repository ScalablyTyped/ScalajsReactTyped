package typingsJapgolly.reactSplitterLayout.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactSplitterLayout.mod.SplitterLayoutProps
import typingsJapgolly.reactSplitterLayout.mod.TPrimaryIndex
import typingsJapgolly.reactSplitterLayout.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactSplitterLayout {
  def apply(
    customClassName: String = null,
    onDragEnd: js.UndefOr[Callback] = js.undefined,
    onDragStart: js.UndefOr[Callback] = js.undefined,
    onSecondaryPaneSizeChange: /* value */ Double => Callback = null,
    percentage: js.UndefOr[Boolean] = js.undefined,
    primaryIndex: TPrimaryIndex = null,
    primaryMinSize: Int | Double = null,
    secondaryInitialSize: Int | Double = null,
    secondaryMinSize: Int | Double = null,
    vertical: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SplitterLayoutProps, default, Unit, SplitterLayoutProps] = {
    val __obj = js.Dynamic.literal()
  
      if (customClassName != null) __obj.updateDynamic("customClassName")(customClassName.asInstanceOf[js.Any])
    onDragEnd.foreach(p => __obj.updateDynamic("onDragEnd")(p.toJsFn))
    onDragStart.foreach(p => __obj.updateDynamic("onDragStart")(p.toJsFn))
    if (onSecondaryPaneSizeChange != null) __obj.updateDynamic("onSecondaryPaneSizeChange")(js.Any.fromFunction1((t0: /* value */ scala.Double) => onSecondaryPaneSizeChange(t0).runNow()))
    if (!js.isUndefined(percentage)) __obj.updateDynamic("percentage")(percentage.asInstanceOf[js.Any])
    if (primaryIndex != null) __obj.updateDynamic("primaryIndex")(primaryIndex.asInstanceOf[js.Any])
    if (primaryMinSize != null) __obj.updateDynamic("primaryMinSize")(primaryMinSize.asInstanceOf[js.Any])
    if (secondaryInitialSize != null) __obj.updateDynamic("secondaryInitialSize")(secondaryInitialSize.asInstanceOf[js.Any])
    if (secondaryMinSize != null) __obj.updateDynamic("secondaryMinSize")(secondaryMinSize.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactSplitterLayout.mod.SplitterLayoutProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactSplitterLayout.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSplitterLayout.mod.SplitterLayoutProps])(children: _*)
  }
  @JSImport("react-splitter-layout", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

