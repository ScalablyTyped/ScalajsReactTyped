package typingsJapgolly.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionPartitionKey extends StObject {
  
  /**
    * The algorithm used for partitioning. Only Hash is supported.
    */
  var kind: PartitionKind
  
  /**
    * An array of paths using which data within the collection can be partitioned.
    *
    * Paths must not contain a wildcard or a trailing slash. For example, the JSON property “AccountNumber” is specified as “/AccountNumber”.
    *
    * The array must contain only a single value.
    */
  var paths: js.Array[String]
}
object CollectionPartitionKey {
  
  inline def apply(kind: PartitionKind, paths: js.Array[String]): CollectionPartitionKey = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionPartitionKey]
  }
  
  extension [Self <: CollectionPartitionKey](x: Self) {
    
    inline def setKind(value: PartitionKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
  }
}
