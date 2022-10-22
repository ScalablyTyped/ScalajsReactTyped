package typingsJapgolly.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetContentVersionValue extends StObject {
  
  /**
    * The name of the dataset whose latest contents are used as input to the notebook or application.
    */
  var datasetName: DatasetName
}
object DatasetContentVersionValue {
  
  inline def apply(datasetName: DatasetName): DatasetContentVersionValue = {
    val __obj = js.Dynamic.literal(datasetName = datasetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetContentVersionValue]
  }
  
  extension [Self <: DatasetContentVersionValue](x: Self) {
    
    inline def setDatasetName(value: DatasetName): Self = StObject.set(x, "datasetName", value.asInstanceOf[js.Any])
  }
}
