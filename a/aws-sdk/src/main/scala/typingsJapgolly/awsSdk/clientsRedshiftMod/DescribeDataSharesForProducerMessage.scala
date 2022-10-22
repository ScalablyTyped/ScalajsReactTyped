package typingsJapgolly.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDataSharesForProducerMessage extends StObject {
  
  /**
    * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeDataSharesForProducer request exceed the value specified in MaxRecords, Amazon Web Services returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve the next set of records by retrying the command with the returned marker value. 
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the producer that returns in the list of datashares.
    */
  var ProducerArn: js.UndefOr[String] = js.undefined
  
  /**
    * An identifier giving the status of a datashare in the producer. If this field is specified, Amazon Redshift returns the list of datashares that have the specified status.
    */
  var Status: js.UndefOr[DataShareStatusForProducer] = js.undefined
}
object DescribeDataSharesForProducerMessage {
  
  inline def apply(): DescribeDataSharesForProducerMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDataSharesForProducerMessage]
  }
  
  extension [Self <: DescribeDataSharesForProducerMessage](x: Self) {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    inline def setProducerArn(value: String): Self = StObject.set(x, "ProducerArn", value.asInstanceOf[js.Any])
    
    inline def setProducerArnUndefined: Self = StObject.set(x, "ProducerArn", js.undefined)
    
    inline def setStatus(value: DataShareStatusForProducer): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
