package typingsJapgolly.vegaTypings.typesSpecTransformMod

import typingsJapgolly.vegaTypings.typesSpecExprMod.ExprRef
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import typingsJapgolly.vegaTypings.vegaTypingsStrings.geopath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoPathTransform
  extends StObject
     with Transforms {
  
  var as: js.UndefOr[String | SignalRef] = js.undefined
  
  var field: js.UndefOr[FieldRef] = js.undefined
  
  var pointRadius: js.UndefOr[Double | SignalRef | ExprRef] = js.undefined
  
  var projection: js.UndefOr[ProjectionName] = js.undefined
  
  var `type`: geopath
}
object GeoPathTransform {
  
  inline def apply(): GeoPathTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("geopath")
    __obj.asInstanceOf[GeoPathTransform]
  }
  
  extension [Self <: GeoPathTransform](x: Self) {
    
    inline def setAs(value: String | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setField(value: FieldRef): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setPointRadius(value: Double | SignalRef | ExprRef): Self = StObject.set(x, "pointRadius", value.asInstanceOf[js.Any])
    
    inline def setPointRadiusUndefined: Self = StObject.set(x, "pointRadius", js.undefined)
    
    inline def setProjection(value: ProjectionName): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    inline def setType(value: geopath): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
