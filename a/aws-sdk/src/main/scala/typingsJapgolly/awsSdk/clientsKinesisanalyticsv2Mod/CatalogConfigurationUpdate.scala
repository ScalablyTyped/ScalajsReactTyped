package typingsJapgolly.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatalogConfigurationUpdate extends StObject {
  
  /**
    * Updates to the configuration parameters for the default Amazon Glue database. You use this database for SQL queries that you write in a Kinesis Data Analytics Studio notebook.
    */
  var GlueDataCatalogConfigurationUpdate: typingsJapgolly.awsSdk.clientsKinesisanalyticsv2Mod.GlueDataCatalogConfigurationUpdate
}
object CatalogConfigurationUpdate {
  
  inline def apply(GlueDataCatalogConfigurationUpdate: GlueDataCatalogConfigurationUpdate): CatalogConfigurationUpdate = {
    val __obj = js.Dynamic.literal(GlueDataCatalogConfigurationUpdate = GlueDataCatalogConfigurationUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatalogConfigurationUpdate]
  }
  
  extension [Self <: CatalogConfigurationUpdate](x: Self) {
    
    inline def setGlueDataCatalogConfigurationUpdate(value: GlueDataCatalogConfigurationUpdate): Self = StObject.set(x, "GlueDataCatalogConfigurationUpdate", value.asInstanceOf[js.Any])
  }
}
