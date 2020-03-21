package typingsJapgolly.requestPromiseNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FullResponse = typingsJapgolly.request.mod.Response
  type Options = typingsJapgolly.requestPromiseNative.mod.OptionsWithUri | typingsJapgolly.requestPromiseNative.mod.OptionsWithUrl
  type OptionsWithUri = typingsJapgolly.request.mod.UriOptions with typingsJapgolly.requestPromiseNative.mod.RequestPromiseOptions
  type OptionsWithUrl = typingsJapgolly.request.mod.UrlOptions with typingsJapgolly.requestPromiseNative.mod.RequestPromiseOptions
  type RequestPromiseAPI = typingsJapgolly.request.mod.RequestAPI[
    typingsJapgolly.requestPromiseNative.mod.RequestPromise[js.Any], 
    typingsJapgolly.requestPromiseNative.mod.RequestPromiseOptions, 
    typingsJapgolly.request.mod.RequiredUriUrl
  ]
}
