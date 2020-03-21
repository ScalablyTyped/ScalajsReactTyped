package typingsJapgolly.nock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Body = java.lang.String | (typingsJapgolly.std.Record[java.lang.String, js.Any])
  // Essentially valid, decoded JSON with the addition of possible RegExp. TS doesn't currently have
  // a great way to represent JSON type data, this data matcher design is based off this comment.
  // https://github.com/microsoft/TypeScript/issues/1897#issuecomment-338650717
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - scala.Double
    - java.lang.String
    - scala.Null
    - `js.undefined`
    - typingsJapgolly.std.RegExp
    - typingsJapgolly.nock.mod.DataMatcherArray
    - typingsJapgolly.nock.mod.DataMatcherMap
  */
  type DataMatcher = js.UndefOr[
    typingsJapgolly.nock.mod._DataMatcher | scala.Boolean | scala.Double | java.lang.String | scala.Null | js.RegExp
  ]
  type InterceptFunction = js.Function3[
    /* uri */ java.lang.String | js.RegExp | (js.Function1[/* uri */ java.lang.String, scala.Boolean]), 
    /* requestBody */ js.UndefOr[typingsJapgolly.nock.mod.RequestBodyMatcher], 
    /* interceptorOptions */ js.UndefOr[typingsJapgolly.nock.mod.Options], 
    typingsJapgolly.nock.mod.Interceptor
  ]
  // a string or decoded JSON
  type ReplyBody = typingsJapgolly.nock.mod.Body | typingsJapgolly.node.Buffer | typingsJapgolly.node.fsMod.ReadStream
  type ReplyFnResult = js.Array[typingsJapgolly.nock.mod.StatusCode] | (js.Tuple2[typingsJapgolly.nock.mod.StatusCode, typingsJapgolly.nock.mod.ReplyBody]) | (js.Tuple3[
    typingsJapgolly.nock.mod.StatusCode, 
    typingsJapgolly.nock.mod.ReplyBody, 
    typingsJapgolly.nock.mod.ReplyHeaders
  ])
  type ReplyHeaderFunction = js.Function3[
    /* req */ typingsJapgolly.node.httpMod.ClientRequest, 
    /* res */ typingsJapgolly.node.httpMod.IncomingMessage, 
    /* body */ java.lang.String | typingsJapgolly.node.Buffer, 
    java.lang.String | js.Array[java.lang.String]
  ]
  type ReplyHeaderValue = java.lang.String | js.Array[java.lang.String] | typingsJapgolly.nock.mod.ReplyHeaderFunction
  type ReplyHeaders = (typingsJapgolly.std.Record[java.lang.String, typingsJapgolly.nock.mod.ReplyHeaderValue]) | (typingsJapgolly.std.Map[java.lang.String, typingsJapgolly.nock.mod.ReplyHeaderValue]) | js.Array[typingsJapgolly.nock.mod.ReplyHeaderValue]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsJapgolly.node.Buffer
    - typingsJapgolly.std.RegExp
    - typingsJapgolly.nock.mod.DataMatcherArray
    - typingsJapgolly.nock.mod.DataMatcherMap
    - js.Function1[/ * body * / js.Any, scala.Boolean]
  */
  type RequestBodyMatcher = typingsJapgolly.nock.mod._RequestBodyMatcher | (js.Function1[/* body */ js.Any, scala.Boolean]) | java.lang.String | typingsJapgolly.node.Buffer | js.RegExp
  type RequestHeaderMatcher = java.lang.String | js.RegExp | (js.Function1[/* fieldValue */ java.lang.String, scala.Boolean])
  type StatusCode = scala.Double
}
