package typingsJapgolly.reactNativeSensorManager.anon

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.reactNative.mod.SwipeableListViewDataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<react-native.react-native.SwipeableListViewProps> */
trait ReadonlySwipeableListView extends StObject {
  
  val bounceFirstRowOnMount: Boolean
  
  val dataSource: SwipeableListViewDataSource
  
  val maxSwipeDistance: Double
  
  def renderQuickActions(rowData: Any, sectionID: String, rowID: String): Element
  
  def renderRow(rowData: Any, sectionID: String, rowID: String): Element
}
object ReadonlySwipeableListView {
  
  inline def apply(
    bounceFirstRowOnMount: Boolean,
    dataSource: SwipeableListViewDataSource,
    maxSwipeDistance: Double,
    renderQuickActions: (Any, String, String) => Element,
    renderRow: (Any, String, String) => Element
  ): ReadonlySwipeableListView = {
    val __obj = js.Dynamic.literal(bounceFirstRowOnMount = bounceFirstRowOnMount.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], maxSwipeDistance = maxSwipeDistance.asInstanceOf[js.Any], renderQuickActions = js.Any.fromFunction3(renderQuickActions), renderRow = js.Any.fromFunction3(renderRow))
    __obj.asInstanceOf[ReadonlySwipeableListView]
  }
  
  extension [Self <: ReadonlySwipeableListView](x: Self) {
    
    inline def setBounceFirstRowOnMount(value: Boolean): Self = StObject.set(x, "bounceFirstRowOnMount", value.asInstanceOf[js.Any])
    
    inline def setDataSource(value: SwipeableListViewDataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setMaxSwipeDistance(value: Double): Self = StObject.set(x, "maxSwipeDistance", value.asInstanceOf[js.Any])
    
    inline def setRenderQuickActions(value: (Any, String, String) => Element): Self = StObject.set(x, "renderQuickActions", js.Any.fromFunction3(value))
    
    inline def setRenderRow(value: (Any, String, String) => Element): Self = StObject.set(x, "renderRow", js.Any.fromFunction3(value))
  }
}
