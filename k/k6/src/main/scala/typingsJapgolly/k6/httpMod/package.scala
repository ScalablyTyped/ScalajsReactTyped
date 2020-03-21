package typingsJapgolly.k6

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object httpMod {
  type ArrayBatchRequest = js.Tuple4[
    java.lang.String, 
    java.lang.String, 
    js.UndefOr[typingsJapgolly.k6.httpMod.RequestBody | scala.Null], 
    js.UndefOr[typingsJapgolly.k6.httpMod.Params | scala.Null]
  ]
  type ArrayRefinedBatchRequest[RT /* <: js.UndefOr[typingsJapgolly.k6.httpMod.ResponseType] */] = js.Tuple4[
    java.lang.String, 
    java.lang.String, 
    js.UndefOr[typingsJapgolly.k6.httpMod.RequestBody | scala.Null], 
    js.UndefOr[typingsJapgolly.k6.httpMod.RefinedParams[RT] | scala.Null]
  ]
  type BatchRequest = java.lang.String | typingsJapgolly.k6.httpMod.ArrayBatchRequest | typingsJapgolly.k6.httpMod.ObjectBatchRequest
  type BatchRequests = js.Array[typingsJapgolly.k6.httpMod.BatchRequest] | org.scalablytyped.runtime.StringDictionary[typingsJapgolly.k6.httpMod.BatchRequest]
  type BatchResponses[Q] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Q ]: Q[K] extends k6.k6/http.RefinedBatchRequest<infer RT>? k6.k6/http.RefinedResponse<any> : never}
    */ typingsJapgolly.k6.k6Strings.BatchResponses with Q
  type CookieJarCookies = org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  type ParamsCookieValue = java.lang.String | typingsJapgolly.k6.AnonReplace
  type RefinedBatchRequest[RT /* <: js.UndefOr[typingsJapgolly.k6.httpMod.ResponseType] */] = java.lang.String | typingsJapgolly.k6.httpMod.ArrayRefinedBatchRequest[RT] | typingsJapgolly.k6.httpMod.ObjectRefinedBatchRequest[RT]
  type RefinedResponseBody[RT /* <: js.UndefOr[typingsJapgolly.k6.httpMod.ResponseType] */] = java.lang.String | scala.Null | typingsJapgolly.k6.mod.bytes
  type RequestBody = java.lang.String | typingsJapgolly.k6.httpMod.StructuredRequestBody
  type ResponseBody = java.lang.String | typingsJapgolly.k6.mod.bytes | scala.Null
  type StructuredRequestBody = org.scalablytyped.runtime.StringDictionary[java.lang.String | typingsJapgolly.k6.httpMod.FileData]
}
