package typingsJapgolly.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSetReference extends StObject {
  
  /**
    * Dataset Amazon Resource Name (ARN).
    */
  var DataSetArn: Arn
  
  /**
    * Dataset placeholder.
    */
  var DataSetPlaceholder: NonEmptyString
}
object DataSetReference {
  
  inline def apply(DataSetArn: Arn, DataSetPlaceholder: NonEmptyString): DataSetReference = {
    val __obj = js.Dynamic.literal(DataSetArn = DataSetArn.asInstanceOf[js.Any], DataSetPlaceholder = DataSetPlaceholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSetReference]
  }
  
  extension [Self <: DataSetReference](x: Self) {
    
    inline def setDataSetArn(value: Arn): Self = StObject.set(x, "DataSetArn", value.asInstanceOf[js.Any])
    
    inline def setDataSetPlaceholder(value: NonEmptyString): Self = StObject.set(x, "DataSetPlaceholder", value.asInstanceOf[js.Any])
  }
}
