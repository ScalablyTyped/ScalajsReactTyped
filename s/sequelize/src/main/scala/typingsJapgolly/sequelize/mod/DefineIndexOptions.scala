package typingsJapgolly.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefineIndexOptions extends StObject {
  
  /**
    * Pass CONCURRENT so other operations run while the index is created - PostgresSQL only. Default is false
    */
  var concurrently: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the index. Default is __
    */
  var indexName: js.UndefOr[String] = js.undefined
  
  /**
    * Set a type for the index, e.g. BTREE. See the documentation of the used dialect
    */
  var indexType: js.UndefOr[String] = js.undefined
  
  /**
    * The index type
    */
  var indicesType: js.UndefOr[IndexType] = js.undefined
  
  /**
    * A function that receives the sql query, e.g. console.log
    */
  var logging: js.UndefOr[js.Function] = js.undefined
  
  /**
    * The name of the index. Default is Default is <table>_<attr1>_<attr2>
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Index operator
    */
  var operator: js.UndefOr[String] = js.undefined
  
  /**
    * For FULLTEXT columns set your parser
    */
  var parser: js.UndefOr[String] = js.undefined
  
  /**
    * The index type
    */
  var `type`: js.UndefOr[IndexType] = js.undefined
  
  /**
    * Create a unique index
    */
  var unique: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Create an unique index
    */
  var `using`: js.UndefOr[String] = js.undefined
  
  /**
    * A hash of attributes to limit your index(Filtered Indexes - MSSQL & PostgreSQL only)
    */
  var where: js.UndefOr[AnyWhereOptions] = js.undefined
}
object DefineIndexOptions {
  
  inline def apply(): DefineIndexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefineIndexOptions]
  }
  
  extension [Self <: DefineIndexOptions](x: Self) {
    
    inline def setConcurrently(value: Boolean): Self = StObject.set(x, "concurrently", value.asInstanceOf[js.Any])
    
    inline def setConcurrentlyUndefined: Self = StObject.set(x, "concurrently", js.undefined)
    
    inline def setIndexName(value: String): Self = StObject.set(x, "indexName", value.asInstanceOf[js.Any])
    
    inline def setIndexNameUndefined: Self = StObject.set(x, "indexName", js.undefined)
    
    inline def setIndexType(value: String): Self = StObject.set(x, "indexType", value.asInstanceOf[js.Any])
    
    inline def setIndexTypeUndefined: Self = StObject.set(x, "indexType", js.undefined)
    
    inline def setIndicesType(value: IndexType): Self = StObject.set(x, "indicesType", value.asInstanceOf[js.Any])
    
    inline def setIndicesTypeUndefined: Self = StObject.set(x, "indicesType", js.undefined)
    
    inline def setLogging(value: js.Function): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setParser(value: String): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
    
    inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
    
    inline def setType(value: IndexType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
    
    inline def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
    
    inline def setUsing(value: String): Self = StObject.set(x, "using", value.asInstanceOf[js.Any])
    
    inline def setUsingUndefined: Self = StObject.set(x, "using", js.undefined)
    
    inline def setWhere(value: AnyWhereOptions): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    
    inline def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
  }
}
