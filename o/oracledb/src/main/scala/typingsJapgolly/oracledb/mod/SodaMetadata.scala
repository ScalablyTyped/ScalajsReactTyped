package typingsJapgolly.oracledb.mod

import typingsJapgolly.oracledb.anon.AssignmentMethod
import typingsJapgolly.oracledb.anon.Cache
import typingsJapgolly.oracledb.anon.Index
import typingsJapgolly.oracledb.anon.Method
import typingsJapgolly.oracledb.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata specifying various details about the collection, such as its database storage, whether it should
  * track version and time stamp document components, how such components are generated, and what document
  * types are.
  *
  * @see https://docs.oracle.com/en/database/oracle/simple-oracle-document-access/adsdi/soda-collection-metadata-components-reference.html#GUID-46E36926-7E6C-4561-A19F-01C09428C56D
  */
trait SodaMetadata extends StObject {
  
  /** Object containing information related to the content column. */
  var contentColumn: js.UndefOr[Cache] = js.undefined
  
  /** Object containing information related to the creation time column. */
  var creationTimeColumn: js.UndefOr[Name] = js.undefined
  
  /** Object containing information related to the key column. */
  var keyColumn: js.UndefOr[AssignmentMethod] = js.undefined
  
  /** Object containing information related to the last modified column. */
  var lastModifiedColumn: js.UndefOr[Index] = js.undefined
  
  /** Object containing information related to the media type column. */
  var mediaTypeColumn: js.UndefOr[Name] = js.undefined
  
  /** Specifies whether or not the collection is read-only. */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  /** Name of the Oracle Database schema that owns the table or view to which the collection is mapped. */
  var schemaName: js.UndefOr[String] = js.undefined
  
  /** Name of the table to which the collection is mapped. */
  var tableName: js.UndefOr[String] = js.undefined
  
  /** Object containing information related to the version column. */
  var versionColumn: js.UndefOr[Method] = js.undefined
  
  /** Name of the view to which the collection is mapped. */
  var viewName: js.UndefOr[String] = js.undefined
}
object SodaMetadata {
  
  inline def apply(): SodaMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SodaMetadata]
  }
  
  extension [Self <: SodaMetadata](x: Self) {
    
    inline def setContentColumn(value: Cache): Self = StObject.set(x, "contentColumn", value.asInstanceOf[js.Any])
    
    inline def setContentColumnUndefined: Self = StObject.set(x, "contentColumn", js.undefined)
    
    inline def setCreationTimeColumn(value: Name): Self = StObject.set(x, "creationTimeColumn", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeColumnUndefined: Self = StObject.set(x, "creationTimeColumn", js.undefined)
    
    inline def setKeyColumn(value: AssignmentMethod): Self = StObject.set(x, "keyColumn", value.asInstanceOf[js.Any])
    
    inline def setKeyColumnUndefined: Self = StObject.set(x, "keyColumn", js.undefined)
    
    inline def setLastModifiedColumn(value: Index): Self = StObject.set(x, "lastModifiedColumn", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedColumnUndefined: Self = StObject.set(x, "lastModifiedColumn", js.undefined)
    
    inline def setMediaTypeColumn(value: Name): Self = StObject.set(x, "mediaTypeColumn", value.asInstanceOf[js.Any])
    
    inline def setMediaTypeColumnUndefined: Self = StObject.set(x, "mediaTypeColumn", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setSchemaName(value: String): Self = StObject.set(x, "schemaName", value.asInstanceOf[js.Any])
    
    inline def setSchemaNameUndefined: Self = StObject.set(x, "schemaName", js.undefined)
    
    inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
    
    inline def setVersionColumn(value: Method): Self = StObject.set(x, "versionColumn", value.asInstanceOf[js.Any])
    
    inline def setVersionColumnUndefined: Self = StObject.set(x, "versionColumn", js.undefined)
    
    inline def setViewName(value: String): Self = StObject.set(x, "viewName", value.asInstanceOf[js.Any])
    
    inline def setViewNameUndefined: Self = StObject.set(x, "viewName", js.undefined)
  }
}
