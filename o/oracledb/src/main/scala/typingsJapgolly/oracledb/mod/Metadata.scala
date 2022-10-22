package typingsJapgolly.oracledb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Included in the result of a query execution to describe details of the columns involved.
  */
trait Metadata[T] extends StObject {
  
  /**
    * Database byte size. This is only set for DB_TYPE_VARCHAR, DB_TYPE_CHAR and DB_TYPE_RAW column types.
    */
  var byteSize: js.UndefOr[Double] = js.undefined
  
  /**
    * One of the Node-oracledb Type Constant values.
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#oracledbconstantsdbtype
    */
  var dbType: js.UndefOr[Double] = js.undefined
  
  /**
    * The class associated with the database type. This is only set if the database type is an object type.
    */
  var dbTypeClass: js.UndefOr[DBObjectClass[T]] = js.undefined
  
  /**
    * Name of the database type, such as “NUMBER” or “VARCHAR2”. For object types, this will be the object name.
    */
  var dbTypeName: js.UndefOr[String] = js.undefined
  
  /**
    * One of the Node-oracledb Type Constant values.
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#oracledbconstantsnodbtype
    */
  var fetchType: js.UndefOr[Double] = js.undefined
  
  /**
    * The column name follows Oracle’s standard name-casing rules. It will commonly be uppercase,
    * since most applications create tables using unquoted, case-insensitive names.
    */
  var name: String
  
  /**
    * Indicates whether NULL values are permitted for this column.
    */
  var nullable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set only for DB_TYPE_NUMBER, DB_TYPE_TIMESTAMP, DB_TYPE_TIMESTAMP_TZ and DB_TYPE_TIMESTAMP_LTZ columns.
    */
  var precision: js.UndefOr[Double] = js.undefined
  
  /**
    * Set only for DB_TYPE_NUMBER columns.
    */
  var scale: js.UndefOr[Double] = js.undefined
}
object Metadata {
  
  inline def apply[T](name: String): Metadata[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata[T]]
  }
  
  extension [Self <: Metadata[?], T](x: Self & Metadata[T]) {
    
    inline def setByteSize(value: Double): Self = StObject.set(x, "byteSize", value.asInstanceOf[js.Any])
    
    inline def setByteSizeUndefined: Self = StObject.set(x, "byteSize", js.undefined)
    
    inline def setDbType(value: Double): Self = StObject.set(x, "dbType", value.asInstanceOf[js.Any])
    
    inline def setDbTypeClass(value: DBObjectClass[T]): Self = StObject.set(x, "dbTypeClass", value.asInstanceOf[js.Any])
    
    inline def setDbTypeClassUndefined: Self = StObject.set(x, "dbTypeClass", js.undefined)
    
    inline def setDbTypeName(value: String): Self = StObject.set(x, "dbTypeName", value.asInstanceOf[js.Any])
    
    inline def setDbTypeNameUndefined: Self = StObject.set(x, "dbTypeName", js.undefined)
    
    inline def setDbTypeUndefined: Self = StObject.set(x, "dbType", js.undefined)
    
    inline def setFetchType(value: Double): Self = StObject.set(x, "fetchType", value.asInstanceOf[js.Any])
    
    inline def setFetchTypeUndefined: Self = StObject.set(x, "fetchType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
    
    inline def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
