package typingsJapgolly.bingmaps.Microsoft.Maps

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeatMapLayer
  extends StObject
     with IDataLayer {
  
  /** Disposes the heat map layer. */
  def dispose(): Unit
  
  /**
    * Gets a boolean indicating if the heat map layer is visible or not.
    * @returns A boolean indicating if the heat map layer is visible or not.
    */
  def getVisible(): Boolean
  
  /** 
    * @deprecated
    * Hides the heat map layer.
    */
  def hide(): Unit
  
  /**
    * Specifies the locations to use when generating the heat map.
    * @param locations Set of locations.
    */
  def setLocations(locations: js.Array[Location | Pushpin]): Unit
  
  /**
    * Sets the options to use with the heat map layer.
    * @param options Set of heat map layer options.
    */
  def setOptions(options: IHeatMapLayerOptions): Unit
  
  /**
    * Sets the visibility of the heat map layer.
    * @param visible A boolean indicating if the heat map layer is visible or not.
    */
  def setVisible(visible: Boolean): Unit
  
  /** 
    * @deprecated
    * Shows the heat map layer.
    */
  def show(): Unit
}
object HeatMapLayer {
  
  inline def apply(
    clear: Callback,
    dispose: Callback,
    getVisible: CallbackTo[Boolean],
    hide: Callback,
    setLocations: js.Array[Location | Pushpin] => Callback,
    setOptions: IHeatMapLayerOptions => Callback,
    setVisible: Boolean => Callback,
    show: Callback
  ): HeatMapLayer = {
    val __obj = js.Dynamic.literal(clear = clear.toJsFn, dispose = dispose.toJsFn, getVisible = getVisible.toJsFn, hide = hide.toJsFn, setLocations = js.Any.fromFunction1((t0: js.Array[Location | Pushpin]) => setLocations(t0).runNow()), setOptions = js.Any.fromFunction1((t0: IHeatMapLayerOptions) => setOptions(t0).runNow()), setVisible = js.Any.fromFunction1((t0: Boolean) => setVisible(t0).runNow()), show = show.toJsFn)
    __obj.asInstanceOf[HeatMapLayer]
  }
  
  extension [Self <: HeatMapLayer](x: Self) {
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    
    inline def setGetVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "getVisible", value.toJsFn)
    
    inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setSetLocations(value: js.Array[Location | Pushpin] => Callback): Self = StObject.set(x, "setLocations", js.Any.fromFunction1((t0: js.Array[Location | Pushpin]) => value(t0).runNow()))
    
    inline def setSetOptions(value: IHeatMapLayerOptions => Callback): Self = StObject.set(x, "setOptions", js.Any.fromFunction1((t0: IHeatMapLayerOptions) => value(t0).runNow()))
    
    inline def setSetVisible(value: Boolean => Callback): Self = StObject.set(x, "setVisible", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
  }
}
