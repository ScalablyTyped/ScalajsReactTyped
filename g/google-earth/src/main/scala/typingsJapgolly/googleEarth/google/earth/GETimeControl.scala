package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GETimeControl
  extends StObject
     with GEControl {
  
  /**
    * Returns an array containing the KmlTimeStamp objects associated with the historical imagery available in this view.
    */
  def getAvailableImageDates(): KmlObjectList[KmlTimeStamp]
  
  /**
    * Returns the clock rate that the plugin would use, if the play button on the time slider UI was pressed.
    * This rate is calculated by the plugin based on the time range currently present in the slider.
    */
  def getCalculatedRate(): Double
  
  /**
    * Returns a KmlTimeSpan object encompassing the earliest and latest times present in the time slider.
    * For more information, refer to the Time chapter of the Developer's Guide.
    */
  def getExtents(): KmlTimeSpan
  
  /**
    * Whether the time slider is visible or not.
    */
  def getVisibility(): GEVisibilityEnum
  
  /**
    * Specifies whether the control is visible or hidden.
    */
  def setVisibility(visibility: GEVisibilityEnum): Unit
}
object GETimeControl {
  
  inline def apply(
    getAvailableImageDates: CallbackTo[KmlObjectList[KmlTimeStamp]],
    getCalculatedRate: CallbackTo[Double],
    getExtents: CallbackTo[KmlTimeSpan],
    getVisibility: CallbackTo[GEVisibilityEnum],
    setVisibility: GEVisibilityEnum => Callback
  ): GETimeControl = {
    val __obj = js.Dynamic.literal(getAvailableImageDates = getAvailableImageDates.toJsFn, getCalculatedRate = getCalculatedRate.toJsFn, getExtents = getExtents.toJsFn, getVisibility = getVisibility.toJsFn, setVisibility = js.Any.fromFunction1((t0: GEVisibilityEnum) => setVisibility(t0).runNow()))
    __obj.asInstanceOf[GETimeControl]
  }
  
  extension [Self <: GETimeControl](x: Self) {
    
    inline def setGetAvailableImageDates(value: CallbackTo[KmlObjectList[KmlTimeStamp]]): Self = StObject.set(x, "getAvailableImageDates", value.toJsFn)
    
    inline def setGetCalculatedRate(value: CallbackTo[Double]): Self = StObject.set(x, "getCalculatedRate", value.toJsFn)
    
    inline def setGetExtents(value: CallbackTo[KmlTimeSpan]): Self = StObject.set(x, "getExtents", value.toJsFn)
    
    inline def setGetVisibility(value: CallbackTo[GEVisibilityEnum]): Self = StObject.set(x, "getVisibility", value.toJsFn)
    
    inline def setSetVisibility(value: GEVisibilityEnum => Callback): Self = StObject.set(x, "setVisibility", js.Any.fromFunction1((t0: GEVisibilityEnum) => value(t0).runNow()))
  }
}
