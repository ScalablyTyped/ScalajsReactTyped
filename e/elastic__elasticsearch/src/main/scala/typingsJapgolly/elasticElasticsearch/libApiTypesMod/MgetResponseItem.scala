package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.GetGetResult[TDocument]
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MgetMultiGetError
*/
trait MgetResponseItem[TDocument] extends StObject
object MgetResponseItem {
  
  inline def GetGetResult[TDocument](_id: Id, _index: IndexName, found: Boolean): typingsJapgolly.elasticElasticsearch.libApiTypesMod.GetGetResult[TDocument] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _index = _index.asInstanceOf[js.Any], found = found.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.GetGetResult[TDocument]]
  }
  
  inline def MgetMultiGetError(_id: Id, _index: IndexName, error: ErrorCause): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MgetMultiGetError = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _index = _index.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MgetMultiGetError]
  }
}
