package typingsJapgolly.devextreme.mod.DevExpress.viz

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.mod.DevExpress.data.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapLayer extends StObject {
  
  /**
    * Deselects all layer elements.
    */
  def clearSelection(): Unit
  
  /**
    * The type of the layer elements.
    */
  var elementType: js.UndefOr[String] = js.undefined
  
  /**
    * Returns the DataSource instance.
    */
  def getDataSource(): DataSource[Any, Any]
  
  /**
    * Gets all layer elements.
    */
  def getElements(): js.Array[MapLayerElement]
  
  /**
    * The layer index in the layers array.
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    * The name of the layer.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The layer type. Can be &apos;area&apos;, &apos;line&apos; or &apos;marker&apos;.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object MapLayer {
  
  inline def apply(
    clearSelection: Callback,
    getDataSource: CallbackTo[DataSource[Any, Any]],
    getElements: CallbackTo[js.Array[MapLayerElement]]
  ): MapLayer = {
    val __obj = js.Dynamic.literal(clearSelection = clearSelection.toJsFn, getDataSource = getDataSource.toJsFn, getElements = getElements.toJsFn)
    __obj.asInstanceOf[MapLayer]
  }
  
  extension [Self <: MapLayer](x: Self) {
    
    inline def setClearSelection(value: Callback): Self = StObject.set(x, "clearSelection", value.toJsFn)
    
    inline def setElementType(value: String): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
    
    inline def setElementTypeUndefined: Self = StObject.set(x, "elementType", js.undefined)
    
    inline def setGetDataSource(value: CallbackTo[DataSource[Any, Any]]): Self = StObject.set(x, "getDataSource", value.toJsFn)
    
    inline def setGetElements(value: CallbackTo[js.Array[MapLayerElement]]): Self = StObject.set(x, "getElements", value.toJsFn)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
