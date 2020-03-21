package typingsJapgolly.elasticElasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object transportMod {
  type ApiResponse[T, C] = typingsJapgolly.elasticElasticsearch.transportMod.RequestEvent[T, C]
  type anyObject = org.scalablytyped.runtime.StringDictionary[js.Any]
  type emitFn = js.Function2[/* event */ java.lang.String | js.Symbol, /* repeated */ js.Any, scala.Boolean]
  type generateRequestIdFn = js.Function2[
    /* params */ typingsJapgolly.elasticElasticsearch.transportMod.TransportRequestParams, 
    /* options */ typingsJapgolly.elasticElasticsearch.transportMod.TransportRequestOptions, 
    js.Any
  ]
  type nodeFilterFn = js.Function1[
    /* connection */ typingsJapgolly.elasticElasticsearch.connectionMod.default, 
    scala.Boolean
  ]
  type nodeSelectorFn = js.Function1[
    /* connections */ js.Array[typingsJapgolly.elasticElasticsearch.connectionMod.default], 
    typingsJapgolly.elasticElasticsearch.connectionMod.default
  ]
  type noopFn = js.Function1[/* repeated */ js.Any, scala.Unit]
}
