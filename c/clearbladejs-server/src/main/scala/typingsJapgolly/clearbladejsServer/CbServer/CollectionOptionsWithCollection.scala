package typingsJapgolly.clearbladejsServer.CbServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionOptionsWithCollection extends StObject {
  
  var collection: String
}
object CollectionOptionsWithCollection {
  
  inline def apply(collection: String): CollectionOptionsWithCollection = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionOptionsWithCollection]
  }
  
  extension [Self <: CollectionOptionsWithCollection](x: Self) {
    
    inline def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
  }
}
