package typingsJapgolly.reactNative.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.SwipeableListViewDataSource
import typingsJapgolly.reactNative.mod.SwipeableListViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SwipeableListView {
  def apply(
    bounceFirstRowOnMount: Boolean,
    dataSource: SwipeableListViewDataSource,
    maxSwipeDistance: Double,
    renderQuickActions: (js.Any, Double | String, Double | String) => CallbackTo[Element],
    renderRow: (js.Any, Double | String, Double | String, js.UndefOr[Boolean]) => CallbackTo[Element],
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    SwipeableListViewProps, 
    typingsJapgolly.reactNative.mod.SwipeableListView, 
    Unit, 
    SwipeableListViewProps
  ] = {
    val __obj = js.Dynamic.literal(bounceFirstRowOnMount = bounceFirstRowOnMount.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], maxSwipeDistance = maxSwipeDistance.asInstanceOf[js.Any])
  
      __obj.updateDynamic("renderQuickActions")(js.Any.fromFunction3((t0: js.Any, t1: scala.Double | java.lang.String, t2: scala.Double | java.lang.String) => renderQuickActions(t0, t1, t2).runNow()))
    __obj.updateDynamic("renderRow")(js.Any.fromFunction4((t0: js.Any, t1: scala.Double | java.lang.String, t2: scala.Double | java.lang.String, t3: js.UndefOr[scala.Boolean]) => renderRow(t0, t1, t2, t3).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNative.mod.SwipeableListViewProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNative.mod.SwipeableListView](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNative.mod.SwipeableListViewProps])(children: _*)
  }
  @JSImport("react-native", "SwipeableListView")
  @js.native
  object componentImport extends js.Object
  
}

