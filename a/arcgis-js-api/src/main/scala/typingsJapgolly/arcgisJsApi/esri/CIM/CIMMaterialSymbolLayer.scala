package typingsJapgolly.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMMaterialSymbolLayer
  extends StObject
     with CIMSymbolLayerBase
     with CIMSymbolLayerType {
  
  /**
    * The material color.
    */
  var color: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * The mode in which the material is applied.
    */
  var materialMode: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MaterialMode * / any */ String
  ] = js.undefined
  
  @JSName("type")
  var type_CIMMaterialSymbolLayer: typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.CIMMaterialSymbolLayer
}
object CIMMaterialSymbolLayer {
  
  inline def apply(): CIMMaterialSymbolLayer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMMaterialSymbolLayer")
    __obj.asInstanceOf[CIMMaterialSymbolLayer]
  }
  
  extension [Self <: CIMMaterialSymbolLayer](x: Self) {
    
    inline def setColor(value: js.Array[Double]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setMaterialMode(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MaterialMode * / any */ String
    ): Self = StObject.set(x, "materialMode", value.asInstanceOf[js.Any])
    
    inline def setMaterialModeUndefined: Self = StObject.set(x, "materialMode", js.undefined)
    
    inline def setType(value: typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.CIMMaterialSymbolLayer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
