package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the settings defining a data record.
  */
trait DataRecordOptions extends StObject {
  
  /**
    * Gets or sets the index of the active data record.
    */
  var activeRecordIndex: Double
  
  /**
    * Gets or sets the count of data source records.
    */
  var recordCount: Double
}
object DataRecordOptions {
  
  inline def apply(activeRecordIndex: Double, recordCount: Double): DataRecordOptions = {
    val __obj = js.Dynamic.literal(activeRecordIndex = activeRecordIndex.asInstanceOf[js.Any], recordCount = recordCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRecordOptions]
  }
  
  extension [Self <: DataRecordOptions](x: Self) {
    
    inline def setActiveRecordIndex(value: Double): Self = StObject.set(x, "activeRecordIndex", value.asInstanceOf[js.Any])
    
    inline def setRecordCount(value: Double): Self = StObject.set(x, "recordCount", value.asInstanceOf[js.Any])
  }
}
