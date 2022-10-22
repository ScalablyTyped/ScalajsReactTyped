package typingsJapgolly.mapboxGl.mod

import typingsJapgolly.mapboxGl.mapboxGlStrings.pbf
import typingsJapgolly.mapboxGl.mapboxGlStrings.tms
import typingsJapgolly.mapboxGl.mapboxGlStrings.vector
import typingsJapgolly.mapboxGl.mapboxGlStrings.xyz
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VectorSource
  extends StObject
     with Source
     with _AnySourceData {
  
  var attribution: js.UndefOr[String] = js.undefined
  
  var bounds: js.UndefOr[js.Array[Double]] = js.undefined
  
  var format: js.UndefOr[pbf] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var maxzoom: js.UndefOr[Double] = js.undefined
  
  var minzoom: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var promoteId: js.UndefOr[PromoteIdSpecification] = js.undefined
  
  var scheme: js.UndefOr[xyz | tms] = js.undefined
  
  var tiles: js.UndefOr[js.Array[String]] = js.undefined
  
  @JSName("type")
  var type_VectorSource: vector
  
  var url: js.UndefOr[String] = js.undefined
  
  var vector_layers: js.UndefOr[js.Array[SourceVectorLayer]] = js.undefined
}
object VectorSource {
  
  inline def apply(): VectorSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("vector")
    __obj.asInstanceOf[VectorSource]
  }
  
  extension [Self <: VectorSource](x: Self) {
    
    inline def setAttribution(value: String): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    
    inline def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
    
    inline def setBounds(value: js.Array[Double]): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    inline def setBoundsVarargs(value: Double*): Self = StObject.set(x, "bounds", js.Array(value*))
    
    inline def setFormat(value: pbf): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMaxzoom(value: Double): Self = StObject.set(x, "maxzoom", value.asInstanceOf[js.Any])
    
    inline def setMaxzoomUndefined: Self = StObject.set(x, "maxzoom", js.undefined)
    
    inline def setMinzoom(value: Double): Self = StObject.set(x, "minzoom", value.asInstanceOf[js.Any])
    
    inline def setMinzoomUndefined: Self = StObject.set(x, "minzoom", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPromoteId(value: PromoteIdSpecification): Self = StObject.set(x, "promoteId", value.asInstanceOf[js.Any])
    
    inline def setPromoteIdUndefined: Self = StObject.set(x, "promoteId", js.undefined)
    
    inline def setScheme(value: xyz | tms): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
    
    inline def setTiles(value: js.Array[String]): Self = StObject.set(x, "tiles", value.asInstanceOf[js.Any])
    
    inline def setTilesUndefined: Self = StObject.set(x, "tiles", js.undefined)
    
    inline def setTilesVarargs(value: String*): Self = StObject.set(x, "tiles", js.Array(value*))
    
    inline def setType(value: vector): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setVector_layers(value: js.Array[SourceVectorLayer]): Self = StObject.set(x, "vector_layers", value.asInstanceOf[js.Any])
    
    inline def setVector_layersUndefined: Self = StObject.set(x, "vector_layers", js.undefined)
    
    inline def setVector_layersVarargs(value: SourceVectorLayer*): Self = StObject.set(x, "vector_layers", js.Array(value*))
  }
}
