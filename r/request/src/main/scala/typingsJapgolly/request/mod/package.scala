package typingsJapgolly.request

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Cookie = typingsJapgolly.toughCookie.mod.Cookie
  type Headers = org.scalablytyped.runtime.StringDictionary[js.Any]
  type MultipartBody = java.lang.String | typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.Uint8Array
  type OptionalUriUrl = typingsJapgolly.request.mod.RequiredUriUrl | js.Object
  type Options = typingsJapgolly.request.mod.OptionsWithUri | typingsJapgolly.request.mod.OptionsWithUrl
  type OptionsWithUri = typingsJapgolly.request.mod.UriOptions with typingsJapgolly.request.mod.CoreOptions
  type OptionsWithUrl = typingsJapgolly.request.mod.UrlOptions with typingsJapgolly.request.mod.CoreOptions
  type RequestCallback = js.Function3[
    /* error */ js.Any, 
    /* response */ typingsJapgolly.request.mod.Response, 
    /* body */ js.Any, 
    scala.Unit
  ]
  type RequestResponse = typingsJapgolly.request.mod.Response
  // aliases for backwards compatibility
  type ResponseRequest = typingsJapgolly.request.mod.Request
}
