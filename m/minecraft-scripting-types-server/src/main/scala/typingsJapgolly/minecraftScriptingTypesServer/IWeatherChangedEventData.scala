package typingsJapgolly.minecraftScriptingTypesServer

import typingsJapgolly.minecraftScriptingTypesShared.Dimension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event is triggered whenever the weather changes. It contains information about the weather it is changing to.
  */
trait IWeatherChangedEventData extends StObject {
  
  /**
    * The name of the dimension where the weather change happened
    */
  var dimension: Dimension
  
  /**
    * Tells if the new weather has lightning
    */
  var lightning: Boolean
  
  /**
    * Tells if the new weather has rain
    */
  var raining: Boolean
}
object IWeatherChangedEventData {
  
  inline def apply(dimension: Dimension, lightning: Boolean, raining: Boolean): IWeatherChangedEventData = {
    val __obj = js.Dynamic.literal(dimension = dimension.asInstanceOf[js.Any], lightning = lightning.asInstanceOf[js.Any], raining = raining.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWeatherChangedEventData]
  }
  
  extension [Self <: IWeatherChangedEventData](x: Self) {
    
    inline def setDimension(value: Dimension): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    inline def setLightning(value: Boolean): Self = StObject.set(x, "lightning", value.asInstanceOf[js.Any])
    
    inline def setRaining(value: Boolean): Self = StObject.set(x, "raining", value.asInstanceOf[js.Any])
  }
}
