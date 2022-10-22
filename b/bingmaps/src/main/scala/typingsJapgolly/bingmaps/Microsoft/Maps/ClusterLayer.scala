package typingsJapgolly.bingmaps.Microsoft.Maps

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterLayer
  extends StObject
     with IDataLayer {
  
  /**
    * Gets the pushpin in the specified cluster grid cell which can be either a ClusterPushpin if there are multiple pushpins in a cell or a single Pushpin.
    * @param The gridKey index to retrieve the pushpins for.
    * @returns The pushpin in the specified cluster grid cell which can be either a ClusterPushpin if there are multiple pushpins in a cell or a single Pushpin.
    */
  def getClusterPushpinByGridKey(gridKey: Double): ClusterPushpin | Pushpin
  
  /**
    * Gets all the pushpins that are in the current map view. If clustering is disabled, all pushpins in the clustering layer are returned.
    * @returns All the pushpins that are in the current map view. If clustering is disabled, all pushpins in the clustering layer are returned.
    */
  def getDisplayedPushpins(): js.Array[Pushpin]
  
  /**
    * Gets the current options used by the cluster layer.
    * @returns The current options used by the cluster layer.
    */
  def getOptions(): IClusterLayerOptions
  
  /**
    * Gets all pushpins that are in the layers.
    * @returns An array of all the pushpins that are in the layers.
    */
  def getPushpins(): js.Array[Pushpin]
  
  /**
    * Gets the original pushpins that are in the specified grid cell.
    * @param The gridKey index to retrieve the pushpins for.
    * @returns The original pushpins that are in the specified grid cell.
    */
  def getPushpinsByGridKey(gridKey: Double): js.Array[Pushpin]
  
  /**
    * Sets the clustering options to use in the layer.
    * @params options The clustering options to use in the layer.
    */
  def setOptions(options: IClusterLayerOptions): Unit
  
  /**
    * Sets the array of pushpins that are used in the clustering layer.
    * @param pushpins An array of pushpins that are to be used by the clustering layer.
    */
  def setPushpins(pushpins: js.Array[Pushpin]): Unit
}
object ClusterLayer {
  
  inline def apply(
    clear: Callback,
    getClusterPushpinByGridKey: Double => ClusterPushpin | Pushpin,
    getDisplayedPushpins: CallbackTo[js.Array[Pushpin]],
    getOptions: CallbackTo[IClusterLayerOptions],
    getPushpins: CallbackTo[js.Array[Pushpin]],
    getPushpinsByGridKey: Double => js.Array[Pushpin],
    setOptions: IClusterLayerOptions => Callback,
    setPushpins: js.Array[Pushpin] => Callback
  ): ClusterLayer = {
    val __obj = js.Dynamic.literal(clear = clear.toJsFn, getClusterPushpinByGridKey = js.Any.fromFunction1(getClusterPushpinByGridKey), getDisplayedPushpins = getDisplayedPushpins.toJsFn, getOptions = getOptions.toJsFn, getPushpins = getPushpins.toJsFn, getPushpinsByGridKey = js.Any.fromFunction1(getPushpinsByGridKey), setOptions = js.Any.fromFunction1((t0: IClusterLayerOptions) => setOptions(t0).runNow()), setPushpins = js.Any.fromFunction1((t0: js.Array[Pushpin]) => setPushpins(t0).runNow()))
    __obj.asInstanceOf[ClusterLayer]
  }
  
  extension [Self <: ClusterLayer](x: Self) {
    
    inline def setGetClusterPushpinByGridKey(value: Double => ClusterPushpin | Pushpin): Self = StObject.set(x, "getClusterPushpinByGridKey", js.Any.fromFunction1(value))
    
    inline def setGetDisplayedPushpins(value: CallbackTo[js.Array[Pushpin]]): Self = StObject.set(x, "getDisplayedPushpins", value.toJsFn)
    
    inline def setGetOptions(value: CallbackTo[IClusterLayerOptions]): Self = StObject.set(x, "getOptions", value.toJsFn)
    
    inline def setGetPushpins(value: CallbackTo[js.Array[Pushpin]]): Self = StObject.set(x, "getPushpins", value.toJsFn)
    
    inline def setGetPushpinsByGridKey(value: Double => js.Array[Pushpin]): Self = StObject.set(x, "getPushpinsByGridKey", js.Any.fromFunction1(value))
    
    inline def setSetOptions(value: IClusterLayerOptions => Callback): Self = StObject.set(x, "setOptions", js.Any.fromFunction1((t0: IClusterLayerOptions) => value(t0).runNow()))
    
    inline def setSetPushpins(value: js.Array[Pushpin] => Callback): Self = StObject.set(x, "setPushpins", js.Any.fromFunction1((t0: js.Array[Pushpin]) => value(t0).runNow()))
  }
}
