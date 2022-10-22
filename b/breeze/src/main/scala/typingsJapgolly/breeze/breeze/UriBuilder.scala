package typingsJapgolly.breeze.breeze

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UriBuilder extends StObject {
  
  def buildUri(entityQuery: EntityQuery, metadataStore: MetadataStore): String
  
  def initialize(): Unit
  
  var name: String
}
object UriBuilder {
  
  inline def apply(buildUri: (EntityQuery, MetadataStore) => String, initialize: Callback, name: String): UriBuilder = {
    val __obj = js.Dynamic.literal(buildUri = js.Any.fromFunction2(buildUri), initialize = initialize.toJsFn, name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UriBuilder]
  }
  
  extension [Self <: UriBuilder](x: Self) {
    
    inline def setBuildUri(value: (EntityQuery, MetadataStore) => String): Self = StObject.set(x, "buildUri", js.Any.fromFunction2(value))
    
    inline def setInitialize(value: Callback): Self = StObject.set(x, "initialize", value.toJsFn)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
