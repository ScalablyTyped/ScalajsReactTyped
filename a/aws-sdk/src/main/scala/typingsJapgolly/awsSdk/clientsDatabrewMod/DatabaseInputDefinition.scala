package typingsJapgolly.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatabaseInputDefinition extends StObject {
  
  /**
    * The table within the target database.
    */
  var DatabaseTableName: js.UndefOr[typingsJapgolly.awsSdk.clientsDatabrewMod.DatabaseTableName] = js.undefined
  
  /**
    * The Glue Connection that stores the connection information for the target database.
    */
  var GlueConnectionName: typingsJapgolly.awsSdk.clientsDatabrewMod.GlueConnectionName
  
  /**
    * Custom SQL to run against the provided Glue connection. This SQL will be used as the input for DataBrew projects and jobs.
    */
  var QueryString: js.UndefOr[typingsJapgolly.awsSdk.clientsDatabrewMod.QueryString] = js.undefined
  
  var TempDirectory: js.UndefOr[S3Location] = js.undefined
}
object DatabaseInputDefinition {
  
  inline def apply(GlueConnectionName: GlueConnectionName): DatabaseInputDefinition = {
    val __obj = js.Dynamic.literal(GlueConnectionName = GlueConnectionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseInputDefinition]
  }
  
  extension [Self <: DatabaseInputDefinition](x: Self) {
    
    inline def setDatabaseTableName(value: DatabaseTableName): Self = StObject.set(x, "DatabaseTableName", value.asInstanceOf[js.Any])
    
    inline def setDatabaseTableNameUndefined: Self = StObject.set(x, "DatabaseTableName", js.undefined)
    
    inline def setGlueConnectionName(value: GlueConnectionName): Self = StObject.set(x, "GlueConnectionName", value.asInstanceOf[js.Any])
    
    inline def setQueryString(value: QueryString): Self = StObject.set(x, "QueryString", value.asInstanceOf[js.Any])
    
    inline def setQueryStringUndefined: Self = StObject.set(x, "QueryString", js.undefined)
    
    inline def setTempDirectory(value: S3Location): Self = StObject.set(x, "TempDirectory", value.asInstanceOf[js.Any])
    
    inline def setTempDirectoryUndefined: Self = StObject.set(x, "TempDirectory", js.undefined)
  }
}
