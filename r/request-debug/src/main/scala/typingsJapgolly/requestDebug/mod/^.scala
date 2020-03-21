package typingsJapgolly.requestDebug.mod

import typingsJapgolly.request.mod.CoreOptions
import typingsJapgolly.request.mod.Request
import typingsJapgolly.request.mod.RequestAPI
import typingsJapgolly.request.mod.RequiredUriUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("request-debug", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[TRequest /* <: Request */, TOptions /* <: CoreOptions */, TUriUrlOptions /* <: RequiredUriUrl */](request: RequestAPI[TRequest, TOptions, TUriUrlOptions]): Unit = js.native
  def apply[TRequest /* <: Request */, TOptions /* <: CoreOptions */, TUriUrlOptions /* <: RequiredUriUrl */](
    request: RequestAPI[TRequest, TOptions, TUriUrlOptions],
    cb: LogCallback[TRequest, TOptions, TUriUrlOptions]
  ): Unit = js.native
}

