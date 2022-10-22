package typingsJapgolly.elasticElasticsearch.libHelpersMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SearchResponse
import typingsJapgolly.elasticTransport.anon.Aborted
import typingsJapgolly.elasticTransport.libTypesMod.TransportResult
import typingsJapgolly.node.httpMod.IncomingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollSearchResponse[TDocument, TAggregations]
  extends StObject
     with TransportResult[SearchResponse[TDocument, TAggregations], Any] {
  
  def clear(): js.Promise[Unit]
  
  var documents: js.Array[TDocument]
}
object ScrollSearchResponse {
  
  inline def apply[TDocument, TAggregations](
    body: SearchResponse[TDocument, TAggregations],
    clear: CallbackTo[js.Promise[Unit]],
    documents: js.Array[TDocument],
    headers: IncomingHttpHeaders,
    meta: Aborted[Any],
    statusCode: Double
  ): ScrollSearchResponse[TDocument, TAggregations] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], clear = clear.toJsFn, documents = documents.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], warnings = null)
    __obj.asInstanceOf[ScrollSearchResponse[TDocument, TAggregations]]
  }
  
  extension [Self <: ScrollSearchResponse[?, ?], TDocument, TAggregations](x: Self & (ScrollSearchResponse[TDocument, TAggregations])) {
    
    inline def setClear(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setDocuments(value: js.Array[TDocument]): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
    
    inline def setDocumentsVarargs(value: TDocument*): Self = StObject.set(x, "documents", js.Array(value*))
  }
}
