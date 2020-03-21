package typingsJapgolly.requestPromise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Options = typingsJapgolly.requestPromise.mod.OptionsWithUri | typingsJapgolly.requestPromise.mod.OptionsWithUrl
  type OptionsWithUri = typingsJapgolly.request.mod.UriOptions with typingsJapgolly.requestPromise.mod.RequestPromiseOptions
  type OptionsWithUrl = typingsJapgolly.request.mod.UrlOptions with typingsJapgolly.requestPromise.mod.RequestPromiseOptions
  type RequestPromiseAPI = typingsJapgolly.request.mod.RequestAPI[
    typingsJapgolly.requestPromise.mod.RequestPromise[js.Any], 
    typingsJapgolly.requestPromise.mod.RequestPromiseOptions, 
    typingsJapgolly.request.mod.RequiredUriUrl
  ]
}
