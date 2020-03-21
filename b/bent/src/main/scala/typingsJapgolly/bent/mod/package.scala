package typingsJapgolly.bent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BaseUrl = java.lang.String
  type Headers = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Json = (org.scalablytyped.runtime.StringDictionary[js.Any] with org.scalablytyped.runtime.NumberDictionary[js.Any]) | js.Array[js.Any]
  type Options = typingsJapgolly.bent.mod.HttpMethod | typingsJapgolly.bent.mod.StatusCode | typingsJapgolly.bent.mod.Headers | typingsJapgolly.bent.mod.BaseUrl
  type RequestBody = java.lang.String | typingsJapgolly.node.streamMod.Stream | typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.ArrayBuffer | typingsJapgolly.bent.mod.Json
  type RequestFunction[T /* <: typingsJapgolly.bent.mod.ValidResponse */] = js.Function3[
    /* url */ java.lang.String, 
    /* body */ js.UndefOr[typingsJapgolly.bent.mod.RequestBody], 
    /* headers */ js.UndefOr[typingsJapgolly.bent.mod.Headers], 
    js.Promise[T]
  ]
  type StatusCode = scala.Double
  type ValidResponse = typingsJapgolly.bent.mod.BentResponse | java.lang.String | typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.ArrayBuffer | typingsJapgolly.bent.mod.Json
}
