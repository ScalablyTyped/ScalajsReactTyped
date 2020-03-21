package typingsJapgolly.requestAsCurl

import typingsJapgolly.request.mod.CoreOptions
import typingsJapgolly.request.mod.Request
import typingsJapgolly.request.mod.RequestAPI
import typingsJapgolly.request.mod.RequiredUriUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("request-as-curl", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(request: RequestAPI[Request, CoreOptions, RequiredUriUrl]): String = js.native
  def apply(request: RequestAPI[Request, CoreOptions, RequiredUriUrl], body: js.Any): String = js.native
  def serialize(request: RequestAPI[Request, CoreOptions, RequiredUriUrl]): String = js.native
}

