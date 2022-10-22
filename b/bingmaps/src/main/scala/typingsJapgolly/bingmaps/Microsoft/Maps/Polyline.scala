package typingsJapgolly.bingmaps.Microsoft.Maps

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Polyline
  extends StObject
     with IPrimitive {
  
  /**
    * Returns whether the polyline is generalizable based on zoom level or not.
    * @returns whether the polyline is generalizable based on zoom level or not.
    */
  def getGeneralizable(): Boolean
  
  /**
    * Gets the locations that make up the polyline.
    * @returns An array that defines the path of the polyline.
    */
  def getLocations(): js.Array[Location]
  
  /**
    * Gets the color of the border stroke of the polyline. Will be string or Color object depending on the the what method was used in the polyline options.
    * @returns The stroke color of the polyline.
    */
  def getStrokeColor(): String | Color
  
  /**
    * Gets the stroke dash array of the polyline, in format of either array or string, whichever user provides.
    * @returns The stroke dash array of the polyline.
    */
  def getStrokeDashArray(): js.Array[Double] | String
  
  /**
    * Gets the thickness of the border stroke of the polyline.
    * @returns The thickness of the border stroke of the polyline as a number.
    */
  def getStrokeThickness(): Double
  
  /**
    * Sets locations of the polyline.
    * @param locations A Location[] that defines path of the polyline
    */
  def setLocations(locations: js.Array[Location]): Unit
  
  /**
    * Sets the properties for the polyline.
    * @param options The IPolylineOptions object containing the options to customize the polyline.
    */
  def setOptions(options: IPolylineOptions): Unit
}
object Polyline {
  
  inline def apply(
    getCursor: CallbackTo[String],
    getGeneralizable: CallbackTo[Boolean],
    getLocations: CallbackTo[js.Array[Location]],
    getStrokeColor: CallbackTo[String | Color],
    getStrokeDashArray: CallbackTo[js.Array[Double] | String],
    getStrokeThickness: CallbackTo[Double],
    getVisible: CallbackTo[Boolean],
    setLocations: js.Array[Location] => Callback,
    setOptions: IPolylineOptions => Callback
  ): Polyline = {
    val __obj = js.Dynamic.literal(getCursor = getCursor.toJsFn, getGeneralizable = getGeneralizable.toJsFn, getLocations = getLocations.toJsFn, getStrokeColor = getStrokeColor.toJsFn, getStrokeDashArray = getStrokeDashArray.toJsFn, getStrokeThickness = getStrokeThickness.toJsFn, getVisible = getVisible.toJsFn, setLocations = js.Any.fromFunction1((t0: js.Array[Location]) => setLocations(t0).runNow()), setOptions = js.Any.fromFunction1((t0: IPolylineOptions) => setOptions(t0).runNow()))
    __obj.asInstanceOf[Polyline]
  }
  
  extension [Self <: Polyline](x: Self) {
    
    inline def setGetGeneralizable(value: CallbackTo[Boolean]): Self = StObject.set(x, "getGeneralizable", value.toJsFn)
    
    inline def setGetLocations(value: CallbackTo[js.Array[Location]]): Self = StObject.set(x, "getLocations", value.toJsFn)
    
    inline def setGetStrokeColor(value: CallbackTo[String | Color]): Self = StObject.set(x, "getStrokeColor", value.toJsFn)
    
    inline def setGetStrokeDashArray(value: CallbackTo[js.Array[Double] | String]): Self = StObject.set(x, "getStrokeDashArray", value.toJsFn)
    
    inline def setGetStrokeThickness(value: CallbackTo[Double]): Self = StObject.set(x, "getStrokeThickness", value.toJsFn)
    
    inline def setSetLocations(value: js.Array[Location] => Callback): Self = StObject.set(x, "setLocations", js.Any.fromFunction1((t0: js.Array[Location]) => value(t0).runNow()))
    
    inline def setSetOptions(value: IPolylineOptions => Callback): Self = StObject.set(x, "setOptions", js.Any.fromFunction1((t0: IPolylineOptions) => value(t0).runNow()))
  }
}
