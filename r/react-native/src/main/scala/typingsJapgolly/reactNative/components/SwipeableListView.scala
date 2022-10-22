package typingsJapgolly.reactNative.components

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactNative.mod.SwipeableListViewDataSource
import typingsJapgolly.reactNative.mod.SwipeableListViewProps
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
  ): Default[typingsJapgolly.reactNative.mod.SwipeableListView] = {
    val __props = js.Dynamic.literal(bounceFirstRowOnMount = bounceFirstRowOnMount.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], maxSwipeDistance = maxSwipeDistance.asInstanceOf[js.Any], renderQuickActions = js.Any.fromFunction3(renderQuickActions), renderRow = js.Any.fromFunction4(renderRow))
    new Default[typingsJapgolly.reactNative.mod.SwipeableListView](js.Array(this.component, __props.asInstanceOf[SwipeableListViewProps]))
  }
  
  @JSImport("react-native", "SwipeableListView")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: SwipeableListViewProps): Default[typingsJapgolly.reactNative.mod.SwipeableListView] = new Default[typingsJapgolly.reactNative.mod.SwipeableListView](js.Array(this.component, p.asInstanceOf[js.Any]))
}
