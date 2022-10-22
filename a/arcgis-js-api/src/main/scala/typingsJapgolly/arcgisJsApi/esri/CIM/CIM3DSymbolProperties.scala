package typingsJapgolly.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIM3DSymbolProperties extends StObject {
  
  /**
    * The dominant size axis.
    */
  var dominantSizeAxis3D: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DominantSizeAxis * / any */ String
  ] = js.undefined
  
  /**
    * The rotation order 3D.
    */
  var rotationOrder3D: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RotationOrder * / any */ String
  ] = js.undefined
  
  /**
    * The scale Y.
    */
  var scaleY: js.UndefOr[Double] = js.undefined
  
  /**
    * The scale Z.
    */
  var scaleZ: js.UndefOr[Double] = js.undefined
  
  var `type`: typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.CIM3DSymbolProperties
}
object CIM3DSymbolProperties {
  
  inline def apply(): CIM3DSymbolProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIM3DSymbolProperties")
    __obj.asInstanceOf[CIM3DSymbolProperties]
  }
  
  extension [Self <: CIM3DSymbolProperties](x: Self) {
    
    inline def setDominantSizeAxis3D(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DominantSizeAxis * / any */ String
    ): Self = StObject.set(x, "dominantSizeAxis3D", value.asInstanceOf[js.Any])
    
    inline def setDominantSizeAxis3DUndefined: Self = StObject.set(x, "dominantSizeAxis3D", js.undefined)
    
    inline def setRotationOrder3D(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RotationOrder * / any */ String
    ): Self = StObject.set(x, "rotationOrder3D", value.asInstanceOf[js.Any])
    
    inline def setRotationOrder3DUndefined: Self = StObject.set(x, "rotationOrder3D", js.undefined)
    
    inline def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    
    inline def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
    
    inline def setScaleZ(value: Double): Self = StObject.set(x, "scaleZ", value.asInstanceOf[js.Any])
    
    inline def setScaleZUndefined: Self = StObject.set(x, "scaleZ", js.undefined)
    
    inline def setType(value: typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.CIM3DSymbolProperties): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
