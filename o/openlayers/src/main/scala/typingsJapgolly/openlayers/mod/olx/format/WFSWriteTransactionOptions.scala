package typingsJapgolly.openlayers.mod.olx.format

import typingsJapgolly.openlayers.mod.GlobalObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WFSWriteTransactionOptions extends StObject {
  
  var featureNS: String
  
  var featurePrefix: String
  
  var featureType: String
  
  var gmlOptions: js.UndefOr[GMLOptions] = js.undefined
  
  var handle: js.UndefOr[String] = js.undefined
  
  var nativeElements: js.Array[GlobalObject]
  
  var srsName: js.UndefOr[String] = js.undefined
}
object WFSWriteTransactionOptions {
  
  inline def apply(
    featureNS: String,
    featurePrefix: String,
    featureType: String,
    nativeElements: js.Array[GlobalObject]
  ): WFSWriteTransactionOptions = {
    val __obj = js.Dynamic.literal(featureNS = featureNS.asInstanceOf[js.Any], featurePrefix = featurePrefix.asInstanceOf[js.Any], featureType = featureType.asInstanceOf[js.Any], nativeElements = nativeElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[WFSWriteTransactionOptions]
  }
  
  extension [Self <: WFSWriteTransactionOptions](x: Self) {
    
    inline def setFeatureNS(value: String): Self = StObject.set(x, "featureNS", value.asInstanceOf[js.Any])
    
    inline def setFeaturePrefix(value: String): Self = StObject.set(x, "featurePrefix", value.asInstanceOf[js.Any])
    
    inline def setFeatureType(value: String): Self = StObject.set(x, "featureType", value.asInstanceOf[js.Any])
    
    inline def setGmlOptions(value: GMLOptions): Self = StObject.set(x, "gmlOptions", value.asInstanceOf[js.Any])
    
    inline def setGmlOptionsUndefined: Self = StObject.set(x, "gmlOptions", js.undefined)
    
    inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
    
    inline def setNativeElements(value: js.Array[GlobalObject]): Self = StObject.set(x, "nativeElements", value.asInstanceOf[js.Any])
    
    inline def setNativeElementsVarargs(value: GlobalObject*): Self = StObject.set(x, "nativeElements", js.Array(value*))
    
    inline def setSrsName(value: String): Self = StObject.set(x, "srsName", value.asInstanceOf[js.Any])
    
    inline def setSrsNameUndefined: Self = StObject.set(x, "srsName", js.undefined)
  }
}
