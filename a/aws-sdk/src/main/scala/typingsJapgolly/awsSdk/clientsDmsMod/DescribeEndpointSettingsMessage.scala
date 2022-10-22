package typingsJapgolly.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEndpointSettingsMessage extends StObject {
  
  /**
    * The databse engine used for your source or target endpoint.
    */
  var EngineName: String
  
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
}
object DescribeEndpointSettingsMessage {
  
  inline def apply(EngineName: String): DescribeEndpointSettingsMessage = {
    val __obj = js.Dynamic.literal(EngineName = EngineName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEndpointSettingsMessage]
  }
  
  extension [Self <: DescribeEndpointSettingsMessage](x: Self) {
    
    inline def setEngineName(value: String): Self = StObject.set(x, "EngineName", value.asInstanceOf[js.Any])
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
  }
}
