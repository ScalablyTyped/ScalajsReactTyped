package typingsJapgolly.tablestore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSearchIndexParams
  extends StObject
     with JustTableName {
  
  var indexName: String
}
object DescribeSearchIndexParams {
  
  inline def apply(indexName: String, tableName: String): DescribeSearchIndexParams = {
    val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSearchIndexParams]
  }
  
  extension [Self <: DescribeSearchIndexParams](x: Self) {
    
    inline def setIndexName(value: String): Self = StObject.set(x, "indexName", value.asInstanceOf[js.Any])
  }
}
