package typingsJapgolly.cesium.anon

import typingsJapgolly.cesium.mod.DataSource
import typingsJapgolly.cesium.mod.DataSourceDisplay.VisualizersCallback
import typingsJapgolly.cesium.mod.Visualizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceCollection extends StObject {
  
  var dataSourceCollection: typingsJapgolly.cesium.mod.DataSourceCollection
  
  var scene: typingsJapgolly.cesium.mod.Scene
  
  var visualizersCallback: js.UndefOr[VisualizersCallback] = js.undefined
}
object DataSourceCollection {
  
  inline def apply(
    dataSourceCollection: typingsJapgolly.cesium.mod.DataSourceCollection,
    scene: typingsJapgolly.cesium.mod.Scene
  ): DataSourceCollection = {
    val __obj = js.Dynamic.literal(dataSourceCollection = dataSourceCollection.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceCollection]
  }
  
  extension [Self <: DataSourceCollection](x: Self) {
    
    inline def setDataSourceCollection(value: typingsJapgolly.cesium.mod.DataSourceCollection): Self = StObject.set(x, "dataSourceCollection", value.asInstanceOf[js.Any])
    
    inline def setScene(value: typingsJapgolly.cesium.mod.Scene): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    inline def setVisualizersCallback(
      value: (/* scene */ typingsJapgolly.cesium.mod.Scene, /* dataSource */ DataSource) => js.Array[Visualizer]
    ): Self = StObject.set(x, "visualizersCallback", js.Any.fromFunction2(value))
    
    inline def setVisualizersCallbackUndefined: Self = StObject.set(x, "visualizersCallback", js.undefined)
  }
}
