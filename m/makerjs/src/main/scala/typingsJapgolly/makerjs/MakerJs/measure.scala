package typingsJapgolly.makerjs.MakerJs

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object measure {
  
  /**
    * A list of maps of measurements.
    *
    * @param modelToMeasure The model to measure.
    * @param atlas Optional atlas to save measurements.
    * @returns object with low and high points.
    */
  trait Atlas extends StObject {
    
    def measureModels(): Unit
    
    var modelContext: IModel
    
    /**
      * Map of model measurements, mapped by routeKey.
      */
    var modelMap: IMeasureMap
    
    /**
      * Flag that models have been measured.
      */
    var modelsMeasured: Boolean
    
    /**
      * Map of path measurements, mapped by routeKey.
      */
    var pathMap: IMeasureMap
  }
  object Atlas {
    
    inline def apply(
      measureModels: Callback,
      modelContext: IModel,
      modelMap: IMeasureMap,
      modelsMeasured: Boolean,
      pathMap: IMeasureMap
    ): Atlas = {
      val __obj = js.Dynamic.literal(measureModels = measureModels.toJsFn, modelContext = modelContext.asInstanceOf[js.Any], modelMap = modelMap.asInstanceOf[js.Any], modelsMeasured = modelsMeasured.asInstanceOf[js.Any], pathMap = pathMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[Atlas]
    }
    
    extension [Self <: Atlas](x: Self) {
      
      inline def setMeasureModels(value: Callback): Self = StObject.set(x, "measureModels", value.toJsFn)
      
      inline def setModelContext(value: IModel): Self = StObject.set(x, "modelContext", value.asInstanceOf[js.Any])
      
      inline def setModelMap(value: IMeasureMap): Self = StObject.set(x, "modelMap", value.asInstanceOf[js.Any])
      
      inline def setModelsMeasured(value: Boolean): Self = StObject.set(x, "modelsMeasured", value.asInstanceOf[js.Any])
      
      inline def setPathMap(value: IMeasureMap): Self = StObject.set(x, "pathMap", value.asInstanceOf[js.Any])
    }
  }
}
