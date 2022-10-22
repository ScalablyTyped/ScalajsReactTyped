package typingsJapgolly.reactNativeWindows.components

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactNativeWindows.rntypesMod.SwipeableListViewDataSource
import typingsJapgolly.reactNativeWindows.rntypesMod.SwipeableListViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SwipeableListView {
  
  inline def apply(
    bounceFirstRowOnMount: Boolean,
    dataSource: SwipeableListViewDataSource,
    maxSwipeDistance: Double,
    renderQuickActions: (Any, Double | String, Double | String) => Element,
    renderRow: (Any, Double | String, Double | String, js.UndefOr[Boolean]) => Element
  ): Default[typingsJapgolly.reactNativeWindows.mod.SwipeableListView] = {
    val __props = js.Dynamic.literal(bounceFirstRowOnMount = bounceFirstRowOnMount.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], maxSwipeDistance = maxSwipeDistance.asInstanceOf[js.Any], renderQuickActions = js.Any.fromFunction3(renderQuickActions), renderRow = js.Any.fromFunction4(renderRow))
    new Default[typingsJapgolly.reactNativeWindows.mod.SwipeableListView](js.Array(this.component, __props.asInstanceOf[SwipeableListViewProps]))
  }
  
  @JSImport("react-native-windows", "SwipeableListView")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: SwipeableListViewProps): Default[typingsJapgolly.reactNativeWindows.mod.SwipeableListView] = new Default[typingsJapgolly.reactNativeWindows.mod.SwipeableListView](js.Array(this.component, p.asInstanceOf[js.Any]))
}
