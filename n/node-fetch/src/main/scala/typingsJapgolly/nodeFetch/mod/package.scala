package typingsJapgolly.nodeFetch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BlobPart = scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.ArrayBufferView | typingsJapgolly.nodeFetch.mod.Blob | java.lang.String
  type BodyInit = scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.ArrayBufferView | typingsJapgolly.node.NodeJS.ReadableStream | java.lang.String | typingsJapgolly.node.urlMod.URLSearchParams | typingsJapgolly.formData.mod.^ 
  type HeaderInit = typingsJapgolly.nodeFetch.mod.HeadersInit
  type HeadersInit = typingsJapgolly.nodeFetch.mod.Headers | js.Array[js.Array[java.lang.String]] | org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsJapgolly.nodeFetch.mod.URLLike
    - typingsJapgolly.nodeFetch.mod.Request
  */
  type RequestInfo = typingsJapgolly.nodeFetch.mod._RequestInfo | java.lang.String
}
