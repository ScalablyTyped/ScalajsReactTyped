package typingsJapgolly.mongodb.mod

import typingsJapgolly.bson.mod.Document
import typingsJapgolly.mongodb.mongodbStrings.hours
import typingsJapgolly.mongodb.mongodbStrings.minutes
import typingsJapgolly.mongodb.mongodbStrings.seconds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeSeriesCollectionOptions
  extends StObject
     with Document {
  
  var granularity: js.UndefOr[seconds | minutes | hours | String] = js.undefined
  
  var metaField: js.UndefOr[String] = js.undefined
  
  var timeField: String
}
object TimeSeriesCollectionOptions {
  
  inline def apply(timeField: String): TimeSeriesCollectionOptions = {
    val __obj = js.Dynamic.literal(timeField = timeField.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeSeriesCollectionOptions]
  }
  
  extension [Self <: TimeSeriesCollectionOptions](x: Self) {
    
    inline def setGranularity(value: seconds | minutes | hours | String): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
    
    inline def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
    
    inline def setMetaField(value: String): Self = StObject.set(x, "metaField", value.asInstanceOf[js.Any])
    
    inline def setMetaFieldUndefined: Self = StObject.set(x, "metaField", js.undefined)
    
    inline def setTimeField(value: String): Self = StObject.set(x, "timeField", value.asInstanceOf[js.Any])
  }
}
