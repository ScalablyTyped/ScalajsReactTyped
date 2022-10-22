package typingsJapgolly.openlayers.mod.olx.interaction

import typingsJapgolly.openlayers.mod.Collection
import typingsJapgolly.openlayers.mod.Coordinate_
import typingsJapgolly.openlayers.mod.DrawGeometryFunctionType
import typingsJapgolly.openlayers.mod.EventsConditionType
import typingsJapgolly.openlayers.mod.Feature
import typingsJapgolly.openlayers.mod.MapBrowserEvent
import typingsJapgolly.openlayers.mod.StyleFunction
import typingsJapgolly.openlayers.mod.geom.GeometryType
import typingsJapgolly.openlayers.mod.geom.SimpleGeometry
import typingsJapgolly.openlayers.mod.source.Vector
import typingsJapgolly.openlayers.mod.style.Style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawOptions extends StObject {
  
  var clickTolerance: js.UndefOr[Double] = js.undefined
  
  var condition: js.UndefOr[EventsConditionType] = js.undefined
  
  var features: js.UndefOr[Collection[Feature]] = js.undefined
  
  var finishCondition: js.UndefOr[EventsConditionType] = js.undefined
  
  var freehand: js.UndefOr[Boolean] = js.undefined
  
  var freehandCondition: js.UndefOr[EventsConditionType] = js.undefined
  
  var geometryFunction: js.UndefOr[DrawGeometryFunctionType] = js.undefined
  
  var geometryName: js.UndefOr[String] = js.undefined
  
  var maxPoints: js.UndefOr[Double] = js.undefined
  
  var minPoints: js.UndefOr[Double] = js.undefined
  
  var snapTolerance: js.UndefOr[Double] = js.undefined
  
  var source: js.UndefOr[Vector] = js.undefined
  
  var stopClick: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[Style | js.Array[Style] | StyleFunction] = js.undefined
  
  var `type`: GeometryType
  
  var wrapX: js.UndefOr[Boolean] = js.undefined
}
object DrawOptions {
  
  inline def apply(`type`: GeometryType): DrawOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawOptions]
  }
  
  extension [Self <: DrawOptions](x: Self) {
    
    inline def setClickTolerance(value: Double): Self = StObject.set(x, "clickTolerance", value.asInstanceOf[js.Any])
    
    inline def setClickToleranceUndefined: Self = StObject.set(x, "clickTolerance", js.undefined)
    
    inline def setCondition(value: /* event */ MapBrowserEvent => Boolean): Self = StObject.set(x, "condition", js.Any.fromFunction1(value))
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setFeatures(value: Collection[Feature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFinishCondition(value: /* event */ MapBrowserEvent => Boolean): Self = StObject.set(x, "finishCondition", js.Any.fromFunction1(value))
    
    inline def setFinishConditionUndefined: Self = StObject.set(x, "finishCondition", js.undefined)
    
    inline def setFreehand(value: Boolean): Self = StObject.set(x, "freehand", value.asInstanceOf[js.Any])
    
    inline def setFreehandCondition(value: /* event */ MapBrowserEvent => Boolean): Self = StObject.set(x, "freehandCondition", js.Any.fromFunction1(value))
    
    inline def setFreehandConditionUndefined: Self = StObject.set(x, "freehandCondition", js.undefined)
    
    inline def setFreehandUndefined: Self = StObject.set(x, "freehand", js.undefined)
    
    inline def setGeometryFunction(
      value: (/* coords */ Coordinate_ | (js.Array[js.Array[Coordinate_] | Coordinate_]), /* geo */ js.UndefOr[SimpleGeometry]) => SimpleGeometry
    ): Self = StObject.set(x, "geometryFunction", js.Any.fromFunction2(value))
    
    inline def setGeometryFunctionUndefined: Self = StObject.set(x, "geometryFunction", js.undefined)
    
    inline def setGeometryName(value: String): Self = StObject.set(x, "geometryName", value.asInstanceOf[js.Any])
    
    inline def setGeometryNameUndefined: Self = StObject.set(x, "geometryName", js.undefined)
    
    inline def setMaxPoints(value: Double): Self = StObject.set(x, "maxPoints", value.asInstanceOf[js.Any])
    
    inline def setMaxPointsUndefined: Self = StObject.set(x, "maxPoints", js.undefined)
    
    inline def setMinPoints(value: Double): Self = StObject.set(x, "minPoints", value.asInstanceOf[js.Any])
    
    inline def setMinPointsUndefined: Self = StObject.set(x, "minPoints", js.undefined)
    
    inline def setSnapTolerance(value: Double): Self = StObject.set(x, "snapTolerance", value.asInstanceOf[js.Any])
    
    inline def setSnapToleranceUndefined: Self = StObject.set(x, "snapTolerance", js.undefined)
    
    inline def setSource(value: Vector): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setStopClick(value: Boolean): Self = StObject.set(x, "stopClick", value.asInstanceOf[js.Any])
    
    inline def setStopClickUndefined: Self = StObject.set(x, "stopClick", js.undefined)
    
    inline def setStyle(value: Style | js.Array[Style] | StyleFunction): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleFunction2(
      value: (/* feature */ Feature | typingsJapgolly.openlayers.mod.render.Feature, /* resolution */ Double) => Style | js.Array[Style] | Null
    ): Self = StObject.set(x, "style", js.Any.fromFunction2(value))
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setStyleVarargs(value: Style*): Self = StObject.set(x, "style", js.Array(value*))
    
    inline def setType(value: GeometryType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
    
    inline def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
  }
}
