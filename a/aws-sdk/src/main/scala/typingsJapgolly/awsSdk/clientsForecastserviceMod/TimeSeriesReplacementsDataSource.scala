package typingsJapgolly.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeSeriesReplacementsDataSource extends StObject {
  
  /**
    * The format of the replacement data, CSV or PARQUET.
    */
  var Format: js.UndefOr[typingsJapgolly.awsSdk.clientsForecastserviceMod.Format] = js.undefined
  
  var S3Config: typingsJapgolly.awsSdk.clientsForecastserviceMod.S3Config
  
  var Schema: typingsJapgolly.awsSdk.clientsForecastserviceMod.Schema
  
  /**
    * The timestamp format of the replacement data.
    */
  var TimestampFormat: js.UndefOr[typingsJapgolly.awsSdk.clientsForecastserviceMod.TimestampFormat] = js.undefined
}
object TimeSeriesReplacementsDataSource {
  
  inline def apply(S3Config: S3Config, Schema: Schema): TimeSeriesReplacementsDataSource = {
    val __obj = js.Dynamic.literal(S3Config = S3Config.asInstanceOf[js.Any], Schema = Schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeSeriesReplacementsDataSource]
  }
  
  extension [Self <: TimeSeriesReplacementsDataSource](x: Self) {
    
    inline def setFormat(value: Format): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "Format", js.undefined)
    
    inline def setS3Config(value: S3Config): Self = StObject.set(x, "S3Config", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: Schema): Self = StObject.set(x, "Schema", value.asInstanceOf[js.Any])
    
    inline def setTimestampFormat(value: TimestampFormat): Self = StObject.set(x, "TimestampFormat", value.asInstanceOf[js.Any])
    
    inline def setTimestampFormatUndefined: Self = StObject.set(x, "TimestampFormat", js.undefined)
  }
}
