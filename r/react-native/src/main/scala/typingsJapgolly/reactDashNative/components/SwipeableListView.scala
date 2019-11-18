package typingsJapgolly.reactDashNative.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactDashNative.reactDashNativeMod.SwipeableListViewDataSource
import typingsJapgolly.reactDashNative.reactDashNativeMod.SwipeableListViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SwipeableListView {
  def apply(
    bounceFirstRowOnMount: Boolean,
    dataSource: SwipeableListViewDataSource,
    maxSwipeDistance: Double,
    renderQuickActions: (js.Any, Double, Double) => CallbackTo[Element],
    renderRow: (js.Any, Double, Double, Boolean) => CallbackTo[Element],
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    SwipeableListViewProps, 
    typingsJapgolly.reactDashNative.reactDashNativeMod.SwipeableListView, 
    Unit, 
    SwipeableListViewProps
  ] = {
    val __obj = js.Dynamic.literal(bounceFirstRowOnMount = bounceFirstRowOnMount.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], maxSwipeDistance = maxSwipeDistance.asInstanceOf[js.Any])
  
      __obj.updateDynamic("renderQuickActions")(js.Any.fromFunction3((t0: js.Any, t1: scala.Double, t2: scala.Double) => renderQuickActions(t0, t1, t2).runNow()))
    __obj.updateDynamic("renderRow")(js.Any.fromFunction4((t0: js.Any, t1: scala.Double, t2: scala.Double, t3: scala.Boolean) => renderRow(t0, t1, t2, t3).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDashNative.reactDashNativeMod.SwipeableListViewProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDashNative.reactDashNativeMod.SwipeableListView](js.constructorOf[typingsJapgolly.reactDashNative.reactDashNativeMod.SwipeableListView])
    f(__obj.asInstanceOf[typingsJapgolly.reactDashNative.reactDashNativeMod.SwipeableListViewProps])(children: _*)
  }
}

